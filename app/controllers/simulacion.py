import numpy as np


def get_neighbours(layers, current_layer_idx, x, y):
    neighbours = []

    # Vecinos en la misma capa
    for i in [-1, 0, 1]:
        for j in [-1, 0, 1]:
            if 0 <= x+i < layers[current_layer_idx].shape[0] and 0 <= y+j < layers[current_layer_idx].shape[1] and (i, j) != (0, 0):
                neighbours.append(layers[current_layer_idx][x+i, y+j])

    # Vecinos en la capa anterior
    if current_layer_idx > 0:
        neighbours.append(layers[current_layer_idx-1][x, y])

    # Vecinos en la capa siguiente
    if current_layer_idx < len(layers) - 1:
        neighbours.append(layers[current_layer_idx+1][x, y])

    return neighbours


def apply_rules(layers, current_layer_idx, rules):
    new_layer = layers[current_layer_idx].copy()
    for i in range(layers[current_layer_idx].shape[0]):
        for j in range(layers[current_layer_idx].shape[1]):
            cell_value = layers[current_layer_idx][i, j]
            neighbours = get_neighbours(layers, current_layer_idx, i, j)
            for rule in rules:
                if cell_value == rule['from'] and rule['condition'] in neighbours:
                    new_layer[i, j] = rule['to']
                    break
    return new_layer


def simulate_contagion(layers, rules, steps):
    updated_layers = layers.copy()
    for _ in range(steps):
        new_layers = []
        for idx, layer in enumerate(updated_layers):
            new_layer = apply_rules(updated_layers, idx, rules)
            new_layers.append(new_layer)
        updated_layers = new_layers
    return updated_layers
