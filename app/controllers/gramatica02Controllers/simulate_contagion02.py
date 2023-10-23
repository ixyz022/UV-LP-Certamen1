import numpy as np
import random


def print_matrix_3d(matrix_3d):
    for layer_index, layer in enumerate(matrix_3d):
        print(f"Capa {layer_index}:")
        for row_index, row in enumerate(layer):
            for col_index, cell in enumerate(row):
                cell_str = ', '.join(
                    f'{state}: {info}' for state, info in cell['states'].items())
                total_population = sum(info['population']
                                       for info in cell['states'].values())
                blocked_str = "Bloqueada" if cell['BLOQUEADO'] else "No Bloqueada"
                print(
                    f"    Celda ({layer_index}, {row_index}, {col_index}) ({blocked_str}): {cell_str}, Población Total: {total_population}")

        print()  # Imprime una línea en blanco entre capas


def print_duration_structure(duration_structure):
    print("Estructura de Duración:")
    for index, duration in enumerate(duration_structure, start=1):
        if duration is None:
            print(f"    {index}. Error: El elemento es None")
        elif isinstance(duration, dict):
            # Obtén el estado, o 'N/A' si no está presente.
            state = duration.get('state', 'N/A')
            # Obtén la duración, o 'N/A' si no está presente.
            duration_value = duration.get('duration', 'N/A')
            print(f"    {index}. Estado: {state}, Duración: {duration_value}")
        else:
            print(f"    {index}. Error: El elemento no es un diccionario")


def print_prob_transitions(prob_transitions):
    print("Transiciones de Probabilidad:")
    for from_state, transitions in prob_transitions.items():
        print(f"    Desde el estado: {from_state}")
        for index, transition in enumerate(transitions, start=1):
            to_state = transition.get('to', 'N/A')
            probability = transition.get('probability', 'N/A')
            print(
                f"        {index}. Hacia: {to_state}, Probabilidad: {probability}")


def print_cell_transitions(cell_transitions):
    print("Transiciones de Celda:")
    for from_state, transitions in cell_transitions.items():
        print(f"    Desde el estado: {from_state}")
        for index, transition in enumerate(transitions, start=1):
            to_state = transition.get('to', 'N/A')
            condition = transition.get('condition', {})
            condition_state = condition.get('state', 'N/A')
            operator = condition.get('operator', 'N/A')
            number = condition.get('number', 'N/A')
            print(
                f"        {index}. Hacia: {to_state}, Condición: {condition_state} {operator} {number}")


def imprimir_vecindades(vecindades):
    for i, vecindad in enumerate(vecindades):
        print(f'Vecindad {i + 1}:')
        for clave, valor in vecindad.items():
            print(f'  {clave}: {valor}')
        print('-' * 40)  # Imprime una línea horizontal como separador


def printNormal(matrix, duration_structure, prob_transitions, cell_transitions):
    print(matrix)
    print(duration_structure)
    print(prob_transitions)
    print(cell_transitions)


def simulate_contagion02(matrix, duration_structure, prob_transitions, cell_transitions, num_steps):
    # print_matrix_3d(matrix)
    # print_duration_structure(duration_structure)
    # print_prob_transitions(prob_transitions)
    # print_cell_transitions(cell_transitions)

    # printNormal(matrix, duration_structure, prob_transitions, cell_transitions)

    vecindades = obtener_vecindades(matrix)

    for i in range(num_steps):
        verificar_condiciones_transicion(matrix, cell_transitions)
        actualizar_vecindad(matrix, duration_structure, prob_transitions)
        matrix = mover_poblacion_en_matriz(matrix)
        print_matrix_3d(matrix)
        realizar_transacciones_entre_celdas(matrix)


def obtener_vecinos(x, y, z, matriz):
    vecinos = []
    nx, ny, nz = len(matriz), len(matriz[0]), len(matriz[0][0])

    for dx in [-1, 0, 1]:
        for dy in [-1, 0, 1]:
            for dz in [-1, 0, 1]:
                if dx == dy == dz == 0:
                    continue
                nx_coord, ny_coord, nz_coord = x + dx, y + dy, z + dz
                if 0 <= nx_coord < nx and 0 <= ny_coord < ny and 0 <= nz_coord < nz:
                    vecinos.append((nx_coord, ny_coord, nz_coord))
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


def actualizar_vecindad(matriz, duration_transitions, prob_transitions):
    D1, D2, D3 = len(matriz), len(matriz[0]), len(matriz[0][0])
    for i in range(D1):
        for j in range(D2):
            for k in range(D3):
                for estado in matriz[i][j][k]["states"]:
                    matriz[i][j][k]["states"][estado]["counter"] += 1
                    matriz[i][j][k] = transicionar_estado(
                        duration_transitions, matriz[i][j][k], prob_transitions)


def transicionar_estado(duration_transitions, celda, prob_transitions):
    new_states = {}  # Crear un nuevo diccionario para almacenar los estados actualizados
    for estado, info in celda['states'].items():
        contador_actual = info['counter']
        # Comprobar si el contador actual coincide con alguna duración en duration_transitions
        duration_match = next(
            (item for item in duration_transitions if item['state'] == estado and item['duration'] == contador_actual), None)
        if duration_match:
            valor_aleatorio = random.random()
            resultado_transicion = get_closest_transition(
                estado, valor_aleatorio, prob_transitions
            )
            # print(celda, resultado_transicion, estado)
            if resultado_transicion and resultado_transicion != estado:
                # Si hay una transición y el estado resultante es diferente, actualizar la entrada
                info['counter'] = 0  # Restablecer el contador
                if resultado_transicion in new_states:
                    # Si el estado resultante ya existe en new_states, suma la población
                    new_states[resultado_transicion]["population"] += info["population"]
                else:
                    # Si el estado resultante no existe en new_states, créalo
                    new_states[resultado_transicion] = info.copy()
            else:
                # Mantener el estado actual si no hay transición
                new_states[estado] = info
        else:
            # Mantener el estado actual si no hay coincidencia de duración
            new_states[estado] = info
    # Reemplazar los estados antiguos con los nuevos estados
    # print("NUEVA", new_states)
    # print(celda)
    celda['states'] = new_states
    return celda


def get_closest_transition(state, random_value, transitions_dict):
    closest_transition = None
    closest_difference = float('inf')
    for transition in transitions_dict.get(state, []):
        probability_difference = abs(transition['probability'] - random_value)
        if probability_difference < closest_difference or \
           (probability_difference == closest_difference and transition['probability'] < random_value):
            closest_transition = transition
            closest_difference = probability_difference
    return closest_transition["to"] if closest_transition else None


def mover_poblacion_entre_estados(celda):
    # Obtener la lista de estados en la celda
    estados = list(celda['states'].keys())
    estados_con_poblacion = [
        estado for estado in estados if celda['states'][estado]['population'] > 0]

    if len(estados_con_poblacion) < 2:
        # No se pueden realizar movimientos si hay menos de 2 estados con población positiva
        return celda

    # Elegir un estado aleatoriamente como origen
    estado_origen = random.choice(estados_con_poblacion)
    # Elegir otro estado aleatoriamente como destino
    estado_destino = random.choice(estados_con_poblacion)

    if estado_origen != estado_destino:
        # Solo mover población si el estado de origen y destino son diferentes
        poblacion_mover = random.randint(
            1, celda['states'][estado_origen]['population'])
        celda['states'][estado_origen]['population'] -= poblacion_mover
        if estado_destino in celda['states']:
            celda['states'][estado_destino]['population'] += poblacion_mover
        else:
            celda['states'][estado_destino] = {
                'population': poblacion_mover, 'counter': 0}

    return celda


def mover_poblacion_en_matriz(matriz):
    # Iterar a través de filas, columnas y niveles de la matriz
    for i in range(len(matriz)):
        for j in range(len(matriz[i])):
            for k in range(len(matriz[i][j])):
                celda_actualizada = mover_poblacion_entre_estados(
                    matriz[i][j][k])
                matriz[i][j][k] = celda_actualizada

    return matriz


def realizar_transacciones_entre_celdas(matriz):
    nx, ny, nz = len(matriz), len(matriz[0]), len(matriz[0][0])

    for i in range(nx):
        for j in range(ny):
            for k in range(nz):
                celda_actual = matriz[i][j][k]

                if not celda_actual['BLOQUEADO']:
                    vecinos = []
                    for dx in [-1, 0, 1]:
                        for dy in [-1, 0, 1]:
                            for dz in [-1, 0, 1]:
                                if dx == dy == dz == 0:
                                    continue
                                nx_coord, ny_coord, nz_coord = i + dx, j + dy, k + dz
                                if 0 <= nx_coord < nx and 0 <= ny_coord < ny and 0 <= nz_coord < nz:
                                    vecinos.append(
                                        (nx_coord, ny_coord, nz_coord))

                    if vecinos:
                        vecino_destino = random.choice(vecinos)
                        destino_x, destino_y, destino_z = vecino_destino
                        celda_destino = matriz[destino_x][destino_y][destino_z]

                        if not celda_destino['BLOQUEADO']:
                            estados_actuales = list(
                                celda_actual['states'].keys())
                            estado_origen = random.choice(estados_actuales)

                            estados_destino = list(
                                celda_destino['states'].keys())
                            estado_destino = random.choice(estados_destino)

                            poblacion_actual = celda_actual['states'][estado_origen]['population']
                            if poblacion_actual > 0:
                                poblacion_a_transferir = random.randint(
                                    1, poblacion_actual)

                                celda_actual['states'][estado_origen]['population'] -= poblacion_a_transferir

                                if estado_destino in celda_destino['states']:
                                    celda_destino['states'][estado_destino]['population'] += poblacion_a_transferir
                                else:
                                    celda_destino['states'][estado_destino] = {
                                        'population': poblacion_a_transferir, 'counter': 0}


def verificar_condiciones_transicion(matriz, cell_transitions):
    for i in range(len(matriz)):
        for j in range(len(matriz[0])):
            for k in range(len(matriz[0][0])):
                celda = matriz[i][j][k]
                for estado_actual, transiciones in cell_transitions.items():
                    for transicion in transiciones:
                        estado_destino = transicion['to']
                        condicion = transicion['condition']
                        poblacion_transicion = 0
                        if condicion['operator'] == '>=':
                            if estado_actual in celda['states'] and estado_actual in celda['states']:
                                poblacion_actual = celda['states'][estado_actual]['population']
                                if poblacion_actual >= condicion['number']:
                                    poblacion_transicion = poblacion_actual // 2  # Ejemplo de población a transferir
                        # Realiza la transición si se cumple la condición
                        if poblacion_transicion > 0:
                            realizar_transicion(
                                celda, estado_actual, estado_destino, poblacion_transicion)


def realizar_transicion(celda, estado_actual, estado_destino, poblacion_transicion):
    # Resta la población del estado actual
    celda['states'][estado_actual]['population'] -= poblacion_transicion
    # Agrega la población al estado de destino
    if estado_destino in celda['states']:
        celda['states'][estado_destino]['population'] += poblacion_transicion
    else:
        # Crea el estado de destino si no existe
        celda['states'][estado_destino] = {
            'population': poblacion_transicion, 'counter': 0}
    # Imprime un mensaje
    print(
        f"Transición: {estado_actual} -> {estado_destino}, Población Transicionada: {poblacion_transicion}")
