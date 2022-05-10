package com.example.proyectododoantho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ArrozChino extends AppCompatActivity {
    String attozChino = "Arroz Chino";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arroz_chino);

    }

    public void pagar(View view) {
        Intent o = new Intent(ArrozChino.this, Factura.class);
        o.putExtra("Arroz Chino",attozChino);
        Intent i = new Intent(ArrozChino.this, Pagar.class);
        startActivity(i);
    }
}