import os
from gramatica.ACMulticapaLexer import ACMulticapaLexer
from gramatica.ACMulticapaParser import ACMulticapaParser
from antlr4 import FileStream, CommonTokenStream

from simulador import Simulator
from myVisitor import MyVisitor

dir_path = os.path.dirname(os.path.realpath(__file__))
file_path = os.path.join(dir_path, 'data', 'esceneario_test.txt')
input_stream = FileStream(file_path)

lexer = ACMulticapaLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = ACMulticapaParser(token_stream)

tree = parser.program()

# ... (parte anterior del código para parsear)

visitor = MyVisitor()
visitor.visit(tree)

simulator = Simulator(visitor.cells)
simulator.simulate()  # Esto avanzará el simulador un paso en el tiempo.
# Usa la función print_ordered para visualizar el resultado.


def print_ordered(data):
    for capa, celdas in data.items():
        print(capa + ":")
        for celda_name, celda_info in celdas.items():
            print("  " + celda_name + ": " + celda_info['state'])
            if celda_info['vecindad']:
                print("    Vecindad: " + ", ".join(celda_info['vecindad']))


print_ordered(simulator.data)
