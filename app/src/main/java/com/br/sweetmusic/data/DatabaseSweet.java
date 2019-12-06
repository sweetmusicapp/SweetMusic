package com.br.sweetmusic.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.br.sweetmusic.pojos.Album;
import com.br.sweetmusic.pojos.Artist;
import com.br.sweetmusic.pojos.Track;

@Database(entities = {Artist.class, Album.class, Track.class}, version = 2, exportSchema = false)
public abstract class DatabaseSweet extends RoomDatabase {
    private static volatile DatabaseSweet INSTANCE;

    public abstract SweetDao sweetDao();

    public static DatabaseSweet getDatabase(Context context) {
        if (INSTANCE == null) {
            synchronized (DatabaseSweet.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context, DatabaseSweet.class, "sweetmusic_db")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
