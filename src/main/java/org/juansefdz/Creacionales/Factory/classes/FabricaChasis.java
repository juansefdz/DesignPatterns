package org.juansefdz.Creacionales.Factory.classes;

import org.juansefdz.Creacionales.Factory.FabricaCreacionVehiculo;

// Clase que implementa la interfaz FabricaCreacionVehiculo
// y sobreescribe el método crearParteVehiculo()

public class FabricaChasis implements FabricaCreacionVehiculo {
    @Override
    public String crearParteVehiculo() {
        return "Creando chasis para el vehiculo";
    }
}
