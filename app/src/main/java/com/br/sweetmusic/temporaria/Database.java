package com.br.sweetmusic.temporaria;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.br.sweetmusic.models.Musica;

@androidx.room.Database(entities = (Musica.class), version = 1, exportSchema = false)
public abstract class Database extends RoomDatabase {
    private static volatile Database INSTANCE;

    public abstract SweetDao produtoDao();

    public static Database getDatabase(Context context) {
        if (INSTANCE == null) {
            synchronized (Database.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context, Database.class, "sweetmusic_db")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
