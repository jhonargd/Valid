# Valid

# Arquitectura: 
Para este proyecto se trabajo la arquitectura MVC. El modelo representa la entidad Registro cargada de base de datos. El controlador quien comunica las acciones del usuario en la vista con el modelo de datos por medio de la clase RegistroController. y por ultimo la vista desarrollada en JSP para ilustrar la informacion al usuario.

# Patrones de diseño implementados:

Patron Dao: Para poder acceder a la informacion de la base de datos, para este caso RegistroDAO quien implementa los metodos de obtener la lista, actualizar o agregar un objeto de la entidad.

Patron Inyeccion de dependencias: Para poder usar la dependecias JDBC y las implementaciones de los DAO. Para el caso de SpringBoot con la anotación @Autowired.

# Consideraciones:
Adicuonal a esto, se trabajo teniendo en cuenta los principios SOLID.

Principio de responsabilidad unica: Cada una de las clases o entidades del proyecto cumple una unica funcion.

principio de abierto cerrado: no aplica.

principio de substitucion de Liskov: no aplica.

principio de segregacion de interfaz: las clases implementan interfaces de las cuales van a hacer uso de ellas.

principio de inversion de deoendencias: no aplica.
