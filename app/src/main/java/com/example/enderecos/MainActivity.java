package com.example.enderecos;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Spinner spinnerLixo;
    Button btnBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerLixo = findViewById(R.id.spinnerLixo);
        btnBuscar = findViewById(R.id.btnBuscar);

        String[] tiposLixo = {
    "♻ Papel", 
    "♻ Plástico", 
    "♻ Vidro", 
    "♻ Eletrônicos", 
    "♻ Orgânico"
};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item, tiposLixo);
        spinnerLixo.setAdapter(adapter);

        btnBuscar.setOnClickListener(v -> {
            String tipoSelecionado = spinnerLixo.getSelectedItem().toString();
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("TIPO_LIXO", tipoSelecionado);
            startActivity(intent);


    });
    }
}