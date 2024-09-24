package org.juansefdz.Creacionales.AbstractFactory.classes;

import org.juansefdz.Creacionales.AbstractFactory.classes.Productos.Salami;
import org.juansefdz.Creacionales.AbstractFactory.classes.Productos.TresQuesos;
import org.juansefdz.Creacionales.AbstractFactory.classes.Productos.Vegetariana;

public class PizzeriaMedellinFactory extends PizzeriaAbstractFactory {

    @Override
    ProductoPizza crearPizza(String tipo) {

        ProductoPizza producto = null;
        switch (tipo) {
            case "Vegetariana":
                producto = new Vegetariana();
                break;
            case "TresQuesos":
                producto = new TresQuesos();
                break;
            case "Salami":
                producto = new Salami();
                break;

            default:
                System.out.println("No se encuentra el tipo de pizza");
                break;
        }

        return producto;
    }

}
