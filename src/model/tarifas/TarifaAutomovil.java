package model.tarifas;

import model.vehiculos.Automovil;
import model.vehiculos.VehiculoConTarifa;

public class TarifaAutomovil extends Tarifa {
    @Override
    public Tarifa cacularTarifa(VehiculoConTarifa automovil) {

        super.setValor(0.10);

        return this;
    }
}
