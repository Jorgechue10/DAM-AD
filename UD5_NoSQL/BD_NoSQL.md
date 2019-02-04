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

* Valor. Puede ser un número (no admite octal o hexadecimal), cadena de caracteres (Unicode) entre comillas, booleano o null.

#### Validez JSON

* Hay multitud de sitios o aplicaciones que permiten comprobar si un objeto JSON es válido o no. Un par de ejemplos:

[JSONLint](https://jsonlint.com)

[JSONFormatter](https://jsonformatter.curiousconcept.com)

#### xml vs JSON

* TL:DR. Json es más ligero y fácil de parsear. [Más en detalle](https://www.w3schools.com/js/js_json_xml.asp)

[Conversor online](http://www.utilities-online.info/xmltojson)


### Operaciones simples en MongoDB

* En cualquier base de datos, el conjunto de operaciones básicas se denominan CRUD. Vemos ejemplos de éstas en MongoDB.

* ``` show databases ```
* ``` use nombre_base_datos``` Si no existe la crea al insertar un objeto.
* ```db``` Referencia a la base de datos actual.
* ```show collections```
* ```count(), size(), length()```




[MongoDB Comandos básicos](https://jarriagadeveloper.wordpress.com/2016/01/19/mongodb-comandos-basicos/)
[Más ejemplos Comandos](http://www.diegocalvo.es/tutorial-de-mongodb-con-ejemplos/)
[Libro MongoDB ES](https://github.com/uokesita/the-little-mongodb-book/blob/master/es/mongodb.markdown) 
[API Datos NBA](https://github.com/kshvmdn/nba.js/blob/master/docs/api/DATA.md)
[Importar datos a MongoDB](https://www.todavianose.com/importar-en-mongodb/)

#### Crear registros. _Crud_

* ```save() o insert()``` Para añadir datos.

#### Consultas. _cRud_

* ```find()``` Para consultar datos. Admite filtros.
* ```sort()``` Para ordenar. 1 ascendente, -1 desdendente.

#### Actualizaciones. _crUd_

* ```update()``` Para actualizar registros.

#### Eliminaciones. _cruD_

* ```remove()``` Para eliminar registros.

### Operaciones con funciones de agregado.

#### Cadenas de texto.
#### Funciones de resumen.
#### Funciones aritméticas.
#### Funciones sobre fechas.