# antlr4 -Dlanguage=Python3 app/gramatica/ACMulticapa.g4 -visitor -listener

import os
from gramatica.ACMulticapaLexer import ACMulticapaLexer
from gramatica.ACMulticapaParser import ACMulticapaParser

from antlr4 import FileStream, CommonTokenStream
from antlr4.tree.Trees import Trees

from controllers.ACMulticapaInterpreter import ACMulticapaInterpreter
from controllers.simulacion import simulate_contagion
from controllers.visualizar import visualizar

# Carga de archivos
dir_path = os.path.dirname(os.path.realpath(__file__))
file_path = os.path.join(dir_path, 'data', 'escenario1.txt')
input_stream = FileStream(file_path)

lexer = ACMulticapaLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = ACMulticapaParser(token_stream)

tree = parser.program()

visitor = ACMulticapaInterpreter()
visitor.visit(tree)

# Imprime los resultados


def print_tensor(tensor):
    for idx, layer in enumerate(tensor):
        print(f"Layer {idx + 1}:")
        print(layer)
        print("\n" + "-" * 20 + "\n")


print_tensor(visitor.tensor)

visualizar(visitor.tensor)


print("\nTransition Rules:")
for i in visitor.rules:
    print(i)

num_steps = 10
