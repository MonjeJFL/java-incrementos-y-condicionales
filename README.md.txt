Jose Fernando Losada Monje
Tecnología en Desarrollo de Software
27/08/2026



Actividades 

  Incrementos: 

    a. Un operador de incremento (++) es un símbolo que le suma $1$ al valor de una variable numérica de forma   rápida. 

    b. La diferencia entre Pre-incremento y Pos-incremento es el orden de los pasos: 

       Pre-incremento (++x): Primero le suma 1 a la variable y luego entrega el valor ya sumado. 
       Pos-incremento (x++): Primero entrega el valor actual de la variable y luego le suma 1. 
   
    c. Dan resultados distintos únicamente cuando guardas el resultado en otra variable, haces una cuenta matemática o evalúas una condición en la misma línea.  

       Con preincremento: int b = ++a; a sube a 6 y b recibe el nuevo 6.  
       Con posincremento: int d = c++; d recibe el 5 original y después c sube a 6.  


      Tabla comparativa de resultados "Incrementos.java"

| Variable | Operación realizada   | Valor impreso | Explicación corta                                                  |
|    a     |  ++a  (Preincremento) |    6          | Aumentó de 5 a 6 de inmediato.                                     |
|    b     |  int b = ++a          |    6          | Recibió el valor de `a` "después" de ser incrementado.             |
|    c     |  c++  (Posincremento) |    6          | Aumentó de 5 a 6 al finalizar la línea.                            |
|    d     |  int d = c++          |    5          | Recibió el valor original de `c` "antes" de que este incrementara. |


  Conclusiones: 

     Comportamiento en asignaciones: 
        Se comprobó que el preincremento (++a) modifica la variable antes de ser utilizada o asignada, mientras que el posincremento (a++) entrega primero el valor original y realiza el aumento al finalizar la instrucción.

     Impacto en operaciones matemáticas:
         En una expresión compuesta, el uso de ++x utiliza el nuevo valor incrementado dentro del cálculo, a diferencia de x++, que opera con el valor original y posterga el aumento.

     Comportamiento en ciclos for: 
         En la cabecera de una estructura iterativa (for), no existe diferencia práctica entre usar i++ o ++i. En ambos casos, el incremento se ejecuta de forma aislada al cerrar cada vuelta del bucle.

     Flujo de control y alcance: 
         La delimitación correcta de las llaves ({ }) es fundamental para garantizar que las instrucciones y las variables como Scanner mantengan el ámbito de ejecución previsto y no alteren el flujo de ciclos independientes al igual que en el ciclo for, cosas que me generaron bastantes problemas en la ejecución de la actividad.



