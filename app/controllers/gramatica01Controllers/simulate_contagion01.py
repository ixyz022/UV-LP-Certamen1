import numpy as np


def simulate_contagion01(layer):
    vecindades = obtener_vecindades(layer)
    for i in vecindades:
        print(i)


def obtener_vecindades(matriz):
    vecindades = []
    nx, ny, nz = len(matriz), len(matriz[0]), len(matriz[0][0])

    def obtener_vecinos(x, y, z):
        vecinos = []
        for dx in [-1, 0, 1]:
            for dy in [-1, 0, 1]:
                for dz in [-1, 0, 1]:
                    if dx == dy == dz == 0:
                        continue  # Skip the cell itself
                    nx, ny, nz = x + dx, y + dy, z + dz
                    if 0 <= nx < len(matriz) and 0 <= ny < len(matriz[0]) and 0 <= nz < len(matriz[0][0]):
                        vecinos.append((nx, ny, nz))
        return vecinos

    for i in range(nx):
        for j in range(ny):
            for k in range(nz):
                celda_info = {
                    'capa': i,
                    'identificador': (i, j, k),
                    'estado': matriz[i][j][k]['state'],
                    'contador': matriz[i][j][k]['counter'],
                    'vecinos': obtener_vecinos(i, j, k)
                }
                vecindades.append(celda_info)
    return vecindades


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


# changes = 0
#     while changes < steps:
#         for x in range(layer.shape[0]):
#             for y in range(layer.shape[1]):
#                 for z in range(layer.shape[2]):
#                     neighbours = get_neighbours(layer, x, y, z)
#                     item = layer[x, y, z]
#                     new_value = apply_rule(item, neighbours, rules)
#                     if new_value != item:
#                         layer[x, y, z] = new_value
#                         changes += 1
#                         print(f"Paso {changes}:\n", layer)
#                         if changes == steps:
#                             return
