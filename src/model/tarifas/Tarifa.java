package model.tarifas;

import model.vehiculos.Automovil;
import model.vehiculos.Vehiculo;
import model.vehiculos.VehiculoConTarifa;

public abstract class Tarifa {

    private double valor;

    public abstract Tarifa cacularTarifa(VehiculoConTarifa automovil);

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
