# Bases de Datos NoSQL

## Introducción

[Referencia UniCan](https://ocw.unican.es/pluginfile.php/2396/course/section/2473/Tema%201.%20NoSQL%20introduccio%CC%81n.pdf)

[Estadística de uso de bases de datos](https://db-engines.com/en/ranking)

## MongoDB

### Introducción

*MongoDB es una base de datos orientada a documentos. Esto quiere decir que en lugar de guardar los datos en registros, guarda los datos en documentos. Estos documentos son almacenados en BSON, que es una representación binaria de [JSON](https://developer.mozilla.org/es/docs/Learn/JavaScript/Objects/JSON).*

*Una de las diferencias más importantes con respecto a las bases de datos relacionales, es que no es necesario seguir un esquema. Los documentos de una misma colección - concepto similar a una tabla de una base de datos relacional -, pueden tener esquemas diferentes.* [Fuente](https://www.genbeta.com/desarrollo/mongodb-que-es-como-funciona-y-cuando-podemos-usarlo-o-no)



[Primeros pasos](https://guiadev.com/tutorial-mongodb/#Primeros_pasos_en_MongoDB)

### Instalación

[Instalación Windows](https://fastdl.mongodb.org/win32/mongodb-win32-x86_64-2008plus-ssl-4.0.5-signed.msi)

#### Clientes

* Hay clientes mediante línea de comandos y entorno gráfico. Veremos ejemplos en ambos casos. 
* El cliente gráfico a utilizar será el que se puede instalar junto al propio servidor [Mongo Compass](https://www.mongodb.com/products/compass).


### Estructuras JSON

* Colecciones de pares clave/valor.
* Lista ordenada de valores (P.Ej: arrays, etc.).

En JSON, las estructuras se presentan de dos formas:

* Objeto. Podría decirse que es un conjunto no ordenado de pares clave/valor expresado entre { y } (llaves). La clave y el valor asociado se separan mediante : (dos puntos). Cada par se separa del siguiente mediante una coma.

```json
{
  "active": true,
  "formed": 2016,
  "homeTown": "Metro City",
  "members": [
    {
      "age": 29,
      "name": "Molecule Man",
      "powers": [
        "Radiation resistance",
        "Turning tiny",
        "Radiation blast"
      ],
      "secretIdentity": "Dan Jukes"
    },
    {
      "age": 39,
      "name": "Madame Uppercut",
      "powers": [
        "Million tonne punch",
        "Damage resistance",
        "Superhuman reflexes"
      ],
      "secretIdentity": "Jane Wilson"
    },
    {
      "age": 1000000,
      "name": "Eternal Flame",
      "powers": [
        "Immortality",
        "Heat Immunity",
        "Inferno",
        "Teleportation",
        "Interdimensional travel"
      ],
      "secretIdentity": "Unknown"
    }
  ],
  "secretBase": "Super tower",
  "squadName": "Super hero squad"
}
```

* Array. Es una colección de valores encerrada por [ ]  (corchetes o square brackets).

```json
{
  "heroes": [
    {
      "age": 29,
      "name": "Molecule Man",
      "powers": [
        "Radiation resistance",
        "Turning tiny",
        "Radiation blast"
      ],
      "secretIdentity": "Dan Jukes"
    },
    {
      "age": 39,
      "name": "Madame Uppercut",
      "powers": [
        "Million tonne punch",
        "Damage resistance",
        "Superhuman reflexes"
      ],
      "secretIdentity": "Jane Wilson"
    }
  ]
}
```

* Valor. Puede ser de los siguientes tipos:

  * __String__: en UTF-8. Van siempre entre dobles comillas.
  * __Number__: números. Al guardarse en BSON admite los de tipo byte, int32, in64 o double.
  * __Boolean__: true o false.
  * __Array__: entre corchetes [] y pueden contener de 1 a N elementos, que pueden ser de cualquiera de los otros tipos.
  * __Documentos__: un documento en formato JSON puede contener otros documentos embebidos que incluyan más documentos o cualquiera de los tipos anteriormente descritos.
  * __Null__.



#### Validez JSON

* Hay multitud de sitios o aplicaciones que permiten comprobar si un objeto JSON es válido o no. Un par de ejemplos:

  * [JSONLint](https://jsonlint.com)

  * [JSONFormatter](https://jsonformatter.curiousconcept.com)

#### xml vs JSON

* TL;DR. JSON es más ligero y fácil de parsear. [Más en detalle](https://www.w3schools.com/js/js_json_xml.asp)

[Conversor online](http://www.utilities-online.info/xmltojson)


### Operaciones básicas iniciales en MongoDB

* En cualquier base de datos, el conjunto de operaciones básicas se denominan CRUD. Vemos ejemplos de éstas en MongoDB.

* ``` show databases o show dbs ```
* ``` use nombre_base_datos``` Si no existe la crea al insertar un objeto.
* ```db``` Referencia a la base de datos actual.
* ```show collections```
* ```db.help()``` Para consultar la ayuda.
* ```db.nombrecoleccion.help()``` Ayuda específica para colecciones.

#### Importar y exportar datos

* __mongoimport__ para importar datos creados con mongoexport
  
  * ```mongoimport --host localhost --port 27666 --db test --collection people --file data.json --jsonArray``` Desde un fichero JSON.

* __mongoexport__ para exportar datos (en JSON o CSV). No debe usarse para backups completos.

  * ```mongoexport --collection collectionName --out collection.json``` Simple
  * ```mongoexport -db dbName --collection collectionName --query '{"field": value}'``` Con una query
  * ```mongoexport.exe –db <myBD> –collection collectionName -csv –out path/to/file.csv –fields ``` A CSV
  
    * Dado que MongoDB usa tipos de datos BSON que no existen en JSON al exportarlos lo hace siguiendo unas reglas, por ejemplo data_date lo genera como Date( <date> )


* __mongodump__ para crear un export binario de los contenidos de una base de datos MongoDB. Debe usarse para backups.
* __mongorestore__ para recrear una base de datos a partir de un dump creado con mongodump

Más ejemplos: [Importar datos a MongoDB](https://www.todavianose.com/importar-en-mongodb/) 

### Crear registros. _Crud_

* ```save() o insert()``` Para añadir datos.


### Consultas. _cRud_

Para realizar consultas a la base de datos, debemos usar el comando db.nombre_de_coleccion.find(). El comando puede recibir dos parámetros: una consulta (los __filtros__) y una proyección(los __campos__). Ambos comandos son opcionales por lo que si ejecutamos el comando:

* ```db.jugadores.find()``` 

Se obtiene una lista con los primeros 20 elementos de la colección. Solo los primeros porque MongoDB no muestra todos los elementos. Para la consulta MongoDB crea un __cursor__. Para mostrar más documentos hay que escribir *it*.

Al ejecutar el comando anterior, el resultado no está formateado, por lo que es poco legible. Para solucionar este problema ese puede usar el modificador *pretty* que devolverá un resultado más legible.

### Filtrando las consultas.

Añadiendo consultas al comando find, filtra los elementos según las necesidades. Para ello se especifica un objeto JSON como primer parámetro del comando, con los campo por los que se quiere filtrar. Por ejemplo, jugadores en activo con el dorsal 23:

```javascript
db.jugadores.find(
    {jersey:23, isActive: true}
  ).pretty()
```

Los resultados muestran todos los campos de cada elemento. Es como utilizar el asterisco en una consulta SELECT. Si se desea seleccionar solo algunos de los campos, hay que utilizar el segundo parámetro de la consulta find para definir una __proyección__.

```javascript
db.jugadores.find(
    {jersey:23, isActive: true},
    {firstName:1, lastName:1} 
  ).pretty()

/*
    Devolverá nombre y apellido. Si en lugar de valor 1, se pasa 0, devuelve todos los campos SALVO los indicados con el 0.
*/
```

Otra función alternativa a __find()__ es __findOne()__ que devuelve solo la primera colección de las que cumplen con lo especificado en la consulta.

### Ordenando los resultados

* ```sort()``` Para ordenar. 1 ascendente, -1 desdendente.


### Operaciones de comparación

* __$eq__. Matches values that are equal to a specified value.
* __$gt__. Matches values that are greater than a specified value.
* __$gte__. Matches values that are greater than or equal to a specified value.
* __$in__. Matches any of the values specified in an array.
* __$lt__. Matches values that are less than a specified value.
* __$lte__. Matches values that are less than or equal to a specified value.
* __$ne__. Matches all values that are not equal to a specified value.
* __$nin__. Matches none of the values specified in an array.

[referencia oficial, EN](https://docs.mongodb.com/manual/reference/operator/query-comparison/)

### Operaciones lógicas

* __$and__. Joins query clauses with a logical AND returns all documents that match the conditions of both clauses.
* __$not__. Inverts the effect of a query expression and returns documents that do not match the query expression.
* __$nor__. Joins query clauses with a logical NOR returns all documents that fail to match both clauses.
* __$or__. Joins query clauses with a logical OR returns all documents that match the conditions of either clause.

[referencia oficial, EN](https://docs.mongodb.com/manual/reference/operator/query-logical/)

### Operaciones de tipo

* __$exists__. Matches documents that have the specified field.
* __$type__. Selects documents if a field is of the specified type.

[referencia oficial, EN](https://docs.mongodb.com/manual/reference/operator/query-element/)


### Actualizaciones. _crUd_

* ```update()``` Para actualizar registros.

[Tutorial ES](https://charlascylon.com/2013-07-18-tutorial-mongodb-operaciones-de-actualización-de)

### Eliminaciones. _cruD_

* ```remove()``` Para eliminar registros.



### Operaciones con funciones de agregado.

#### Cadenas de texto.
#### Funciones de resumen.
#### Funciones aritméticas.
#### Funciones sobre fechas.

### Notas sobre las comillas

Al realizar alguna consulta de prueba siguiendo los ejemplos, probablemente se habrá visto que MongoDB guarda los elementos con comillas dobles en el identificador. Es decir que MongoDB guarda las duplas “firstName”:“Alex” o “age”:34. En las consultas, en cambio, no se han especificado dichas comillas. Esto es porque el motor JavaScript de MongoDB las añade. Esto facilita la escritura de consultas, que no son obligatorias.

## Recursos

* [MongoDB Comandos básicos](https://jarriagadeveloper.wordpress.com/2016/01/19/mongodb-comandos-basicos/) 
* [Más ejemplos Comandos](http://www.diegocalvo.es/tutorial-de-mongodb-con-ejemplos/) 
* [Libro MongoDB ES](https://github.com/uokesita/the-little-mongodb-book/blob/master/es/mongodb.markdown) 
* [API Datos NBA](https://github.com/kshvmdn/nba.js/blob/master/docs/api/DATA.md) 
* [Tutorial MongoDB ES](https://charlascylon.com/tutorialmongo)