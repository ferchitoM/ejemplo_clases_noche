package com.example.ejemplo_clases_noche.modelos;

import android.icu.number.FormattedNumber;
import android.util.Log;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Locale;

public class Factura {

    public int numeroFactura;
    public ArrayList<DetalleFactura> listaProductos;
    public double subtotal;
    public double iva;
    public double descuento;
    public double totalPagar;
    public String metodoPago;
    public double pagaCon;
    public double cambio;

    public Factura(){
        this.numeroFactura = 0;
        this.listaProductos = new ArrayList<DetalleFactura>();
        this.subtotal = 0;
        this.iva = 0;
        this.descuento = 0;
        this.totalPagar = 0;
        this.metodoPago = "";
        this.pagaCon = 0;
        this.cambio = 0;
    }

    public void setNumeroFactura(int numeroFactura){

        this.numeroFactura = numeroFactura;

    }

    public String getNumeroFactura(){

        String cadena = "";

        for (int i = 4; i >= 0; i--){

            if(this.numeroFactura < Math.pow(10, i))
                cadena += "0";
            else {
                cadena += this.numeroFactura + "";
                break;
            }
        }

        return cadena;

    }

    public void agregarProducto(Producto p, int cantidad){

        DetalleFactura df;
        df = new DetalleFactura();
        df.cantidad = cantidad;
        df.descripcion = p.descripcion;
        df.vTotal = p.vUnitario * cantidad;
        df.vUnitario = p.vUnitario; //Valor unitario = precio del producto

        df.calcularSubtotal(p.porcentajeIva);
        df.calcularIva(p.vUnitario);

        listaProductos.add(df);

    }

    public void calcularValoresFactura(double descuento){

        for (DetalleFactura df : listaProductos){

            subtotal += df.vUnitario;
            iva += df.iva;
            totalPagar += df.vTotal;

        }

        this.descuento = descuento;
        totalPagar = totalPagar - descuento;
    }

    public void calcularCambio(double pagaCon, String metodoPago){
        this.metodoPago = metodoPago;
        this.pagaCon = pagaCon;
        this.cambio = pagaCon - totalPagar;
    }

    public void mostrarDetalleProducto(){

        NumberFormat myFormat = NumberFormat.getCurrencyInstance(new Locale("es", "CO"));
        myFormat.setMaximumFractionDigits(2);


        Log.e("msg", "FACTURA DE VENTA");
        Log.e("msg", "No. " + getNumeroFactura());

        Log.e("msg", "---------------------------------------------------");
        Log.e("msg", "Cant. | Descripcion | V. Unitario | IVA | V.Total");
        Log.e("msg", "---------------------------------------------------");

        for (DetalleFactura df : listaProductos){
            Log.e("msg", df.cantidad + " | " + df.descripcion + " | " + myFormat.format(df.vUnitario) + " COP" + " | " + myFormat.format(df.iva) + " COP" + " | " + myFormat.format(df.vTotal) + " COP");
        }

        Log.e("msg", "---------------------------------------------------");
        Log.e("msg", "");
        Log.e("msg", "Subtotal: " + myFormat.format(subtotal) + " COP");
        Log.e("msg", "IVA: " + myFormat.format(iva) + " COP");
        Log.e("msg", "Descuento: " + myFormat.format(descuento) + " COP");
        Log.e("msg", "Total a pagar: " + myFormat.format(totalPagar) + " COP");
        Log.e("msg", "");
        Log.e("msg", "Metodo de pago: " + metodoPago);
        Log.e("msg", "Paga con: " + myFormat.format(pagaCon) + " COP");
        Log.e("msg", "Cambio: " + myFormat.format(cambio) + " COP");

    }

}
