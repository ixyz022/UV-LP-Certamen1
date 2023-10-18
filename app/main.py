# antlr4 -Dlanguage=Python3 ACMulticapa.g4 -visitor -listener
# antlr4 -visitor -no-listener -Dlanguage=Python3  ACMulticapa01.g4

# Importaciones de bibliotecas estándar
import os

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


def obtener_archivos(dir_path):
    data_dir_path = os.path.join(dir_path, 'data')
    files = [f for f in os.listdir(data_dir_path) if os.path.isfile(
        os.path.join(data_dir_path, f))]
    files.sort()
    return files, data_dir_path


def imprimir_archivos(files):
    for idx, filename in enumerate(files):
        print(f"{idx + 1}: {filename}")


def seleccionar_archivo(files):
    file_number = int(
        input("Por favor, ingresa el número del archivo que deseas leer: "))
    if file_number < 1 or file_number > len(files):
        print("Número inválido.")
        return None
    return files[file_number - 1]


def seleccionar_pasos_simulacion():
    num_steps = int(
        input("Por favor, ingresa el número de pasos de simulación: "))
    if num_steps < 1:
        print("Número inválido.")
        return None
    return num_steps


def seleccionar_gramatica():
    print("Por favor, selecciona una gramática:")
    print("1: ACMulticapa01")
    print("2: ACMulticapa02")
    print("3: ACMulticapa03")
    print("4: ACMulticapa04")

    opcion = int(
        input("Ingresa el número de la gramática que deseas utilizar: "))

    if opcion < 1 or opcion > 4:
        print("Número inválido.")
        return None

    return opcion


def realizar_simulacion(file_path, num_steps, gramatica_opcion):
    input_stream = FileStream(file_path)

    if gramatica_opcion == 1:
        lexer = ACMulticapa01Lexer(input_stream)
        token_stream = CommonTokenStream(lexer)
        parser = ACMulticapa01Parser(token_stream)
        tree = parser.program()
        visitor = ACMulticapa01Interpreter()
        visitor.visit(tree)
        simulate_contagion01(visitor.tensor, visitor.rules, num_steps)

    elif gramatica_opcion == 2:
        lexer = ACMulticapa02Lexer(input_stream)
        token_stream = CommonTokenStream(lexer)
        parser = ACMulticapa02Parser(token_stream)
        tree = parser.program()
        visitor = ACMulticapa02Interpreter()
        visitor.visit(tree)
        simulate_contagion02(visitor.tensor, visitor.rules, num_steps)
    # elif gramatica_opcion == 3:
    #     lexer = ACMulticapa03Lexer(input_stream)
    #     parser = ACMulticapa03Parser(CommonTokenStream(lexer))
    #     visitor = ACMulticapa03Interpreter()
    # elif gramatica_opcion == 4:
    #     lexer = ACMulticapa04Lexer(input_stream)
    #     parser = ACMulticapa04Parser(CommonTokenStream(lexer))
    #     visitor = ACMulticapa04Interpreter()


def main():
    while True:
        try:

            gramatica_opcion = seleccionar_gramatica()
            if gramatica_opcion is None:
                continue

            dir_path = os.path.dirname(os.path.realpath(__file__))
            files, data_dir_path = obtener_archivos(dir_path)
            imprimir_archivos(files)

            selected_file = seleccionar_archivo(files)
            if selected_file is None:
                continue

            file_path = os.path.join(data_dir_path, selected_file)

            num_steps = seleccionar_pasos_simulacion()
            if num_steps is None:
                continue

            realizar_simulacion(file_path, num_steps, gramatica_opcion)

            break

        except FileNotFoundError:
            print("El directorio o archivo no existe.")
        except Exception as e:
            print(f"Ocurrió un error: {e}")


if __name__ == '__main__':
    main()
