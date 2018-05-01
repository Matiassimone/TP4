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
  > Es el estereotipo principal, indica que la clase anotada es un component (o un Bean de Spring).
##### @Repository
  > Es una especializacion de @Component para el caso concreto de persistencia.
##### @Service
  > Es una especializacion de @Component para el caso concreto de servicios.
##### @Controller
  > Es una especializacion de @Component para el caso concreto de controlador.
-----------------------------------------------
### Explique los verbos REST

##### GET
  > GET : Para recuperar un recurso. Es idempotente, es decir si la ejecutamos más de una vez siempre devuelve el mismo recurso.
##### POST
  > POST : Para añadir recursos. No es idempotente, es decir si la ejecutamos dos veces estaremos añadiendo dos recursos.
##### PUT
  > PUT : Para modificar un recurso. Es idempotente, si la ejecutamos más de una vez la modificación es siempre la misma.
##### DELETE
  > DELETE : Para borrar un recurso. Es idempotente, si lo ejecutamos más de una vez el resultado es siempre el mismo: el recurso deja de estar en el sistema (la primera vez se borra realmente, las siguientes veces simplemente se ignora la petición, pero no da error).
##### HEAD
  > HEAD : Para pedir un recurso sin recuperarlo, nos sirve para saber si existe o para traer metainformación sobre el recurso.
##### OPTIONS
  > OPTIONS : Para preguntarle a un servidor sobre que otros verbos son aplicables a un recurso determinado.
##### PATH
  > PATH : Es un intento de expresar de forma estándar actualizaciones parciales de un recurso.
-----------------------------------------------
@Matias_Simone

