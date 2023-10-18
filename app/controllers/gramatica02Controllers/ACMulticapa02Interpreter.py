# ACMulticapa02Interpreter.py
from font.gramatica02.ACMulticapa02Parser import ACMulticapa02Parser
from font.gramatica02.ACMulticapa02Visitor import ACMulticapa02Visitor
import numpy as np


class ACMulticapa02Interpreter(ACMulticapa02Visitor):
    def __init__(self):
        self.num_layers = 0
        self.current_layer_index = 0
        self.tensor = None
        self.rules = []

    def visitProgram(self, ctx: ACMulticapa02Parser.ProgramContext):
        self.num_layers = len(ctx.layer())
        num_cells = len(ctx.layer(0).cell())
        dim = int(np.sqrt(num_cells))
        print(f"Num layers: {self.num_layers}, Dim: {dim}")  # Debug
        self.tensor = np.empty((self.num_layers, dim, dim), dtype=object)

        for layer_ctx in ctx.layer():
            self.visit(layer_ctx)
            self.current_layer_index += 1

        for rule_ctx in ctx.transitionRule():
            self.visit(rule_ctx)


def visitLayer(self, ctx: ACMulticapa02Parser.LayerContext):
    for index, cell_ctx in enumerate(ctx.cell()):
        row, col = divmod(index, self.tensor.shape[1])
        # Debug
        print(
            f"Current layer index: {self.current_layer_index}, Row: {row}, Col: {col}")
        if self.current_layer_index < self.tensor.shape[0] and \
           row < self.tensor.shape[1] and \
           col < self.tensor.shape[2]:
            cell_info = self.visit(cell_ctx)
            self.tensor[self.current_layer_index, row, col] = cell_info
        else:
            print("Index out of bounds.")  # Debug

    def visitCell(self, ctx: ACMulticapa02Parser.CellContext):
        population = int(ctx.NUMBER()[1].getText())
        states = {}
        for state_ctx in ctx.diseaseState():
            state, num = self.visit(state_ctx)
            states[state] = num
        return {'population': population, 'states': states}

    def visitDiseaseState(self, ctx: ACMulticapa02Parser.DiseaseStateContext):
        state = ctx.stateName().getText()
        num = int(ctx.NUMBER().getText())
        return state, num

    def visitTransitionRule(self, ctx: ACMulticapa02Parser.TransitionRuleContext):
        from_state = ctx.stateName()[0].getText()
        to_state = ctx.stateName()[1].getText()
        condition = ctx.condition().getText()
        self.rules.append((from_state, to_state, condition))
