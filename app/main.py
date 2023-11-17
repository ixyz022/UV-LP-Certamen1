# antlr4 -Dlanguage=Python3 ACMulticapa02.g4 -visitor -listener
# antlr4 -visitor -no-listener -Dlanguage=Python3  ACMulticapa02.g4

# Importaciones de bibliotecas estándar
import os
import argparse

# Importaciones de bibliotecas de terceros
from antlr4 import FileStream
from antlr4 import CommonTokenStream
from antlr4.tree.Trees import Trees


# Importaciones propias del proyecto

# Importacion de gramatica 1 y controladores de la gramatica 1
from font.gramatica01.ACMulticapa01Lexer import ACMulticapa01Lexer
from font.gramatica01.ACMulticapa01Parser import ACMulticapa01Parser
from controllers.gramatica01Controllers.ACMulticapa01Interpreter import ACMulticapa01Interpreter
from controllers.gramatica01Controllers.simulate_contagion01 import simulate_contagion01

# Importacion de gramatica 2 y controladores de la gramatica 2
from font.gramatica02.ACMulticapa02Lexer import ACMulticapa02Lexer
from font.gramatica02.ACMulticapa02Parser import ACMulticapa02Parser
from controllers.gramatica02Controllers.ACMulticapa02Interpreter import ACMulticapa02Interpreter
from controllers.gramatica02Controllers.simulate_contagion02 import simulate_contagion02

# Importacion de gramatica 3 y controladores de la gramatica 3


def obtener_opciones(file_path):
    with open(file_path, 'r') as file:
        lines = file.readlines()
        gramatica_opcion = int(lines[0].split(':')[1].strip())
        num_steps = int(lines[1].split(':')[1].strip())
    return gramatica_opcion, num_steps


def realizar_simulacion(file_path):
    gramatica_opcion, num_steps = obtener_opciones(file_path)
    input_stream = FileStream(file_path)

    # python main.py "D:/Documentos/Development Projects/UV-LP-Certamen1/app/data/escenario1.txt"
    # python main.py "C:\Users\ixyz0\Personal\Dev\UV-LP-Certamen1\app\data/escenario1.txt"
    if gramatica_opcion == 1:

        lexer = ACMulticapa01Lexer(input_stream)
        token_stream = CommonTokenStream(lexer)
        parser = ACMulticapa01Parser(token_stream)
        tree = parser.program()
        visitor = ACMulticapa01Interpreter()
        visitor.visit(tree)
        simulate_contagion01(
            visitor.tensor, visitor.duration_transitions, visitor.state_durations,  visitor.neighbor_transitions, num_steps)

    # python main.py "D:/Documentos/Development Projects/UV-LP-Certamen1/app/data/escenario2.txt"
    # python main.py "C:\Users\ixyz0\Personal\Dev\UV-LP-Certamen1\app\data/escenario2.txt"
    elif gramatica_opcion == 2:
        lexer = ACMulticapa02Lexer(input_stream)
        token_stream = CommonTokenStream(lexer)
        parser = ACMulticapa02Parser(token_stream)
        tree = parser.program()
        visitor = ACMulticapa02Interpreter()
        visitor.visit(tree)
        simulate_contagion02(
            visitor.matrix_3d, visitor.duration_structure, visitor.prob_transitions, visitor.cell_transitions, num_steps)

        # print(" A\n", visitor.cell_transitions, visitor.matrix_3d)


# cd app
parser = argparse.ArgumentParser(description='Procesar archivo especificado.')
parser.add_argument('file_path', type=str,
                    help='La ruta del archivo a procesar.')

args = parser.parse_args()
print(args.file_path)

realizar_simulacion(args.file_path)
