package com.apkdoandroid.osstatus.helper;

import com.apkdoandroid.osstatus.model.Frases;

import java.util.List;

public interface DaoFrases {

    public Boolean salvar (Frases frases);
    public Boolean atualizar (Frases frases);
    public  Boolean deletar (Frases frases);
    public List<Frases> listar ();
    public List<Frases> listar_Frases_Perfeitas ();
    public List<Frases> listar_Frases_para_Whatsapp();
    public List<Frases> listar_Frases_de_Amor ();
    public List<Frases> listar_Status_para_Fotos ();
    public List<Frases> listar_Status_para_Namorado();
    public List<Frases> listar_Frases_de_Reflexao();
    public List<Frases> listar_Frases_de_Deus ();
    public List<Frases> listar_Frases_Tristes ();
    public List<Frases> listar_Status_para_Casal ();
    public List<Frases> listar_Frases_Engracadas();
    public List<Frases> listar_Favoritos();
    public List<Frases> listar_FrasesdeIndiretas();
    public List<Frases> listar_Frasesfelizaniversario();
    public List<Frases> listar_FrasesparaEx();
    public List<Frases> listar_FrasesdeMusicas();

}
