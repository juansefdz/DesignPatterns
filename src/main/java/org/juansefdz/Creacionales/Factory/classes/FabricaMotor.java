package org.juansefdz.Creacionales.Factory.classes;

import org.juansefdz.Creacionales.Factory.FabricaCreacionVehiculo;

// Clase que implementa la interfaz FabricaCreacionVehiculo
// y sobreescribe el método crearParteVehiculo()
public class FabricaMotor implements FabricaCreacionVehiculo {
    @Override
    public String crearParteVehiculo() {
        return "Creando el motor para el vehiculo";
    }

}