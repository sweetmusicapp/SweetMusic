package com.br.sweetmusic.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Update;

import com.br.sweetmusic.pojos.Track;

@Dao
public interface SweetDao {

    @Insert
    void insertMusica(Track track);

    @Delete
    void deleteMusica(Track track);

    @Update
    void updateMusica(Track track);


}

