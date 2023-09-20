# antlr4 -Dlanguage=Python3 app/gramatica/ACMulticapa.g4 -visitor -listener

import os
from gramatica.ACMulticapaLexer import ACMulticapaLexer
from gramatica.ACMulticapaParser import ACMulticapaParser
from gramatica.ACMulticapaVisitor import ACMulticapaVisitor
from antlr4 import FileStream, CommonTokenStream
from antlr4.tree.Trees import Trees

dir_path = os.path.dirname(os.path.realpath(__file__))
file_path = os.path.join(dir_path, 'data', 'escenario1.txt')
print(file_path)
input_stream = FileStream(file_path)

lexer = ACMulticapaLexer(input_stream)
token_stream = CommonTokenStream(lexer)
parser = ACMulticapaParser(token_stream)

tree = parser.program()

rule_names = parser.ruleNames
tree_str = Trees.toStringTree(tree, None, parser)
print(tree_str)

visitor = ACMulticapaVisitor()
visitor.visit(tree)
