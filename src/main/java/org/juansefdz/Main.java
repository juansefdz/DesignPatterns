package org.juansefdz;

import org.juansefdz.Creacionales.AbstractFactory.classes.PizzeriaAbstractFactory;
import org.juansefdz.Creacionales.AbstractFactory.classes.PizzeriaEnvigadoFactory;
import org.juansefdz.Creacionales.AbstractFactory.classes.PizzeriaMedellinFactory;
import org.juansefdz.Creacionales.AbstractFactory.classes.ProductoPizza;
import org.juansefdz.Creacionales.Builder.House;
import org.juansefdz.Creacionales.Builder.HouseBuilder;
import org.juansefdz.Creacionales.Factory.FabricaCreacionVehiculo;
import org.juansefdz.Creacionales.Factory.classes.FabricaChasis;
import org.juansefdz.Creacionales.Factory.classes.FabricaMotor;
import org.juansefdz.Creacionales.Singleton.Singleton;

public class Main {

    public static void main(String[] args) {

        System.out.println("Patrones de diseño");
        System.out.println("Creacionales");
        System.out.println("Singleton");

        // Obtiene la única instancia de la clase Singleton utilizando el método
        // estático getInstancia()
        Singleton singleton = Singleton.getInstancia();

        // Imprime la instancia del Singleton en la consola
        System.out.println(singleton);

        Singleton singleton2 = Singleton.getInstancia();
        System.out.println(singleton2);

        Singleton singleton3 = Singleton.getInstancia();
        System.out.println(singleton3);

        System.out.println(singleton == singleton2 && singleton2 == singleton3);

        System.out.println("--------------------------------------------------");

        System.out.println("Factory");

        // Crea una instancia de la clase FabricaChasis y llama al método
        // crearParteVehiculo()
        FabricaCreacionVehiculo fabricaChasis = new FabricaChasis();
        System.out.println(fabricaChasis.crearParteVehiculo());
        // Crea una instancia de la clase FabricaMotor y llama al método
        // crearParteVehiculo()
        FabricaCreacionVehiculo fabricaMotor = new FabricaMotor();
        System.out.println(fabricaMotor.crearParteVehiculo());
        System.out.println("--------------------------------------------------");

        // ABSTRACT FACTORY
        System.out.println("--------------------------------------------------");

        System.out.println("ABSTRACT FACTORY");

        PizzeriaAbstractFactory pizzeriaMedellin = new PizzeriaMedellinFactory();
        PizzeriaAbstractFactory pizzeriaEnvigado = new PizzeriaEnvigadoFactory();

        ProductoPizza pizza = pizzeriaMedellin.ordenarPizza("Salami");
        System.out.println("En Medellin se ha ordenado la pizza:  " + pizza.getNombrePizza());
        ProductoPizza pizza2 = pizzeriaEnvigado.ordenarPizza("Vegetariana");
        System.out.println("En Envigado se ha ordenado la pizza: " + pizza2.getNombrePizza());

        System.out.println
        ("--------------------------------------------------");

        // BUILDER
        System.out.println("--------------------------------------------------");

        System.out.println("BUILDER");
        House house = new HouseBuilder("CONCRETO", "ACERO", "TEJA", 3, 2)
        .setGarage(true)
        .setSwimmingPool(true)
        .setInterior("MODERNO")
        .build();

        System.out.println("La casa solicitada quedó con las siguientes especificaciones:  "+house);

    }

    
}