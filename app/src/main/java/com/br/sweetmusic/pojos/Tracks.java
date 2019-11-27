
package com.br.sweetmusic.pojos;

import com.google.gson.annotations.Expose;

import java.util.List;

public class Tracks {

    @Expose
    private List<Track> track;

    public List<Track> getTrack() {
        return track;
    }

    public void setTrack(List<Track> track) {
        this.track = track;
    }

}
