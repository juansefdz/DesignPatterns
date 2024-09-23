package org.juansefdz.Creacionales.Factory;

/*
 * -----PATRÓN FACTORY ------
*/

/*  El patrón Factory es un patrón de diseño creacional que define una interfaz para crear objetos en una superclase,
     delegando a las subclases la responsabilidad de instanciar un tipo específico de objeto.
     Permite crear objetos relacionados entre sí sin necesidad de especificar su clase concreta, lo que facilita
     la escalabilidad y el mantenimiento del código.
     Es importante respetar el principio de responsabilidad única, donde cada clase tiene una única responsabilidad,
     y el principio de abierto/cerrado, en el que las clases deben estar abiertas para la extensión pero cerradas
     para la modificación, favoreciendo la flexibilidad sin comprometer la estabilidad del sistema.
*/

public interface FabricaCreacionVehiculo {
    String crearParteVehiculo();
}
