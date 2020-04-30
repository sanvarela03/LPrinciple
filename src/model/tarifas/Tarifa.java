package model.tarifas;

import model.vehiculos.VehiculoConTarifa;

public abstract class Tarifa {

    private double valor;

    public double getValor() { return valor; }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public abstract Tarifa cacularTarifa(VehiculoConTarifa automovil);
}
