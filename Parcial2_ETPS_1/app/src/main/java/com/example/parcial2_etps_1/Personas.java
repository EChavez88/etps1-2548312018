package com.example.parcial2_etps_1;

public class Personas {
    private String nombre, cargo, compania;


    public Personas(String nombre, String cargo, String compania){
        this.nombre=nombre;
        this.cargo=cargo;
        this.compania=compania;
    }
    public String getNombre(){
        return nombre;
    }
    public String getCargo(){
        return  cargo;
    }
    public String getCompania(){
        return compania;
    }
}
