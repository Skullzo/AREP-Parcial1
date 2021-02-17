# Taller Clientes y Servicios
## Descripción
En el **Taller de Clientes y Servicios** se realizarán diferentes retos en los que se explorarán los conceptos de esquemas de nombres y de clientes y servicios. Adicionalmente, el taller también explorará la arquitectura de las aplicaciones distribuidas sobre internet, para así ver el funcionamiento detallado de una aplicación web capaz de recibir múltiples solicitudes no concurrentes, creando un framework manualmente muy similar al funcionamiento de Spark que le permite publicar servicios web ```get``` y ```post``` para poder acceder a recursos estáticos como páginas web, javascripts, imágenes CSSs, entre otras cosas, desplegado usando un servidor web llamado Heroku para poder acceder a ella de manera totalmente remota. Para verificar el funcionamiento de cada uno de los requisitos, se realizó una simulación de la página de la Registraduría Nacional del Estado Civil, en la cual el usuario tiene una interfaz, y al digitar la URL en la que se encuentran las bases de datos, puede observar características como nombres y apellidos de ciudadanos junto con su dirección, cada una de ellas almacenada en una base de datos.
## Prerrequisitos
Para la realización y ejecución tanto del programa como de las pruebas de este, se requieren ser instalados los siguientes programas:
* [Maven](https://maven.apache.org/). Herramienta que se encarga de estandarizar la estructura física de los proyectos de software, maneja dependencias (librerías) automáticamente desde repositorios y administra el flujo de vida de construcción de un software.
* [GIT](https://git-scm.com/). Sistema de control de versiones que almacena cambios sobre un archivo o un conjunto de archivos, permite recuperar versiones previas de esos archivos y permite otras cosas como el manejo de ramas (branches).
* [Heroku](https://www.heroku.com/). Plataforma en la nube como servicio (PaaS en sus siglas en inglés) basada en contenedores. Los desarrolladores usan Heroku para implementar, administrar y escalar aplicaciones modernas.

Para asegurar que el usuario cumple con todos los prerrequisitos para poder ejecutar el programa, es necesario disponer de un Shell o Símbolo del Sistema para ejecutar los siguientes comandos para comprobar que todos los programas están instalados correctamente, para así compilar y ejecutar tanto las pruebas como el programa correctamente.

```
mvn -version
git --version
java -version
```

## Instalación
Para descargar el proyecto de GitHub, primero debemos clonar este repositorio, ejecutando la siguiente línea de comando en GIT.

```
git clone https://github.com/Skullzo/AREP-Lab3.git
```

## Ejecución
Para compilar el proyecto utilizando la herramienta Maven, nos dirigimos al directorio donde se encuentra alojado el proyecto, y dentro de este ejecutamos en un Shell o Símbolo del Sistema el siguiente comando:

```
mvn package
```
## Pruebas
Para realizar las pruebas correspondientes del proyecto utilizando la herramienta Maven, nos dirigimos al directorio donde se encuentra alojado el proyecto, y dentro de este ejecutamos en un Shell o Símbolo del Sistema el siguiente comando:

```
mvn test
```

Luego de haber ejecutado el comando ```mvn test``` en un Shell o Símbolo del Sistema, debe aparecer la siguiente imagen, demostrando que las pruebas han sido realizadas exitosamente.

![img](https://github.com/Skullzo/AREP-Lab3/blob/main/img/Pruebas.PNG)

## Desplegar en Heroku
Para desplegar el programa en Heroku, se debe realizar clic en el siguiente botón de Heroku para desplegar automáticamente la aplicación directamente desde Heroku. 

[![Deploy](https://www.herokucdn.com/deploy/button.svg)](https://arep-lab3.herokuapp.com/)

* Para ir a la interfaz principal, poner el recurso ```/index.html``` al final de la URL de Heroku. 
* Para consultar toda la información relacionada con la Registraduría Nacional del Estado Civil, poner el recurso ```/Apps/acercade``` al final de la URL de Heroku.
* Para visualizar el logo de la Registraduría Nacional del Estado Civil, poner el recurso ```/RegistraduriaNacionalDelEstadoCivil.png``` al final de la URL de Heroku.
* Para consultar todas las bases de datos de todos los ciudadanos, poner el recurso ```/Apps/informationDB``` al final de la URL de Heroku.

## Construido con
* [Maven](https://maven.apache.org/). Herramienta que se encarga de estandarizar la estructura física de los proyectos de software, maneja dependencias (librerías) automáticamente desde repositorios y administra el flujo de vida de construcción de un software.
* [GIT](https://git-scm.com/). Sistema de control de versiones que almacena cambios sobre un archivo o un conjunto de archivos, permite recuperar versiones previas de esos archivos y permite otras cosas como el manejo de ramas (branches).
* [JUnit](https://junit.org/junit5/). Framework de Java que permite la realización de la ejecución de clases de manera controlada, para poder comprobar que los métodos realizan su cometido de forma correcta.
* [Eclipse](https://www.eclipse.org/ide/). Entorno de desarrollo integrado (IDE) utilizado en programación de computadoras. Contiene un espacio de trabajo básico y un sistema de complementos extensible para personalizar el entorno. Eclipse está escrito principalmente en Java y su uso principal es para desarrollar aplicaciones Java, pero también se puede usar para desarrollar aplicaciones en otros lenguajes de programación a través de complementos (plug-ins).
* [Java](https://www.oracle.com/java/). Lenguaje de programación de propósito general, es decir, que sirve para muchas cosas, para web, servidores, aplicaciones móviles, entre otros. Java también es un lenguaje orientado a objetos, y con un fuerte tipado de variables.
* [Heroku](https://www.heroku.com/). Plataforma en la nube como servicio (PaaS en sus siglas en inglés) basada en contenedores. Los desarrolladores usan Heroku para implementar, administrar y escalar aplicaciones modernas.
* [CircleCI](https://circleci.com/). Plataforma moderna de integración continua y entrega continua (CI / CD) que se encarga de automatizar la construcción, pruebas e implementación de software.

     [![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/Skullzo/AREP-Lab3)

## Autor
[Alejandro Toro Daza](https://github.com/Skullzo)
## Licencia & Derechos de Autor
**©** Alejandro Toro Daza, Estudiante de Ingeniería de Sistemas de la Escuela Colombiana de Ingeniería Julio Garavito

Licencia bajo la [GNU General Public License](https://github.com/Skullzo/AREP-Parcial1/blob/main/LICENSE).