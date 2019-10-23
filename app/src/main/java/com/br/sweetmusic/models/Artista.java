package com.br.sweetmusic.models;

import java.util.ArrayList;
import java.util.List;

public class Artista {
    private List<Musica> listaMusica;

    public Artista(List<Musica> listaMusica) {
        this.listaMusica = listaMusica;
    }

    public List<Musica> getListaMusica() {
        return listaMusica;
    }

    public void setListaMusica(List<Musica> listaMusica) {
        this.listaMusica = listaMusica;
    }
}
