import numpy as np
from gramatica.ACMulticapaParser import ACMulticapaParser
from gramatica.ACMulticapaVisitor import ACMulticapaVisitor


class ACMulticapaInterpreter(ACMulticapaVisitor):

    def __init__(self):
        self.num_layers = 0   # Inicialmente, asumimos que no sabemos cuántas capas hay
        # Esto se usará para saber en qué "capa" del tensor 3D estamos escribiendo
        self.current_layer_index = 0
        self.tensor = None  # Este será nuestro tensor 3D final
        self.rules = []

    def visitProgram(self, ctx: ACMulticapaParser.ProgramContext):
        self.num_layers = len(ctx.layer())
        num_cells = len(ctx.layer(0).cell())
        dim = int(np.sqrt(num_cells))
        self.tensor = np.empty((self.num_layers, dim, dim), dtype=object)

        for layer_ctx in ctx.layer():
            self.visit(layer_ctx)
            self.current_layer_index += 1

        for rule_ctx in ctx.transitionRule():
            self.visit(rule_ctx)

    def visitLayer(self, ctx: ACMulticapaParser.LayerContext):
        for index, cell_ctx in enumerate(ctx.cell()):
            row, col = divmod(index, self.tensor.shape[1])
            disease_state = self.visit(cell_ctx.diseaseState())
            self.tensor[self.current_layer_index, row, col] = disease_state

    def visitCell(self, ctx: ACMulticapaParser.CellContext):
        cell_number = int(ctx.NUMBER().getText())
        disease_state = self.visit(ctx.diseaseState())
        return [cell_number, disease_state]

    def visitDiseaseState(self, ctx: ACMulticapaParser.DiseaseStateContext):
        return ctx.getText()

    def visitTransitionRule(self, ctx: ACMulticapaParser.TransitionRuleContext):
        from_state = self.visit(ctx.diseaseState(0))
        to_state = self.visit(ctx.diseaseState(1))
        condition = self.visit(ctx.condition())

        # Ahora agregamos las reglas como tuplas
        rule_data = (from_state, to_state, condition)
        self.rules.append(rule_data)

    def visitCondition(self, ctx: ACMulticapaParser.ConditionContext):
        state = self.visit(ctx.diseaseState())
        return state
