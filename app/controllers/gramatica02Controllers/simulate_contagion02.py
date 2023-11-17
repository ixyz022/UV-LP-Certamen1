import numpy as np
import random


def imprimir_matriz(matriz, num_step):
    print(
        f'--------------------------------- Paso número: {num_step+1} ---------------------------------------')
    D1, D2, D3 = len(matriz), len(matriz[0]), len(matriz[0][0])
    for i in range(D1):
        print(f'Capa {i}:')
        for j in range(D2):
            fila = []
            for k in range(D3):
                cell = matriz[i][j][k]
                cell_str = f"B" if cell['BLOQUEADO'] else ""
                states_str = ", ".join(
                    [f"{estado}:{info['population']}({info['counter']})" for estado, info in cell['states'].items()])
                if cell_str and states_str:
                    fila.append(f"{cell_str} ({states_str})")
                elif cell_str:
                    fila.append(cell_str)
                elif states_str:
                    fila.append(states_str)
                else:
                    fila.append("-")
            fila_str = " | ".join(fila)
            print(fila_str)
        print('\n')  # Imprime una línea en blanco entre capas


def simulate_contagion02(matrix, duration_structure, prob_transitions, cell_transitions, num_steps):

    imprimir_matriz(matrix, -1)  # Mostrar matriz inicial

    for i in range(num_steps):
        reglas_transicion(matrix, cell_transitions)
        actualizar_vecindad(matrix,
                            prob_transitions, duration_structure)
        realizar_transacciones_entre_celdas(matrix)
        imprimir_matriz(matrix, i)  # Mostrar matriz inicial
    # imprimir_matriz(matrix, 100)  # Mostrar matriz final


def reglas_transicion(matrix, cell_transitions):
    reglas = obtener_reglas(cell_transitions)
    for i, capa in enumerate(matrix):
        for j, fila in enumerate(capa):
            for k, celda in enumerate(fila):
                # Esta la celda bloqueada?
                if (celda['BLOQUEADO']):
                    continue

                vecinos = obtener_vecinos(i, j, k, matrix)
                # Obtener la población total de los vecinos
                poblacion_vecinos = obtener_poblacion_total_de_vecinos(
                    matrix, vecinos)
                resultados_condiciones = verificar_condiciones_transicion(
                    poblacion_vecinos, reglas)
                aplicar_transiciones_celda(
                    celda, resultados_condiciones)


def aplicar_transiciones_celda(celda, resultados_condiciones):
    for resultado in resultados_condiciones:
        estado_actual, estado_destino, condicion_cumplida = resultado

        # Verificar si la celda está en el estado adecuado y la condición se cumple
        if estado_actual in celda['states'] and condicion_cumplida:
            poblacion_actual = celda['states'][estado_actual]['population']

            # Asegurarse de que hay población para transferir
            if poblacion_actual > 0:
                # Calcular una cantidad aleatoria de población para transferir
                cantidad_transferir = random.randint(0, poblacion_actual)

                # Disminuir la población en el estado actual
                celda['states'][estado_actual]['population'] -= cantidad_transferir

                # Si la población del estado actual llega a 0, eliminar el estado
                if celda['states'][estado_actual]['population'] == 0:
                    del celda['states'][estado_actual]

                # Aumentar la población en el estado de destino
                if estado_destino in celda['states']:
                    celda['states'][estado_destino]['population'] += cantidad_transferir
                else:
                    # Si el estado de destino no existe en la celda, crearlo
                    celda['states'][estado_destino] = {
                        'population': cantidad_transferir, 'counter': 0}

    return celda


def verificar_condiciones_transicion(poblacion_vecinos, transiciones):
    resultados = []

    for i in range(len(transiciones[0])):
        estado_actual = transiciones[0][i]
        estado_destino = transiciones[1][i]
        estado_vecino_requerido = transiciones[2][i]
        operador = transiciones[3][i]
        numero_requerido = transiciones[4][i]

        # Verificar si el estado de los vecinos requerido está presente y cumple la condición
        poblacion_vecino = poblacion_vecinos.get(estado_vecino_requerido, 0)
        condicion = f"{poblacion_vecino} {operador} {numero_requerido}"
        if eval(condicion):
            resultado = (estado_actual, estado_destino, True)
        else:
            resultado = (estado_actual, estado_destino, False)

        resultados.append(resultado)

    return resultados


def obtener_poblacion_total_de_vecinos(matriz, coordenadas_vecinos):
    poblacion_por_estado = {}

    for coord in coordenadas_vecinos:
        x, y, z = coord
        vecino = matriz[x][y][z]
        for estado, info in vecino['states'].items():
            if estado not in poblacion_por_estado:
                poblacion_por_estado[estado] = 0
            poblacion_por_estado[estado] += info['population']

    return poblacion_por_estado


def obtener_reglas(cell_transitions):
    transicionar = []
    hacia = []
    si_existen = []
    operador = []
    condicion = []

    for estado, transiciones in cell_transitions.items():
        for transicion in transiciones:
            transicionar.append(estado)
            hacia.append(transicion['to'])
            si_existen.append(transicion['condition']['state'])
            operador.append(transicion['condition']['operator'])
            condicion.append(transicion['condition']['number'])

    return transicionar, hacia, si_existen, operador, condicion


def obtener_vecinos(x, y, z, matriz):
    vecinos = []
    D1, D2, D3 = len(matriz), len(matriz[0]), len(matriz[0][0])
    for dx, dy in [(-1, 0), (1, 0), (0, -1), (0, 1)]:
        nx, ny = x + dx, y + dy
        if 0 <= nx < D1 and 0 <= ny < D2:
            vecinos.append((nx, ny, z))
    for dz in [-1, 1]:
        nz = z + dz
        if 0 <= nz < D3:
            vecinos.append((x, y, nz))
    return vecinos


def actualizar_vecindad(matriz, duration_transitions, state_durations):
    D1, D2, D3 = len(matriz), len(matriz[0]), len(matriz[0][0])
    for i in range(D1):
        for j in range(D2):
            for k in range(D3):
                estados = list(matriz[i][j][k]['states'].keys())
                for estado in estados:
                    # Comprueba si el estado sigue existiendo ya que podría haberse eliminado en una iteración anterior
                    if estado not in matriz[i][j][k]['states']:
                        continue

                    info = matriz[i][j][k]['states'][estado]
                    info['counter'] += 1
                    nuevo_estado, nuevo_info = transicionar_estado(
                        duration_transitions, state_durations, estado, info)

                    if nuevo_estado != estado:
                        # Si el nuevo estado ya existe, migra la población
                        if nuevo_estado in matriz[i][j][k]['states']:
                            matriz[i][j][k]['states'][nuevo_estado]['population'] += info['population']
                        else:
                            matriz[i][j][k]['states'][nuevo_estado] = nuevo_info

                        # Elimina el estado antiguo
                        del matriz[i][j][k]['states'][estado]


def transicionar_estado(duration_transitions, state_durations, estado_actual, info):
    contador_actual = info['counter']

    for duracion in state_durations:
        if contador_actual >= duracion["duration"] and estado_actual == duracion["state"]:
            valor_aleatorio = random.random()
            nuevo_estado = get_closest_transition(
                estado_actual, valor_aleatorio, duration_transitions)

            if nuevo_estado != estado_actual:
                info['state'] = nuevo_estado
                info['counter'] = 0

            return nuevo_estado, info

    return estado_actual, info


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
                    vecinos = obtener_vecinos(i, j, k, matriz)

                    if vecinos:
                        vecino_destino = random.choice(vecinos)
                        destino_x, destino_y, destino_z = vecino_destino
                        celda_destino = matriz[destino_x][destino_y][destino_z]

                        if not celda_destino['BLOQUEADO']:
                            estados_actuales = list(
                                celda_actual['states'].keys())
                            if estados_actuales:
                                estado_origen = random.choice(estados_actuales)

                                estados_destino = list(
                                    celda_destino['states'].keys())
                                estado_destino = random.choice(
                                    estados_destino) if estados_destino else estado_origen

                                poblacion_actual = celda_actual['states'][estado_origen]['population']
                                if poblacion_actual > 0:
                                    poblacion_a_transferir = random.randint(
                                        1, poblacion_actual)

                                    celda_actual['states'][estado_origen]['population'] -= poblacion_a_transferir

                                    # Eliminar el estado si su población llega a 0
                                    if celda_actual['states'][estado_origen]['population'] == 0:
                                        del celda_actual['states'][estado_origen]

                                    if estado_destino in celda_destino['states']:
                                        celda_destino['states'][estado_destino]['population'] += poblacion_a_transferir
                                    else:
                                        celda_destino['states'][estado_destino] = {
                                            'population': poblacion_a_transferir, 'counter': 0}
