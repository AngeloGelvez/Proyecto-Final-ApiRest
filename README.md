# Trabajo Final

### Problema 

Una agencia inmobiliaria posee varias oficinas. Ya que la ficha de cada inmueble se encuentra en la oficina a la que se ha dirigido el propietario para ponerlo en venta o alquiler, la forma de compartir esta información actualmente es consultándola telefónicamente entre oficinas. A continuación se detallan los datos que se desea conocer sobre los inmuebles, que pueden ser pisos nuevos (apartamentos nuevos), pisos de ocasión(apartamentos usados), villas, casas y locales.

De todos los tipos de inmueble se desea conocer la superficie en m2 y la dirección completa; si se trata de una villa, hay que especificar además el tamaño de la parcela y la urbanización en la que se encuentra. De pisos, villas y casas se quiere conocer cuántas estancias posee de cada tipo: habitaciones, baños, aseos,cocinas, etc., y sus características específicas: si tiene gas ciudad, puerta blindada, parquet, etc. De los locales sólo se quiere conocer sus características: número de puertas de entrada, si es diáfano (vitrina a la calle), si está acondicionado, etc. De pisos, casas y locales se desea conocer la zona de la ciudad en la que se encuentran.

Estas zonas son las mismas en las que se encuentra dividido el mapa de la ciudad que se hay en cada oficina y que se utiliza para mostrar la localización de los inmuebles. Los inmuebles pueden ofrecerse sólo para venta, sólo para alquiler, o para venta o alquiler.

En cualquier caso, se desea conocer el precio, ya sea de venta o alquiler. Cada inmueble tiene un número de referencia, e interesa el nombre y el teléfono del propietario. Si se posee llaves del inmueble, se deberá reflejar en qué oficina se encuentran. Además, para cada inmueble se deben anotar las visitas que se han realizado o se van a realizar, con los datos del cliente, fecha y hora de la visita y un comentario sobre la impresión que ha manifestado el cliente al respecto. La información se guarda actualmente en fichas.

### Solución

Desarrollo de un API para la Gestión de Inmuebles en una Agencia Inmobiliaria
Descripción: La agencia inmobiliaria necesita una solución eficiente para gestionar la información de los inmuebles que posee en varias de sus oficinas. Actualmente, la información se comparte telefónicamente entre oficinas, lo que es ineficiente. Se requiere desarrollar un API con Spring Boot para centralizar y gestionar la información de los inmuebles de manera efectiva.

Requisitos Funcionales:

Servicios de Gestión de Inmuebles:

Crear un nuevo inmueble.
Obtener detalles de un inmueble por su número de referencia.
Listar inmuebles disponibles para venta o alquiler.
Registrar una visita a un inmueble.
Servicios de Gestión de Oficinas:

Crear una nueva oficina.
Actualizar la información de una oficina existente.
Eliminar una oficina.
Servicios de Gestión de Clientes:

Crear un nuevo cliente.
Actualizar la información de un cliente existente.

Tecnologías Utilizadas:

- Spring Boot para el desarrollo del API RESTful.
- Spring Data JPA para el acceso a la base de datos.
- Base de datos relacional H2 (opcinal por ejemplo, MySQL, PostgreSQL) para almacenar los datos.
- Datos de pruebas. Debe tener un archivo import.sql con los scripts para crear datos iniciales de pruebas
- Usar DTO. En la capa externa (controllers) no se debe exponer las clases entities, por lo tanto, se debe usar DTO, además de ser un buena práctica se soluciona el problema de loop de serializable y no es necesario de resolverlo con @JsonIgnoreProperties
