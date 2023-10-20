import numpy as np
from font.gramatica01.ACMulticapa01Visitor import ACMulticapa01Visitor
from font.gramatica01.ACMulticapa01Parser import ACMulticapa01Parser


class ACMulticapa01Interpreter(ACMulticapa01Visitor):

    def __init__(self):
        self.num_layers = 0
        self.current_layer_index = 0
        self.tensor = None
        self.neighbor_transitions = []
        self.duration_transitions = []
        self.state_durations = []

    def visitProgram(self, ctx: ACMulticapa01Parser.ProgramContext):
        self.num_layers = len(ctx.layer())
        num_cells = len(ctx.layer(0).cell())
        dim = int(np.sqrt(num_cells))
        self.tensor = np.empty((self.num_layers, dim, dim), dtype=object)

        self.visit(ctx.durationStandard())

        for layer_ctx in ctx.layer():
            self.visit(layer_ctx)
            self.current_layer_index += 1

        for transition_ctx in ctx.transitions():  # Modificación aquí
            self.visit(transition_ctx)

    def visitDurationStandard(self, ctx: ACMulticapa01Parser.DurationStandardContext):
        for duration_state_ctx in ctx.durationState():
            self.visit(duration_state_ctx)

    def visitDurationState(self, ctx: ACMulticapa01Parser.DurationStateContext):
        state = self.visit(ctx.basicState())
        duration = int(ctx.NUMBER().getText())
        self.state_durations.append({'state': state, 'duration': duration})

    def visitLayer(self, ctx: ACMulticapa01Parser.LayerContext):
        for index, cell_ctx in enumerate(ctx.cell()):
            row, col = divmod(index, self.tensor.shape[1])
            cell_data = self.visit(cell_ctx)
            self.tensor[self.current_layer_index, row, col] = cell_data

    def visitCell(self, ctx: ACMulticapa01Parser.CellContext):
        cell_state = self.visit(ctx.basicState())
        cell_data = {'state': cell_state, 'counter': 0}
        return cell_data

    def visitTransitions(self, ctx: ACMulticapa01Parser.TransitionsContext):  # Nueva función aquí
        if ctx.durationTransitions():
            self.visit(ctx.durationTransitions())
        if ctx.neighborTransitions():
            self.visit(ctx.neighborTransitions())

    def visitDurationTransitions(self, ctx: ACMulticapa01Parser.DurationTransitionsContext):
        for duration_transition_ctx in ctx.durationTransitionRule():
            self.visit(duration_transition_ctx)

    def visitDurationTransitionRule(self, ctx: ACMulticapa01Parser.DurationTransitionRuleContext):
        from_state = self.visit(ctx.basicState(0))
        to_state = self.visit(ctx.basicState(1))
        self.duration_transitions.append({'from': from_state, 'to': to_state})

    def visitNeighborTransitions(self, ctx: ACMulticapa01Parser.NeighborTransitionsContext):
        for neighbor_transition_ctx in ctx.neighborTransitionRule():
            self.visit(neighbor_transition_ctx)

    def visitNeighborTransitionRule(self, ctx: ACMulticapa01Parser.NeighborTransitionRuleContext):
        from_state = self.visit(ctx.basicState(0))
        to_state = self.visit(ctx.basicState(1))
        condition = self.visit(ctx.condition())
        self.neighbor_transitions.append(
            {'from': from_state, 'to': to_state, 'condition': condition})

    def visitBasicState(self, ctx: ACMulticapa01Parser.BasicStateContext):
        return ctx.getText()

    def visitCondition(self, ctx: ACMulticapa01Parser.ConditionContext):
        state = self.visit(ctx.basicState())
        number = int(ctx.NUMBER().getText())
        return {'state': state, 'number': number}
