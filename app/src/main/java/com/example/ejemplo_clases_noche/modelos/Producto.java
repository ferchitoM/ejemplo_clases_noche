package com.example.ejemplo_clases_noche.modelos;

public class Producto {

    public String descripcion;
    public double vUnitario;
    public double porcentajeIva;

    public Producto(String descripcion, double vUnitario, double porcentajeIva){
        this.descripcion = descripcion;
        this.vUnitario = vUnitario;
        this.porcentajeIva = porcentajeIva;
    }

    public void listarProductos(){

    }
}
