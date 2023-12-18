package com.example.pry_proyectofinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnJuego1, btnJuego2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.activity_main);
        btnJuego1 = findViewById(R.id.btn_juego1);
        btnJuego2 = findViewById(R.id.btn_juego2);

        btnJuego1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conec = new Intent(MainActivity.this, juego1.class);
                startActivity(conec);
            }
        });

        btnJuego2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent conec = new Intent(MainActivity.this, juego2.class);
                startActivity(conec);
            }
        });


    }

}
