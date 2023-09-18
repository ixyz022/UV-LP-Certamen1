from gramatica.ACMulticapaVisitor import ACMulticapaVisitor


class MyVisitor(ACMulticapaVisitor):

    def __init__(self):
        self.layers = {}
        self.rules = []
        self.cells = {}

    def visitLayer(self, ctx):
        layer_name = ctx.ID().getText()
        cells = {}
        for cell_ctx in ctx.cell():
            cell_name = cell_ctx.ID().getText()
            cell_state = cell_ctx.cellState().getText()
            vecindad = [ref.getText() for ref in cell_ctx.vecindad(
            ).cellRef()] if cell_ctx.vecindad() else []
            cells[cell_name] = {'state': cell_state, 'vecindad': vecindad}

        self.cells[layer_name] = cells

    def visitCell(self, ctx):
        cell_name = ctx.ID().getText()
        cell_state = ctx.cellState().getText()
        cell = {'name': cell_name, 'state': cell_state}

        if ctx.vecindad():
            cell['neighbors'] = [neighbor.getText()
                                 for neighbor in ctx.vecindad().cellRef()]
        else:
            cell['neighbors'] = []

        current_layer = list(self.layers.keys())[-1]
        self.layers[current_layer].append(cell)

        return self.visitChildren(ctx)

    def visitTransitionRule(self, ctx):
        from_state = ctx.cellState(0).getText()
        to_state = ctx.cellState(1).getText()

        condition_state = ctx.condition().cellState().getText()
        condition_cells = [cell.getText()
                           for cell in ctx.condition().cellRef()]

        rule = {
            'from': from_state,
            'to': to_state,
            'condition_state': condition_state,
            'condition_cells': condition_cells
        }
        self.rules.append(rule)

        return self.visitChildren(ctx)

    def simulate_step(self, layer):
        new_states = {}
        for cell in self.layers[layer]:
            current_state = cell['state']
            new_state = self.evaluate_cell(cell)
            if new_state:
                new_states[cell['name']] = new_state
        for cell_name, state in new_states.items():
            for cell in self.layers[layer]:
                if cell['name'] == cell_name:
                    cell['state'] = state
                    break

    def evaluate_cell(self, cell):
        current_state = cell['state']
        for rule in self.rules:
            if current_state == rule['from']:
                neighbors_in_condition = [c for c in cell['neighbors'] if self.get_cell_state(
                    c) == rule['condition_state']]
                if set(neighbors_in_condition) == set(rule['condition_cells']):
                    return rule['to']
        return None

    def get_cell_state(self, cell_name):
        for layer in self.layers.values():
            for cell in layer:
                if cell['name'] == cell_name:
                    return cell['state']
        return None

    def run_simulation(self, steps=1):
        for _ in range(steps):
            for layer in self.layers.keys():
                self.simulate_step(layer)
