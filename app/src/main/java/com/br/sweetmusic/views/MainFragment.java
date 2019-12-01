package com.br.sweetmusic.views;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.br.sweetmusic.R;
import com.br.sweetmusic.adapter.RecyclerViewAdapater;
import com.br.sweetmusic.pojos.Album;
import com.br.sweetmusic.viewmodel.MainViewModel;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;


public class MainFragment extends Fragment {

    private MainViewModel viewModel;
    private RecyclerViewAdapater adapater;
    private List<Album> albumList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ImageView imgProfile;
    private TextView nameProfile;
    private Button btnLogout;
    private String artista = "metallica";

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
                adapater.setUpdate(albums);
            } else {
                Snackbar.make(imgProfile, "Artista ou albuns não encontrados", Snackbar.LENGTH_LONG);
                adapater.setUpdate(this.albumList);
            }
        });

        return view;
    }


    private void initViews(View view) {
        recyclerView = view.findViewById(R.id.recyclerViewMusicas);
        adapater = new RecyclerViewAdapater(albumList);
        viewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        recyclerView.setAdapter(adapater);
        imgProfile = view.findViewById(R.id.imageView_gridItem_artista);
        nameProfile = view.findViewById(R.id.textView_gridItem_artista);
    }

}
