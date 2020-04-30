package model.vehiculos;



public class Vehiculo {

    private String marca;
    private String modelo;
    private double valorComercial;

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String pMarca){
        this.marca = pMarca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String pModelo){
        this.modelo = pModelo;
    }

    public double getValorComercial(){
        return this.valorComercial;
    }

    public void setValorComercial(double pValorComercial){
        this.valorComercial = pValorComercial;
    }
}
