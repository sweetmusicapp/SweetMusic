package com.br.sweetmusic.models;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "musicas")
public class Musica implements Parcelable {

    @PrimaryKey(autoGenerate = true)
    private long idArtista;

    @ColumnInfo(name = "favorita")
    private boolean favorita;

    @ColumnInfo(name = "nome")
    private String nomeMusica;

    @ColumnInfo(name = "album")
    private String nomeAlbum;

    @ColumnInfo(name = "artista")
    private String nomeArtista;

    @ColumnInfo(name = "imagem")
    private int imagemArtista;

    @ColumnInfo(name = "detalhe")
    private String detalheMusica;

    private String videoId;

//    Construtor completo
    public Musica(boolean favorita, String nomeMusica, String nomeAlbum, String nomeArtista, long idArtista, int imagemArtista, String detalheMusica, String videoId) {
        this.favorita = favorita;
        this.nomeMusica = nomeMusica;
        this.nomeAlbum = nomeAlbum;
        this.nomeArtista = nomeArtista;
        this.idArtista = idArtista;
        this.imagemArtista = imagemArtista;
        this.detalheMusica = detalheMusica;
        this.videoId = videoId;
    }
//
//    //Construtor sem vídeo
//    public Musica(boolean favorita, String nomeMusica, String nomeAlbum, String nomeArtista, long idArtista, int imagemArtista, String detalheMusica) {
//        this.favorita = favorita;
//        this.nomeMusica = nomeMusica;
//        this.nomeAlbum = nomeAlbum;
//        this.nomeArtista = nomeArtista;
//        this.idArtista = idArtista;
//        this.imagemArtista = imagemArtista;
//        this.detalheMusica = detalheMusica;
//    }
//
//    public Musica(boolean favorita, String nomeMusica, String nomeAlbum, String nomeArtista, int imagemArtista, String detalheMusica) {
//        this.favorita = favorita;
//        this.nomeMusica = nomeMusica;
//        this.nomeAlbum = nomeAlbum;
//        this.nomeArtista = nomeArtista;
//        this.imagemArtista = imagemArtista;
//        this.detalheMusica = detalheMusica;
//    }
//
//    public Musica(boolean favorita, String nomeMusica, String nomeAlbum, String nomeArtista) {
//        this.favorita = favorita;
//        this.nomeMusica = nomeMusica;
//        this.nomeAlbum = nomeAlbum;
//        this.nomeArtista = nomeArtista;
//    }
//
//    public Musica(boolean favorita, String nomeMusica, String nomeAlbum, String nomeArtista, int imagemArtista) {
//        this.favorita = favorita;
//        this.nomeMusica = nomeMusica;
//        this.nomeAlbum = nomeAlbum;
//        this.nomeArtista = nomeArtista;
//        this.imagemArtista = imagemArtista;
//    }

    public Musica() {
    }

    protected Musica(Parcel in) {
        favorita = in.readByte() != 0;
        nomeMusica = in.readString();
        nomeAlbum = in.readString();
        nomeArtista = in.readString();
        idArtista = in.readLong();
        imagemArtista = in.readInt();
        detalheMusica = in.readString();
        videoId = in.readString();
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

    public long getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(long idArtista) {
        this.idArtista = idArtista;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
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
        parcel.writeLong(idArtista);
        parcel.writeInt(imagemArtista);
        parcel.writeString(detalheMusica);
        parcel.writeString(videoId);
    }
}
