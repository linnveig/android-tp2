package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText textTipo, textNombre, textRaza, textEdad, textCausa;
    private Button continuar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textTipo=(EditText)findViewById(R.id.textTipo);
        textNombre=(EditText)findViewById(R.id.textNombre);
        textRaza=(EditText)findViewById(R.id.textRaza);
        textEdad=(EditText)findViewById(R.id.textEdad);
        textCausa=(EditText)findViewById(R.id.textCausa);

        continuar=findViewById(R.id.btnContinuar);
        continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento=new Intent(MainActivity.this, Medicos.class);
                ArrayList<String> datos=new ArrayList<String>();
                int datosIngresados=datos.size();

                if (datosIngresados!=0){
                    datos.add(textTipo.getText().toString());
                    datos.add(textNombre.getText().toString());
                    datos.add(textRaza.getText().toString());
                    datos.add(textEdad.getText().toString());
                    datos.add(textCausa.getText().toString());
                }
                else{
                    //Toast.makeText(this, "Por vavor ingrese datos", Toast.LENGTH_LONG).show();
                }
                intento.putExtra("datos", datos);
                startActivity(intento);
            }
        });


    }
}