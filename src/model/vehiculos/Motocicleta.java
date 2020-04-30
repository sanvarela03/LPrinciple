package model.vehiculos;

import model.tarifas.Tarifa;
import model.tarifas.TarifaMotocicleta;

public class Motocicleta extends VehiculoConTarifa{


    private int cilindraje;

    public int getCilindraje(){
        return this.cilindraje;
    }

    public void setCilindraje(int pCilindraje){
        this.cilindraje = pCilindraje;
    }

    @Override
    public double obtenerTarifa() {
        Tarifa tarifa = new TarifaMotocicleta();
        return tarifa.cacularTarifa(this);
    }
}
