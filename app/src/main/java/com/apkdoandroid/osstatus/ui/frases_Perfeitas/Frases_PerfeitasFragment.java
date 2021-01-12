package com.apkdoandroid.osstatus.ui.frases_Perfeitas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.apkdoandroid.osstatus.R;
import com.apkdoandroid.osstatus.adapter.AdapterFrases;
import com.apkdoandroid.osstatus.helper.FrasesDao;
import com.apkdoandroid.osstatus.model.Frases;

import java.util.ArrayList;
import java.util.List;

public class Frases_PerfeitasFragment extends Fragment {

    private Frases_PerfeitasViewModel frasesPerfeitasViewModel;
    private RecyclerView recyclerView;
    private Frases frase = new Frases();
    private List<Frases> frases = new ArrayList<>() ;
    private AdapterFrases adapterFrases;

    private Button buttonRecarregar;
    private int quantidadeDeItens = 50;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        frasesPerfeitasViewModel =
                new ViewModelProvider(this).get(Frases_PerfeitasViewModel.class);
        View  view = inflater.inflate(R.layout.fragment_frases_perfeitas, container, false);





        recyclerView = view.findViewById(R.id.recyclerviewfrases_Perfeitas);
        //Definir Layout
        LinearLayoutManager layout = new LinearLayoutManager(getActivity());
        layout.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layout);

        //Definir adapter
        carregarfrases();
        adapterFrases = new AdapterFrases(frases,getActivity());
        recyclerView.setAdapter(adapterFrases);
        buttonRecarregar = view.findViewById(R.id.buttonRecarregafrases_Perfeitas);
        buttonRecarregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantidadeDeItens += 10;
                frases.clear();
                carregarfrases();
                adapterFrases.notifyDataSetChanged();
            }
        });
        return view;
    }
    public void carregarfrases (){
        FrasesDao dao = new FrasesDao(getActivity());
        for(Frases fra : dao.listar_Frases_Perfeitas(quantidadeDeItens)){
            frases.add(fra);
        }

    }
    @Override
    public void onStart() {
        super.onStart();
        frases.clear();
        carregarfrases();
    }
    @Override
    public void onStop() {
        super.onStop();
        frases.clear();
    }

}