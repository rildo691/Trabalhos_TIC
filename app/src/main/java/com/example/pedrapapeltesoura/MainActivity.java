package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mostrar();
    }

    private  void mostrar(){
        botao = findViewById(R.id.btn);
        botao.setOnClickListener(v->{
            Intent outraTela = new Intent(getApplicationContext(), TelaOpcoes.class);
            startActivity(outraTela);
        });
    }
}