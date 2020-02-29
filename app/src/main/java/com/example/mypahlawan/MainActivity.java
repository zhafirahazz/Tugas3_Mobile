package com.example.mypahlawan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvHero;
    private ArrayList<ModelPahlawan> listHero = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHero = findViewById(R.id.rv_hero);
        rvHero.setHasFixedSize(true);
        listHero.addAll(DataPahlawan.getHeroList());

        showRecyclerList();
    }

    private void showRecyclerList() {
        rvHero.setLayoutManager(new LinearLayoutManager(this));
        AdapterPahlawan adapterPahlawan = new AdapterPahlawan(this);
        adapterPahlawan.setListHero(listHero);
        rvHero.setAdapter(adapterPahlawan);
    }
}
