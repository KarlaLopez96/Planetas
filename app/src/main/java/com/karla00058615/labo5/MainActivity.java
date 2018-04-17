package com.karla00058615.labo5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Planetas> planetList;
    RecyclerView recyclerView;
    PlanetaAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //llenando la lista planeta
        planetList = new ArrayList<Planetas>();
        fillList(planetList);

        //setting el recycler view
        recyclerView = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(  this);
        //Agreagr el constructor al planet adapter.
        adapter = new PlanetaAdapter (this,planetList);

        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

    }

    private void fillList(List<Planetas> planetasList){
        List<Planetas> l = planetasList;
        String descripcion ="Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto.";

        l.add(new Planetas(1,"Shrek",descripcion));
        l.add(new Planetas(2,"Shrek 2",descripcion));
        l.add(new Planetas(3, "Shrek 3",descripcion));
    }

}
