package com.br.sweetmusic.network;


import com.br.sweetmusic.pojos.Tracks;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface API {

    @GET("mostloved.php")
    Observable<Tracks> getTracks(
            @Query("format") String track);
}
