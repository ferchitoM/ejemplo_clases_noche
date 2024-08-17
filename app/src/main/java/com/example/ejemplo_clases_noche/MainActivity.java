package com.example.ejemplo_clases_noche;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.ejemplo_clases_noche.modelos.Factura;
import com.example.ejemplo_clases_noche.modelos.Producto;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Factura> facturas;
    ArrayList<Producto> productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        crearProductosBase();

        facturas = new ArrayList<Factura>();

        int contadorFacturas = 0;
        contadorFacturas = facturas.size(); //tamaño del arreglo de facturas

        Factura f1;
        f1  = new Factura();
        f1  .agregarProducto(productos.get(0), 1); //1 - Portatil A



    }

    private void crearProductosBase(){

        //Supongamos que estos productos provienen de la base de datos
        productos = new ArrayList<Producto>();
        productos.add(new Producto("Portátil A", 2000000, 19));
        productos.add(new Producto("Portátil B", 2000000, 19));
        productos.add(new Producto("Portátil C", 1500000, 16));
    }


}