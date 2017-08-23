package com.example.elmac.vimenu;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.github.johnpersano.supertoasts.library.Style;
import com.github.johnpersano.supertoasts.library.SuperActivityToast;
import com.github.johnpersano.supertoasts.library.SuperToast;
import com.github.johnpersano.supertoasts.library.utils.PaletteUtils;

public class Carta_General extends AppCompatActivity {
    ImageButton btn_cocinero;
    private View btnBebidas;
    private View btnPlatosF;
    private View btnPostres;
    private View btnRapidas;
    private View btnLicores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carta__general);

        btn_cocinero= (ImageButton) findViewById(R.id.imageButtonCocinero);
        btnBebidas = (Button) findViewById(R.id.buttonBebidas);
        btnPlatosF = (Button) findViewById(R.id.buttonFuertes);
        btnPostres = (Button) findViewById(R.id.buttonPostres);
        btnRapidas = (Button) findViewById(R.id.buttonRapidas);
        btnLicores = (Button) findViewById(R.id.buttonLicores);

        //Accion del imagebutton
        btn_cocinero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = getApplicationContext();
                CharSequence text = "El cocinero a Cargo es José Rodriguez!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        //Accion boton bebidas
        btnBebidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Carta_General.this,Bebidas.class);
                startActivity(intent);
            }
        });

        //Accion Boton Platos
        btnPlatosF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Carta_General.this,PlatosFuertes.class);
                startActivity(intent);
            }
        });
        //Accion Boton Postres
        btnPostres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Carta_General.this,Postres.class);
                startActivity(intent);
            }
        });
        //Accion Boton Rapidas
        btnRapidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Carta_General.this,CRapidas.class);
                startActivity(intent);
            }
        });
        //Accion Boton Licores
        btnLicores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Carta_General.this,Licores.class);
                startActivity(intent);
            }
        });

    }
}
