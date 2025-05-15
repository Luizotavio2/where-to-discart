package com.example.enderecos;

import android.annotation.SuppressLint;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;



import android.widget.TextView;



public class MainActivity2 extends AppCompatActivity {

    TextView textResultado;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textResultado = findViewById(R.id.textResultado);

        String tipoLixo = getIntent().getStringExtra("TIPO_LIXO");

        String resultado = "";

        switch (tipoLixo) {
            case "Papel":
                resultado = "📍 Papelaria Central\n📍 EcoPonto Avenida 10";
                break;
            case "Plástico":
                resultado = "📍 Mercado Verde\n📍 Ponto Limpo Zona Leste";
                break;
            case "Vidro":
                resultado = "📍 Vidraçaria São José\n📍 Ponto Ecológico Rua B";
                break;
            case "Eletrônicos":
                resultado = "📍 Loja TechReuso\n📍 EletroPonto Centro";
                break;
            case "Orgânico":
                resultado = "📍 Horta Comunitária\n📍 Composteira Urbana Sul";
                break;
        }

        textResultado.setText("Locais para descarte de " + tipoLixo + ":\n\n" + resultado);
}
}