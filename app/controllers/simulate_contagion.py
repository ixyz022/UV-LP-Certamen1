import numpy as np


def simulate_contagion(layer, rules, steps):
    for step in range(steps):
        iterate_3D_matrix_layer(layer, rules)
    print(layer)


def get_neighbours(layer, x, y, z):
    neighbours = []

    # Vecinos en la misma capa (z)
    for i in [-1, 0, 1]:
        for j in [-1, 0, 1]:
            for k in [-1, 0, 1]:
                if (i != 0 or j != 0 or k != 0) and (0 <= x+i < layer.shape[0]) and (0 <= y+j < layer.shape[1]) and (0 <= z+k < layer.shape[2]):
                    neighbours.append(layer[x+i, y+j, z+k])

    return neighbours


def iterate_3D_matrix_layer(layer, rules):
    new_layer = np.copy(layer)
    for x in range(layer.shape[0]):
        for y in range(layer.shape[1]):
            for z in range(layer.shape[2]):
                neighbours = get_neighbours(layer, x, y, z)
                item = layer[x, y, z]
                new_layer[x, y, z] = apply_rule(item, neighbours, rules)
    np.copyto(layer, new_layer)


def apply_rule(item, neighbours, rules):
    for rule in rules:
        if item == rule[0] and rule[2] in neighbours:
            return rule[1]
    return item
