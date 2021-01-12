package com.apkdoandroid.osstatus.helper;

import com.apkdoandroid.osstatus.model.Frases;

import java.util.List;

public interface DaoFrases {

    public Boolean salvar (Frases frases);
    public Boolean atualizar (Frases frases);
    public  Boolean deletar (Frases frases);
    public List<Frases> listar (int qt);
    public List<Frases> listar ();
    public List<Frases> listarFavorito ();
    public List<Frases> listar_Frases_Perfeitas (int qt);
    public List<Frases> listar_Frases_para_Whatsapp(int qt);
    public List<Frases> listar_Frases_de_Amor (int qt);
    public List<Frases> listar_Status_para_Fotos (int qt);
    public List<Frases> listar_Status_para_Namorado(int qt);
    public List<Frases> listar_Frases_de_Reflexao(int qt);
    public List<Frases> listar_Frases_de_Deus (int qt);
    public List<Frases> listar_Frases_Tristes (int qt);
    public List<Frases> listar_Status_para_Casal (int qt);
    public List<Frases> listar_Frases_Engracadas(int qt);
    public List<Frases> listar_Favoritos(int qt);
    public List<Frases> listar_FrasesdeIndiretas(int qt);
    public List<Frases> listar_Frasesfelizaniversario(int qt);
    public List<Frases> listar_FrasesparaEx(int qt);
    public List<Frases> listar_FrasesdeMusicas(int qt);

}
