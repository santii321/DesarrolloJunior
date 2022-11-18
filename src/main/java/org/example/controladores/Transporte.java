package org.example.controladores;

public class Transporte {

    private String tipoTransporte;
    private double costoTrasporte;
    private String fechaTrasporte;

    public Transporte() {
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public double getCostoTrasporte() {
        return costoTrasporte;
    }

    public void setCostoTrasporte(double costoTrasporte) {

        if (costoTrasporte < 0) {
            System.out.println("Ingrese un valor valido");
        }else {
            this.costoTrasporte = costoTrasporte;
        }
    }

    public String getFechaTrasporte() {
        return fechaTrasporte;
    }

    public void setFechaTrasporte(String fechaTrasporte) {
        this.fechaTrasporte = fechaTrasporte;
    }
}
