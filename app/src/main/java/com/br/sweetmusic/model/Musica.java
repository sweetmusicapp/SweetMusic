package com.br.sweetmusic.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Musica implements Parcelable {

    private String nomeMusica;
    private String nomeArtista;
    private int imagemArtista;
    private String nomeAlbum;
    private String detalheMusica;

    public Musica() {
    }

    public Musica(String nomeMusica, String nomeArtista, int imagemArtista) {
        this.nomeMusica = nomeMusica;
        this.nomeArtista = nomeArtista;
        this.imagemArtista = imagemArtista;
        //this.nomeAlbum = nomeAlbum;
        //this.detalheMusica = detalheMusica;
    }

    protected Musica(Parcel in){
        nomeMusica = in.readString();
        nomeArtista = in.readString();
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int i) {

        dest.writeString(nomeMusica);
        dest.writeString(nomeArtista);

    }

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public int getImagemArtista() {
        return imagemArtista;
    }

    public void setImagemArtista(int imagemArtista) {
        this.imagemArtista = imagemArtista;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public String getDetalheMusica() {
        return detalheMusica;
    }

    public void setDetalheMusica(String detalheMusica) {
        this.detalheMusica = detalheMusica;
    }
}
