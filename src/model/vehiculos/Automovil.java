package model.vehiculos;

import model.tarifas.Tarifa;
import model.tarifas.TarifaAutomovil;

public class Automovil extends VehiculoConTarifa{

    private String matricula;

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String pMatricula){
        this.matricula = pMatricula;
    }


    @Override
    public Tarifa obtenerTarifa() {
        Tarifa tarifa = new TarifaAutomovil();
        return tarifa.cacularTarifa(this);
    }
}
