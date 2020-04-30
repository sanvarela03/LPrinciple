package model.tarifas;

import model.vehiculos.Automovil;
import model.vehiculos.VehiculoConTarifa;

public class TarifaAutomovil extends Tarifa {
    @Override
    public double cacularTarifa(VehiculoConTarifa automovil) {
        return 0.10;
    }
}
