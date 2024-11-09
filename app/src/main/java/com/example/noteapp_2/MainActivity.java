package com.example.noteapp_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    // Variables que se utilizaran
    EditText txtTitulo, txtCuerpo, txtNotaEliminar;
    Button btnAgregarNota, btnEliminarNota;
    ListView listNotas;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);









    }
}