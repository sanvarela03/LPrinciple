package model.tarifas;

import model.vehiculos.Automovil;
import model.vehiculos.Vehiculo;
import model.vehiculos.VehiculoConTarifa;

public abstract class Tarifa {

    public abstract double cacularTarifa(VehiculoConTarifa automovil);

}
