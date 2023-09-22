import numpy as np


def simulate_contagion(layer, rules, steps):
    changes = 0
    while changes < steps:
        for x in range(layer.shape[0]):
            for y in range(layer.shape[1]):
                for z in range(layer.shape[2]):
                    neighbours = get_neighbours(layer, x, y, z)
                    item = layer[x, y, z]
                    new_value = apply_rule(item, neighbours, rules)
                    if new_value != item:
                        layer[x, y, z] = new_value
                        changes += 1
                        print(f"Paso {changes}:\n", layer)
                        if changes == steps:
                            return


def get_neighbours(layer, x, y, z):
    neighbours = []

    # Vecinos en la misma capa (z)
    for i in [-1, 0, 1]:
        for j in [-1, 0, 1]:
            for k in [-1, 0, 1]:
                if (i != 0 or j != 0 or k != 0) and (0 <= x+i < layer.shape[0]) and (0 <= y+j < layer.shape[1]) and (0 <= z+k < layer.shape[2]):
                    neighbours.append(layer[x+i, y+j, z+k])

    return neighbours


def apply_rule(item, neighbours, rules):
    for rule in rules:
        if item == rule[0] and rule[2] in neighbours:
            return rule[1]
    return item
