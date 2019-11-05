package com.br.sweetmusic.temporaria;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.br.sweetmusic.models.Musica;

import java.util.List;

import io.reactivex.Observable;

@Dao
public interface SweetDao {

    @Insert
    void insertMusica(Musica musica);

    @Delete
    void deleteMusica(Musica musica);

    @Update
    void updateMusica(Musica musica);

    @Query("SELECT * FROM musicas")
    Observable<List<Musica>> getAllMusicas();

    @Query("SELECT * FROM musicas WHERE idArtista = :idArtista")
    Musica getById(long idArtista);

    @Query("SELECT * FROM musicas WHERE nome = :nome")
    Musica getByName(String nome);
}
