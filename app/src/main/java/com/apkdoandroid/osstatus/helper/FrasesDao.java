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
        Log.i("INFO DB:", "LISTANDO" );


        return frases;
    }

    @Override
    public List<Frases> listar_Frases_Perfeitas() {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases Perfeitas' ;";
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
        Log.i("INFO DB:", "LISTANDO" );


        return frases;
    }

    @Override
    public List<Frases> listar_Frases_para_Whatsapp() {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases para Whatsapp';";
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
        Log.i("INFO DB:", "LISTANDO" );


        return frases;
    }

    @Override
    public List<Frases> listar_Frases_de_Amor() {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases de Amor';";
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
        Log.i("INFO DB:", "LISTANDO" );


        return frases;
    }

    @Override
    public List<Frases> listar_Status_para_Fotos() {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Status para Fotos';";
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
        Log.i("INFO DB:", "LISTANDO" );


        return frases;
    }

    @Override
    public List<Frases> listar_Status_para_Namorado() {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Status para Namorado' ;";
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
        Log.i("INFO DB:", "LISTANDO" );


        return frases;
    }

    @Override
    public List<Frases> listar_Frases_de_Reflexao() {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases de Reflexão';";
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
        Log.i("INFO DB:", "LISTANDO" );


        return frases;
    }

    @Override
    public List<Frases> listar_Frases_de_Deus() {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases de Deus';";
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
        Log.i("INFO DB:", "LISTANDO" );


        return frases;
    }

    @Override
    public List<Frases> listar_Frases_Tristes() {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases Tristes' ;";
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
        Log.i("INFO DB:", "LISTANDO" );


        return frases;
    }

    @Override
    public List<Frases> listar_Status_para_Casal() {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Status para Casal';";
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
        Log.i("INFO DB:", "LISTANDO" );


        return frases;
    }

    @Override
    public List<Frases> listar_Frases_Engracadas() {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases Engraçadas para Status';";
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
        Log.i("INFO DB:", "LISTANDO" );


        return frases;
    }

    @Override
    public List<Frases> listar_Favoritos() {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE favorito = 1;";
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
        Log.i("INFO DB:", "LISTANDO" );


        return frases;
    }

    @Override
    public List<Frases> listar_FrasesdeIndiretas() {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases de Indiretas';";
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
        Log.i("INFO DB:", "LISTANDO" );


        return frases;
    }

    @Override
    public List<Frases> listar_Frasesfelizaniversario() {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases feliz aniversario';";
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
        Log.i("INFO DB:", "LISTANDO" );


        return frases;
    }

    @Override
    public List<Frases> listar_FrasesparaEx() {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases para Ex';";
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
        Log.i("INFO DB:", "LISTANDO" );


        return frases;
    }

    @Override
    public List<Frases> listar_FrasesdeMusicas() {
        List<Frases> frases = new ArrayList<>();
        String sql = " Select * from " +Banco_BD.TABELA+" WHERE categoria= 'Frases de Músicas';";
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
        Log.i("INFO DB:", "LISTANDO" );


        return frases;
    }

}
