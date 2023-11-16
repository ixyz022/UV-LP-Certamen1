import numpy as np
import random


def imprimir_vecindades(vecindades):
    for i, vecindad in enumerate(vecindades):
        print(f'Vecindad {i + 1}:')
        for clave, valor in vecindad.items():
            print(f'  {clave}: {valor}')
        print('-' * 40)  # Imprime una línea horizontal como separador


def imprimir_matriz(matriz, num_step):
    D1, D2, D3 = len(matriz), len(matriz[0]), len(matriz[0][0])
    print(
        f'--------------------------------- Paso número: {num_step+1} ---------------------------------------')
    for i in range(D1):
        print(f'Capa {i}:')
        for j in range(D2):
            for k in range(D3):
                print(f'{str(matriz[i][j][k]):>10}', end=' ')
            print()  # Imprime una nueva línea al final de cada fila
        print('\n')  # Imprime una línea en blanco entre capas


def simulate_contagion01(matriz, duration_transitions, state_durations, neighbor_transitions, num_steps):
    imprimir_matriz(matriz, -1)  # Mostrar matriz inicial
    for i in range(num_steps):

        actualizar_vecindad(matriz,
                            duration_transitions, state_durations)
        perform_transitions(matriz, neighbor_transitions)
        imprimir_matriz(matriz, i)


def check_transition(neighbor_states, transition_condition):
    # Verifica si se cumple la condición de transición
    state_to_check = transition_condition['state']
    required_number = transition_condition['number']
    actual_number = neighbor_states.count(state_to_check)
    return actual_number >= required_number


def perform_transitions(matriz, transitions_dict):
    D1, D2, D3 = matriz.shape
    transitions_to_apply = []

    for i in range(D1):
        for j in range(D2):
            for k in range(D3):
                current_state = matriz[i, j, k]['state']
                if current_state in transitions_dict:
                    transition_rules = transitions_dict[current_state]
                    for rule in transition_rules:
                        to_state = rule['to']
                        condition = rule['condition']
                        required_state = condition['state']
                        required_number = condition['number']

                        neighbor_coords = obtener_vecinos(i, j, k, matriz)
                        count_required_state = sum(
                            matriz[nx, ny, nz]['state'] == required_state for nx, ny, nz in neighbor_coords
                        )

                        if count_required_state >= required_number:
                            transitions_to_apply.append(((i, j, k), to_state))

    # Aplicar transiciones
    for coord, new_state in transitions_to_apply:
        matriz[coord]['state'] = new_state
        # print(f'Transición realizada en {coord}: {current_state} -> {new_state}')


def contar_estados(matriz, vecindades):
    # Inicializa un diccionario para almacenar el conteo de estados
    conteo_estados = {}
    for vecindad in vecindades:  # Itera sobre cada diccionario en la lista vecindades
        lista_vecinos = vecindad['vecinos']
        for vecino in lista_vecinos:  # Itera sobre cada vecino en la lista de vecinos
            # Obtiene las coordenadas del vecino
            capa, fila, columna = vecino
            # Accede al estado del vecino en la matriz
            estado_vecino = matriz[capa][fila][columna]['state']
            # Incrementa el contador para este estado en conteo_estados
            # Si el estado no está en el diccionario, lo inicializa con 0
            conteo_estados[estado_vecino] = conteo_estados.get(
                estado_vecino, 0) + 1

    return conteo_estados


def obtener_vecinos(x, y, z, matriz):
    vecinos = []
    D1, D2, D3 = len(matriz), len(matriz[0]), len(matriz[0][0])
    # Vecinos en la misma capa
    for dx, dy in [(-1, 0), (1, 0), (0, -1), (0, 1)]:
        nx, ny = x + dx, y + dy
        if 0 <= nx < D1 and 0 <= ny < D2:
            vecinos.append((nx, ny, z))
    # Vecino inmediatamente arriba e inmediatamente debajo
    for dz in [-1, 1]:
        nz = z + dz
        if 0 <= nz < D3:
            vecinos.append((x, y, nz))
    return vecinos


def obtener_vecindades(matriz):
    vecindades = []
    nx, ny, nz = len(matriz), len(matriz[0]), len(matriz[0][0])

    for i in range(nx):
        for j in range(ny):
            for k in range(nz):
                celda_info = {
                    'capa': i,
                    'identificador': (i, j, k),
                    'vecinos': obtener_vecinos(i, j, k, matriz)
                }
                vecindades.append(celda_info)
    return vecindades


def actualizar_vecindad(matriz, duration_transitions, state_durations):
    D1, D2, D3 = len(matriz), len(matriz[0]), len(matriz[0][0])
    for i in range(D1):
        for j in range(D2):
            for k in range(D3):
                matriz[i][j][k]["counter"] += 1
                matriz[i][j][k] = transicionar_estado(duration_transitions,
                                                      state_durations, matriz[i][j][k])


def transicionar_estado(duration_transitions, state_durations, celda):
    estado_actual = celda['state']
    contador_actual = celda['counter']

    for duracion in state_durations:
        # print(duracion)
        # print(estado_actual, contador_actual,
        #       duracion["duration"], duracion["state"], contador_actual == duracion["duration"], estado_actual == duracion["state"])
        if contador_actual >= duracion["duration"] and estado_actual == duracion["state"]:
            valor_aleatorio = random.random()
            resultado_transicion = get_closest_transition(
                estado_actual, valor_aleatorio, duration_transitions)

            # Aplicar la transición y reiniciar el contador si el estado cambia
            if resultado_transicion != estado_actual:
                celda['state'] = resultado_transicion
                celda['counter'] = 0
                return celda

    # Si no se realiza ninguna transición, devolver la celda sin cambios
    return celda


def get_closest_transition(state, random_value, transitions_dict):
    closest_transition = None
    # Inicializar con infinito para asegurar una primera asignación
    closest_difference = float('inf')

    for transition in transitions_dict.get(state, []):
        probability_difference = abs(transition['probability'] - random_value)
        # Si la diferencia es menor que la diferencia más cercana encontrada hasta ahora,
        # o si la diferencia es igual pero esta transición aparece primero en la lista,
        # actualizar la transición más cercana y la diferencia más cercana.
        if probability_difference < closest_difference or \
           (probability_difference == closest_difference and transition['probability'] < random_value):
            closest_transition = transition
            closest_difference = probability_difference

    # Retornar la transición más cercana encontrada
    return closest_transition["to"]
