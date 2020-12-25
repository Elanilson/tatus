package com.apkdoandroid.osstatus.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.apkdoandroid.osstatus.R;
import com.apkdoandroid.osstatus.adapter.AdapterFrases;
import com.apkdoandroid.osstatus.helper.FrasesDao;
import com.apkdoandroid.osstatus.model.Frases;

import java.util.ArrayList;
import java.util.List;

public class FavoritosActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Frases frase = new Frases();
    private List<Frases> frases = new ArrayList<>() ;
    private AdapterFrases adapterFrases;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);

        recyclerView = findViewById(R.id.recyclerviewFavoritos);
        //Definir Layout
        LinearLayoutManager layout = new LinearLayoutManager(getApplicationContext());
        layout.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layout);

        //Definir adapter
        carregarfrases();
        adapterFrases = new AdapterFrases(frases,FavoritosActivity.this);
        recyclerView.setAdapter(adapterFrases);
    }
    public void carregarfrases (){
        FrasesDao dao = new FrasesDao(getApplicationContext());
        for(Frases fra : dao.listar_Favoritos()){
            frases.add(fra);
        }

    }
}