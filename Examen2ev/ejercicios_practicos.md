## Ejercicios Prácticos 2ª Evaluación

* Se debe entregar para cada ejercicio el código fuente que se ha utilizado, así como los ficheros que resulten de la realización de los ejercicios.
* Se entrega por github.
* Cada 30 minutos se debe hacer un commit.
* La valoración de cada ejercicio pondera 80% obtener el resultado pedido y un 20% otros aspectos como la estructura y orden del código.
* Los ejercicios son 7 puntos sobre 10 del examen, los 3 puntos restantes corresponden al test.

1. (2 PUNTOS) 

Crea una clase Java, denominada Equipo con los atributos:

- nombre 
- ligas 
- copas 
- fundación 
- enPrimera

Crea una base de datos en [NeoDatis](https://sourceforge.net/projects/neodatis-odb/files/latest/download) e inserta los datos siguientes.

| Nombre | Ligas | Copas | Fundación | En primera |
|--------|-------|-------|-----------|------------|
| Recreativo de Huelva | – | – | 1889 | 5 |
| Athletic Club | 8 | 23 | 1898 | 83 |
| Barcelona | 22 | 26 | 1899 | 83 |
| Espanyol | – | 4 | 1900 | 79 |
| Real Madrid | 32 | 18 | 1902 | 83 |
| Sabadell | – | – | 1903 | 14 |
| Atlético de Madrid | 9 | 10 | 1903 | 77 |
| Sevilla | 1 | 5 | 1905 | 70 |
| Sporting de Gijón | – | – | 1905 | 40 |
| Deportivo de La Coruña | 1 | 2 | 1906 | 42 |
| Betis | 1 | 2 | 1907 | 49 |
| Europa | – | – | 1907 | 3 |
| Levante | – | – | 1909 | 9 |
| Arenas | – | 1 | 1909 | 7 |
| Real Sociedad | 2 | 1 | 1909 | 67 |
| Cádiz | – | – | 1910 | 12 |
| Mérida | – | – | 1912 | 2 |
| Racing de Santander | – | – | 1913 | 44 |
| Gimnàstic de Tarragona | – | – | 1914 | 4 |
| Real Unión | – | 4 | 1915 | 4 |
| Mallorca | – | 1 | 1916 | 27 |
| Valencia | 6 | 7 | 1919 | 79 |
| Murcia | – | – | 1920 | 18 |
| Osasuna | – | – | 1920 | 36 |
| Alavés | – | – | 1921 | 11 |

Posteriormente realiza un método que los recupere mediante una consulta (criterios):

- Consulta para obtener el equipo más antiguo que ha ganado alguna Liga.
- Consulta para obtener el equipo que menos temporadas ha jugado en primera.


2. (2.5 PUNTOS) Muestra mediante el uso de la Aggregation Pipeline de MongoDB sobre la colección de jugadores de la NBA los datos de la colección que cumplan lo siguiente:

	* Nombre completo (firstName y lastName) de los jugadores en un solo campo.
	* Edad actual en años de cada jugador.
	* Insertar el resultado en una nueva colección llamada, jugadores_edades.
	* Exportar el contenido de la colección nueva a un fichero JSON.

3. (2.5 PUNTOS) Implementa el CRUD mediante el patrón DAO para la clase Java Equipo utilizada en el Ejercicio 1. La base de datos MySQL se facilita adjunta^.

	* Inserta los datos correspondientes al Real Zaragoza, fundado en 1932. 59 Temporadas en primera división. 6 Copas del Rey.
	* Lista los equipos ordenados por ligas ganadas.
	* Actualiza el palmarés del Fútbol Club Barcelona, incrementando el número de ligas en uno.
	* Elimina el equipo que menos temporadas haya jugado en primera.


^Se adjunta estructura de la tabla y datos, para importarla mediante MySQL Workbench es necesario crear primero la base de datos (schema) con el nombre _futbol_ y seleccionarla como destino del fichero _futbol.sql_ que se adjunta.