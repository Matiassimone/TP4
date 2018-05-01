
# TP4_TSSI


### Explique los siguientes Goals


###### Mvn Clean
    Aca va el MVN Clean.
###### Mvn compile
    Aca va el MVN Clean.
###### Mvn package
    Aca va el MVN Clean.
###### Mvn install
    Aca va el MVN Clean.
    
    

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
