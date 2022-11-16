package com.example.myruta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.net.Inet4Address;

public class MainActivity extends AppCompatActivity {


    ImageButton home;
    ImageButton ruta;
    ImageButton trallectoria;
    ImageButton acerca;
    ImageButton comen;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        home = (ImageButton) findViewById(R.id.home);
        ruta = (ImageButton) findViewById(R.id.bus);
        trallectoria = (ImageButton) findViewById(R.id.ruta);
        acerca = (ImageButton) findViewById(R.id.acer);
        comen = (ImageButton ) findViewById(R.id.comen);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        acerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ac = new Intent(getApplicationContext(), acerca_de.class);
                startActivity(ac);
            }
        });

        trallectoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent map = new Intent(getApplicationContext(), mapa.class);
                startActivity(map);
            }
        });

        ruta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inf = new Intent(getApplicationContext(), info.class);
                startActivity(inf);
            }
        });

        comen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent comenta = new Intent(getApplicationContext(), comentarios.class);
                startActivity(comenta);
            }
        });

    }
}