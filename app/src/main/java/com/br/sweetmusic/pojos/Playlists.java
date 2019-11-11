
package com.br.sweetmusic.pojos;

import com.google.gson.annotations.Expose;

import java.util.List;

public class Playlists {

    @Expose
    private List<Playlist> playlists;

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public void setPlaylists(List<Playlist> playlists) {
        this.playlists = playlists;
    }

}
