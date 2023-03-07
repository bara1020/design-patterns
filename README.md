# Patrones creacionales

## Builder:
Para crear objetos complejos paso a paso.

## Factory Method:
Se utiliza para crear objetos comunes a partir de una interfaz. Por ejemplo un carrito de compras que tiene un tipo de producto. O se tiene un notificador de eventos que lo puede hacer por diferentes canales. O una aplicación que tiene multiples campañas con descuentos ya definidos.

Básicamente es si se tiene un objeto el cual puede llegar a tener varios tipos, se puede crear una interfaz y por cada tipo se hace una implementación.

## Abstract factory:
Nos permite producir familias de objetos relacionados sin especificar sus clases concretas.

Básicamente es un conjunto de FactoryMethods, en el cual se crea un factory por cada grupo de objetos.

Builder se enfoca en construir objetos complejos, paso a paso. Abstract Factory se especializa en crear familias de objetos relacionados. Abstract Factory devuelve el producto inmediatamente, mientras que Builder te permite ejecutar algunos pasos adicionales de construcción antes de extraer el producto.

## Prototype:
Se utiliza cuando se tiene una plantilla base para iniciar la construcción de un objeto. Este nos permite copiar o clonar objetos ya existentes sin que el código dependa de sus clases. En este se utiliza el "cloneable" de java la cual hace que la clase se convierta en una clase clonable.

## Singleton:

Es un patrón de diseño creacional que nos permite asegurarnos de que una clase tenga una única instancia, a la vez que proporciona un punto de acceso global a dicha instancia.

Es utilizado cuando se requieren hacer conexiones con sistemas externos como bases de datos, caché, colas etc. En las que no es necesario realizar multiples conexiones si no que se hace una única conexión y es utilizada en todo el código.

Una clase fachada a menudo puede transformarse en una Singleton, ya que un único objeto fachada es suficiente en la mayoría de los casos


# ESTRUCTURALES

## ADPATER:
Permite la interacción entre objetos con interfaces incompatibles Su principal objetivo es la reutilización. Se hacemeja a los adaptadores de la vida real que permiten por ejemplo convertir un tipo de entrada en una salida diferente para poder hacer la conexión.

Por ejempplo cuando queremos usar código existente, pero la interfaz no es compatible con el resto del código o cuando requerimos agregar funcionalidad a sub-clases sin modificar la super clase.

## BRIDGE
Cuando se necesita separar la abstracción de la implementación. Básicamente es implementar una interfaz o clase abtracta con el comportamiento en comun que tiene un sistema pero que de manera independiente de pueden comportar de manera diferente. (Es el objetivo de implementar las interfaces)

## FACADE:
Este le permite al cliente simplificar la utilización de nuestro sistema sin necesidad de tener toda la complejidad que tiene por dentro para poder ejecutar o llegar a un objetivo. Por ejemplo si se desea hacer el envío de un email y que esa información del envío se guarde en un sistema externo o tenga que hacer consulta en base de datos para poder armar el objeto final para hacer el envío.

## PROXY:
Permite tener un intermediario o ejecutar algo antes de ejecutar la funcion final. Se utiliza cuando se requiere acceso a objetos muy pesados que hacen que el rendimiento de la plataforma se degrade, para ello en el proxi se hacen consultas en caché, disco locales etc 

## DECORATOR:
Permite agregar nuevas caracteristicar a un objeto en especifico en tiempo de ejecución

## COMPOSITE:
Permite componer objetos en forma de arbol, es muy util cuando se requiere sistemas que manejan jerarquias, por ejemplo un sistema de distribución donde se puede incluir varios objetos en una caja o en subcajas de empaque, o por ejemplo un sistema donde se maneja el sistema de jerarquias entre roles de la compañia.

## FLYWIGHT
Este patron permite optimizar el manejo de la menoria cuando se requiere manejar sistemas con valores estaticos por ello, este patron es inmutable, ya que un objeto se instancia una única vez al no tener que cambiar el valor dentro de la aplicación

Para un acceso más cómodo a varios objetos flyweight, puedes crear un método fábrica que gestione un grupo de objetos flyweight existentes. El método acepta el estado intrínseco del flyweight deseado por un cliente, busca un objeto flyweight existente que coincida con este estado y lo devuelve si lo encuentra. Si no, crea un nuevo objeto flyweight y lo añade al grupo.

# PATRONES DE COMPORTAMIENTO

## CHAIN OF RESPONSABILITY
Este patron permite crear una cadena de manejadores que se relacionan uno entre si. Cada manejador tiene su lógica individual y está encargada de ejecutar el siguente manejador que se encuentra dentro de la cadena.
Un ejemplo de este es un sistema de aprobación de casos donde debe pasar por un flujo de aprobación para que puede ser ejecutado. Cada manejador sería cada aprobador que tiene que ejecutar ciertas acciones antes de realizar la aprobación y se encarga de realizar o no la aprobación.

## COMMAND
Este patron permite independicar la ejecutación de tareas administradas por una única interfaz. Con este patrón cada tare es independiente, y el añadir nuevas tareas o funcionalides no afecta a las demás por lo cual es muy facil de realizar. 
Un ejemplo de este patrón un cuando se pueden ejecutar multiples tareas desde diferentes puntos de la aplicación y se maneja el mismo tipo de objeto, por ejemplo si se tiene la función de copiar o pegar un objeto o texto, no importa desde que punto se llame a la función de copiar, siempre se hará el llamado a la implementación de la ejecución y se aplica la misma lógica asi se llame desde firentes puntos.

## ITERATOR
Este patrón es utilizado para permitir iterar o recorrer diferentes tipos de colecciones sin que el cliente conozca de que tipo es (lista, pila, árbol, etc).

## MEDIATOR
Mediator centraliza la comunicación entre componentes del sistema. Los componentes conocen únicamente el objeto mediador y no se comunican directamente.
El ejemplo más común sería un chat, donde se encuentra un mediador el cual recibe las peticiones para el envío de un mensaje y este es el encargado de mandarlo al resto de usuarios registrados en el chat.

## MEMENTO
Permite guardar y restaurar el estado previo de un objeto lo que quiere decir que es comunmente utilizado para guardar las versiones que se han guardado de una documento o plantilla.

## OBSERVE
Este patrón permite crear un mecanismo basado en em modelo de suscripción el cual le permite realizar notificaciónes a todos los clientes que se encuentre suscritos a él. Por ejemplo si una grupo de personas se suscriben a una cuenta de una red social, y quien es dueño de la cuenta hace una publicación, dicha publicación se envía a todas las personas que se suscribieron a dicha cuenta.

## STATE
Este patrón es utilizado cuando se necesita que el comportamiento de un objeto se altere dependiendo del estado en que se encuentre. Por ejemplo si se tiene un objeto encargado de enviar una notificación ya sea por sms o email, dependiente del tipo de envío (estado) ejecuta la notificación por uno u otro canal (email o sms).

## STRATEGY
Este patrón se utiliza cuando en un sistema de tiene la posibilidad de ejecutar algo de diferentes maneras y el cliente es quien toma la decisión de cual camino tomar. Por ejemplo si se tiene un sistema que envia un mensaje otp y el cliente puede seleccionar si desea enviar por email o por sms, o en una tiene cuando se va a realizar un pago si el pago quiere que se haga por crédito o débito.

# COMPARACIÓN ENTRE PATRONES


- Adapter cambia la interfaz de un objeto existente mientras que Decorator mejora un objeto sin cambiar su interfaz. Además, Decorator soporta la composición recursiva, lo cual no es posible al utilizar Adapter.

- Adapter proporciona una interfaz diferente al objeto envuelto, Proxy le proporciona la misma interfaz y Decorator le proporciona una interfaz mejorada

- Facade define una nueva interfaz para objetos existentes, mientras que Adapter intenta hacer que la interfaz existente sea utilizable. Normalmente Adapter sólo envuelve un objeto, mientras que Facade trabaja con todo un subsistema de objetos.

- Facade y Mediator tienen trabajos similares: ambos intentan organizar la colaboración entre muchas clases estrechamente acopladas.

- Facade define una interfaz simplificada a un subsistema de objetos, pero no introduce ninguna nueva funcionalidad. El propio subsistema no conoce la fachada. Los objetos del subsistema pueden comunicarse directamente.

- Mediator centraliza la comunicación entre componentes del sistema. Los componentes conocen únicamente el objeto mediador y no se comunican directamente.

- Se puede manejar un Builder cuando la jerarquia es muy compleja en vez de Composite.

- Un Decorator es como un Composite pero sólo tiene un componente hijo. Hay otra diferencia importante: Decorator añade responsabilidades adicionales al objeto envuelto, mientras que Composite se limita a “recapitular” los resultados de sus hijos.

- Los diseños que hacen un uso amplio de Composite y Decorator a menudo pueden beneficiarse del uso del Prototype. Aplicar el patrón te permite clonar estructuras complejas en lugar de reconstruirlas desde cero.

- Flyweight podría asemejarse a Singleton si de algún modo pudieras reducir todos los estados compartidos de los objetos a un único objeto flyweight. Pero existen dos diferencias fundamentales entre estos patrones:
 - Solo debe haber una instancia Singleton, mientras que una clase Flyweight puede tener varias instancias con distintos estados intrínsecos.
 - El objeto Singleton puede ser mutable. Los objetos flyweight son inmutables.
 - Chain of Responsibility, Command, Mediator y Observer abordan distintas formas de conectar emisores y receptores de solicitudes:
 - Chain of Responsibility pasa una solicitud secuencialmente a lo largo de una cadena dinámica de receptores potenciales hasta que uno de ellos la gestiona.

- Command establece conexiones unidireccionales entre emisores y receptores.

- Mediator elimina las conexiones directas entre emisores y receptores, forzándolos a comunicarse indirectamente a través de un objeto mediador.

- Observer permite a los receptores suscribirse o darse de baja dinámicamente a la recepción de solicitudes.

- Puedes utilizar Command y Memento juntos cuando implementes “deshacer”. En este caso, los comandos son responsables de realizar varias operaciones sobre un objeto destino, mientras que los mementos guardan el estado de ese objeto justo antes de que se ejecute el comando.

- Puedes utilizar Command para convertir cualquier operación en un objeto. Los parámetros de la operación se convierten en campos de ese objeto. La conversión te permite aplazar la ejecución de la operación, ponerla en cola, almacenar el historial de comandos, enviar comandos a servicios remotos, etc.

- Por su parte, Strategy normalmente describe distintas formas de hacer lo mismo, permitiéndote intercambiar estos algoritmos dentro de una única clase contexto.

- Puedes utilizar Command y Memento juntos cuando implementes “deshacer”.

- Chain of Responsibility, Command, Mediator y Observer abordan distintas formas de conectar emisores y receptores de solicitudes:

- Chain of Responsibility pasa una solicitud secuencialmente a lo largo de una cadena dinámica de receptores potenciales hasta que uno de ellos la gestiona.

- Command establece conexiones unidireccionales entre emisores y receptores.

- Mediator elimina las conexiones directas entre emisores y receptores, forzándolos a comunicarse indirectamente a través de un objeto mediador.

- Observer permite a los receptores suscribirse o darse de baja dinámicamente a la recepción de solicitudes.

- cambian el comportamiento del contexto delegando parte del trabajo a objetos ayudantes. Strategy hace que estos objetos sean completamente independientes y no se conozcan entre sí. Sin embargo, State no restringe las dependencias entre estados concretos, permitiéndoles alterar el estado del contexto a voluntad.

## Referencía:
Documentación teória obtenida de https://refactoring.guru/es/design-patterns/state