package model.vehiculos;

import model.tarifas.Tarifa;

public abstract class VehiculoConTarifa extends Vehiculo{
    public abstract Tarifa obtenerTarifa();
}
