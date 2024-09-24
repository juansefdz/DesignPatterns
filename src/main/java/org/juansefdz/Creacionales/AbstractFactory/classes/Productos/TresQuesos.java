package org.juansefdz.Creacionales.AbstractFactory.classes.Productos;

import org.juansefdz.Creacionales.AbstractFactory.classes.ProductoPizza;

public class TresQuesos extends ProductoPizza {

    public TresQuesos() {

        super();
        this.nombrePizza = "TresQuesos";
        this.tipoMasa = "Masa extra gruesa";
        this.tipoSalsa = "Salsa vechamel";
        this.Ingredientes.add("Queso cheddar");
        this.Ingredientes.add("Queso mozzarella");
        this.Ingredientes.add("Queso parmesano");
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
