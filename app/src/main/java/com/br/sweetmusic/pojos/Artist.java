
package com.br.sweetmusic.pojos;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "artist")
public class Artist {

    @PrimaryKey(autoGenerate = true)
    private int internalId;
    @ColumnInfo(name = "favorito")
    private int favorito;
    @ColumnInfo(name = "artist_id")
    private String idArtist;
    @ColumnInfo(name = "artist_nascimento")
    private String intBornYear;
    @ColumnInfo(name = "artist_morte")
    private String intDiedYear;
    @ColumnInfo(name = "artist_formacao")
    private String intFormedYear;
    @ColumnInfo(name = "artist_membros")
    private String intMembers;
    @ColumnInfo(name = "artist_nome")
    private String strArtist;
    @ColumnInfo(name = "artist_biografia_en")
    private String strBiographyEN;
    @ColumnInfo(name = "artist_biografia_pt")
    private String strBiographyPT;
    @ColumnInfo(name = "artist_pais")
    private String strCountry;
    @ColumnInfo(name = "artist_pais_code")
    private String strCountryCode;
    @ColumnInfo(name = "artist_separacao")
    private String strDisbanded;
    @ColumnInfo(name = "artist_sexo")
    private String strGender;
    @ColumnInfo(name = "artist_genero")
    private String strGenre;

    private String idLabel;
    private String strArtistAlternate;
    private String strArtistBanner;
    private String strArtistClearart;
    private String strArtistFanart;
    private String strArtistFanart2;
    private String strArtistFanart3;
    private String strArtistLogo;
    private String strArtistStripped;
    private String strArtistThumb;
    private String strArtistWideThumb;
    private String strBiographyCN;
    private String strBiographyDE;
    private String intCharted;
    private String strBiographyES;
    private String strBiographyFR;
    private String strBiographyHU;
    private String strBiographyIL;
    private String strBiographyIT;
    private String strBiographyJP;
    private String strBiographyNL;
    private String strBiographyNO;
    private String strBiographyPL;
    private String strBiographyRU;
    private String strBiographySE;
    private String strFacebook;
    private String strLabel;
    private String strLastFMChart;
    private String strLocked;
    private String strMood;
    private String strMusicBrainzID;
    private String strStyle;
    private String strTwitter;
    private String strWebsite;

    public Artist(int internalId, int favorito, String idArtist, String intBornYear,
                  String intDiedYear, String intFormedYear, String intMembers, String strArtist,
                  String strBiographyEN, String strBiographyPT, String strCountry,
                  String strCountryCode, String strDisbanded, String strGender, String strGenre) {
        this.internalId = internalId;
        this.favorito = favorito;
        this.idArtist = idArtist;
        this.intBornYear = intBornYear;
        this.intDiedYear = intDiedYear;
        this.intFormedYear = intFormedYear;
        this.intMembers = intMembers;
        this.strArtist = strArtist;
        this.strBiographyEN = strBiographyEN;
        this.strBiographyPT = strBiographyPT;
        this.strCountry = strCountry;
        this.strCountryCode = strCountryCode;
        this.strDisbanded = strDisbanded;
        this.strGender = strGender;
        this.strGenre = strGenre;
    }

    public int getFavorito() {
        return favorito;
    }

    public void setFavorito(int favorito) {
        this.favorito = favorito;
    }

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
