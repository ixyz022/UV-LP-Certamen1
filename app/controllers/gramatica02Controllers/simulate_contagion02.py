import numpy as np
import copy
import random


def simulate_contagion02(layer, rules, steps):
    changes = 0
    while changes < steps:
        for x in range(layer.shape[0]):
            for y in range(layer.shape[1]):
                cell_info = layer[x, y]
                neighbours = get_neighbours(layer, x, y)
                new_cell_info = apply_rule(cell_info, neighbours, rules)

                if new_cell_info != cell_info:
                    layer[x, y] = new_cell_info
                    changes += 1
                    print(f"Paso {changes}:\n", layer)

                    if changes == steps:
                        return


def get_neighbours(layer, x, y):
    neighbours = []
    for i in [-1, 0, 1]:
        for j in [-1, 0, 1]:
            if i == 0 and j == 0:
                continue
            if 0 <= x + i < layer.shape[0] and 0 <= y + j < layer.shape[1]:
                neighbours.append(layer[x + i, y + j])
    return neighbours


def apply_rule(cell_info, neighbours, rules):
    # deep copy to avoid modifying original dict
    new_cell_info = copy.deepcopy(cell_info)

    for from_state, to_state, condition in rules:
        # Seleccionamos una celda vecina aleatoriamente para aplicar la regla
        neighbour = random.choice(neighbours) if neighbours else None

        if neighbour and condition in neighbour['states']:
            affected_people = random.randint(1, neighbour['states'][condition])

            # Aplicamos la regla si hay suficientes personas en el estado 'from_state'
            if from_state in cell_info['states'] and cell_info['states'][from_state] >= affected_people:
                new_cell_info['states'][from_state] -= affected_people

                # Aumentamos el estado de destino en la celda actual
                new_cell_info['states'][to_state] = new_cell_info['states'].get(
                    to_state, 0) + affected_people

                # Disminuimos el estado de origen en la celda vecina
                neighbour['states'][condition] -= affected_people

                # Aumentamos el estado de destino en la celda vecina
                neighbour['states'][from_state] = neighbour['states'].get(
                    from_state, 0) + affected_people

                return new_cell_info

    return cell_info  # return the original cell_info if no rules are applied
