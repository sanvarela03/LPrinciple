package model;

import model.vehiculos.VehiculoConTarifa;

public class Impuesto {

    static public void calcularImpuesto(VehiculoConTarifa vehiculo){

        double valorImpuesto = vehiculo.getValorComercial()*vehiculo.obtenerTarifa().getValor();

        System.out.println("El impuesto es de: " + valorImpuesto);
    }
}
