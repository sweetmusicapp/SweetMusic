package com.br.sweetmusic.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Musica implements Parcelable {
    private boolean favorita;
    private String nomeMusica;
    private String nomeAlbum;
    private String nomeArtista;
    private int imagemArtista;
    private String detalheMusica;

    public Musica(boolean favorita, String nomeMusica, String nomeAlbum, String nomeArtista, int imagemArtista, String detalheMusica) {
        this.favorita = favorita;
        this.nomeMusica = nomeMusica;
        this.nomeAlbum = nomeAlbum;
        this.nomeArtista = nomeArtista;
        this.imagemArtista = imagemArtista;
        this.detalheMusica = detalheMusica;
    }

    public Musica(boolean favorita, String nomeMusica, String nomeAlbum, String nomeArtista) {
        this.favorita = favorita;
        this.nomeMusica = nomeMusica;
        this.nomeAlbum = nomeAlbum;
        this.nomeArtista = nomeArtista;
    }

    public Musica(boolean favorita, String nomeMusica, String nomeAlbum, String nomeArtista, int imagemArtista) {
        this.favorita = favorita;
        this.nomeMusica = nomeMusica;
        this.nomeAlbum = nomeAlbum;
        this.nomeArtista = nomeArtista;
        this.imagemArtista = imagemArtista;
    }

    public Musica() {
    }

    protected Musica(Parcel in) {
        favorita = in.readByte() != 0;
        nomeMusica = in.readString();
        nomeAlbum = in.readString();
        nomeArtista = in.readString();
        imagemArtista = in.readInt();
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

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
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

    public String getDetalheMusica() {
        return detalheMusica;
    }

    public void setDetalheMusica(String detalheMusica) {
        this.detalheMusica = detalheMusica;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) (favorita ? 1 : 0));
        parcel.writeString(nomeMusica);
        parcel.writeString(nomeAlbum);
        parcel.writeString(nomeArtista);
        parcel.writeInt(imagemArtista);
        parcel.writeString(detalheMusica);
    }
}