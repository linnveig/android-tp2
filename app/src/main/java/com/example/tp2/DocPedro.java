package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class DocPedro extends AppCompatActivity {

    private EditText textDiagnosticoPedro, textCausasPedro, textMedicamentosPedro, textTratamientoPerdo, textReposoPedro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_juan);

        textDiagnosticoPedro=(EditText)findViewById(R.id.textDiagnosticoJuan);
        textCausasPedro=(EditText)findViewById(R.id.textCausasJuan);
        textMedicamentosPedro=(EditText)findViewById(R.id.textMedicamentosJuan;
        textTratamientoPerdo=(EditText)findViewById(R.id.textTratamientoJuan);
        textReposoPedro=(EditText)findViewById(R.id.textReposoJuan);
    }
}