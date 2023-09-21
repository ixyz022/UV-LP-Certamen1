import numpy as np
import plotly.graph_objects as go


def visualizar(data):
    x_vals, y_vals, z_vals, text_vals = [], [], [], []

    for i in range(data.shape[0]):
        for j in range(data.shape[1]):
            for k in range(data.shape[2]):
                x_vals.append(i)
                y_vals.append(j)
                z_vals.append(k)
                text_vals.append(str(data[i, j, k]))

    trace = go.Scatter3d(x=x_vals, y=y_vals, z=z_vals,
                         text=text_vals,
                         mode='markers+text',
                         marker=dict(size=5),
                         textposition="top center")

    layout = go.Layout(scene=dict(aspectmode="cube"))
    fig = go.Figure(data=[trace], layout=layout)

    fig.show()
