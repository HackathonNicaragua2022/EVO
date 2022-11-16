package com.example.myruta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class comentarios extends AppCompatActivity {

    Button env;
    EditText coment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comentarios);


        env = (Button) findViewById(R.id.enviar);
        coment = (EditText) findViewById(R.id.edit);

        env.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String aux = coment.getText().toString();

                coment.setText("");

            }
        });

    }
}