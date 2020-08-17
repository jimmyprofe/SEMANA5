package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    RecyclerView rv_mascotas;

    ArrayList<perrosVO> listaperros = new ArrayList<perrosVO>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar mitoolbar = (Toolbar) findViewById(R.id.miactionbar);
        setSupportActionBar(mitoolbar);



        rv_mascotas = (RecyclerView) findViewById(R.id.rv_mascotas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv_mascotas.setLayoutManager(llm);

        llenarlista();


        Adaptadorperros adaptador = new Adaptadorperros(listaperros, this);
        rv_mascotas.setAdapter(adaptador);


    }

    public void llenarlista (){

        listaperros.add(new perrosVO(R.drawable.perro_1, "Catty", 3));
        listaperros.add(new perrosVO(R.drawable.perro_2, "Ronny", 2));
        listaperros.add(new perrosVO(R.drawable.perro_3, "Pelusa", 5));
        listaperros.add(new perrosVO(R.drawable.perro_4, "GuauGuau", 7));
        listaperros.add(new perrosVO(R.drawable.perro_5, "Coqui", 4));

    }

    //metodo para mostrar el menu

    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    public boolean onOptionsItemSelected (MenuItem item){
        int id = item.getItemId();

        if (id == R.id.estrella){
            Intent intent = new Intent(this, MainActivity2_mascotas.class);
            startActivity(intent);
        }

        return true;
    }

}