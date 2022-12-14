package org.example.controladores;

import org.example.interfaces.Metodos;

import java.util.Scanner;

public class Transporte {

    private String idEmpleado;
    private String tipoTransporte;
    private double costoTrasporte;
    private String fechaInicioTrasporte;
    private String fechaFinDeTrasporte;
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
            System.out.println("Ingrese un valor de transporte valido");
        }else {
            this.costoTrasporte = costoTrasporte;
        }
    }

    public String getFechaInicioTrasporte() {
        return fechaInicioTrasporte;
    }

    public void setFechaInicioTrasporte(String fechaInicioTrasporte) {
        this.fechaInicioTrasporte = fechaInicioTrasporte;
    }

    public String getFechaFinDeTrasporte() {
        return fechaFinDeTrasporte;
    }

    public void setFechaFinDeTrasporte(String fechaFinDeTrasporte) {
        this.fechaFinDeTrasporte = fechaFinDeTrasporte;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void agregarTransporte(){
        Scanner read= new Scanner(System.in);
        System.out.println("*****DATOS DEL TRASPORTE*****");
        System.out.println("Ingrese el tipo de transporte: ");
        this.setTipoTransporte(read.next());
        System.out.println("Ingrese la fecha de inicio del transporte: ");
        this.setFechaInicioTrasporte(read.next());
        System.out.println("Ingrese la fecha final del transporte: ");
        this.setFechaFinDeTrasporte(read.next());
        System.out.println("Ingrese el costo del transporte: ");
        this.setCostoTrasporte(read.nextDouble());
    }
}
