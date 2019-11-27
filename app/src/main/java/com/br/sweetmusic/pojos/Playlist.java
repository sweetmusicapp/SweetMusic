
package com.br.sweetmusic.pojos;

import com.google.gson.annotations.Expose;

public class Playlist {

    @Expose
    private String dateCreated;
    @Expose
    private String idPlaylist;
    @Expose
    private String strDescription;
    @Expose
    private String strFeatured;
    @Expose
    private String strImage;
    @Expose
    private String strPlaylist;
    @Expose
    private String strPublic;
    @Expose
    private String strSort;
    @Expose
    private String strType;
    @Expose
    private String strUser;

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(String idPlaylist) {
        this.idPlaylist = idPlaylist;
    }

    public String getStrDescription() {
        return strDescription;
    }

    public void setStrDescription(String strDescription) {
        this.strDescription = strDescription;
    }

    public String getStrFeatured() {
        return strFeatured;
    }

    public void setStrFeatured(String strFeatured) {
        this.strFeatured = strFeatured;
    }

    public String getStrImage() {
        return strImage;
    }

    public void setStrImage(String strImage) {
        this.strImage = strImage;
    }

    public String getStrPlaylist() {
        return strPlaylist;
    }

    public void setStrPlaylist(String strPlaylist) {
        this.strPlaylist = strPlaylist;
    }

    public String getStrPublic() {
        return strPublic;
    }

    public void setStrPublic(String strPublic) {
        this.strPublic = strPublic;
    }

    public String getStrSort() {
        return strSort;
    }

    public void setStrSort(String strSort) {
        this.strSort = strSort;
    }

    public String getStrType() {
        return strType;
    }

    public void setStrType(String strType) {
        this.strType = strType;
    }

    public String getStrUser() {
        return strUser;
    }

    public void setStrUser(String strUser) {
        this.strUser = strUser;
    }

}
