import numpy as np


def apply_moore_rules(layer, row, col, rules, layers):
    current_state = layer[row, col]
    for rule in rules:
        if rule['from'] == current_state:
            condition = rule['condition']
            for _, l in layers.items():  # Usamos "items()" para acceder a los valores como matrices
                for dr in [-1, 0, 1]:
                    for dc in [-1, 0, 1]:
                        new_row, new_col = row + dr, col + dc
                        if 0 <= new_row < layer.shape[0] and 0 <= new_col < layer.shape[1]:
                            adjacent_state = l[new_row, new_col]
                            if adjacent_state == condition:
                                layer[row, col] = rule['to']
                                return


def simulate_contagion(layers, transition_rules, num_steps):
    # Verificar que todos los valores en layers sean matrices NumPy
    for layer_name, layer_matrix in layers.items():
        if not isinstance(layer_matrix, np.ndarray):
            raise ValueError(
                f"El valor para la capa '{layer_name}' no es una matriz NumPy.")

    for step in range(num_steps):
        print(f"Step {step}:\n")
        for layer_name, layer_matrix in layers.items():
            print(f"Layer {layer_name}:\n{layer_matrix}\n")
        print("=" * 30 + "\n")

        new_layers = {layer_name: layer_matrix.copy()
                      for layer_name, layer_matrix in layers.items()}

        for i in range(next(iter(layers.values())).shape[0]):
            for j in range(next(iter(layers.values())).shape[1]):
                for layer_name, layer_matrix in layers.items():
                    apply_moore_rules(layer_matrix, i, j,
                                      transition_rules, layers)

        layers = new_layers
