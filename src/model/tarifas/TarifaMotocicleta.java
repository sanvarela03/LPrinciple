package model.tarifas;

import model.vehiculos.Automovil;
import model.vehiculos.Motocicleta;
import model.vehiculos.VehiculoConTarifa;

public class TarifaMotocicleta extends Tarifa {

    @Override
    public double cacularTarifa(VehiculoConTarifa automovil) {
        Motocicleta motocicleta = (Motocicleta) automovil;

        if(motocicleta.getCilindraje() >= 125 ){
            return 0.20;

        }else if ( ( motocicleta.getCilindraje() > 10 ) && ( motocicleta.getCilindraje() < 125 ) ){
            return 0.10;
        }
        return  -1;
    }
}
