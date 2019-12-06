package com.br.sweetmusic.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.br.sweetmusic.pojos.Artist;
import com.br.sweetmusic.pojos.Track;

import java.util.List;

import io.reactivex.Observable;

@Dao
public interface SweetDao {

    @Insert
    void insertArtista(Artist artista);

    @Insert
    void insertTrack(Track track);

    @Delete
    void deleteTrack(Track track);

    @Update
    void updateArtista(Artist artista);

    @Query("SELECT * FROM artist WHERE artist_nome = :nomeArtista")
    Artist getArtistByName(String nomeArtista);

    @Query("SELECT * FROM artist WHERE favorito = 1")
    Artist getFavoritos();

    @Query("SELECT * FROM track")
    Observable<List<Track>> getFavoritesTracks();
}

