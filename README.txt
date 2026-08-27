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



Las estructuras condicionales en Java:

Son herramientas que le permiten al programa tomar decisiones y elegir qué camino seguir según si una condición es verdadera o falsa.

if (Si): Evalúa una condición; si se cumple, ejecuta el código que tiene adentro.

else if (Si no, si): Permite evaluar una nueva condición en caso de que la anterior no se haya cumplido.

else (Si no): Es el bloque por defecto que se ejecuta cuando ninguna de las condiciones anteriores se cumplió.

&& (y)
|| (ó)
!(no)


--------------------------------------CONCLUSIONES FINALES-------------------------------

¿Cuál es la principal diferencia entre ++variable y variable++?

++variable, incrementa en 1 primero la variable por ejemplo 

c= 5
b=++c 

primero el programa añade 1 unidad a "c" dando como resultado 
c=6 y b=6

En cambio en:
c=5
b=c++

El programa primero le da el valor de "c" a "b" sin incrementar todavia y luego lo incrementa en 1 unidad a "c" de esta manera

c=6
b=5


¿Qué estructura if considera más adecuada para situaciones complejas y por
qué?

La que considero mas adecuada es if-else if-else, que me permite anidar mejor las variables e información y la primera que se de ejecute al instante.

¿Qué dificultades encontró durante el desarrollo?

Las dificultades que mas tuve durante el desarrollo fue ordenar las corchetas {} al finalizar ciertos if else, que cerraban mal o simplemente no se encontraban donde debian para que el programa usara el orden correcto, al igual que el correcto usos de Scanner sc=new Scanner (System.in); y como tomar cada variable con el Int, Line, double, String

¿Qué aprendizajes obtuvo durante la actividad?

Mi mayor aprendizaje fue mejorar y entender mejor el uso de las corchetas {}, solucionar errores de sintaxis, asi como aprendí nuevas líneas de código en las variables de Si/No al tomar datos y que esta ignorara el uso de mayuscula y minúsculas, también aprendí a usar mejor los && o || que me ayudaron bastante a separar por grupos en if else, aprendí también a memorizar las líneas de código sin necesidad de ver mis apuntes, asi como el uso de comandos en git







