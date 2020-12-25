package com.apkdoandroid.osstatus.ui.Sobre;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.apkdoandroid.osstatus.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SobreFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SobreFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SobreFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SobreFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SobreFragment newInstance(String param1, String param2) {
        SobreFragment fragment = new SobreFragment();
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
      //  return inflater.inflate(R.layout.fragment_sobre, container, false);
        String descricao =" Aqui no Os Status você encontra milhares de frases organizadas em centenas de categorias para facilitar a sua busca.\n" +
                " Os status tem como principal objetivo ajudar as pessoas a se expressarem ou a se inspirarem.\n" +
                " Todos os dias publicamos novas frases e toda semana novas categorias.\n" +
                " Procurou uma frase e não a encontrou? Sinta-se à vontade para sugerir ela. Com certeza levaremos em consideração sua sugestão.";
        Element versao = new Element();
        versao.setTitle("Versão 1.0");
        return new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription(descricao)

                .addGroup("Entre em contato")
                .addEmail("elanilsonpp@hotmail.com","Envie um e-mail")
                .addWebsite("www.apkdoandroid.com","Acesse nosso site")

                .addGroup("Redes sociais")
                .addFacebook("elanilsondejesus","Facebook")
                .addInstagram("elanilsondejesus","Instagram")
                .addTwitter("elanilsondejesus","Twitter")
                .addYoutube("elanilsondejesus","Youtube")
                .addGitHub("elanilsondejesus","GitHub")
                .addPlayStore("elanilsondejesus","Download App")

                .addItem(versao)


                .create();
    }
}