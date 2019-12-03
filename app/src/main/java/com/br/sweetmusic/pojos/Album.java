
package com.br.sweetmusic.pojos;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;

@Entity(tableName = "album")
public class Album implements Parcelable {

    @PrimaryKey(autoGenerate = true)
    private int internalId;
    @ColumnInfo
    private String idAlbum;
    @ColumnInfo
    private String idArtist;
    @ColumnInfo
    private String idLabel;
    @ColumnInfo
    private String intLoved;
    @ColumnInfo
    private String intSales;
    @ColumnInfo
    private String intScore;
    @ColumnInfo
    private String intScoreVotes;
    @ColumnInfo
    private String intYearReleased;
    @ColumnInfo
    private String strAlbum;
    @ColumnInfo
    private String strAlbum3DCase;
    @ColumnInfo
    private String strAlbum3DFace;
    @ColumnInfo
    private String strAlbum3DFlat;
    @ColumnInfo
    private String strAlbum3DThumb;
    @Expose
    private String strAlbumCDart;
    @Expose
    private String strAlbumSpine;
    @Expose
    private String strAlbumStripped;
    @ColumnInfo
    private String strAlbumThumb;
    @Expose
    private String strAlbumThumbBack;
    @Expose
    private String strAlbumThumbHQ;
    @ColumnInfo
    private String strAllMusicID;
    @ColumnInfo
    private String strAmazonID;
    @ColumnInfo
    private String strArtist;
    @Expose
    private String strArtistStripped;
    @Expose
    private String strBBCReviewID;
    @Expose
    private String strDescriptionCN;
    @Expose
    private String strDescriptionDE;
    @ColumnInfo
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
    @ColumnInfo
    private String strDescriptionPT;
    @Expose
    private String strDescriptionRU;
    @Expose
    private String strDescriptionSE;
    @ColumnInfo
    private String strDiscogsID;
    @ColumnInfo
    private String strGeniusID;
    @ColumnInfo
    private String strGenre;
    @ColumnInfo
    private String strItunesID;
    @ColumnInfo
    private String strLabel;
    @ColumnInfo
    private String strLocation;
    @Expose
    private String strLocked;
    @ColumnInfo
    private String strLyricWikiID;
    @Expose
    private String strMood;
    @ColumnInfo
    private String strMusicBrainzArtistID;
    @ColumnInfo
    private String strMusicBrainzID;
    @Expose
    private String strMusicMozID;
    @Expose
    private String strRateYourMusicID;
    @Expose
    private String strReleaseFormat;
    @ColumnInfo
    private String strReview;
    @Expose
    private String strSpeed;
    @ColumnInfo
    private String strStyle;
    @ColumnInfo
    private String strTheme;
    @Expose
    private String strWikidataID;
    @Expose
    private String strWikipediaID;

    protected Album(Parcel in) {
        internalId = in.readInt();
        idAlbum = in.readString();
        idArtist = in.readString();
        idLabel = in.readString();
        intLoved = in.readString();
        intSales = in.readString();
        intScore = in.readString();
        intScoreVotes = in.readString();
        intYearReleased = in.readString();
        strAlbum = in.readString();
        strAlbum3DCase = in.readString();
        strAlbum3DFace = in.readString();
        strAlbum3DFlat = in.readString();
        strAlbum3DThumb = in.readString();
        strAlbumCDart = in.readString();
        strAlbumSpine = in.readString();
        strAlbumStripped = in.readString();
        strAlbumThumb = in.readString();
        strAlbumThumbBack = in.readString();
        strAlbumThumbHQ = in.readString();
        strAllMusicID = in.readString();
        strAmazonID = in.readString();
        strArtist = in.readString();
        strArtistStripped = in.readString();
        strBBCReviewID = in.readString();
        strDescriptionCN = in.readString();
        strDescriptionDE = in.readString();
        strDescriptionEN = in.readString();
        strDescriptionES = in.readString();
        strDescriptionFR = in.readString();
        strDescriptionHU = in.readString();
        strDescriptionIL = in.readString();
        strDescriptionIT = in.readString();
        strDescriptionJP = in.readString();
        strDescriptionNL = in.readString();
        strDescriptionNO = in.readString();
        strDescriptionPL = in.readString();
        strDescriptionPT = in.readString();
        strDescriptionRU = in.readString();
        strDescriptionSE = in.readString();
        strDiscogsID = in.readString();
        strGeniusID = in.readString();
        strGenre = in.readString();
        strItunesID = in.readString();
        strLabel = in.readString();
        strLocation = in.readString();
        strLocked = in.readString();
        strLyricWikiID = in.readString();
        strMood = in.readString();
        strMusicBrainzArtistID = in.readString();
        strMusicBrainzID = in.readString();
        strMusicMozID = in.readString();
        strRateYourMusicID = in.readString();
        strReleaseFormat = in.readString();
        strReview = in.readString();
        strSpeed = in.readString();
        strStyle = in.readString();
        strTheme = in.readString();
        strWikidataID = in.readString();
        strWikipediaID = in.readString();
    }

    public static final Creator<Album> CREATOR = new Creator<Album>() {
        @Override
        public Album createFromParcel(Parcel in) {
            return new Album(in);
        }

        @Override
        public Album[] newArray(int size) {
            return new Album[size];
        }
    };

    public Album() {
    }

    //    public Album(int internalId, String idAlbum, String idArtist, String idLabel, String intLoved,
//                 String intSales, String intScore, String intScoreVotes, String intYearReleased,
//                 String strAlbum, String strAlbum3DCase, String strAlbum3DFace, String strAlbum3DFlat,
//                 String strAlbum3DThumb, String strAlbumCDart, String strAlbumSpine,
//                 String strAlbumStripped, String strAlbumThumb, String strAlbumThumbBack,
//                 String strAlbumThumbHQ, String strAllMusicID, String strAmazonID, String strArtist,
//                 String strArtistStripped, String strBBCReviewID, String strDescriptionCN,
//                 String strDescriptionDE, String strDescriptionEN, String strDescriptionES,
//                 String strDescriptionFR, String strDescriptionHU, String strDescriptionIL,
//                 String strDescriptionIT, String strDescriptionJP, String strDescriptionNL,
//                 String strDescriptionNO, String strDescriptionPL, String strDescriptionPT,
//                 String strDescriptionRU, String strDescriptionSE, String strDiscogsID, String strGeniusID,
//                 String strGenre, String strItunesID, String strLabel, String strLocation,
//                 String strLocked, String strLyricWikiID, String strMood, String strMusicBrainzArtistID,
//                 String strMusicBrainzID, String strMusicMozID, String strRateYourMusicID,
//                 String strReleaseFormat, String strReview, String strSpeed, String strStyle,
//                 String strTheme, String strWikidataID, String strWikipediaID) {
//        this.internalId = internalId;
//        this.idAlbum = idAlbum;
//        this.idArtist = idArtist;
//        this.idLabel = idLabel;
//        this.intLoved = intLoved;
//        this.intSales = intSales;
//        this.intScore = intScore;
//        this.intScoreVotes = intScoreVotes;
//        this.intYearReleased = intYearReleased;
//        this.strAlbum = strAlbum;
//        this.strAlbum3DCase = strAlbum3DCase;
//        this.strAlbum3DFace = strAlbum3DFace;
//        this.strAlbum3DFlat = strAlbum3DFlat;
//        this.strAlbum3DThumb = strAlbum3DThumb;
//        this.strAlbumCDart = strAlbumCDart;
//        this.strAlbumSpine = strAlbumSpine;
//        this.strAlbumStripped = strAlbumStripped;
//        this.strAlbumThumb = strAlbumThumb;
//        this.strAlbumThumbBack = strAlbumThumbBack;
//        this.strAlbumThumbHQ = strAlbumThumbHQ;
//        this.strAllMusicID = strAllMusicID;
//        this.strAmazonID = strAmazonID;
//        this.strArtist = strArtist;
//        this.strArtistStripped = strArtistStripped;
//        this.strBBCReviewID = strBBCReviewID;
//        this.strDescriptionCN = strDescriptionCN;
//        this.strDescriptionDE = strDescriptionDE;
//        this.strDescriptionEN = strDescriptionEN;
//        this.strDescriptionES = strDescriptionES;
//        this.strDescriptionFR = strDescriptionFR;
//        this.strDescriptionHU = strDescriptionHU;
//        this.strDescriptionIL = strDescriptionIL;
//        this.strDescriptionIT = strDescriptionIT;
//        this.strDescriptionJP = strDescriptionJP;
//        this.strDescriptionNL = strDescriptionNL;
//        this.strDescriptionNO = strDescriptionNO;
//        this.strDescriptionPL = strDescriptionPL;
//        this.strDescriptionPT = strDescriptionPT;
//        this.strDescriptionRU = strDescriptionRU;
//        this.strDescriptionSE = strDescriptionSE;
//        this.strDiscogsID = strDiscogsID;
//        this.strGeniusID = strGeniusID;
//        this.strGenre = strGenre;
//        this.strItunesID = strItunesID;
//        this.strLabel = strLabel;
//        this.strLocation = strLocation;
//        this.strLocked = strLocked;
//        this.strLyricWikiID = strLyricWikiID;
//        this.strMood = strMood;
//        this.strMusicBrainzArtistID = strMusicBrainzArtistID;
//        this.strMusicBrainzID = strMusicBrainzID;
//        this.strMusicMozID = strMusicMozID;
//        this.strRateYourMusicID = strRateYourMusicID;
//        this.strReleaseFormat = strReleaseFormat;
//        this.strReview = strReview;
//        this.strSpeed = strSpeed;
//        this.strStyle = strStyle;
//        this.strTheme = strTheme;
//        this.strWikidataID = strWikidataID;
//        this.strWikipediaID = strWikipediaID;
//    }

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(internalId);
        dest.writeString(idAlbum);
        dest.writeString(idArtist);
        dest.writeString(idLabel);
        dest.writeString(intLoved);
        dest.writeString(intSales);
        dest.writeString(intScore);
        dest.writeString(intScoreVotes);
        dest.writeString(intYearReleased);
        dest.writeString(strAlbum);
        dest.writeString(strAlbum3DCase);
        dest.writeString(strAlbum3DFace);
        dest.writeString(strAlbum3DFlat);
        dest.writeString(strAlbum3DThumb);
        dest.writeString(strAlbumCDart);
        dest.writeString(strAlbumSpine);
        dest.writeString(strAlbumStripped);
        dest.writeString(strAlbumThumb);
        dest.writeString(strAlbumThumbBack);
        dest.writeString(strAlbumThumbHQ);
        dest.writeString(strAllMusicID);
        dest.writeString(strAmazonID);
        dest.writeString(strArtist);
        dest.writeString(strArtistStripped);
        dest.writeString(strBBCReviewID);
        dest.writeString(strDescriptionCN);
        dest.writeString(strDescriptionDE);
        dest.writeString(strDescriptionEN);
        dest.writeString(strDescriptionES);
        dest.writeString(strDescriptionFR);
        dest.writeString(strDescriptionHU);
        dest.writeString(strDescriptionIL);
        dest.writeString(strDescriptionIT);
        dest.writeString(strDescriptionJP);
        dest.writeString(strDescriptionNL);
        dest.writeString(strDescriptionNO);
        dest.writeString(strDescriptionPL);
        dest.writeString(strDescriptionPT);
        dest.writeString(strDescriptionRU);
        dest.writeString(strDescriptionSE);
        dest.writeString(strDiscogsID);
        dest.writeString(strGeniusID);
        dest.writeString(strGenre);
        dest.writeString(strItunesID);
        dest.writeString(strLabel);
        dest.writeString(strLocation);
        dest.writeString(strLocked);
        dest.writeString(strLyricWikiID);
        dest.writeString(strMood);
        dest.writeString(strMusicBrainzArtistID);
        dest.writeString(strMusicBrainzID);
        dest.writeString(strMusicMozID);
        dest.writeString(strRateYourMusicID);
        dest.writeString(strReleaseFormat);
        dest.writeString(strReview);
        dest.writeString(strSpeed);
        dest.writeString(strStyle);
        dest.writeString(strTheme);
        dest.writeString(strWikidataID);
        dest.writeString(strWikipediaID);
    }
}
