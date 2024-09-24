package org.juansefdz.Creacionales.AbstractFactory.classes.Productos;

import org.juansefdz.Creacionales.AbstractFactory.classes.ProductoPizza;

public class Vegetariana extends ProductoPizza {

    public Vegetariana() {

        super();
        this.nombrePizza = "Vegetariana";
        this.tipoMasa = "Masa delgada";
        this.tipoSalsa = "Salsa napolitana";
        this.Ingredientes.add("Queso cheddar");
        this.Ingredientes.add("Tomate secos");
        this.Ingredientes.add("Aceitunas");
        this.Ingredientes.add("Pimientos asados");
    }

    @Override
    public void cocinarPizza() {
        System.out.println("Cocinando la pizza: " + this.nombrePizza);
    }

    @Override
    public void cortarPizza() {

        System.out.println("nuestro chef está cortando la pizza: " + this.nombrePizza);
    }

    @Override
    public String getNombrePizza() {
       System.out.println("La pizza es: " + this.nombrePizza);
        return this.nombrePizza;
    }

   
}
