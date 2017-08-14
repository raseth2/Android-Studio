package com.example.samuel.practica01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.ArrayList;
import android.app.ListActivity;
import java.util.StringTokenizer;
import android.widget.ArrayAdapter;
public class MostrarParrafoActivity extends AppCompatActivity {
    private ArrayAdapter<String> adaptador1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_parrafo);

        Intent intent = getIntent();
        String parrafo = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String numero = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);


        ListView myTextView = (ListView) findViewById(R.id.myTextView);
        TextView parrafoView = (TextView) findViewById(R.id.activity_mostrar_parrafo);
        TextView NPalabras = (TextView) findViewById(R.id.NPalabras);


        String parrafoVista = String.valueOf(parrafo);
        StringTokenizer st = new StringTokenizer(parrafoVista);
        String nPalabras = String.valueOf(st.countTokens());
        parrafoView.setText(parrafoVista);


        String[] arrayPalabras = parrafo.split(" ");

        int index = new Random().nextInt(arrayPalabras.length);
        for (int i = 1; i <= 5; i++) {

            String Ramdom = arrayPalabras[index];
            List<String> miLista = Arrays.asList(Ramdom);
            // nuemeri+=nuemeri;

            adaptador1 = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, miLista);
        }

        //int number  = rand.nextInt(6)+1;
        ///////int number  = rand.nextInt( Integer.parseInt(nPalabras) )+1;
        // int number = rand.nextInt(parrafoVista.length());
        //////////String Ramdom =String.valueOf(number);

        // myTextView.setText(Ramdom);

        myTextView.setAdapter(adaptador1);
             NPalabras.setText(nPalabras + "     Palabras digitadas");


    }
}
