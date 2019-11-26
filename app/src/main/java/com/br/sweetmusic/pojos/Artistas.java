
package com.br.sweetmusic.pojos;

import com.google.gson.annotations.Expose;

import java.util.List;

public class Artistas {

    @Expose
    private List<Artist> artists;

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

}
