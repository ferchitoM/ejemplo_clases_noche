package com.example.ejemplo_clases_noche.modelos;

import java.util.ArrayList;

public class Factura {

    public int numeroFactura;
    public ArrayList<DetalleFactura> productos;

    public Factura(){
        this.numeroFactura = 0;
        this.productos = new ArrayList<DetalleFactura>();
    }

    public Factura(int numeroFactura, ArrayList<DetalleFactura> productos){
        this.numeroFactura = numeroFactura;
        this.productos = productos;
    }

    public String getNumeroFactura(int contador){
        return "";
    }

    public void agregarProducto(Producto p, int cantidad){

        DetalleFactura df = new DetalleFactura(
                cantidad,
                p.descripcion,
                p.vUnitario,
                p.porcentajeIva,
                0);

        productos.add(df);

    }

    public void calcularSubtotal(){

    }

    public void calcularIva(){

    }

    public void calcularTotalPagar(){

    }

    public void calcularCambio(){

    }

    public void mostrarDetalleProducto(){

    }

}
