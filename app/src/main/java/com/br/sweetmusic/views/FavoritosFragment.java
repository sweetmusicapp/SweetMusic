package com.br.sweetmusic.views;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.br.sweetmusic.R;
import com.br.sweetmusic.adapters.MusicaAdapter;
import com.br.sweetmusic.models.Musica;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoritosFragment extends Fragment {
    private RecyclerView favoritosRecycler;
    private MusicaAdapter adapter;
    private List<Musica> listaMusicas = new ArrayList<>();

    public FavoritosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favoritos, container, false);

        favoritosRecycler = view.findViewById(R.id.favoritos_recycler);
        adapter = new MusicaAdapter(retornarLista());
        favoritosRecycler.setAdapter(adapter);
        favoritosRecycler.setLayoutManager(new LinearLayoutManager(this.getContext()));

        return view;
    }

    private List<Musica> retornarLista() {
        listaMusicas.add(new Musica(true, "Scar Tissue", "Californication", "Red Hot Chili Peppers"));
        listaMusicas.add(new Musica(true, "Californication", "Californication", "Red Hot Chili Peppers"));
        listaMusicas.add(new Musica(true, "Otherside", "Californication", "Red Hot Chili Peppers"));
        listaMusicas.add(new Musica(true, "Parallel Universe", "Californication", "Red Hot Chili Peppers"));
        listaMusicas.add(new Musica(true, "Easily", "Californication", "Red Hot Chili Peppers"));
        listaMusicas.add(new Musica(true, "Savior", "Californication", "Red Hot Chili Peppers"));
        listaMusicas.add(new Musica(true, "Purple Stain", "Californication", "Red Hot Chili Peppers"));
        listaMusicas.add(new Musica(true, "Road Trippin'", "Californication", "Red Hot Chili Peppers"));
        listaMusicas.add(new Musica(true, "Scar Tissue", "Californication", "Red Hot Chili Peppers"));
        listaMusicas.add(new Musica(true, "Californication", "Californication", "Red Hot Chili Peppers"));
        listaMusicas.add(new Musica(true, "Otherside", "Californication", "Red Hot Chili Peppers"));

        return listaMusicas;
    }


}
