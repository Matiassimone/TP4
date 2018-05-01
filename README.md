-----------------------------------------------  
![bar](https://getfavicons.com/api/?url=http%3A%2F%2Fwww.utn.edu.ar%2Fdefault.utn) 
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
  >  Instala el paquete en el repositorio local, para usarlo como una dependencia en otros proyectos localmente. `mvn install`
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
