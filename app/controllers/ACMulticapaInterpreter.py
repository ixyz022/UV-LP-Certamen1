import numpy as np
from gramatica.ACMulticapaParser import ACMulticapaParser
from gramatica.ACMulticapaVisitor import ACMulticapaVisitor


class ACMulticapaInterpreter(ACMulticapaVisitor):

    # Mapeo de estados a números
    STATE_MAP = {
        'SUSCEPTIBLE': 1,
        'EXPOSED': 2,
        'INFECTADO': 3,
        'RECUPERADO': 4,
        'MUERTO': 5
    }

    def __init__(self):
        self.layers = {}  # Diccionario para almacenar matrices de las capas
        self.rules = []

    def visitProgram(self, ctx: ACMulticapaParser.ProgramContext):
        for layer_ctx in ctx.layer():
            self.visit(layer_ctx)
        for rule_ctx in ctx.transitionRule():
            self.visit(rule_ctx)

    def visitLayer(self, ctx: ACMulticapaParser.LayerContext):
        layer_name = ctx.NUMBER().getText()
        num_cells = len(ctx.cell())
        dim = int(np.sqrt(num_cells))

        matrix = np.zeros((dim, dim), dtype=int)
        for index, cell_ctx in enumerate(ctx.cell()):
            row, col = divmod(index, dim)
            disease_state = self.visit(cell_ctx.diseaseState())
            matrix[row, col] = self.STATE_MAP[disease_state]

        self.layers[layer_name] = matrix

    def visitCell(self, ctx: ACMulticapaParser.CellContext):
        cell_number = int(ctx.NUMBER().getText())
        disease_state = self.STATE_MAP[self.visit(ctx.diseaseState())]
        return [cell_number, disease_state]

    def visitDiseaseState(self, ctx: ACMulticapaParser.DiseaseStateContext):
        return ctx.getText()

    def visitTransitionRule(self, ctx: ACMulticapaParser.TransitionRuleContext):
        from_state = self.STATE_MAP[self.visit(ctx.diseaseState(0))]
        to_state = self.STATE_MAP[self.visit(ctx.diseaseState(1))]
        condition = self.STATE_MAP[self.visit(ctx.condition())]
        rule_data = {"from": from_state,
                     "to": to_state, "condition": condition}

        self.rules.append(rule_data)

    def visitCondition(self, ctx: ACMulticapaParser.ConditionContext):
        state = self.visit(ctx.diseaseState())
        return state  # Cambia de {"state": state} a simplemente state
