package com.br.sweetmusic.network;

import com.br.sweetmusic.model.Artista;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface API {

    @GET("searchalbum.php")
    Observable<Artista> getAllAlbunArtist(
            @Query("s") String artista);
}
