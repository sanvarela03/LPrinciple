package model.tarifas;

import model.vehiculos.VehiculoConTarifa;

public class TarifaTractomula extends Tarifa {
    @Override
    public Tarifa cacularTarifa(VehiculoConTarifa automovil) {

        super.setValor(0.30);

        return this;
    }
}
