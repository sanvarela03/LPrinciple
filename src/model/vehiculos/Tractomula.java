package model.vehiculos;

import model.tarifas.Tarifa;
import model.tarifas.TarifaTractomula;

public class Tractomula extends VehiculoConTarifa {

    @Override
    public Tarifa obtenerTarifa() {
        Tarifa tarifa = new TarifaTractomula();
        return tarifa.cacularTarifa(this);
    }
}
