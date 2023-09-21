# antlr4 -Dlanguage=Python3 app/gramatica/ACMulticapa.g4 -visitor -listener

import os
from gramatica.ACMulticapaLexer import ACMulticapaLexer
from gramatica.ACMulticapaParser import ACMulticapaParser

from antlr4 import FileStream, CommonTokenStream
from antlr4.tree.Trees import Trees

from controllers.ACMulticapaInterpreter import ACMulticapaInterpreter
from controllers.simulacion import simulate_contagion

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
print("Layers:")
for i in visitor.layers:
    print("Layer", i)
    print(visitor.layers[i])

print("\nTransition Rules:")
for i in visitor.rules:
    print(i)

num_steps = 10

simulate_contagion(visitor.layers, visitor.rules, num_steps)
