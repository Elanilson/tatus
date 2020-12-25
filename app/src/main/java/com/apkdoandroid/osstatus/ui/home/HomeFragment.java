package com.apkdoandroid.osstatus.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import android.widget.Toast;

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
import com.apkdoandroid.osstatus.recyclwviewListner.RecyclerItemClickListener;


import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private RecyclerView recyclerView;
    private Frases frase = new Frases();
    private List<Frases> frases = new ArrayList<>() ;
    private AdapterFrases adapterFrases;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = root.findViewById(R.id.recyclerviewFrases);
        //Definir Layout
        LinearLayoutManager layout = new LinearLayoutManager(getActivity());
        layout.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layout);

        //Definir adapter
        carregarfrases();
        adapterFrases = new AdapterFrases(frases,getActivity());
        recyclerView.setAdapter(adapterFrases);


      //  configurandoClickRecycleview();

        return root;
    }
    public void carregarfrases (){
        FrasesDao dao = new FrasesDao(getActivity());
        for(Frases fra : dao.listar()){
            frases.add(fra);
        }

    }


    public void configurandoClickRecycleview() {
        //Adicionar evento de clique
        recyclerView.addOnItemTouchListener(new RecyclerItemClickListener(
                getActivity(), recyclerView, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                //Recuperar tarefa para edicao
//                Frases frase = frases.get(position);
//                adapterFrases = new AdapterFrases(frases,getActivity(),frase.getId(),recyclerView);
//                adapterFrases.favorito(frase.getId());
//                recarregarFrases();


            }

            @Override
            public void onLongItemClick(View view, int position) {
                //Recuperar tarefa para edicao


            }

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        }
        ));
    }


}