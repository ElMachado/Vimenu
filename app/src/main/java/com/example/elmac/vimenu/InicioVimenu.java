package com.example.elmac.vimenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;

public class InicioVimenu extends AppCompatActivity {
    private View btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_vimenu);

        btn=(Button) findViewById(R.id.buttonVerubicacion);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                //acceder al Activity_Hubicacion_vimenu
                Intent intent=new Intent(InicioVimenu.this,HubicacionVimenu.class);
                startActivity(intent);
            }

        });
    }
}
