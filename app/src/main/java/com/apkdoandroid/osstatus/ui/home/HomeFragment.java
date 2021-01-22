package com.apkdoandroid.osstatus.ui.home;

import android.content.Intent;
import android.graphics.Color;
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
import com.google.android.material.snackbar.Snackbar;
import com.jaredrummler.materialspinner.MaterialSpinner;


import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private RecyclerView recyclerView;
    private Frases frase = new Frases();
    private List<Frases> frases = new ArrayList<>() ;
    private AdapterFrases adapterFrases;
    private Button buttonRecarregar;
    private int quantidadeDeItens = 100;
    private String itemSelecionado="Frases de Deus";


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = root.findViewById(R.id.recyclerviewFrases);
        buttonRecarregar = root.findViewById(R.id.buttonRecarregar);
        //Definir Layout
        LinearLayoutManager layout = new LinearLayoutManager(getActivity());
        layout.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layout);

        //Definir adapter
        carregarfrases(itemSelecionado);
        adapterFrases = new AdapterFrases(frases,getActivity());
        recyclerView.setAdapter(adapterFrases);
        buttonRecarregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantidadeDeItens += 50;
                frases.clear();
                carregarfrases(itemSelecionado);
                adapterFrases.notifyDataSetChanged();

            }
        });

        MaterialSpinner spinner = (MaterialSpinner) root.findViewById(R.id.spinner);
        spinner.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        spinner.setHintColor(Color.RED);
        spinner.setArrowColor(getResources().getColor(R.color.colorAccent));
        spinner.setTextColor(Color.WHITE);
        spinner.getCurrentHintTextColor();
        spinner.setItems("Frases de Deus","Frases de Músicas","Frases para foto com amiga","Frases para fotos sorrindo","Legendas para foto na praia","Status de  amizade","Status para Fotos","Frases para fotos sorrindo","Frases de Agradecimento","Frases de Aniversario de Namoro","Frases de Dia dos Namorados","Frases  Solitarias","Frases de Academia","Frases Apaixonadas","Frases de Apoio","Frases Boa Noite","Frases Boa Tarde","Frases Bom Dia","Frases Bonitas","Frases Engraçadas ","Frases Engraçadas para Status","Frases Familia","Frases Inteligentes","Frases Masculinas","Frases Pensativas","Frases Perfeitas","Frases Romanticas","Frases Tristes","Frases de Amor","Frases de Aniversario","Frases de Deus","Frases de Felicidade","Frases de Indiretas","Frases de Livros","Frases de Motivacao","Frases de Músicas","Frases de Otimismo","Frases de Pensamentos","Frases de Positividade","Frases de Reflexão","Frases de Sabedoria","Frases de Saudade","Frases de Superação","Frases de Traição","Frases de carinho","Frases de ciumes","Frases de decepcao","Frases de desapego","Frases de falsidade","Frases de fim de namoro","Frases de impacto","Frases em ingles","Frases feliz aniversario","Frases para Balada","Frases para Ex","Frases para Irma","Frases para Perfil","Frases para Primas","Frases para Solteira","Frases para Status","Frases para Whatsapp","Frases sobre Raiva","Frases sobre Recomeco","Frases sobre Vida","Status para Casal","Status para Namorado");
        spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
               frases.clear();

                if(item.equals("Frases de Agradecimento")){
                    item = "Agradecimento";

                }else if(item.equals("Frases de Aniversario de Namoro")){
                    item = "Aniversario de Namoro";

                }else if(item.equals("Frases de Dia dos Namorados")){
                    item = "Dia dos Namorados";

                }else if(item.equals("Frases  Solitarias")){
                    item = "Frases  Sozinha";

                }else if(item.equals("Frases de Academia")){
                    item = "Frases Academia";

                }else if(item.equals("Frases de Apoio")){
                    item = "Frases Apoio";

                }else if(item.equals("Frases de Apoio")){
                    item = "Frases Apoio";

                }
                itemSelecionado = item;
                carregarfrases(item);
               adapterFrases.notifyDataSetChanged();
                Snackbar.make(view, "Carregando.. ", Snackbar.LENGTH_LONG).show();
            }
        });
        return root;
    }

    public void carregarfrases (String item){
        FrasesDao dao = new FrasesDao(getActivity());
        if(quantidadeDeItens != 0){
            for(Frases fra : dao.listar(quantidadeDeItens,item)){
                frases.add(fra);
            }
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

    @Override
    public void onStart() {
        super.onStart();
        frases.clear();
        carregarfrases(itemSelecionado);
    }

    @Override
    public void onStop() {
        super.onStop();
        frases.clear();
    }


}