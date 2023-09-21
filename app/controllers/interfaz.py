# import tkinter as tk
# from threading import Thread
# from .simulate_contagion import simulate_contagion
# from functools import partial


# def actualizar_interfaz(layers, rules, num_steps):
#     simulate_contagion(layers, rules, num_steps)
#     # Actualiza la interfaz gráfica aquí


# def iniciar_simulacion():
#     # Inicia la simulación en un hilo separado
#     simulation_thread = Thread(target=actualizar_interfaz)
#     simulation_thread.start()


# root = tk.Tk()
# root.title("Simulación de Contagio")

# boton_avanzar = tk.Button(root, text="Avanzar", command=iniciar_simulacion)
# boton_avanzar.pack()

# root.mainloop()
