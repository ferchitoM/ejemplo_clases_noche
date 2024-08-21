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

    public void calcularSubtotal(double porcentajeIva){

        double precio = this.vUnitario;
        this.vUnitario = precio / (1 + (porcentajeIva / 100)); //Subtotal

    }

    public void calcularIva(double precio){

        this.iva = precio - this.vUnitario;
    }
}
