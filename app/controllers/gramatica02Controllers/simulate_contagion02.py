import numpy as np
import random


def print_matrix_3d(matrix_3d):
    for layer_index, layer in enumerate(matrix_3d, start=1):
        print(f"Capa {layer_index}:")
        for row_index, cell in enumerate(layer, start=1):
            cell_str = ', '.join(
                f'{state}: {info}' for state, info in cell['states'].items())
            blocked_str = "Bloqueada" if cell['BLOQUEADO'] else "No Bloqueada"
            print(f"    Celda {row_index} ({blocked_str}): {cell_str}")
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


def simulate_contagion02(matrix, duration_structure, prob_transitions, cell_transitions):
    print_matrix_3d(matrix)
    print_duration_structure(duration_structure)
    print_prob_transitions(prob_transitions)
    print_cell_transitions(cell_transitions)
