package com.example.noteapp_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Variables que se utilizaran
    EditText txtTitulo, txtCuerpo, txtNotaEliminar;
    Button btnAgregarNota, btnEliminarNota;
    ListView listNotas;

    ArrayList<Nota> notas = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitulo = findViewById(R.id.txtTitulo);
        txtCuerpo = findViewById(R.id.txtCuerpo);
        txtNotaEliminar = findViewById(R.id.txtNotaEliminar);
        btnAgregarNota = findViewById(R.id.btnAgregarNota);
        btnEliminarNota = findViewById(R.id.btnEliminarNota);
        listNotas = findViewById(R.id.listNotas);


    }

    // FUNCIONALIDAD 1 - AGREGAR NOTAS

    public void agregarNotas(View view){

        String titulo = txtTitulo.getText().toString();
        String cuerpo = txtCuerpo.getText().toString();

        if(titulo.isEmpty() || cuerpo.isEmpty()){
            Toast.makeText(this, "Complete los campos", Toast.LENGTH_SHORT).show();
        } else {

            Nota note = new Nota(titulo, cuerpo);

            notas.add(note);

            if(notas.size() > 0){
                Toast.makeText(this, "Nota creada correctamente", Toast.LENGTH_SHORT).show();
                cargarNotas(); // NUEVO METODO PARA CARGAR DATOS LUEGO DE CREAR NOTA

            } else {
                Toast.makeText(this, "La nota no se pudo guardar :(", Toast.LENGTH_SHORT).show();
            }
        }

    }

    // FUNCIONALIDAD 2 - VER NOTAS CREADAS

    public void cargarNotas(){

        if(notas.size() > 0){

            ArrayList<String> contenidoNotas = new ArrayList<>();

            for(int i = 0; i < notas.size(); i++){

                Nota nota = notas.get(i);

                String fila = "Titulo: " + nota.getTitulo() + " Cuerpo: " + nota.getCuerpo();
                contenidoNotas.add(fila);
            }

            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, contenidoNotas);
            listNotas.setAdapter(adapter);

        }


    }







}