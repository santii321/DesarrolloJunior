package org.example.controladores;

public class Empleado {

    private String id;
    private String nombre;
    private String apellido;
    private int edad;
    private String cargo;
    private double salario;

    public Empleado() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) { if (edad<18){
        System.out.println("Ingrese una edad valida");
    }
    else if (edad>110) {
        System.out.println("Edad invalida");
    }
        else {
        this.edad = edad;
    }

    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        if (cargo.equals("senior")) {
            this.cargo = cargo;
        } else if (cargo.equals("junior")) {
            this.cargo = cargo;
        }else {
            System.out.println("Cargo invalido");
        }

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0 ) {
            System.out.println("Ingresa una cantidad de salario valida");
        }else{
            this.salario = salario;
        }

    }
}
