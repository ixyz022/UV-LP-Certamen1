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
        self.num_layers = 0   # Inicialmente, asumimos que no sabemos cuántas capas hay
        # Esto se usará para saber en qué "capa" del tensor 3D estamos escribiendo
        self.current_layer_index = 0
        self.tensor = None  # Este será nuestro tensor 3D final
        self.rules = []

    def visitProgram(self, ctx: ACMulticapaParser.ProgramContext):
        # Primero, determinamos cuántas capas hay para inicializar el tensor 3D
        self.num_layers = len(ctx.layer())
        # Asumimos que todas las capas tienen la misma dimensión.
        # Usamos la primera capa para determinar la dimensión
        num_cells = len(ctx.layer(0).cell())
        dim = int(np.sqrt(num_cells))
        # Inicializamos el tensor 3D con ceros
        self.tensor = np.zeros((self.num_layers, dim, dim), dtype=int)

        # Procesamos cada capa
        for layer_ctx in ctx.layer():
            self.visit(layer_ctx)
            self.current_layer_index += 1

        # Procesamos cada regla de transición
        for rule_ctx in ctx.transitionRule():
            self.visit(rule_ctx)

    def visitLayer(self, ctx: ACMulticapaParser.LayerContext):
        for index, cell_ctx in enumerate(ctx.cell()):
            row, col = divmod(index, self.tensor.shape[1])
            disease_state = self.visit(cell_ctx.diseaseState())
            self.tensor[self.current_layer_index, row,
                        col] = self.STATE_MAP[disease_state]

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
