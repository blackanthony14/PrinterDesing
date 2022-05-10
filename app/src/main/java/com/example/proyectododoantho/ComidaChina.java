package com.example.proyectododoantho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ComidaChina extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida_china);
    }

    public void SetComidaChina(View view) {
        Intent i = new Intent(ComidaChina.this,ArrozChino.class);
        startActivity(i);
    }

    public void pagar(View view) {
        Intent i = new Intent(ComidaChina.this,Factura.class);
        startActivity(i);
    }

    public void chowmein(View view) {
        Intent i = new Intent(ComidaChina.this,ChouMein.class);
        startActivity(i);
    }

    public void dumplings(View view) {
        Intent i = new Intent(ComidaChina.this,Dumplings.class);
        startActivity(i);
    }
}