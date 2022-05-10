package com.example.proyectododoantho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlimentsMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aliments_menu);
    }

    public void GoComidaChina(View view) {
        Intent i = new Intent(AlimentsMenu.this,ComidaChina.class);
        startActivity(i);
    }
}