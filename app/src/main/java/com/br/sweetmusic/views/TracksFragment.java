package com.br.sweetmusic.views;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.br.sweetmusic.R;
import com.br.sweetmusic.adapter.TracksRecyclerViewAdapter;
import com.br.sweetmusic.pojos.Album;
import com.br.sweetmusic.pojos.Track;
import com.br.sweetmusic.viewmodel.TracksViewModel;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class TracksFragment extends Fragment {

    private List<Track> trackList = new ArrayList<>();
    private TracksViewModel viewModel;
    private RecyclerView recyclerView;
    private TracksRecyclerViewAdapter adapter;
    private String albumId = "";
    private ImageButton buttonFavorito;
    public static final String ALBUMS_KEY = "album";

    public TracksFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tracks, container, false);

        initViews(view);

        if (getArguments() != null) {

            final Album album = getArguments().getParcelable(ALBUMS_KEY);
            albumId = album.getIdAlbum();

        }

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        viewModel.getTracks(albumId);

        viewModel.getTracksMutableLiveData().observe(this, tracks -> {
            if (tracks != null && !tracks.isEmpty()) {
                adapter.setUpdate(tracks);
            } else {
                Snackbar.make(recyclerView, "Houve um erro no carregamento dos dados",
                        Snackbar.LENGTH_LONG);
                adapter.setUpdate(this.trackList);
            }
        });

        return view;
    }

    private void initViews(View view) {
        buttonFavorito = view.findViewById(R.id.favorito);
        recyclerView = view.findViewById(R.id.recyclerViewTracks);
        adapter = new TracksRecyclerViewAdapter(trackList);
        viewModel = ViewModelProviders.of(this).get(TracksViewModel.class);
        recyclerView.setAdapter(adapter);
    }

}
