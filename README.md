-----------------------------------------------  
![utn](https://getfavicons.com/api/?url=http%3A%2F%2Fwww.utn.edu.ar%2Fdefault.utn) 
# TP4 TSSI
-----------------------------------------------                     
### Explique los siguientes Goals

##### Mvn Clean
  >  Limpia todas las clases compiladas del proyecto. `mvn clean`
##### Mvn compile
  > Compila el código fuente del proyecto. `mvn compile`
##### Mvn package
  >  Toma el código compilado y lo empaqueta en su formato distribuible, como un JAR. `mvn package`
##### Mvn install
  >  Instala el paquete en el repositorio local, para usarlo como una dependencia en otros proyectos localmente.            
  `mvn install`
-----------------------------------------------
### Explique los siguientes Scopes

##### Compile
  >  Es el valor por defecto. Se utiliza en todos los casos (Compilar, Ejecutar,etc).
##### Provided
  >   También se utiliza en todos los casos, pero se espera que el jar sea suministrado por la JDK o el contenedor. Es decir, no se incluirá al empaquetar el proyecto, ni en el repositorio.
##### Runtime
  >   No se utiliza para compilar, pero si es necesario para ejecutar.
##### Test
  >   Sólo se utiliza para compilar o ejecutar los test.
##### System
  >  Es similar a Provided, pero eres tu el que tiene que suministrar el jar. No se incluirá al empaquetar el proyecto, ni en el repositorio.
##### Import
  >  Solo se admite en una dependencia del tipo pom en la sección `<dependencyManagement>`. Indica que la dependencia se reemplazará con la lista efectiva de dependencias.
-----------------------------------------------
### Que es un Archetype?

  > En resumen, Archetype es un kit de herramientas de plantillas del proyecto Maven. Un Archetype se define como un patrón o modelo original a partir del cual se hacen todas las demás cosas del mismo tipo.
-----------------------------------------------
### Estructura base de un proyecto Maven.
![base](https://hop2croft.files.wordpress.com/2011/04/estructura_basica_maven.png) 

  > - src/main/java : Donde guardaremos nuestras clases java fuente. Debajo de esta carpeta situaremos nuestras clases en distintos paquetes.
  
  > - src/main/resources : Aquí almacenaremos los recursos (ficheros xml, ficheros de propiedades, imagenes, etc) que pueda necesitar las clases java de nuestro proyecto. Igualmente aquí tienen que ir los ficheros de configuración de Spring o Hibernate por ejemplo.
  
  > - src/test/java : En dicha carpeta se guardan las clases de test que se encargarán de probar el correcto funcionamiento de nuestra aplicación. Aquí por ejemplo podemos guardar nuestros test unitarios de JUnit.
  
  > - src/test/resources : En esta carpeta guardamos los recursos que usan los test.
-----------------------------------------------
### Diferencia de Archetype y Artifact
 > Artifact : Un Artifact es algo que es producido o utilizado por un proyecto Maven. Los ejemplos de artefactos producidos por Maven para un proyecto incluyen: JAR, distribuciones y fuentes binarias, WAR. Cada artefacto se identifica de forma única mediante una identificación de grupo y una ID de artefacto que es única dentro de un grupo.
-----------------------------------------------
### Explique los cuatro Stereotypes basicos

##### @Component
  > 
##### @Repository
  > 
##### @Service
  > 
##### @Controller
  > 
-----------------------------------------------
