
package com.br.sweetmusic.pojos;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;

@Entity(tableName = "track")
public class Track {

    @PrimaryKey(autoGenerate = true)
    private int internalId;
    @ColumnInfo
    private String idAlbum;
    @ColumnInfo
    private int favorito;
    @ColumnInfo
    private String idArtist;
    @ColumnInfo
    private String idIMVDB;
    @ColumnInfo
    private String idLyric;
    @ColumnInfo
    private String idTrack;
    @ColumnInfo
    private String intCD;
    @ColumnInfo
    private String intDuration;
    @ColumnInfo
    private String intLoved;
    @ColumnInfo
    private String intMusicVidComments;
    @ColumnInfo
    private String intMusicVidDislikes;
    @ColumnInfo
    private String intMusicVidFavorites;
    @ColumnInfo
    private String intMusicVidLikes;
    @ColumnInfo
    private String intMusicVidViews;
    @ColumnInfo
    private String intScore;
    @ColumnInfo
    private String intScoreVotes;
    @ColumnInfo
    private String intTotalListeners;
    @ColumnInfo
    private String intTotalPlays;
    @ColumnInfo
    private String intTrackNumber;
    @ColumnInfo
    private String strAlbum;
    @ColumnInfo
    private String strArtist;
    @ColumnInfo
    private String strArtistAlternate;
    @ColumnInfo
    private String strDescriptionEN;
    @ColumnInfo
    private String strGenre;
    @Expose
    private String strLocked;
    @Expose
    private String strMood;
    @ColumnInfo
    private String strMusicBrainzAlbumID;
    @ColumnInfo
    private String strMusicBrainzArtistID;
    @ColumnInfo
    private String strMusicBrainzID;
    @ColumnInfo
    private String strMusicVid;
    @ColumnInfo
    private String strMusicVidCompany;
    @ColumnInfo
    private String strMusicVidDirector;
    @ColumnInfo
    private String strMusicVidScreen1;
    @Expose
    private String strMusicVidScreen2;
    @Expose
    private String strMusicVidScreen3;
    @ColumnInfo
    private String strStyle;
    @ColumnInfo
    private String strTheme;
    @ColumnInfo
    private String strTrack;
    @ColumnInfo
    private String strTrack3DCase;
    @ColumnInfo
    private String strTrackLyrics;
    @ColumnInfo
    private String strTrackThumb;

    public int getInternalId() {
        return internalId;
    }

    public void setInternalId(int internalId) {
        this.internalId = internalId;
    }

    public String getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(String idAlbum) {
        this.idAlbum = idAlbum;
    }

    public int getFavorito() {
        return favorito;
    }

    public void setFavorito(int favorito) {
        this.favorito = favorito;
    }

    public String getIdArtist() {
        return idArtist;
    }

    public void setIdArtist(String idArtist) {
        this.idArtist = idArtist;
    }

    public String getIdIMVDB() {
        return idIMVDB;
    }

    public void setIdIMVDB(String idIMVDB) {
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

    public String getIntCD() {
        return intCD;
    }

    public void setIntCD(String intCD) {
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

    public String getIntMusicVidComments() {
        return intMusicVidComments;
    }

    public void setIntMusicVidComments(String intMusicVidComments) {
        this.intMusicVidComments = intMusicVidComments;
    }

    public String getIntMusicVidDislikes() {
        return intMusicVidDislikes;
    }

    public void setIntMusicVidDislikes(String intMusicVidDislikes) {
        this.intMusicVidDislikes = intMusicVidDislikes;
    }

    public String getIntMusicVidFavorites() {
        return intMusicVidFavorites;
    }

    public void setIntMusicVidFavorites(String intMusicVidFavorites) {
        this.intMusicVidFavorites = intMusicVidFavorites;
    }

    public String getIntMusicVidLikes() {
        return intMusicVidLikes;
    }

    public void setIntMusicVidLikes(String intMusicVidLikes) {
        this.intMusicVidLikes = intMusicVidLikes;
    }

    public String getIntMusicVidViews() {
        return intMusicVidViews;
    }

    public void setIntMusicVidViews(String intMusicVidViews) {
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

    public String getIntTotalListeners() {
        return intTotalListeners;
    }

    public void setIntTotalListeners(String intTotalListeners) {
        this.intTotalListeners = intTotalListeners;
    }

    public String getIntTotalPlays() {
        return intTotalPlays;
    }

    public void setIntTotalPlays(String intTotalPlays) {
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

    public String getStrArtistAlternate() {
        return strArtistAlternate;
    }

    public void setStrArtistAlternate(String strArtistAlternate) {
        this.strArtistAlternate = strArtistAlternate;
    }

    public String getStrDescriptionEN() {
        return strDescriptionEN;
    }

    public void setStrDescriptionEN(String strDescriptionEN) {
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

    public String getStrMood() {
        return strMood;
    }

    public void setStrMood(String strMood) {
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

    public String getStrMusicVid() {
        return strMusicVid;
    }

    public void setStrMusicVid(String strMusicVid) {
        this.strMusicVid = strMusicVid;
    }

    public String getStrMusicVidCompany() {
        return strMusicVidCompany;
    }

    public void setStrMusicVidCompany(String strMusicVidCompany) {
        this.strMusicVidCompany = strMusicVidCompany;
    }

    public String getStrMusicVidDirector() {
        return strMusicVidDirector;
    }

    public void setStrMusicVidDirector(String strMusicVidDirector) {
        this.strMusicVidDirector = strMusicVidDirector;
    }

    public String getStrMusicVidScreen1() {
        return strMusicVidScreen1;
    }

    public void setStrMusicVidScreen1(String strMusicVidScreen1) {
        this.strMusicVidScreen1 = strMusicVidScreen1;
    }

    public String getStrMusicVidScreen2() {
        return strMusicVidScreen2;
    }

    public void setStrMusicVidScreen2(String strMusicVidScreen2) {
        this.strMusicVidScreen2 = strMusicVidScreen2;
    }

    public String getStrMusicVidScreen3() {
        return strMusicVidScreen3;
    }

    public void setStrMusicVidScreen3(String strMusicVidScreen3) {
        this.strMusicVidScreen3 = strMusicVidScreen3;
    }

    public String getStrStyle() {
        return strStyle;
    }

    public void setStrStyle(String strStyle) {
        this.strStyle = strStyle;
    }

    public String getStrTheme() {
        return strTheme;
    }

    public void setStrTheme(String strTheme) {
        this.strTheme = strTheme;
    }

    public String getStrTrack() {
        return strTrack;
    }

    public void setStrTrack(String strTrack) {
        this.strTrack = strTrack;
    }

    public String getStrTrack3DCase() {
        return strTrack3DCase;
    }

    public void setStrTrack3DCase(String strTrack3DCase) {
        this.strTrack3DCase = strTrack3DCase;
    }

    public String getStrTrackLyrics() {
        return strTrackLyrics;
    }

    public void setStrTrackLyrics(String strTrackLyrics) {
        this.strTrackLyrics = strTrackLyrics;
    }

    public String getStrTrackThumb() {
        return strTrackThumb;
    }

    public void setStrTrackThumb(String strTrackThumb) {
        this.strTrackThumb = strTrackThumb;
    }
}
