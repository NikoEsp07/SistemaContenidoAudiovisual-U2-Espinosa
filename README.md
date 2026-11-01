Sistema de Contenido Audiovisual
Universidad Politécnica Salesiana

Asignatura: Programación Orientada a Objetos  
Unidad: Relación entre clases  
Lenguaje de programación: Java

============================================================================================

1. Objetivo y propósito del proyecto

El objetivo de este proyecto es desarrollar un sistema de gestión de contenido audiovisual utilizando los principios de la Programación Orientada a Objetos.

El sistema permite representar diferentes tipos de contenido audiovisual mediante clases, aplicando conceptos como herencia, encapsulamiento, asociación, agregación, composición y polimorfismo.

============================================================================================

2. Clases y funcionalidades implementadas

Clases principales

- ContenidoAudiovisual: clase abstracta que contiene los atributos y métodos generales de los contenidos audiovisuales.
- Pelicula: representa películas y permite registrar sus actores.
- SerieDeTV: representa series de televisión y administra sus temporadas.
- Documental: representa documentales y permite registrar investigadores.

Nuevas clases implementadas

- Actor: almacena el nombre, edad y nacionalidad de los actores.
- Temporada: almacena el número, año de estreno y cantidad de episodios de una temporada.
- Investigador: almacena el nombre, especialidad e institución de un investigador.
- VideoMusical: representa videos musicales mediante atributos como artista, álbum y productora.
- ClaseVirtual: representa clases educativas grabadas mediante atributos como instructor, plataforma y nivel.

 Relaciones entre clases

- Herencia: las clases Pelicula, SerieDeTV, Documental, VideoMusical y ClaseVirtual heredan de ContenidoAudiovisual.
- Asociación: Pelicula se relaciona con Actor.
- Composición: SerieDeTV contiene objetos Temporada que crea y administra.
- Agregación: Documental se relaciona con objetos Investigador creados independientemente.
- Polimorfismo: los diferentes contenidos audiovisuales se almacenan en un arreglo de tipo ContenidoAudiovisual y ejecutan su propio método mostrarDetalles().

============================================================================================

3. Instrucciones para clonar y ejecutar el proyecto

Requisitos

- Java JDK instalado.
- Eclipse IDE.
- Git instalado.

Clonar el repositorio

Ejecutar este comando en una terminal:

git clone https://github.com/NikoEsp07/SistemaContenidoAudiovisual.git

Importar en Eclipse

1. Abrir Eclipse IDE.
2. Seleccionar File → Import.
3. Elegir General → Existing Projects into Workspace.
4. Seleccionar la carpeta del proyecto clonado.
5. Finalizar la importación.

Ejecutar el programa

1. Abrir el paquete `poo`.
2. Localizar el archivo `PruebaAudioVisual.java`.
3. Hacer clic derecho sobre el archivo.
4. Seleccionar Run As → Java Application.

============================================================================================

4. Mejoras implementadas

- Incorporación de nuevas clases para representar actores, temporadas e investigadores.
- Implementación de relaciones entre clases mediante asociación, agregación y composición.
- Creación de las subclases VideoMusical y ClaseVirtual.
- Aplicación de herencia y polimorfismo para reutilizar código.
- Ampliación de las pruebas del programa principal para comprobar el funcionamiento de los diferentes tipos de contenido audiovisual.
- Actualización del diagrama UML para representar las clases y sus relaciones.
