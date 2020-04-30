package model;

import model.vehiculos.Automovil;
import model.vehiculos.Motocicleta;
import model.vehiculos.Tractomula;

public class Print {

    public static void main(String[] args) {
        ejecutar3L();
    }

    public static void ejecutar3L(){

        Motocicleta motocicleta = new Motocicleta();
        motocicleta.setCilindraje(250);
        motocicleta.setValorComercial(7_000_000);

        Impuesto.calcularImpuesto(motocicleta);


        Automovil automovil = new Automovil();
        automovil.setValorComercial(30_000_000);

        Impuesto.calcularImpuesto(automovil);

        Tractomula tractomula = new Tractomula();

        tractomula.setValorComercial(100);

        Impuesto.calcularImpuesto(tractomula);

    }
}
