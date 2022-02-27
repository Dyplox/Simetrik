#language: es
#author: @AbelGuAr
#encoding: utf-8

@Conexion
Característica: Prueba tecnica Simetrik QA Engineer

  Esquema del escenario: Escenario: realizar la consulta de Simetrik en la web
    Dado que el "QA Engineer" abre el navegador en Google
    Cuando consulta "Simetrik"
    Entonces se valida los "<resultado>"

    Ejemplos:
      | resultado   |
      | 0           |
      | 1880000     |
     # | 199,000.000 |
     # | %*(         |
     # | -100.2      |
     # | Valor       |