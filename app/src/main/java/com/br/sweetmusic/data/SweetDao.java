package com.br.sweetmusic.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.br.sweetmusic.models.Musica;
import com.br.sweetmusic.pojos.Artist;
import com.br.sweetmusic.pojos.Track;

import java.util.List;

import io.reactivex.Observable;

@Dao
public interface SweetDao {

    @Insert
    void insertMusica(Track track);

    @Delete
    void deleteMusica(Track track);

    @Update
    void updateMusica(Track track);

    @Query("SELECT * FROM track")
    Observable<List<Musica>> getAllMusicas();

    @Query("SELECT * FROM artist WHERE idArtist = :idArtista")
    Artist getArtistById(long idArtista);

    @Query("SELECT * FROM artist WHERE strArtist = :nome")
    Artist getArtistByName(String nome);

    @Query("Select * FROM track WHERE idTrack = :idTrack")
    Track getTrackById(String idTrack);

    @Query("SELECT * FROM track WHERE strTrack = :nomeTrack")
    Track getTrackByName(String nomeTrack);

}
