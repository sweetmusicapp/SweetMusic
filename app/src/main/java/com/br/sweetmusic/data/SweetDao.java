package com.br.sweetmusic.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.br.sweetmusic.pojos.Artist;
import com.br.sweetmusic.pojos.Track;

import static android.icu.text.MessagePattern.ArgType.SELECT;

@Dao
public interface SweetDao {

    @Insert
    void insertArtista(Artist artista);

    @Delete
    void deleteArtista(Artist artista);

    @Update
    void updateArtista(Artist artista);

    //Retorna o artista do DB de acordo com o nome
    @Query("SELECT * FROM artist WHERE artist_nome = :nomeArtista")
    Artist getArtistByName(String nomeArtista);

    //Retorna apenas os artistas do DB com favorito = 1
    @Query("SELECT * FROM artist WHERE favorito = 1")
    Artist getFavoritos();
}

