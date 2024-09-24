package org.juansefdz.Creacionales.AbstractFactory.Productos;

import org.juansefdz.Creacionales.AbstractFactory.classes.ProductoPizza;

public class Salami extends ProductoPizza {

    public Salami() {

        super();
        this.nombrePizza = "Salami";
        this.tipoMasa = "Masa gruesa";
        this.tipoSalsa = "Salsa napolitana";
        this.Ingredientes.add("Queso cheddar");
        this.Ingredientes.add("Salami");
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
