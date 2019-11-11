
package com.br.sweetmusic.pojos;

import com.google.gson.annotations.Expose;

public class Mvid {

    @Expose
    private String idAlbum;
    @Expose
    private String idArtist;
    @Expose
    private String idTrack;
    @Expose
    private String strDescriptionEN;
    @Expose
    private String strMusicVid;
    @Expose
    private String strTrack;
    @Expose
    private String strTrackThumb;

    public String getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(String idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(String idArtist) {
        this.idArtist = idArtist;
    }

    public String getIdTrack() {
        return idTrack;
    }

    public void setIdTrack(String idTrack) {
        this.idTrack = idTrack;
    }

    public String getStrDescriptionEN() {
        return strDescriptionEN;
    }

    public void setStrDescriptionEN(String strDescriptionEN) {
        this.strDescriptionEN = strDescriptionEN;
    }

    public String getStrMusicVid() {
        return strMusicVid;
    }

    public void setStrMusicVid(String strMusicVid) {
        this.strMusicVid = strMusicVid;
    }

    public String getStrTrack() {
        return strTrack;
    }

    public void setStrTrack(String strTrack) {
        this.strTrack = strTrack;
    }

    public String getStrTrackThumb() {
        return strTrackThumb;
    }

    public void setStrTrackThumb(String strTrackThumb) {
        this.strTrackThumb = strTrackThumb;
    }

}
