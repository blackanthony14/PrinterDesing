package com.example.proyectododoantho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Pagar extends AppCompatActivity {
    TextView platos, cantidades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagar);
        platos = findViewById(R.id.platos);
        cantidades = findViewById(R.id.cantidades);
    }

    public void GoFactura(View view) {
        Intent i = new Intent(Pagar.this,Factura.class);
        startActivity(i);
    }
}