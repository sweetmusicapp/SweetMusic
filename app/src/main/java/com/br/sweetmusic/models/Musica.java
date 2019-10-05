package com.br.sweetmusic.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Musica implements Parcelable{
    private boolean favorita;
    private String nome;
    private String album;
    private String artista;
    private int imgArtista;

    //Implementação do Filipe
    private String nomeMusica;
    private String nomeArtista;
    private int imagemArtista;
    private String nomeAlbum;
    private String detalheMusica;


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

    //Metodo do Filipe
    public Musica(String nomeMusica, String nomeArtista, int imagemArtista, String nomeAlbum, String detalheMusica) {
        this.nomeMusica = nomeMusica;
        this.nomeArtista = nomeArtista;
        this.imagemArtista = imagemArtista;
        this.nomeAlbum = nomeAlbum;
        this.detalheMusica = detalheMusica;
    }

    public Musica() {
    }

    protected Musica(Parcel in) {
        nomeMusica = in.readString();
        nomeArtista = in.readString();
        imagemArtista = in.readInt();
        nomeAlbum = in.readString();
        detalheMusica = in.readString();
    }

    public static final Creator<Musica> CREATOR = new Creator<Musica>() {
        @Override
        public Musica createFromParcel(Parcel in) {
            return new Musica(in);
        }

        @Override
        public Musica[] newArray(int size) {
            return new Musica[size];
        }
    };

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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nomeMusica);
        parcel.writeString(nomeArtista);
        parcel.writeInt(imagemArtista);
        parcel.writeString(nomeAlbum);
        parcel.writeString(detalheMusica);
    }

    //Getters e Setters do Filipe

    public String getNomeMusica() {
        return nomeMusica;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public int getImagemArtista() {
        return imagemArtista;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public String getDetalheMusica() {
        return detalheMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public void setImagemArtista(int imagemArtista) {
        this.imagemArtista = imagemArtista;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public void setDetalheMusica(String detalheMusica) {
        this.detalheMusica = detalheMusica;
    }
}
