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

## FACHADA:
Este le permite al cliente simplificar la utilización de nuestro sistema sin necesidad de tener toda la complejidad que tiene por dentro para poder ejecutar o llegar a un objetivo. Por ejemplo si se desea hacer el envío de un email y que esa información del envío se guarde en un sistema externo o tenga que hacer consulta en base de datos para poder armar el objeto final para hacer el envío.

## PROXY:
Permite tener un intermediario o ejecutar algo antes de ejecutar la funcion final. Se utiliza cuando se requiere acceso a objetos muy pesados que hacen que el rendimiento de la plataforma se degrade, para ello en el proxi se hacen consultas en caché, disco locales etc 

 