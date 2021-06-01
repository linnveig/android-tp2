package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class DocJuan extends AppCompatActivity {

    private EditText textDiagnosticoJuan, textCausasJuan, textMedicamentosJuan, textTratamientoJuan, textReposoJuan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_juan);

        textDiagnosticoJuan=(EditText)findViewById(R.id.textDiagnosticoJuan);
        textCausasJuan=(EditText)findViewById(R.id.textCausasJuan);
        textMedicamentosJuan=(EditText)findViewById(R.id.textMedicamentosJuan;
        textTratamientoJuan=(EditText)findViewById(R.id.textTratamientoJuan);
        textReposoJuan=(EditText)findViewById(R.id.textReposoJuan);
    }
}