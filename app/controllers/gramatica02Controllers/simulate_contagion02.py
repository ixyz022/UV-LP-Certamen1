import numpy as np
import random

# Función para obtener los vecinos de Moore en una matriz 3D


def obtener_vecinos(coord, matriz):
    x, y, z = coord
    vecinos = []
    for dx in [-1, 0, 1]:
        for dy in [-1, 0, 1]:
            for dz in [-1, 0, 1]:
                if dx == dy == dz == 0:
                    continue  # Saltar la celda misma
                vecinos.append((x + dx, y + dy, z + dz))
    return [vec for vec in vecinos if 0 <= vec[0] < matriz.shape[0] and 0 <= vec[1] < matriz.shape[1] and 0 <= vec[2] < matriz.shape[2]]

# Función para ejecutar un paso de la simulación


def ejecutar_paso(coord, matriz):
    celda = matriz[coord]
    vecinos = obtener_vecinos(coord, matriz)

    if not vecinos:
        return  # No hay vecinos, no se puede hacer nada

    estado_aleatorio = random.choice(list(celda['states'].keys()))

    # Verificar si hay personas en el estado seleccionado
    if celda['states'][estado_aleatorio] == 0:
        return  # No hay personas, salir de la función

    cantidad_personas = random.randint(1, celda['states'][estado_aleatorio])
    personas_por_vecino = cantidad_personas // len(vecinos)
    # Personas que no se pueden distribuir equitativamente
    personas_restantes = cantidad_personas % len(vecinos)

    # Actualizar la población y el estado en la celda actual
    celda['population'] -= (cantidad_personas - personas_restantes)
    celda['states'][estado_aleatorio] -= (
        cantidad_personas - personas_restantes)

    # Distribuir la población a las celdas vecinas
    for vecino_coord in vecinos:
        vecino = matriz[vecino_coord]
        if estado_aleatorio not in vecino['states']:
            vecino['states'][estado_aleatorio] = 0
        vecino['states'][estado_aleatorio] += personas_por_vecino
        vecino['population'] += personas_por_vecino


def simulate_contagion02(matriz, num_steps):
    contador = 0
    total_celdas = matriz.shape[0] * matriz.shape[1] * matriz.shape[2]
    while contador < num_steps * total_celdas:  # Ajuste en la condición del bucle
        for x in range(matriz.shape[0]):
            for y in range(matriz.shape[1]):
                for z in range(matriz.shape[2]):
                    ejecutar_paso((x, y, z), matriz)
                    # Imprimir el estado de la matriz después de cada pasoprimir el estado de la matriz después de cada paso
                    print(matriz, "\n")
                    contador += 1
