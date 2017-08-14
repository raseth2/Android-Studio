package com.example.samuel.practica01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    public final static String EXTRA_MESSAGE = "com.example.samuel.practica01.MESSAGE";
    public void Enviar(View view){
        Intent intent = new Intent(this,MostrarParrafoActivity.class);
        EditText editText = (EditText)findViewById(R.id.edit_parrafo);
        EditText editnumero = (EditText)findViewById(R.id.edit_numero);

        String editNumero = editnumero.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,editNumero);

        String editParrafo = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,editParrafo);

        startActivity(intent);
    }
}
