package com.apkdoandroid.osstatus.model;

public class Frases {
    private Long id;
    private String titulo;
    private String texto;
    private String autor;
    private String data_hora;
    private String categoria;
    private Frases frase;
    private int favorito;

    public Frases() {
    }

    public Frases(Long id, String titulo, String texto, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.texto = texto;
        this.autor = autor;
    }



    public Frases(String texto, String autor) {
        this.texto = texto;
        this.autor = autor;
    }

    public int getFavorito() {
        return favorito;
    }

    public void setFavorito(int favorito) {
        this.favorito = favorito;
    }

    public Frases getFrase() {
        return frase;
    }

    public void setFrase(Frases frase) {
        this.frase = frase;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
