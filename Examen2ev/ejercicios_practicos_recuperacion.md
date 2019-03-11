## Ejercicios Prácticos 2ª Evaluación

* Se debe entregar para cada ejercicio el código fuente que se ha utilizado, así como los ficheros que resulten de la realización de los ejercicios.
* Se entrega por github.
* Cada 30 minutos se debe hacer un commit.
* La valoración de cada ejercicio pondera 80% obtener el resultado pedido y un 20% otros aspectos como la estructura y orden del código.
* Los ejercicios son 7 puntos sobre 10 del examen, los 3 puntos restantes corresponden al test.

1. (2 PUNTOS) 

Crea una clase Java, denominada Champions con los atributos:

- nombre 
- fundación 
- campeonatos 
- subcampeonatos
- último triunfo
- último subcampeonato

Crea una base de datos en [NeoDatis](https://sourceforge.net/projects/neodatis-odb/files/latest/download) e inserta los datos siguientes.


| Equipo	| Fundacion | Campeonatos | Subcampeonatos | Ult. Triunfo | Ult. Subcampeonato |
|-----------|-----------|-------------|----------------|--------------|--------------------|
|Real Madrid |	1902	|13	|3	|2018| 1981 |
|AC Milano |	1899 	|7	|4	|2007| 2005 |
|Bayern Munchen | 1900	|5	|5	|2013| 2012 |
|FC Barcelona | 1899	|5	|3	|2015| 1994 |
|Liverpool FC | 1892	|5	|3	|2005| 2018 |
|Ajax FC	| 1900	|4	|2	|1995| 1996 |
|Manchester United |	1878	|3	|2	|2008| 2011 |
|Internazionale Milano | 1908	|3	|2	|2010| 1972 |
|Juventus FC |	1897	|2	|7	|1996| 2017 |
|SL Benfica |	1904	|2	|5	|1962| 1990 |

Posteriormente realiza un método que los recupere mediante una consulta (criterios):

- Consulta para obtener el equipo más antiguo que no ha ganado la competición en el siglo XXI.
- Consulta para obtener el equipo con más subcampeonatos.


2. (2.5 PUNTOS) Muestra mediante el uso de la Aggregation Pipeline de MongoDB sobre la colección de jugadores de la NBA los datos de la colección que cumplan lo siguiente:

	* Nombre completo (firstName y lastName) de los jugadores en un solo campo.
	* Índice de masa corporal del jugador
	* Insertar el resultado en una nueva colección llamada, jugadores_masa_corporal.
	* Exportar el contenido de la colección nueva a un fichero JSON.

Nota: El índice de masa corporal (IMC), se calcula dividiendo los kilogramos de peso por el cuadrado de la estatura en metros (IMC = peso [kg]/ estatura [m2]). Por ejemplo, en el caso de Alex Abrines:

- (90.7 kg / 1.98^2) = 23.1


3. (2.5 PUNTOS) Implementa el CRUD mediante el patrón DAO para la clase Java Champions utilizada en el Ejercicio 1. La base de datos MySQL se facilita adjunta^.

	* Inserta los datos correspondientes al Atlético de Madrid, fundado en 1903, 0 campeonatos, 3 subcampeonatos, último subcampeonato en 2016.
	* Lista los equipos ordenados por Champions ganadas.
	* Actualiza el palmarés del Fútbol Club Barcelona, incrementando el número de champions en 1.
	* Elimina el equipo de la tabla que se haya fundado más tarde.


^Se adjunta estructura de la tabla y datos, para importarla mediante MySQL Workbench es necesario crear primero la base de datos (schema) con el nombre _champions_ y seleccionarla como destino del fichero _champions.sql_ que se adjunta.