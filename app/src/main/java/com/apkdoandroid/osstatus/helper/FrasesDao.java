package com.apkdoandroid.osstatus.helper;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.apkdoandroid.osstatus.model.Frases;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FrasesDao implements DaoFrases {

    private SQLiteDatabase escrever;
    private SQLiteDatabase ler;
    private Context context;

    public FrasesDao (Context context){
    Banco_BD db = new Banco_BD(context);
    escrever = db.getWritableDatabase();
    ler = db.getReadableDatabase();
    this.context = context;


    }

    @Override
    public Boolean salvar(Frases frases) {
        ContentValues cv = new ContentValues();
        cv.put("autor",frases.getAutor());
        cv.put("texto",frases.getTexto());
        cv.put("categoria",frases.getCategoria());
        cv.put("favorito",frases.getFavorito());

        try {
            escrever.insert(Banco_BD.TABELA,null,cv);
            Log.i("INFO", "Dados salva com sucesso!");
        }catch (Exception e){
            e.printStackTrace();
            Log.e("INFO", "Erro ao salvar Dados " + e.getMessage() );
            return false;
        }
        return true;
    }

    @Override
    public Boolean atualizar(Frases frases) {
        ContentValues cv = new ContentValues();
        cv.put("autor",frases.getAutor());
        cv.put("texto",frases.getTexto());
        cv.put("categoria",frases.getCategoria());
        cv.put("favorito",frases.getFavorito());

        try {
            String [] args ={frases.getId().toString()};
            escrever.update(Banco_BD.TABELA,cv,"id=?",args);
            Log.i("INFO", "Dados Atualizado com sucesso!");
        }catch (Exception e){
            e.printStackTrace();
            Log.e("INFO", "Erro ao Atualizar Dados " + e.getMessage() );
            return false;
        }
        return true;
    }

    @Override
    public Boolean deletar(Frases frases) {
        return null;
    }

    @Override
    public List<Frases> listar(int qt) {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" limit "+qt+";";
        Cursor c = ler.rawQuery(sql,null);

        while (c.moveToNext()){
            Frases frase = new Frases();
        Long id = c.getLong(c.getColumnIndex("id"));
        String autor = c.getString(c.getColumnIndex("autor"));
        String texto = c.getString(c.getColumnIndex("texto"));
        String categoria = c.getString(c.getColumnIndex("categoria"));
        String data = c.getString(c.getColumnIndex("data_hora"));
        int favorito = c.getInt(c.getColumnIndex("favorito"));
        frase.setId(id);
        frase.setAutor(autor);
        frase.setTexto(texto);
        frase.setData_hora(data);
        frase.setCategoria(categoria);
        frase.setFavorito(favorito);
        frases.add(frase);
        }
        Log.i("INFO DB:", "LISTANDO ALL+50" );


        return frases;
    }
    @Override
    public List<Frases> listar() {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" ;";
        Cursor c = ler.rawQuery(sql,null);

        while (c.moveToNext()){
            Frases frase = new Frases();
            Long id = c.getLong(c.getColumnIndex("id"));
            String autor = c.getString(c.getColumnIndex("autor"));
            String texto = c.getString(c.getColumnIndex("texto"));
            String categoria = c.getString(c.getColumnIndex("categoria"));
            String data = c.getString(c.getColumnIndex("data_hora"));
            int favorito = c.getInt(c.getColumnIndex("favorito"));
            frase.setId(id);
            frase.setAutor(autor);
            frase.setTexto(texto);
            frase.setData_hora(data);
            frase.setCategoria(categoria);
            frase.setFavorito(favorito);
            frases.add(frase);
        }
        Log.i("INFO DB:", "LISTANDO ALL" );


        return frases;
    }
    @Override
    public List<Frases> listarFavorito() {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" where  favorito = 1;";
        Cursor c = ler.rawQuery(sql,null);

        while (c.moveToNext()){
            Frases frase = new Frases();
            Long id = c.getLong(c.getColumnIndex("id"));
            String autor = c.getString(c.getColumnIndex("autor"));
            String texto = c.getString(c.getColumnIndex("texto"));
            String categoria = c.getString(c.getColumnIndex("categoria"));
            String data = c.getString(c.getColumnIndex("data_hora"));
            int favorito = c.getInt(c.getColumnIndex("favorito"));
            frase.setId(id);
            frase.setAutor(autor);
            frase.setTexto(texto);
            frase.setData_hora(data);
            frase.setCategoria(categoria);
            frase.setFavorito(favorito);
            frases.add(frase);
        }
        Log.i("INFO DB:", "LISTANDO FAVORITO" );


        return frases;
    }

    @Override
    public List<Frases> listar_Frases_Perfeitas(int qt) {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases Perfeitas' limit "+qt+" ;";
        Cursor c = ler.rawQuery(sql,null);

        while (c.moveToNext()){
            Frases frase = new Frases();
            Long id = c.getLong(c.getColumnIndex("id"));
            String autor = c.getString(c.getColumnIndex("autor"));
            String texto = c.getString(c.getColumnIndex("texto"));
            String categoria = c.getString(c.getColumnIndex("categoria"));
            String data = c.getString(c.getColumnIndex("data_hora"));
            int favorito = c.getInt(c.getColumnIndex("favorito"));
            frase.setId(id);
            frase.setAutor(autor);
            frase.setTexto(texto);
            frase.setData_hora(data);
            frase.setCategoria(categoria);
            frase.setFavorito(favorito);
            frases.add(frase);
        }
        Log.i("INFO DB:", "LISTANDO PERFEITAS" );


        return frases;
    }

    @Override
    public List<Frases> listar_Frases_para_Whatsapp(int qt) {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases para Whatsapp' limit "+qt+";";
        Cursor c = ler.rawQuery(sql,null);

        while (c.moveToNext()){
            Frases frase = new Frases();
            Long id = c.getLong(c.getColumnIndex("id"));
            String autor = c.getString(c.getColumnIndex("autor"));
            String texto = c.getString(c.getColumnIndex("texto"));
            String categoria = c.getString(c.getColumnIndex("categoria"));
            String data = c.getString(c.getColumnIndex("data_hora"));
            int favorito = c.getInt(c.getColumnIndex("favorito"));
            frase.setId(id);
            frase.setAutor(autor);
            frase.setTexto(texto);
            frase.setData_hora(data);
            frase.setCategoria(categoria);
            frase.setFavorito(favorito);
            frases.add(frase);
        }
        Log.i("INFO DB:", "LISTANDO WHATSAPP" );


        return frases;
    }

    @Override
    public List<Frases> listar_Frases_de_Amor(int qt) {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases de Amor' limit "+qt+";";
        Cursor c = ler.rawQuery(sql,null);

        while (c.moveToNext()){
            Frases frase = new Frases();
            Long id = c.getLong(c.getColumnIndex("id"));
            String autor = c.getString(c.getColumnIndex("autor"));
            String texto = c.getString(c.getColumnIndex("texto"));
            String categoria = c.getString(c.getColumnIndex("categoria"));
            String data = c.getString(c.getColumnIndex("data_hora"));
            int favorito = c.getInt(c.getColumnIndex("favorito"));
            frase.setId(id);
            frase.setAutor(autor);
            frase.setTexto(texto);
            frase.setData_hora(data);
            frase.setCategoria(categoria);
            frase.setFavorito(favorito);
            frases.add(frase);
        }
        Log.i("INFO DB:", "LISTANDO AMOR" );


        return frases;
    }

    @Override
    public List<Frases> listar_Status_para_Fotos(int qt) {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Status para Fotos' limit "+qt+";";
        Cursor c = ler.rawQuery(sql,null);

        while (c.moveToNext()){
            Frases frase = new Frases();
            Long id = c.getLong(c.getColumnIndex("id"));
            String autor = c.getString(c.getColumnIndex("autor"));
            String texto = c.getString(c.getColumnIndex("texto"));
            String categoria = c.getString(c.getColumnIndex("categoria"));
            String data = c.getString(c.getColumnIndex("data_hora"));
            int favorito = c.getInt(c.getColumnIndex("favorito"));
            frase.setId(id);
            frase.setAutor(autor);
            frase.setTexto(texto);
            frase.setData_hora(data);
            frase.setCategoria(categoria);
            frase.setFavorito(favorito);
            frases.add(frase);
        }
        Log.i("INFO DB:", "LISTANDO FOTOS" );


        return frases;
    }

    @Override
    public List<Frases> listar_Status_para_Namorado(int qt) {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Status para Namorado' limit "+qt+";";
        Cursor c = ler.rawQuery(sql,null);

        while (c.moveToNext()){
            Frases frase = new Frases();
            Long id = c.getLong(c.getColumnIndex("id"));
            String autor = c.getString(c.getColumnIndex("autor"));
            String texto = c.getString(c.getColumnIndex("texto"));
            String categoria = c.getString(c.getColumnIndex("categoria"));
            String data = c.getString(c.getColumnIndex("data_hora"));
            int favorito = c.getInt(c.getColumnIndex("favorito"));
            frase.setId(id);
            frase.setAutor(autor);
            frase.setTexto(texto);
            frase.setData_hora(data);
            frase.setCategoria(categoria);
            frase.setFavorito(favorito);
            frases.add(frase);
        }
        Log.i("INFO DB:", "LISTANDO NAMORADO(A)" );


        return frases;
    }

    @Override
    public List<Frases> listar_Frases_de_Reflexao(int qt) {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases de Reflexão' limit "+qt+";";
        Cursor c = ler.rawQuery(sql,null);

        while (c.moveToNext()){
            Frases frase = new Frases();
            Long id = c.getLong(c.getColumnIndex("id"));
            String autor = c.getString(c.getColumnIndex("autor"));
            String texto = c.getString(c.getColumnIndex("texto"));
            String categoria = c.getString(c.getColumnIndex("categoria"));
            String data = c.getString(c.getColumnIndex("data_hora"));
            int favorito = c.getInt(c.getColumnIndex("favorito"));
            frase.setId(id);
            frase.setAutor(autor);
            frase.setTexto(texto);
            frase.setData_hora(data);
            frase.setCategoria(categoria);
            frase.setFavorito(favorito);
            frases.add(frase);
        }
        Log.i("INFO DB:", "LISTANDO REFLEXAO" );


        return frases;
    }

    @Override
    public List<Frases> listar_Frases_de_Deus(int qt) {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases de Deus' limit "+qt+";";
        Cursor c = ler.rawQuery(sql,null);

        while (c.moveToNext()){
            Frases frase = new Frases();
            Long id = c.getLong(c.getColumnIndex("id"));
            String autor = c.getString(c.getColumnIndex("autor"));
            String texto = c.getString(c.getColumnIndex("texto"));
            String categoria = c.getString(c.getColumnIndex("categoria"));
            String data = c.getString(c.getColumnIndex("data_hora"));
            int favorito = c.getInt(c.getColumnIndex("favorito"));
            frase.setId(id);
            frase.setAutor(autor);
            frase.setTexto(texto);
            frase.setData_hora(data);
            frase.setCategoria(categoria);
            frase.setFavorito(favorito);
            frases.add(frase);
        }
        Log.i("INFO DB:", "LISTANDO DEUS" );


        return frases;
    }

    @Override
    public List<Frases> listar_Frases_Tristes(int qt) {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases Tristes' limit "+qt+";";
        Cursor c = ler.rawQuery(sql,null);

        while (c.moveToNext()){
            Frases frase = new Frases();
            Long id = c.getLong(c.getColumnIndex("id"));
            String autor = c.getString(c.getColumnIndex("autor"));
            String texto = c.getString(c.getColumnIndex("texto"));
            String categoria = c.getString(c.getColumnIndex("categoria"));
            String data = c.getString(c.getColumnIndex("data_hora"));
            int favorito = c.getInt(c.getColumnIndex("favorito"));
            frase.setId(id);
            frase.setAutor(autor);
            frase.setTexto(texto);
            frase.setData_hora(data);
            frase.setCategoria(categoria);
            frase.setFavorito(favorito);
            frases.add(frase);
        }
        Log.i("INFO DB:", "LISTANDO TRISTE" );


        return frases;
    }

    @Override
    public List<Frases> listar_Status_para_Casal(int qt) {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Status para Casal' limit "+qt+";";
        Cursor c = ler.rawQuery(sql,null);

        while (c.moveToNext()){
            Frases frase = new Frases();
            Long id = c.getLong(c.getColumnIndex("id"));
            String autor = c.getString(c.getColumnIndex("autor"));
            String texto = c.getString(c.getColumnIndex("texto"));
            String categoria = c.getString(c.getColumnIndex("categoria"));
            String data = c.getString(c.getColumnIndex("data_hora"));
            int favorito = c.getInt(c.getColumnIndex("favorito"));
            frase.setId(id);
            frase.setAutor(autor);
            frase.setTexto(texto);
            frase.setData_hora(data);
            frase.setCategoria(categoria);
            frase.setFavorito(favorito);
            frases.add(frase);
        }
        Log.i("INFO DB:", "LISTANDO CASAL" );


        return frases;
    }

    @Override
    public List<Frases> listar_Frases_Engracadas(int qt) {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases Engraçadas para Status' limit "+qt+";";
        Cursor c = ler.rawQuery(sql,null);

        while (c.moveToNext()){
            Frases frase = new Frases();
            Long id = c.getLong(c.getColumnIndex("id"));
            String autor = c.getString(c.getColumnIndex("autor"));
            String texto = c.getString(c.getColumnIndex("texto"));
            String categoria = c.getString(c.getColumnIndex("categoria"));
            String data = c.getString(c.getColumnIndex("data_hora"));
            int favorito = c.getInt(c.getColumnIndex("favorito"));
            frase.setId(id);
            frase.setAutor(autor);
            frase.setTexto(texto);
            frase.setData_hora(data);
            frase.setCategoria(categoria);
            frase.setFavorito(favorito);
            frases.add(frase);
        }
        Log.i("INFO DB:", "LISTANDO ENGRAÇADAS" );


        return frases;
    }

    @Override
    public List<Frases> listar_Favoritos(int qt) {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE favorito = 1 limit "+qt+";";
        Cursor c = ler.rawQuery(sql,null);

        while (c.moveToNext()){
            Frases frase = new Frases();
            Long id = c.getLong(c.getColumnIndex("id"));
            String autor = c.getString(c.getColumnIndex("autor"));
            String texto = c.getString(c.getColumnIndex("texto"));
            String categoria = c.getString(c.getColumnIndex("categoria"));
            String data = c.getString(c.getColumnIndex("data_hora"));
            int favorito = c.getInt(c.getColumnIndex("favorito"));
            frase.setId(id);
            frase.setAutor(autor);
            frase.setTexto(texto);
            frase.setData_hora(data);
            frase.setCategoria(categoria);
            frase.setFavorito(favorito);
            frases.add(frase);
        }
        Log.i("INFO DB:", "LISTANDO FAVORITOS1" );


        return frases;
    }

    @Override
    public List<Frases> listar_FrasesdeIndiretas(int qt) {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases de Indiretas' limit "+qt+";";
        Cursor c = ler.rawQuery(sql,null);

        while (c.moveToNext()){
            Frases frase = new Frases();
            Long id = c.getLong(c.getColumnIndex("id"));
            String autor = c.getString(c.getColumnIndex("autor"));
            String texto = c.getString(c.getColumnIndex("texto"));
            String categoria = c.getString(c.getColumnIndex("categoria"));
            String data = c.getString(c.getColumnIndex("data_hora"));
            int favorito = c.getInt(c.getColumnIndex("favorito"));
            frase.setId(id);
            frase.setAutor(autor);
            frase.setTexto(texto);
            frase.setData_hora(data);
            frase.setCategoria(categoria);
            frase.setFavorito(favorito);
            frases.add(frase);
        }
        Log.i("INFO DB:", "LISTANDO INDIRETAS" );


        return frases;
    }

    @Override
    public List<Frases> listar_Frasesfelizaniversario(int qt) {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases feliz aniversario' limit "+qt+";";
        Cursor c = ler.rawQuery(sql,null);

        while (c.moveToNext()){
            Frases frase = new Frases();
            Long id = c.getLong(c.getColumnIndex("id"));
            String autor = c.getString(c.getColumnIndex("autor"));
            String texto = c.getString(c.getColumnIndex("texto"));
            String categoria = c.getString(c.getColumnIndex("categoria"));
            String data = c.getString(c.getColumnIndex("data_hora"));
            int favorito = c.getInt(c.getColumnIndex("favorito"));
            frase.setId(id);
            frase.setAutor(autor);
            frase.setTexto(texto);
            frase.setData_hora(data);
            frase.setCategoria(categoria);
            frase.setFavorito(favorito);
            frases.add(frase);
        }
        Log.i("INFO DB:", "LISTANDO ANIVERSARIO" );


        return frases;
    }

    @Override
    public List<Frases> listar_FrasesparaEx(int qt) {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases para Ex' limit "+qt+";";
        Cursor c = ler.rawQuery(sql,null);

        while (c.moveToNext()){
            Frases frase = new Frases();
            Long id = c.getLong(c.getColumnIndex("id"));
            String autor = c.getString(c.getColumnIndex("autor"));
            String texto = c.getString(c.getColumnIndex("texto"));
            String categoria = c.getString(c.getColumnIndex("categoria"));
            String data = c.getString(c.getColumnIndex("data_hora"));
            int favorito = c.getInt(c.getColumnIndex("favorito"));
            frase.setId(id);
            frase.setAutor(autor);
            frase.setTexto(texto);
            frase.setData_hora(data);
            frase.setCategoria(categoria);
            frase.setFavorito(favorito);
            frases.add(frase);
        }
        Log.i("INFO DB:", "LISTANDO EX" );


        return frases;
    }

    @Override
    public List<Frases> listar_FrasesdeMusicas(int qt) {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases de Músicas' limit "+qt+"; ";
        Cursor c = ler.rawQuery(sql,null);

        while (c.moveToNext()){
            Frases frase = new Frases();
            Long id = c.getLong(c.getColumnIndex("id"));
            String autor = c.getString(c.getColumnIndex("autor"));
            String texto = c.getString(c.getColumnIndex("texto"));
            String categoria = c.getString(c.getColumnIndex("categoria"));
            String data = c.getString(c.getColumnIndex("data_hora"));
            int favorito = c.getInt(c.getColumnIndex("favorito"));
            frase.setId(id);
            frase.setAutor(autor);
            frase.setTexto(texto);
            frase.setData_hora(data);
            frase.setCategoria(categoria);
            frase.setFavorito(favorito);
            frases.add(frase);
        }
        Log.i("INFO DB:", "LISTANDO MUSICA" );


        return frases;
    }

}
