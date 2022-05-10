package com.example.proyectododoantho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dumplings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dumplings);
    }

    public void addtoCart(View view) {
        Intent i = new Intent(Dumplings.this, Pagar.class);
        startActivity(i);
    }
}