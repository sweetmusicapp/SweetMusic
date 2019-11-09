
package com.br.sweetmusic.pojos;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;

@Entity(tableName = "album")
public class Album {

    @PrimaryKey(autoGenerate = true)
    private String idAlbum;
    @Expose
    private String idArtist;
    @Expose
    private String idLabel;
    @Expose
    private String intLoved;
    @Expose
    private String intSales;
    @Expose
    private String intScore;
    @Expose
    private String intScoreVotes;
    @Expose
    private String intYearReleased;
    @Expose
    private String strAlbum;
    @Expose
    private String strAlbum3DCase;
    @Expose
    private String strAlbum3DFace;
    @Expose
    private String strAlbum3DFlat;
    @Expose
    private String strAlbum3DThumb;
    @Expose
    private String strAlbumCDart;
    @Expose
    private String strAlbumSpine;
    @Expose
    private String strAlbumStripped;
    @Expose
    private String strAlbumThumb;
    @Expose
    private String strAlbumThumbBack;
    @Expose
    private String strAlbumThumbHQ;
    @Expose
    private String strAllMusicID;
    @Expose
    private String strAmazonID;
    @Expose
    private String strArtist;
    @Expose
    private String strArtistStripped;
    @Expose
    private String strBBCReviewID;
    @Expose
    private String strDescriptionCN;
    @Expose
    private String strDescriptionDE;
    @Expose
    private String strDescriptionEN;
    @Expose
    private String strDescriptionES;
    @Expose
    private String strDescriptionFR;
    @Expose
    private String strDescriptionHU;
    @Expose
    private String strDescriptionIL;
    @Expose
    private String strDescriptionIT;
    @Expose
    private String strDescriptionJP;
    @Expose
    private String strDescriptionNL;
    @Expose
    private String strDescriptionNO;
    @Expose
    private String strDescriptionPL;
    @Expose
    private String strDescriptionPT;
    @Expose
    private String strDescriptionRU;
    @Expose
    private String strDescriptionSE;
    @Expose
    private String strDiscogsID;
    @Expose
    private String strGeniusID;
    @Expose
    private String strGenre;
    @Expose
    private String strItunesID;
    @Expose
    private String strLabel;
    @Expose
    private String strLocation;
    @Expose
    private String strLocked;
    @Expose
    private String strLyricWikiID;
    @Expose
    private String strMood;
    @Expose
    private String strMusicBrainzArtistID;
    @Expose
    private String strMusicBrainzID;
    @Expose
    private String strMusicMozID;
    @Expose
    private String strRateYourMusicID;
    @Expose
    private String strReleaseFormat;
    @Expose
    private String strReview;
    @Expose
    private String strSpeed;
    @Expose
    private String strStyle;
    @Expose
    private String strTheme;
    @Expose
    private String strWikidataID;
    @Expose
    private String strWikipediaID;

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

    public String getIdLabel() {
        return idLabel;
    }

    public void setIdLabel(String idLabel) {
        this.idLabel = idLabel;
    }

    public String getIntLoved() {
        return intLoved;
    }

    public void setIntLoved(String intLoved) {
        this.intLoved = intLoved;
    }

    public String getIntSales() {
        return intSales;
    }

    public void setIntSales(String intSales) {
        this.intSales = intSales;
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

    public String getIntYearReleased() {
        return intYearReleased;
    }

    public void setIntYearReleased(String intYearReleased) {
        this.intYearReleased = intYearReleased;
    }

    public String getStrAlbum() {
        return strAlbum;
    }

    public void setStrAlbum(String strAlbum) {
        this.strAlbum = strAlbum;
    }

    public String getStrAlbum3DCase() {
        return strAlbum3DCase;
    }

    public void setStrAlbum3DCase(String strAlbum3DCase) {
        this.strAlbum3DCase = strAlbum3DCase;
    }

    public String getStrAlbum3DFace() {
        return strAlbum3DFace;
    }

    public void setStrAlbum3DFace(String strAlbum3DFace) {
        this.strAlbum3DFace = strAlbum3DFace;
    }

    public String getStrAlbum3DFlat() {
        return strAlbum3DFlat;
    }

    public void setStrAlbum3DFlat(String strAlbum3DFlat) {
        this.strAlbum3DFlat = strAlbum3DFlat;
    }

    public String getStrAlbum3DThumb() {
        return strAlbum3DThumb;
    }

    public void setStrAlbum3DThumb(String strAlbum3DThumb) {
        this.strAlbum3DThumb = strAlbum3DThumb;
    }

    public String getStrAlbumCDart() {
        return strAlbumCDart;
    }

    public void setStrAlbumCDart(String strAlbumCDart) {
        this.strAlbumCDart = strAlbumCDart;
    }

    public String getStrAlbumSpine() {
        return strAlbumSpine;
    }

    public void setStrAlbumSpine(String strAlbumSpine) {
        this.strAlbumSpine = strAlbumSpine;
    }

    public String getStrAlbumStripped() {
        return strAlbumStripped;
    }

    public void setStrAlbumStripped(String strAlbumStripped) {
        this.strAlbumStripped = strAlbumStripped;
    }

    public String getStrAlbumThumb() {
        return strAlbumThumb;
    }

    public void setStrAlbumThumb(String strAlbumThumb) {
        this.strAlbumThumb = strAlbumThumb;
    }

    public String getStrAlbumThumbBack() {
        return strAlbumThumbBack;
    }

    public void setStrAlbumThumbBack(String strAlbumThumbBack) {
        this.strAlbumThumbBack = strAlbumThumbBack;
    }

    public String getStrAlbumThumbHQ() {
        return strAlbumThumbHQ;
    }

    public void setStrAlbumThumbHQ(String strAlbumThumbHQ) {
        this.strAlbumThumbHQ = strAlbumThumbHQ;
    }

    public String getStrAllMusicID() {
        return strAllMusicID;
    }

    public void setStrAllMusicID(String strAllMusicID) {
        this.strAllMusicID = strAllMusicID;
    }

    public String getStrAmazonID() {
        return strAmazonID;
    }

    public void setStrAmazonID(String strAmazonID) {
        this.strAmazonID = strAmazonID;
    }

    public String getStrArtist() {
        return strArtist;
    }

    public void setStrArtist(String strArtist) {
        this.strArtist = strArtist;
    }

    public String getStrArtistStripped() {
        return strArtistStripped;
    }

    public void setStrArtistStripped(String strArtistStripped) {
        this.strArtistStripped = strArtistStripped;
    }

    public String getStrBBCReviewID() {
        return strBBCReviewID;
    }

    public void setStrBBCReviewID(String strBBCReviewID) {
        this.strBBCReviewID = strBBCReviewID;
    }

    public String getStrDescriptionCN() {
        return strDescriptionCN;
    }

    public void setStrDescriptionCN(String strDescriptionCN) {
        this.strDescriptionCN = strDescriptionCN;
    }

    public String getStrDescriptionDE() {
        return strDescriptionDE;
    }

    public void setStrDescriptionDE(String strDescriptionDE) {
        this.strDescriptionDE = strDescriptionDE;
    }

    public String getStrDescriptionEN() {
        return strDescriptionEN;
    }

    public void setStrDescriptionEN(String strDescriptionEN) {
        this.strDescriptionEN = strDescriptionEN;
    }

    public String getStrDescriptionES() {
        return strDescriptionES;
    }

    public void setStrDescriptionES(String strDescriptionES) {
        this.strDescriptionES = strDescriptionES;
    }

    public String getStrDescriptionFR() {
        return strDescriptionFR;
    }

    public void setStrDescriptionFR(String strDescriptionFR) {
        this.strDescriptionFR = strDescriptionFR;
    }

    public String getStrDescriptionHU() {
        return strDescriptionHU;
    }

    public void setStrDescriptionHU(String strDescriptionHU) {
        this.strDescriptionHU = strDescriptionHU;
    }

    public String getStrDescriptionIL() {
        return strDescriptionIL;
    }

    public void setStrDescriptionIL(String strDescriptionIL) {
        this.strDescriptionIL = strDescriptionIL;
    }

    public String getStrDescriptionIT() {
        return strDescriptionIT;
    }

    public void setStrDescriptionIT(String strDescriptionIT) {
        this.strDescriptionIT = strDescriptionIT;
    }

    public String getStrDescriptionJP() {
        return strDescriptionJP;
    }

    public void setStrDescriptionJP(String strDescriptionJP) {
        this.strDescriptionJP = strDescriptionJP;
    }

    public String getStrDescriptionNL() {
        return strDescriptionNL;
    }

    public void setStrDescriptionNL(String strDescriptionNL) {
        this.strDescriptionNL = strDescriptionNL;
    }

    public String getStrDescriptionNO() {
        return strDescriptionNO;
    }

    public void setStrDescriptionNO(String strDescriptionNO) {
        this.strDescriptionNO = strDescriptionNO;
    }

    public String getStrDescriptionPL() {
        return strDescriptionPL;
    }

    public void setStrDescriptionPL(String strDescriptionPL) {
        this.strDescriptionPL = strDescriptionPL;
    }

    public String getStrDescriptionPT() {
        return strDescriptionPT;
    }

    public void setStrDescriptionPT(String strDescriptionPT) {
        this.strDescriptionPT = strDescriptionPT;
    }

    public String getStrDescriptionRU() {
        return strDescriptionRU;
    }

    public void setStrDescriptionRU(String strDescriptionRU) {
        this.strDescriptionRU = strDescriptionRU;
    }

    public String getStrDescriptionSE() {
        return strDescriptionSE;
    }

    public void setStrDescriptionSE(String strDescriptionSE) {
        this.strDescriptionSE = strDescriptionSE;
    }

    public String getStrDiscogsID() {
        return strDiscogsID;
    }

    public void setStrDiscogsID(String strDiscogsID) {
        this.strDiscogsID = strDiscogsID;
    }

    public String getStrGeniusID() {
        return strGeniusID;
    }

    public void setStrGeniusID(String strGeniusID) {
        this.strGeniusID = strGeniusID;
    }

    public String getStrGenre() {
        return strGenre;
    }

    public void setStrGenre(String strGenre) {
        this.strGenre = strGenre;
    }

    public String getStrItunesID() {
        return strItunesID;
    }

    public void setStrItunesID(String strItunesID) {
        this.strItunesID = strItunesID;
    }

    public String getStrLabel() {
        return strLabel;
    }

    public void setStrLabel(String strLabel) {
        this.strLabel = strLabel;
    }

    public String getStrLocation() {
        return strLocation;
    }

    public void setStrLocation(String strLocation) {
        this.strLocation = strLocation;
    }

    public String getStrLocked() {
        return strLocked;
    }

    public void setStrLocked(String strLocked) {
        this.strLocked = strLocked;
    }

    public String getStrLyricWikiID() {
        return strLyricWikiID;
    }

    public void setStrLyricWikiID(String strLyricWikiID) {
        this.strLyricWikiID = strLyricWikiID;
    }

    public String getStrMood() {
        return strMood;
    }

    public void setStrMood(String strMood) {
        this.strMood = strMood;
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

    public String getStrMusicMozID() {
        return strMusicMozID;
    }

    public void setStrMusicMozID(String strMusicMozID) {
        this.strMusicMozID = strMusicMozID;
    }

    public String getStrRateYourMusicID() {
        return strRateYourMusicID;
    }

    public void setStrRateYourMusicID(String strRateYourMusicID) {
        this.strRateYourMusicID = strRateYourMusicID;
    }

    public String getStrReleaseFormat() {
        return strReleaseFormat;
    }

    public void setStrReleaseFormat(String strReleaseFormat) {
        this.strReleaseFormat = strReleaseFormat;
    }

    public String getStrReview() {
        return strReview;
    }

    public void setStrReview(String strReview) {
        this.strReview = strReview;
    }

    public String getStrSpeed() {
        return strSpeed;
    }

    public void setStrSpeed(String strSpeed) {
        this.strSpeed = strSpeed;
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

    public String getStrWikidataID() {
        return strWikidataID;
    }

    public void setStrWikidataID(String strWikidataID) {
        this.strWikidataID = strWikidataID;
    }

    public String getStrWikipediaID() {
        return strWikipediaID;
    }

    public void setStrWikipediaID(String strWikipediaID) {
        this.strWikipediaID = strWikipediaID;
    }
}
