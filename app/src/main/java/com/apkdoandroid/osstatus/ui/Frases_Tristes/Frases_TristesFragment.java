package com.apkdoandroid.osstatus.ui.Frases_Tristes;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apkdoandroid.osstatus.R;
import com.apkdoandroid.osstatus.adapter.AdapterFrases;
import com.apkdoandroid.osstatus.helper.FrasesDao;
import com.apkdoandroid.osstatus.model.Frases;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Frases_TristesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Frases_TristesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private View view;
    private RecyclerView recyclerView;
    private Frases frase = new Frases();
    private List<Frases> frases = new ArrayList<>() ;
    private AdapterFrases adapterFrases;
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Frases_TristesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Frases_TristesFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Frases_TristesFragment newInstance(String param1, String param2) {
        Frases_TristesFragment fragment = new Frases_TristesFragment();
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
        view = inflater.inflate(R.layout.fragment_frases__tristes, container, false);


        recyclerView = view.findViewById(R.id.recyclerviewFrases_Tristes);
        //Definir Layout
        LinearLayoutManager layout = new LinearLayoutManager(getActivity());
        layout.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layout);

        //Definir adapter
        carregarfrases();
        adapterFrases = new AdapterFrases(frases,getActivity());
        recyclerView.setAdapter(adapterFrases);

        return view;
    }
    public void carregarfrases (){
        FrasesDao dao = new FrasesDao(getActivity());
        for(Frases fra : dao.listar_Frases_Tristes()){
            frases.add(fra);
        }

    }
}