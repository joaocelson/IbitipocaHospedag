package com.jctecnologia.ibitipocahospedagem;

import android.app.Activity;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by JOAOCELSON on 21/12/2015.
 */
public class Comerciantes extends Activity {

    ArrayAdapter<String> adpDados;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comerciante);

        ListView lvComerciantes = (ListView) findViewById(R.id.lvComerciantes);

//        String[] arrayComerciantes = {"JoaoCELSON", "Andressa", "Maria"};
        adpDados = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        lvComerciantes.setAdapter(adpDados);

        adpDados.add("Teste");
        adpDados.add("Joao");

    }

}
