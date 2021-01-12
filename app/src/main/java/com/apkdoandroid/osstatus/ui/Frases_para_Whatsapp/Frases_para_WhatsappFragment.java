package com.apkdoandroid.osstatus.ui.Frases_para_Whatsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.apkdoandroid.osstatus.R;
import com.apkdoandroid.osstatus.adapter.AdapterFrases;
import com.apkdoandroid.osstatus.helper.FrasesDao;
import com.apkdoandroid.osstatus.model.Frases;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Frases_para_WhatsappFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Frases_para_WhatsappFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private View view;
    private RecyclerView recyclerView;
    private Frases frase = new Frases();
    private List<Frases> frases = new ArrayList<>() ;
    private AdapterFrases adapterFrases;


    private Button buttonRecarregar;
    private int quantidadeDeItens = 50;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Frases_para_WhatsappFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Frases_para_WhatsappFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Frases_para_WhatsappFragment newInstance(String param1, String param2) {
        Frases_para_WhatsappFragment fragment = new Frases_para_WhatsappFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_frases_para__whatsapp, container, false);

        recyclerView = view.findViewById(R.id.recyclerviewFrases_para_Whatsapp);
        //Definir Layout
        LinearLayoutManager layout = new LinearLayoutManager(getActivity());
        layout.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layout);

        //Definir adapter
        carregarfrases();
        adapterFrases = new AdapterFrases(frases,getActivity());
        recyclerView.setAdapter(adapterFrases);

        buttonRecarregar = view.findViewById(R.id.buttonRecarregaFrases_para_Whatsapp);
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
        for(Frases fra : dao.listar_Frases_para_Whatsapp(quantidadeDeItens)){
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