# (index, author): (266485, Jakub Łukaszewski)


import statsmodels
from plotly.subplots import make_subplots
import plotly.graph_objects as go
import pandas as p
import plotly.express as px
import statsmodels.api as sm

dfb = p.read_csv("poland_capex.csv")

fig = make_subplots(
    rows=2, cols=2, subplot_titles=("Line chart", "Bar chart", "Pie chart", "Scatter plot"), specs=[[{"type": "scatter"}, {"type": "bar"}], [{"type": "pie"}, {"type": "scatter"}]]
)

fig.add_trace(go.Scatter(x=dfb["Rok"], y=dfb["tys. PLN"], mode="lines", name="'000 PLN"), row=1, col=1)
fig.add_trace(go.Bar(x=dfb["Rok"], y=dfb["tys. PLN"], name="'000 PLN"), row=1, col=2)
fig.add_trace(go.Pie(values=dfb["tys. PLN"], labels=dfb["Rok"], domain=dict(x=[0, 0.5]), name="'000 PLN"), row=2, col=1)
fig.add_trace(go.Scattergl(x=dfb["Rok"], y=dfb["tys. PLN"], name="'000 PLN", mode="markers", line=dict(
        color='red',
    )), row=2, col=2)

fig.update_xaxes(title_text="Rok", row=1, col=1)
fig.update_xaxes(title_text="Rok", row=1, col=2)
fig.update_xaxes(title_text="Rok", row=2, col=2)

fig.update_yaxes(title_text="'000 PLN", row=1, col=1)
fig.update_yaxes(title_text="'000 PLN", row=1, col=2)
fig.update_yaxes(title_text="'000 PLN", row=2, col=2)

fig.update_layout(title_text="Capital Expenditure in Polish economy", height=700)

fig.show()
