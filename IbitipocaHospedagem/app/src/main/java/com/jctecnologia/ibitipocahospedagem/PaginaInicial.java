package com.jctecnologia.ibitipocahospedagem;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.facebook.FacebookSdk;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/**
 * Created by JOAOCELSON on 19/12/2015.
 */
public class PaginaInicial extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pagina_inicial);

        addListnerOnButton();
    }

    public void addListnerOnButton(){
        ImageButton turista = (ImageButton)findViewById(R.id.btnTurista);
        turista.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(PaginaInicial.this, Turistas.class);
                startActivity(intent);
                }
            });

        ImageButton comerciante = (ImageButton)findViewById(R.id.btnComerciante);
        comerciante.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(PaginaInicial.this, Turistas.class);
                startActivity(intent);
            }
        });
    }
}

