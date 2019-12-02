package com.br.sweetmusic.network;


import com.br.sweetmusic.pojos.Album;
import com.br.sweetmusic.pojos.Albuns;
import com.br.sweetmusic.pojos.Artistas;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface API {

    @GET("searchalbum.php")
    Observable<Albuns> getAlbunsByArtist(
            @Query("s") String artista);

    @GET("artist.php")
    Observable<Artistas> getArtistById(
            @Query("i") String artistId);
}
