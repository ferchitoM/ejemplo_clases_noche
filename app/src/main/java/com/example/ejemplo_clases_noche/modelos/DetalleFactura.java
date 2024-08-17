package com.example.ejemplo_clases_noche.modelos;

public class DetalleFactura {

    public int cantidad;
    public String descripcion;
    public double vUnitario;
    public double iva;
    public double vTotal;

    public DetalleFactura(){
        this.cantidad = 0;
        this.descripcion = "";
        this.vUnitario = 0;
        this.iva = 0;
        this.vTotal = 0;
    }

    public DetalleFactura(int cantidad, String descripcion, double vUnitario, double iva, double vTotal){
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.vUnitario = vUnitario;
        this.iva = iva;
        this.vTotal = vTotal;
    }

    public void calcularSubtotal(){

    }

    public void calcularIva(){

    }
}
