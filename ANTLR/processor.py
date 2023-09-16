import os
from ACMulticapaLexer import ACMulticapaLexer
from ACMulticapaParser import ACMulticapaParser
from ACMulticapaListener import ACMulticapaListener
from antlr4 import FileStream, CommonTokenStream


class ACMulticapaProcessor(ACMulticapaListener):

    def __init__(self):
        self.layers = {}
        self.rules = []
        self.simulation = []

    def enterLayer(self, ctx):
        layer_name = ctx.ID().getText()
        self.layers[layer_name] = []

    def enterCell(self, ctx):
        cell_name = ctx.ID().getText()
        cell_state = ctx.state().getText()
        self.layers[-1].append((cell_name, cell_state))

    def process(self, tree):
        pass


def main():

    dir_path = os.path.dirname(os.path.realpath(__file__))

    file_path = os.path.join(dir_path, '..', 'data', 'data.txt')

    input_stream = FileStream(file_path)

    lexer = ACMulticapaLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = ACMulticapaParser(token_stream)
    tree = parser.program()

    processor = ACMulticapaProcessor()
    processor.process(tree)


if __name__ == "__main__":
    main()
