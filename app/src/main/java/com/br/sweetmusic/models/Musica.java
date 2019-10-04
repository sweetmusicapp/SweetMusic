package com.br.sweetmusic.models;

public class Musica {
    private boolean favorita;
    private String nome;
    private String album;
    private String artista;
    private int imgArtista;

    public Musica(boolean favorita, String nome, String album, String artista, int imgArtista) {
        this.favorita = favorita;
        this.nome = nome;
        this.album = album;
        this.artista = artista;
        this.imgArtista = imgArtista;
    }

    public Musica(boolean favorita, String nome, String album, String artista) {
        this.favorita = favorita;
        this.nome = nome;
        this.album = album;
        this.artista = artista;
    }

    public Musica() {
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getImgArtista() {
        return imgArtista;
    }

    public void setImgArtista(int imgArtista) {
        this.imgArtista = imgArtista;
    }
}
