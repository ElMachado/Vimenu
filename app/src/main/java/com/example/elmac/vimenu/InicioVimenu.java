package com.example.elmac.vimenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

public class InicioVimenu extends AppCompatActivity {
    private View btnUbicacion;
    private View btnVerCarta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_vimenu);

        btnUbicacion=(Button) findViewById(R.id.buttonVerubicacion);
        btnUbicacion.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                //acceder al Activity_ubicacion_vimenu
                Intent intent= new Intent(InicioVimenu.this,UbicacionVimenu.class);
                startActivity(intent);
            }

        });

        btnVerCarta = (Button) findViewById(R.id.buttonVerCarta);
        btnVerCarta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(InicioVimenu.this,Carta_General.class);
                startActivity(intent);
            }
        });
    }
}
