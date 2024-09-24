package org.juansefdz.Creacionales.AbstractFactory.classes;

abstract public class PizzeriaAbstractFactory {

    public ProductoPizza ordenarPizza(String tipo) {
        ProductoPizza pizza = crearPizza(tipo);
        System.out.println("Ordenando la pizza: " + pizza.getNombrePizza());
        pizza.prepararPizza();
        pizza.cocinarPizza();
        pizza.cortarPizza();
        pizza.empacarPizza();

        return pizza;

    }

    abstract ProductoPizza crearPizza(String tipo);

}
