package com.br.sweetmusic.views;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.br.sweetmusic.R;
import com.br.sweetmusic.adapter.RecyclerViewAdapater;
import com.br.sweetmusic.data.SweetDao;
import com.br.sweetmusic.interfaces.AlbumOnClick;
import com.br.sweetmusic.pojos.Album;
import com.br.sweetmusic.viewmodel.MainViewModel;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;


public class MainFragment extends Fragment implements AlbumOnClick {

    private MainViewModel viewModel;
    private RecyclerViewAdapater adapter;
    private List<Album> albumList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ImageView imgProfile;
    private TextView nameProfile;
    private String artista = "metallica";
    private AlbumOnClick listener;
    private ImageButton buttonFavorito;
    private SweetDao dao;
    public static final String ALBUMS_KEY = "album";

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_inicio, container, false);
        initViews(view);


        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));

        viewModel.getAlbuns(artista);

        viewModel.getAlbunsLiveData().observe(this, albums -> {
            if (albums != null && !albums.isEmpty()) {
                adapter.setUpdate(albums);
            } else {
                Snackbar.make(imgProfile, "Artista ou albuns não encontrados", Snackbar.LENGTH_LONG);
                adapter.setUpdate(this.albumList);
            }
        });


//        buttonFavorito.setOnClickListener(v -> {
//            if (albumList == null || albumList.isEmpty()) {
//                Snackbar.make(buttonFavorito,
//                        "Por favor, selecione primeiro um artista", Snackbar.LENGTH_SHORT);
//            } else {
//                if (dao.getArtistByName(artista) != null) {
//                    dao.getArtistByName(artista).setFavorito(0);
//                    Toast.makeText(getContext(), "Você retirou "
//                            + dao.getArtistByName(artista).getStrArtist()
//                            + " dos seus favoritos!", Toast.LENGTH_SHORT).show();
//                } else {
//                    String artistId = albumList.get(0).getIdArtist();
//
//                    viewModel.getArtists(artistId);
//
//                    viewModel.getArtistLiveData().observe(this, artist -> {
//                        if (artist != null) {
//                            dao.insertArtista(artist);
//                            dao.getArtistByName(artista).setFavorito(1);
//                            Toast.makeText(getContext(), "Você adicionou "
//                                    + dao.getArtistByName(artista).getStrArtist()
//                                    + " aos seus favoritos!", Toast.LENGTH_SHORT).show();
//                        } else {
//                            Snackbar.make(buttonFavorito,
//                                    "Houve um erro ao adicionar o favorito", Snackbar.LENGTH_SHORT);
//                        }
//                    });
//                }
//            }
//        });

        return view;
    }


    private void initViews(View view) {
        recyclerView = view.findViewById(R.id.recyclerViewMusicas);
        adapter = new RecyclerViewAdapater(albumList, this);
        viewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        recyclerView.setAdapter(adapter);
        imgProfile = view.findViewById(R.id.imageView_gridItem_artista);
        nameProfile = view.findViewById(R.id.textView_gridItem_artista);
        buttonFavorito = view.findViewById(R.id.buttonFavorito);
    }


    @Override
    public void albumOnClick(Album album) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(ALBUMS_KEY, album);

        Fragment detalheFragment = new TracksFragment();
        detalheFragment.setArguments(bundle);
        replaceFragment(detalheFragment);
    }

    public void replaceFragment(Fragment fragment) {
        FragmentManager manager = getFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.commit();
    }
}
