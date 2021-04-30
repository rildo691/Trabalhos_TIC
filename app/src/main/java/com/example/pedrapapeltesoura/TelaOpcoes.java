package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class TelaOpcoes extends AppCompatActivity {
    ImageView imgPedra;
    ImageView imgPapel;
    ImageView imgTesoura;
    ImageView imgComputador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_opcoes);
        imgPedra = (ImageView) findViewById(R.id.imgPedra);
        imgPapel = (ImageView) findViewById(R.id.imgPapel);
        imgTesoura = (ImageView) findViewById(R.id.imgTesoura);
        imgComputador = (ImageView) findViewById(R.id.imageView);

        imgPedra.setOnClickListener(v->{

        });
    }
}