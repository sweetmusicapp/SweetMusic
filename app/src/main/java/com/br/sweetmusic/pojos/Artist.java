
package com.br.sweetmusic.pojos;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;

@Entity(tableName = "artist")
public class Artist {

    @PrimaryKey(autoGenerate = true)
    private int internalId;
    @ColumnInfo
    private String idArtist;
    @ColumnInfo
    private String idLabel;
    @ColumnInfo
    private String intBornYear;
    @ColumnInfo
    private String intCharted;
    @ColumnInfo
    private String intDiedYear;
    @ColumnInfo
    private String intFormedYear;
    @ColumnInfo
    private String intMembers;
    @ColumnInfo
    private String strArtist;
    @ColumnInfo
    private String strArtistAlternate;
    @ColumnInfo
    private String strArtistBanner;
    @ColumnInfo
    private String strArtistClearart;
    @ColumnInfo
    private String strArtistFanart;
    @Expose
    private String strArtistFanart2;
    @Expose
    private String strArtistFanart3;
    @ColumnInfo
    private String strArtistLogo;
    @ColumnInfo
    private String strArtistStripped;
    @ColumnInfo
    private String strArtistThumb;
    @ColumnInfo
    private String strArtistWideThumb;
    @Expose
    private String strBiographyCN;
    @Expose
    private String strBiographyDE;
    @ColumnInfo
    private String strBiographyEN;
    @Expose
    private String strBiographyES;
    @Expose
    private String strBiographyFR;
    @Expose
    private String strBiographyHU;
    @Expose
    private String strBiographyIL;
    @Expose
    private String strBiographyIT;
    @Expose
    private String strBiographyJP;
    @Expose
    private String strBiographyNL;
    @Expose
    private String strBiographyNO;
    @Expose
    private String strBiographyPL;
    @ColumnInfo
    private String strBiographyPT;
    @Expose
    private String strBiographyRU;
    @Expose
    private String strBiographySE;
    @ColumnInfo
    private String strCountry;
    @ColumnInfo
    private String strCountryCode;
    @ColumnInfo
    private String strDisbanded;
    @ColumnInfo
    private String strFacebook;
    @ColumnInfo
    private String strGender;
    @ColumnInfo
    private String strGenre;
    @ColumnInfo
    private String strLabel;
    @Expose
    private String strLastFMChart;
    @Expose
    private String strLocked;
    @Expose
    private String strMood;
    @ColumnInfo
    private String strMusicBrainzID;
    @ColumnInfo
    private String strStyle;
    @ColumnInfo
    private String strTwitter;
    @ColumnInfo
    private String strWebsite;

    public int getInternalId() {
        return internalId;
    }

    public void setInternalId(int internalId) {
        this.internalId = internalId;
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

    public String getIntBornYear() {
        return intBornYear;
    }

    public void setIntBornYear(String intBornYear) {
        this.intBornYear = intBornYear;
    }

    public String getIntCharted() {
        return intCharted;
    }

    public void setIntCharted(String intCharted) {
        this.intCharted = intCharted;
    }

    public String getIntDiedYear() {
        return intDiedYear;
    }

    public void setIntDiedYear(String intDiedYear) {
        this.intDiedYear = intDiedYear;
    }

    public String getIntFormedYear() {
        return intFormedYear;
    }

    public void setIntFormedYear(String intFormedYear) {
        this.intFormedYear = intFormedYear;
    }

    public String getIntMembers() {
        return intMembers;
    }

    public void setIntMembers(String intMembers) {
        this.intMembers = intMembers;
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

    public String getStrArtistBanner() {
        return strArtistBanner;
    }

    public void setStrArtistBanner(String strArtistBanner) {
        this.strArtistBanner = strArtistBanner;
    }

    public String getStrArtistClearart() {
        return strArtistClearart;
    }

    public void setStrArtistClearart(String strArtistClearart) {
        this.strArtistClearart = strArtistClearart;
    }

    public String getStrArtistFanart() {
        return strArtistFanart;
    }

    public void setStrArtistFanart(String strArtistFanart) {
        this.strArtistFanart = strArtistFanart;
    }

    public String getStrArtistFanart2() {
        return strArtistFanart2;
    }

    public void setStrArtistFanart2(String strArtistFanart2) {
        this.strArtistFanart2 = strArtistFanart2;
    }

    public String getStrArtistFanart3() {
        return strArtistFanart3;
    }

    public void setStrArtistFanart3(String strArtistFanart3) {
        this.strArtistFanart3 = strArtistFanart3;
    }

    public String getStrArtistLogo() {
        return strArtistLogo;
    }

    public void setStrArtistLogo(String strArtistLogo) {
        this.strArtistLogo = strArtistLogo;
    }

    public String getStrArtistStripped() {
        return strArtistStripped;
    }

    public void setStrArtistStripped(String strArtistStripped) {
        this.strArtistStripped = strArtistStripped;
    }

    public String getStrArtistThumb() {
        return strArtistThumb;
    }

    public void setStrArtistThumb(String strArtistThumb) {
        this.strArtistThumb = strArtistThumb;
    }

    public String getStrArtistWideThumb() {
        return strArtistWideThumb;
    }

    public void setStrArtistWideThumb(String strArtistWideThumb) {
        this.strArtistWideThumb = strArtistWideThumb;
    }

    public String getStrBiographyCN() {
        return strBiographyCN;
    }

    public void setStrBiographyCN(String strBiographyCN) {
        this.strBiographyCN = strBiographyCN;
    }

    public String getStrBiographyDE() {
        return strBiographyDE;
    }

    public void setStrBiographyDE(String strBiographyDE) {
        this.strBiographyDE = strBiographyDE;
    }

    public String getStrBiographyEN() {
        return strBiographyEN;
    }

    public void setStrBiographyEN(String strBiographyEN) {
        this.strBiographyEN = strBiographyEN;
    }

    public String getStrBiographyES() {
        return strBiographyES;
    }

    public void setStrBiographyES(String strBiographyES) {
        this.strBiographyES = strBiographyES;
    }

    public String getStrBiographyFR() {
        return strBiographyFR;
    }

    public void setStrBiographyFR(String strBiographyFR) {
        this.strBiographyFR = strBiographyFR;
    }

    public String getStrBiographyHU() {
        return strBiographyHU;
    }

    public void setStrBiographyHU(String strBiographyHU) {
        this.strBiographyHU = strBiographyHU;
    }

    public String getStrBiographyIL() {
        return strBiographyIL;
    }

    public void setStrBiographyIL(String strBiographyIL) {
        this.strBiographyIL = strBiographyIL;
    }

    public String getStrBiographyIT() {
        return strBiographyIT;
    }

    public void setStrBiographyIT(String strBiographyIT) {
        this.strBiographyIT = strBiographyIT;
    }

    public String getStrBiographyJP() {
        return strBiographyJP;
    }

    public void setStrBiographyJP(String strBiographyJP) {
        this.strBiographyJP = strBiographyJP;
    }

    public String getStrBiographyNL() {
        return strBiographyNL;
    }

    public void setStrBiographyNL(String strBiographyNL) {
        this.strBiographyNL = strBiographyNL;
    }

    public String getStrBiographyNO() {
        return strBiographyNO;
    }

    public void setStrBiographyNO(String strBiographyNO) {
        this.strBiographyNO = strBiographyNO;
    }

    public String getStrBiographyPL() {
        return strBiographyPL;
    }

    public void setStrBiographyPL(String strBiographyPL) {
        this.strBiographyPL = strBiographyPL;
    }

    public String getStrBiographyPT() {
        return strBiographyPT;
    }

    public void setStrBiographyPT(String strBiographyPT) {
        this.strBiographyPT = strBiographyPT;
    }

    public String getStrBiographyRU() {
        return strBiographyRU;
    }

    public void setStrBiographyRU(String strBiographyRU) {
        this.strBiographyRU = strBiographyRU;
    }

    public String getStrBiographySE() {
        return strBiographySE;
    }

    public void setStrBiographySE(String strBiographySE) {
        this.strBiographySE = strBiographySE;
    }

    public String getStrCountry() {
        return strCountry;
    }

    public void setStrCountry(String strCountry) {
        this.strCountry = strCountry;
    }

    public String getStrCountryCode() {
        return strCountryCode;
    }

    public void setStrCountryCode(String strCountryCode) {
        this.strCountryCode = strCountryCode;
    }

    public String getStrDisbanded() {
        return strDisbanded;
    }

    public void setStrDisbanded(String strDisbanded) {
        this.strDisbanded = strDisbanded;
    }

    public String getStrFacebook() {
        return strFacebook;
    }

    public void setStrFacebook(String strFacebook) {
        this.strFacebook = strFacebook;
    }

    public String getStrGender() {
        return strGender;
    }

    public void setStrGender(String strGender) {
        this.strGender = strGender;
    }

    public String getStrGenre() {
        return strGenre;
    }

    public void setStrGenre(String strGenre) {
        this.strGenre = strGenre;
    }

    public String getStrLabel() {
        return strLabel;
    }

    public void setStrLabel(String strLabel) {
        this.strLabel = strLabel;
    }

    public String getStrLastFMChart() {
        return strLastFMChart;
    }

    public void setStrLastFMChart(String strLastFMChart) {
        this.strLastFMChart = strLastFMChart;
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

    public String getStrMusicBrainzID() {
        return strMusicBrainzID;
    }

    public void setStrMusicBrainzID(String strMusicBrainzID) {
        this.strMusicBrainzID = strMusicBrainzID;
    }

    public String getStrStyle() {
        return strStyle;
    }

    public void setStrStyle(String strStyle) {
        this.strStyle = strStyle;
    }

    public String getStrTwitter() {
        return strTwitter;
    }

    public void setStrTwitter(String strTwitter) {
        this.strTwitter = strTwitter;
    }

    public String getStrWebsite() {
        return strWebsite;
    }

    public void setStrWebsite(String strWebsite) {
        this.strWebsite = strWebsite;
    }
}
