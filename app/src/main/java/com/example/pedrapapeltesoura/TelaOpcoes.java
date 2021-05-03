package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class TelaOpcoes extends AppCompatActivity {
    ImageView imgPedra;
    ImageView imgPapel;
    ImageView imgTesoura;
    ImageView imgComputador;
    TextView resultado;
    ImageView btnFechar;
    ImageView btnRestart;
    Timer timer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_opcoes);
        imgPedra = (ImageView) findViewById(R.id.imgPedra);
        imgPapel = (ImageView) findViewById(R.id.imgPapel);
        imgTesoura = (ImageView) findViewById(R.id.imgTesoura);
        imgComputador = (ImageView) findViewById(R.id.imageView);
        resultado = (TextView) findViewById(R.id.textView2);
        btnFechar = (ImageView) findViewById(R.id.imageView2);
        btnRestart = (ImageView) findViewById(R.id.imageView4);

        int [] minhasImagens = new int[]{R.drawable.papel, R.drawable.pedra, R.drawable.tesoura};
        Random r = new Random();

        imgPedra.setOnClickListener(v->{
            int valor = r.nextInt(minhasImagens.length);
            imgComputador.setImageResource(minhasImagens[valor]);

            if (minhasImagens[valor] == R.drawable.papel){
                resultado.setText("Você perdeu!");
            } else if (minhasImagens[valor] == R.drawable.pedra){
                resultado.setText("Empate!");
            } else if (minhasImagens[valor] == R.drawable.tesoura){
                resultado.setText("Você venceu!");
            }
        });

        imgPapel.setOnClickListener(v->{
            int valor = r.nextInt(minhasImagens.length);
            imgComputador.setImageResource(minhasImagens[valor]);

            if (minhasImagens[valor] == R.drawable.papel){
                resultado.setText("Empate!");
            } else if (minhasImagens[valor] == R.drawable.pedra){
                resultado.setText("Você venceu!");
            } else if (minhasImagens[valor] == R.drawable.tesoura){
                resultado.setText("Você perdeu!");
            }
        });

        imgTesoura.setOnClickListener(v->{
            int valor = r.nextInt(minhasImagens.length);
            imgComputador.setImageResource(minhasImagens[valor]);

            if (minhasImagens[valor] == R.drawable.papel){
                resultado.setText("Você venceu!");
            } else if (minhasImagens[valor] == R.drawable.pedra){
                resultado.setText("Você perdeu!");
            } else if (minhasImagens[valor] == R.drawable.tesoura){
                resultado.setText("Empate!");
            }
        });

        btnFechar.setOnClickListener(v->{
            this.finish();
        });

        btnRestart.setOnClickListener(v->{
            imgComputador.setImageResource(R.drawable.computador);
            resultado.setText("Escolha uma opção abaixo!");
        });
    }
}