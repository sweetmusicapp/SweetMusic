package com.br.sweetmusic.views.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.br.sweetmusic.R;
import com.br.sweetmusic.views.adapters.FavoritosAdapter;
import com.br.sweetmusic.views.interfaces.RecyclerOnPlay;
import com.br.sweetmusic.views.interfaces.RecyclerViewOnClick;
import com.br.sweetmusic.models.Musica;
import com.br.sweetmusic.views.DetalheActivity;
import com.br.sweetmusic.views.video.VideoActivity;

import java.util.ArrayList;
import java.util.List;

import static com.br.sweetmusic.views.Fragments.InicioFragment.MUSICA_KEY;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoritosFragment extends Fragment implements RecyclerViewOnClick, RecyclerOnPlay {
    private RecyclerView favoritosRecycler;
    private FavoritosAdapter adapter;
    private List<Musica> listaMusicas = new ArrayList<>();

    public FavoritosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favoritos, container, false);

        //Muda título da ActionBar
      //  ((HomeActivity) getActivity()).setActionBarTitle("Favoritos");

        favoritosRecycler = view.findViewById(R.id.favoritos_recycler);
        adapter = new FavoritosAdapter(musicasFavoritas(retornarLista()), this, this);
        favoritosRecycler.setAdapter(adapter);
        favoritosRecycler.setLayoutManager(new LinearLayoutManager(this.getContext()));

        return view;
    }

    private List<Musica> retornarLista() {
        listaMusicas.add(new Musica(true, "Otherside", "Californication", "Red Hot Chili Peppers", 2,
                R.drawable.rhcp,
                getString(R.string.detalhe_rhcp),
                "rn_YodiJO6k"));
        listaMusicas.add(new Musica(true, "Scar Tissue", "Californication", "Red Hot Chili Peppers", 2,
                R.drawable.rhcp,
                getString(R.string.detalhe_rhcp),
                "mzJj5-lubeM"));
        listaMusicas.add(new Musica(false, "Around the World", "Californication", "Red Hot Chili Peppers", 2,
                R.drawable.rhcp,
                getString(R.string.detalhe_rhcp),
                "a9eNQZbjpJk"));
        listaMusicas.add(new Musica(true, "Otherside", "Californication", "Red Hot Chili Peppers", 2,
                R.drawable.rhcp,
                getString(R.string.detalhe_rhcp),
                "rn_YodiJO6k"));
        listaMusicas.add(new Musica(false, "Scar Tissue", "Californication", "Red Hot Chili Peppers", 2,
                R.drawable.rhcp,
                getString(R.string.detalhe_rhcp),
                "mzJj5-lubeM"));
        listaMusicas.add(new Musica(true, "Around the World", "Californication", "Red Hot Chili Peppers", 2,
                R.drawable.rhcp,
                getString(R.string.detalhe_rhcp),
                "a9eNQZbjpJk"));
        listaMusicas.add(new Musica(true, "Otherside", "Californication", "Red Hot Chili Peppers", 2,
                R.drawable.rhcp,
                getString(R.string.detalhe_rhcp),
                "rn_YodiJO6k"));
        listaMusicas.add(new Musica(true, "Scar Tissue", "Californication", "Red Hot Chili Peppers", 2,
                R.drawable.rhcp,
                getString(R.string.detalhe_rhcp),
                "mzJj5-lubeM"));
        listaMusicas.add(new Musica(true, "Around the World", "Californication", "Red Hot Chili Peppers", 2,
                R.drawable.rhcp,
                getString(R.string.detalhe_rhcp),
                "a9eNQZbjpJk"));

        return listaMusicas;
    }

    private static List<Musica> musicasFavoritas(List<Musica> musicas) {
        List<Musica> favoritas = new ArrayList<>();
        for (Musica musica : musicas) {
            if (musica.isFavorita()) {
                favoritas.add(musica);
            }
        }

        return favoritas;
    }


    @Override
    public void onClick(Musica musica) {
        Intent intent = new Intent(this.getContext(), DetalheActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(MUSICA_KEY, musica);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    @Override
    public void onPlay(Musica musica) {
        Intent intent = new Intent(this.getContext(), VideoActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(MUSICA_KEY, musica);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
