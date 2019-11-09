package com.br.sweetmusic.data;

import androidx.room.TypeConverter;

import com.facebook.stetho.inspector.protocol.module.Runtime;

public class Converter {

    @TypeConverter
    public int toInt(Object object) {
        if (object != null) {
            return null;
        } else {
            return new int(object);
        }
    }
}
