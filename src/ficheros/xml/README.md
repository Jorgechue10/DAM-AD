# Manejo de ficheros XML

Interfaces para usar DOM

- **Document:** Objeto equivalente a un documento XML.
- **Element:** Objeto equivalente a un elemento del documento XML.
- **Node:** Representa cualquier nodo del documento.
- **NodeList:** Lista con los nodos hijos de un nodo.
- **Attr:** Permite acceder a los atributos de un nodo.
- **Text:** Son los datos car�cter de un elemento.
- **CharacterData:** Atributos y m�todos para manipular los datos de caracteres.
- **DocumentType:** Informaci�n de la etiqueta DOCTYPE.

Empleado
- [Crear y escribir](https://github.com/franlu/DAM-AD/blob/master/src/ficheros/xml/CrearEmpleadoXml.java)
- [Leer](https://github.com/franlu/DAM-AD/blob/master/src/ficheros/xml/LecturaEmpleadoXml.java)

**Actividad: **
Crear un documento XML partiendo del fichero que contiene informaci�n sobre las canciones (lista de reproducci�n). Mostrar el contenido del documento por consola.
	
Acceso a ficheros XML con SAX
- [Ejemplo](https://github.com/franlu/DAM-AD/blob/master/src/ficheros/xml/PruebaSax1.java)

**Actividad: **
Utiliza SAX para visualizar el contendio del fichero XML que contiene informaci�n sobre canciones.	

Serializaci�n de objetos
- [Crear Lista de personas](https://github.com/franlu/DAM-AD/blob/master/src/ficheros/xml/ListaPersonas.java)
- [Escribir Personas](https://github.com/franlu/DAM-AD/blob/master/src/ficheros/xml/EscribirPersonas.java)
- [Leer Personas](https://github.com/franlu/DAM-AD/blob/master/src/ficheros/xml/LeerPersonas.java)

**Actividad: **
Serializar los objetos canci�n a un fichero XML.
	
Conversi�n a otros formatos
- [Conversor](https://github.com/franlu/DAM-AD/blob/master/src/ficheros/xml/convertidor.java)

**Actividad: **
Crea una plantilla para convertir el fichero xml de canciones en un fichero html. Realiza la conversi�n.