package com.example.proyectododoantho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ChouMein extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chou_mein);
    }

    public void addtoCart(View view) {
        Intent i = new Intent(ChouMein.this, Pagar.class);
        startActivity(i);
    }
}