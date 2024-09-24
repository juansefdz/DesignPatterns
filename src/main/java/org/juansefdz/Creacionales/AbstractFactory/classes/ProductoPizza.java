package org.juansefdz.Creacionales.AbstractFactory.classes;

import java.util.ArrayList;
import java.util.List;

//ABSTRACT FACTORY
/**
 * El patrón Abstract Factory es un patrón de diseño creacional que nos permite
 * producir familias de objetos relacionados sin especificar sus clases
 * concretas.
 * 
 */

abstract public class ProductoPizza {

    protected String nombrePizza;
    protected String tipoMasa;
    protected String tipoSalsa;
    protected List<String> Ingredientes;

    public ProductoPizza() {
        this.Ingredientes = new ArrayList<>();
    }

    public void prepararPizza() {
        System.out.println("Preparando la pizza: " + this.nombrePizza);
        System.out.println("Tipo de masa: " + this.tipoMasa);
        System.out.println("Tipo de salsa: " + this.tipoSalsa);
        System.out.println("Ingredientes: ");
        for (String ingrediente : Ingredientes) {
            System.out.println(ingrediente);
        }
    }

    abstract public  void cocinarPizza();

    abstract public  void cortarPizza();

    public void empacarPizza() {
        System.out.println("Empacando la pizza: " + this.nombrePizza);
    }

    @Override
    public String toString() {
        return "Pizza: " + this.nombrePizza + " Masa: " + this.tipoMasa + " Salsa: " + this.tipoSalsa;
    }

    public abstract String getNombrePizza();

}
