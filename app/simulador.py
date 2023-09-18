class Simulator:
    def __init__(self, data):
        self.data = data
        # Asumiendo que las reglas están definidas así.
        # Puede adaptar esto según las reglas que tengas.
        self.rules = [
            {'old_state': 'SUSCEPTIBLE', 'new_state': 'INFECTADO',
                'condition': 'INFECTADO'}
        ]

    def check_conditions(self, celda):
        for rule in self.rules:
            if celda['state'] == rule['old_state']:
                for neighbor in celda['vecindad']:
                    # Asumimos que todas las celdas están en la misma capa.
                    # Si tienes capas separadas, necesitas un mecanismo para obtener la capa adecuada.
                    if self.data['Capa1'][neighbor]['state'] == rule['condition']:
                        return rule['new_state']
        # Si no se cumple ninguna regla, el estado no cambia.
        return celda['state']

    def apply_rules(self):
        new_data = {}
        for capa, celdas in self.data.items():
            new_data[capa] = {}
            for celda_name, celda_info in celdas.items():
                new_state = self.check_conditions(celda_info)
                new_data[capa][celda_name] = {
                    'state': new_state, 'vecindad': celda_info['vecindad']}
        self.data = new_data

    def simulate(self, steps=1):
        for _ in range(steps):
            self.apply_rules()
