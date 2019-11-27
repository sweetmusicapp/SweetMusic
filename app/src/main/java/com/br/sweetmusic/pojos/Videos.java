
package com.br.sweetmusic.pojos;

import com.google.gson.annotations.Expose;

import java.util.List;

public class Videos {

    @Expose
    private List<Mvid> mvids;

    public List<Mvid> getMvids() {
        return mvids;
    }

    public void setMvids(List<Mvid> mvids) {
        this.mvids = mvids;
    }

}
