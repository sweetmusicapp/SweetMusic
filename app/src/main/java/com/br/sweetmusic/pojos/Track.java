
package com.br.sweetmusic.pojos;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;

@Entity(tableName = "track")
public class Track {

    @PrimaryKey(autoGenerate = true)
    private String idAlbum;
    @Expose
    private Boolean favorito;
    @Expose
    private String idArtist;
    @Expose
    private Object idIMVDB;
    @Expose
    private String idLyric;
    @Expose
    private String idTrack;
    @Expose
    private Object intCD;
    @Expose
    private String intDuration;
    @Expose
    private String intLoved;
    @Expose
    private Object intMusicVidComments;
    @Expose
    private Object intMusicVidDislikes;
    @Expose
    private Object intMusicVidFavorites;
    @Expose
    private Object intMusicVidLikes;
    @Expose
    private Object intMusicVidViews;
    @Expose
    private String intScore;
    @Expose
    private String intScoreVotes;
    @Expose
    private Object intTotalListeners;
    @Expose
    private Object intTotalPlays;
    @Expose
    private String intTrackNumber;
    @Expose
    private String strAlbum;
    @Expose
    private String strArtist;
    @Expose
    private Object strArtistAlternate;
    @Expose
    private Object strDescriptionEN;
    @Expose
    private String strGenre;
    @Expose
    private String strLocked;
    @Expose
    private Object strMood;
    @Expose
    private String strMusicBrainzAlbumID;
    @Expose
    private String strMusicBrainzArtistID;
    @Expose
    private String strMusicBrainzID;
    @Expose
    private Object strMusicVid;
    @Expose
    private Object strMusicVidCompany;
    @Expose
    private Object strMusicVidDirector;
    @Expose
    private Object strMusicVidScreen1;
    @Expose
    private Object strMusicVidScreen2;
    @Expose
    private Object strMusicVidScreen3;
    @Expose
    private Object strStyle;
    @Expose
    private Object strTheme;
    @Expose
    private String strTrack;
    @Expose
    private Object strTrack3DCase;
    @Expose
    private Object strTrackLyrics;
    @Expose
    private Object strTrackThumb;

    public Boolean getFavorito() {
        return favorito;
    }

    public void setFavorito(Boolean favorito) {
        this.favorito = favorito;
    }

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

    public Object getIdIMVDB() {
        return idIMVDB;
    }

    public void setIdIMVDB(Object idIMVDB) {
        this.idIMVDB = idIMVDB;
    }

    public String getIdLyric() {
        return idLyric;
    }

    public void setIdLyric(String idLyric) {
        this.idLyric = idLyric;
    }

    public String getIdTrack() {
        return idTrack;
    }

    public void setIdTrack(String idTrack) {
        this.idTrack = idTrack;
    }

    public Object getIntCD() {
        return intCD;
    }

    public void setIntCD(Object intCD) {
        this.intCD = intCD;
    }

    public String getIntDuration() {
        return intDuration;
    }

    public void setIntDuration(String intDuration) {
        this.intDuration = intDuration;
    }

    public String getIntLoved() {
        return intLoved;
    }

    public void setIntLoved(String intLoved) {
        this.intLoved = intLoved;
    }

    public Object getIntMusicVidComments() {
        return intMusicVidComments;
    }

    public void setIntMusicVidComments(Object intMusicVidComments) {
        this.intMusicVidComments = intMusicVidComments;
    }

    public Object getIntMusicVidDislikes() {
        return intMusicVidDislikes;
    }

    public void setIntMusicVidDislikes(Object intMusicVidDislikes) {
        this.intMusicVidDislikes = intMusicVidDislikes;
    }

    public Object getIntMusicVidFavorites() {
        return intMusicVidFavorites;
    }

    public void setIntMusicVidFavorites(Object intMusicVidFavorites) {
        this.intMusicVidFavorites = intMusicVidFavorites;
    }

    public Object getIntMusicVidLikes() {
        return intMusicVidLikes;
    }

    public void setIntMusicVidLikes(Object intMusicVidLikes) {
        this.intMusicVidLikes = intMusicVidLikes;
    }

    public Object getIntMusicVidViews() {
        return intMusicVidViews;
    }

    public void setIntMusicVidViews(Object intMusicVidViews) {
        this.intMusicVidViews = intMusicVidViews;
    }

    public String getIntScore() {
        return intScore;
    }

    public void setIntScore(String intScore) {
        this.intScore = intScore;
    }

    public String getIntScoreVotes() {
        return intScoreVotes;
    }

    public void setIntScoreVotes(String intScoreVotes) {
        this.intScoreVotes = intScoreVotes;
    }

    public Object getIntTotalListeners() {
        return intTotalListeners;
    }

    public void setIntTotalListeners(Object intTotalListeners) {
        this.intTotalListeners = intTotalListeners;
    }

    public Object getIntTotalPlays() {
        return intTotalPlays;
    }

    public void setIntTotalPlays(Object intTotalPlays) {
        this.intTotalPlays = intTotalPlays;
    }

    public String getIntTrackNumber() {
        return intTrackNumber;
    }

    public void setIntTrackNumber(String intTrackNumber) {
        this.intTrackNumber = intTrackNumber;
    }

    public String getStrAlbum() {
        return strAlbum;
    }

    public void setStrAlbum(String strAlbum) {
        this.strAlbum = strAlbum;
    }

    public String getStrArtist() {
        return strArtist;
    }

    public void setStrArtist(String strArtist) {
        this.strArtist = strArtist;
    }

    public Object getStrArtistAlternate() {
        return strArtistAlternate;
    }

    public void setStrArtistAlternate(Object strArtistAlternate) {
        this.strArtistAlternate = strArtistAlternate;
    }

    public Object getStrDescriptionEN() {
        return strDescriptionEN;
    }

    public void setStrDescriptionEN(Object strDescriptionEN) {
        this.strDescriptionEN = strDescriptionEN;
    }

    public String getStrGenre() {
        return strGenre;
    }

    public void setStrGenre(String strGenre) {
        this.strGenre = strGenre;
    }

    public String getStrLocked() {
        return strLocked;
    }

    public void setStrLocked(String strLocked) {
        this.strLocked = strLocked;
    }

    public Object getStrMood() {
        return strMood;
    }

    public void setStrMood(Object strMood) {
        this.strMood = strMood;
    }

    public String getStrMusicBrainzAlbumID() {
        return strMusicBrainzAlbumID;
    }

    public void setStrMusicBrainzAlbumID(String strMusicBrainzAlbumID) {
        this.strMusicBrainzAlbumID = strMusicBrainzAlbumID;
    }

    public String getStrMusicBrainzArtistID() {
        return strMusicBrainzArtistID;
    }

    public void setStrMusicBrainzArtistID(String strMusicBrainzArtistID) {
        this.strMusicBrainzArtistID = strMusicBrainzArtistID;
    }

    public String getStrMusicBrainzID() {
        return strMusicBrainzID;
    }

    public void setStrMusicBrainzID(String strMusicBrainzID) {
        this.strMusicBrainzID = strMusicBrainzID;
    }

    public Object getStrMusicVid() {
        return strMusicVid;
    }

    public void setStrMusicVid(Object strMusicVid) {
        this.strMusicVid = strMusicVid;
    }

    public Object getStrMusicVidCompany() {
        return strMusicVidCompany;
    }

    public void setStrMusicVidCompany(Object strMusicVidCompany) {
        this.strMusicVidCompany = strMusicVidCompany;
    }

    public Object getStrMusicVidDirector() {
        return strMusicVidDirector;
    }

    public void setStrMusicVidDirector(Object strMusicVidDirector) {
        this.strMusicVidDirector = strMusicVidDirector;
    }

    public Object getStrMusicVidScreen1() {
        return strMusicVidScreen1;
    }

    public void setStrMusicVidScreen1(Object strMusicVidScreen1) {
        this.strMusicVidScreen1 = strMusicVidScreen1;
    }

    public Object getStrMusicVidScreen2() {
        return strMusicVidScreen2;
    }

    public void setStrMusicVidScreen2(Object strMusicVidScreen2) {
        this.strMusicVidScreen2 = strMusicVidScreen2;
    }

    public Object getStrMusicVidScreen3() {
        return strMusicVidScreen3;
    }

    public void setStrMusicVidScreen3(Object strMusicVidScreen3) {
        this.strMusicVidScreen3 = strMusicVidScreen3;
    }

    public Object getStrStyle() {
        return strStyle;
    }

    public void setStrStyle(Object strStyle) {
        this.strStyle = strStyle;
    }

    public Object getStrTheme() {
        return strTheme;
    }

    public void setStrTheme(Object strTheme) {
        this.strTheme = strTheme;
    }

    public String getStrTrack() {
        return strTrack;
    }

    public void setStrTrack(String strTrack) {
        this.strTrack = strTrack;
    }

    public Object getStrTrack3DCase() {
        return strTrack3DCase;
    }

    public void setStrTrack3DCase(Object strTrack3DCase) {
        this.strTrack3DCase = strTrack3DCase;
    }

    public Object getStrTrackLyrics() {
        return strTrackLyrics;
    }

    public void setStrTrackLyrics(Object strTrackLyrics) {
        this.strTrackLyrics = strTrackLyrics;
    }

    public Object getStrTrackThumb() {
        return strTrackThumb;
    }

    public void setStrTrackThumb(Object strTrackThumb) {
        this.strTrackThumb = strTrackThumb;
    }

}
