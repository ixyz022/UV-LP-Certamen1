import numpy as np
from font.gramatica02.ACMulticapa02Visitor import ACMulticapa02Visitor
from font.gramatica02.ACMulticapa02Parser import ACMulticapa02Parser


class ACMulticapa02Interpreter(ACMulticapa02Visitor):

    def __init__(self):
        self.matrix_3d = []
        self.duration_structure = []
        self.prob_transitions = {}
        self.cell_transitions = {}

    def visitProgram(self, ctx: ACMulticapa02Parser.ProgramContext):
        # Si hay definiciones de duración estándar, visita esa sección
        if ctx.durationStandard():
            self.visitDurationStandard(ctx.durationStandard())

        # Visita todas las capas definidas
        for layer_ctx in ctx.layer():
            self.visitLayer(layer_ctx)

        # Si hay transiciones definidas, visita esas secciones
        for transitions_ctx in ctx.transitions():
            if transitions_ctx.durationTransitions():
                self.visitDurationTransitions(
                    transitions_ctx.durationTransitions())
            elif transitions_ctx.cellTransitions():
                self.visitCellTransitions(transitions_ctx.cellTransitions())

    def visitLayer(self, ctx: ACMulticapa02Parser.LayerContext):
        # Inicializa una nueva capa como una lista vacía.
        current_layer = []

        # Itera sobre cada definición de celda en la capa actual.
        for cell_ctx in ctx.cell():
            # Llama al método visitCell para construir la estructura de datos de la celda.
            cell_data = self.visitCell(cell_ctx)

            # Añade la estructura de datos de la celda a la capa actual.
            current_layer.append(cell_data)

        # Añade la capa actual a la matriz 3D.
        self.matrix_3d.append(current_layer)

    def visitDurationStandard(self, ctx: ACMulticapa02Parser.DurationStandardContext):
        # Itera sobre cada definición de duración de estado en la sección de duración estándar.
        for duration_state_ctx in ctx.durationState():
            # Llama al método visitDurationState para construir la estructura de datos de la duración del estado.
            self.visitDurationState(duration_state_ctx)  # Esta línea está bien
            # La siguiente línea está añadiendo None a self.duration_structure, así que deberías eliminarla.
            # self.duration_structure.append(duration_data)

    def visitDurationTransitions(self, ctx: ACMulticapa02Parser.DurationTransitionsContext):
        # Itera sobre cada regla de transición de duración en la sección de transiciones de duración.
        for duration_transition_rule_ctx in ctx.durationTransitionRule():
            # Extrae el estado inicial, el estado final y la probabilidad de la regla de transición.
            from_state = duration_transition_rule_ctx.basicState(0).getText()
            to_state = duration_transition_rule_ctx.basicState(1).getText()
            probability = float(
                duration_transition_rule_ctx.NUMBER().getText())

            # Construye la estructura de datos de la transición.
            transition_data = {'to': to_state, 'probability': probability}

            # Añade la estructura de datos de la transición a la estructura de transiciones de probabilidad.
            if from_state in self.prob_transitions:
                self.prob_transitions[from_state].append(transition_data)
            else:
                self.prob_transitions[from_state] = [transition_data]

    def visitCellTransitions(self, ctx: ACMulticapa02Parser.CellTransitionsContext):
        # Itera sobre cada regla de transición de celda en la sección de transiciones de celda.
        for cell_transition_rule_ctx in ctx.cellTransitionRule():
            # Extrae el estado inicial, el estado final y la condición de la regla de transición.
            from_state = cell_transition_rule_ctx.basicState(0).getText()
            to_state = cell_transition_rule_ctx.basicState(1).getText()
            condition_ctx = cell_transition_rule_ctx.condition()
            condition_state = condition_ctx.basicState().getText()
            operator = condition_ctx.comparison().OPERATOR().getText()
            number = int(condition_ctx.comparison().NUMBER().getText())

            # Construye la estructura de datos de la condición.
            condition_data = {'state': condition_state,
                              'operator': operator, 'number': number}

            # Construye la estructura de datos de la transición.
            transition_data = {'to': to_state, 'condition': condition_data}

            # Añade la estructura de datos de la transición a la estructura de transiciones de celda.
            if from_state in self.cell_transitions:
                self.cell_transitions[from_state].append(transition_data)
            else:
                self.cell_transitions[from_state] = [transition_data]

    def visitCell(self, ctx: ACMulticapa02Parser.CellContext):
        # Diccionario para almacenar la información de la celda
        cell_data = {
            'BLOQUEADO': 'BLOQUEADO' in [c.getText() for c in ctx.children],
            'states': {}  # Sub-diccionario para almacenar los estados y contadores
        }

        # Itera sobre cada estado de enfermedad en el conjunto de estados de enfermedad
        for state_ctx in ctx.diseaseStateSet().diseaseState():
            state = state_ctx.basicState().getText()
            count = int(state_ctx.NUMBER().getText())

            # Añade un sub-diccionario para cada estado con la población y el contador
            cell_data['states'][state] = {'population': count, 'counter': 0}

        # Este método ahora retorna cell_data en lugar de añadirlo directamente a matrix_3d.
        # La adición a matrix_3d se hará en el método visitLayer.
        return cell_data

    def visitDurationState(self, ctx: ACMulticapa02Parser.DurationStateContext):
        state = ctx.basicState().getText()
        duration = int(ctx.NUMBER().getText())
        self.duration_structure.append({'state': state, 'duration': duration})

    def visitDurationTransitionRule(self, ctx: ACMulticapa02Parser.DurationTransitionRuleContext):
        from_state = ctx.basicState(0).getText()
        to_state = ctx.basicState(1).getText()
        probability = float(ctx.NUMBER().getText())
        transition = {'to': to_state, 'probability': probability}
        if from_state in self.prob_transitions:
            self.prob_transitions[from_state].append(transition)
        else:
            self.prob_transitions[from_state] = [transition]

    def visitCellTransitionRule(self, ctx: ACMulticapa02Parser.CellTransitionRuleContext):
        from_state = ctx.basicState(0).getText()
        to_state = ctx.basicState(1).getText()
        condition_state = ctx.condition().basicState().getText()
        operator = ctx.condition().comparison().OPERATOR().getText()
        number = int(ctx.condition().comparison().NUMBER().getText())
        condition = {'state': condition_state,
                     'operator': operator, 'number': number}
        transition = {'to': to_state, 'condition': condition}
        if from_state in self.cell_transitions:
            self.cell_transitions[from_state].append(transition)
        else:
            self.cell_transitions[from_state] = [transition]
