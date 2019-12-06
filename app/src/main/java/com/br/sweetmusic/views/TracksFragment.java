package com.br.sweetmusic.views;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.br.sweetmusic.R;
import com.br.sweetmusic.adapter.TracksRecyclerViewAdapter;
import com.br.sweetmusic.interfaces.TrackOnClick;
import com.br.sweetmusic.pojos.Album;
import com.br.sweetmusic.pojos.Track;
import com.br.sweetmusic.viewmodel.TracksViewModel;
import com.google.android.material.snackbar.Snackbar;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class TracksFragment extends Fragment implements TrackOnClick {

    private List<Track> trackList = new ArrayList<>();
    private TracksViewModel viewModel;
    private RecyclerView recyclerView;
    private TracksRecyclerViewAdapter adapter;
    private String albumId = "";
    private ImageView artistImageView;
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
            Picasso.get().load(album.getStrAlbumThumb()).into(artistImageView);
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
        artistImageView = view.findViewById(R.id.artistImageView);
        adapter = new TracksRecyclerViewAdapter(trackList, this);
        viewModel = ViewModelProviders.of(this).get(TracksViewModel.class);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void trackOnClick(Track track) {
       viewModel.insertTrack(track);
        Toast.makeText(getContext(), "Música adicionada com sucesso", Toast.LENGTH_SHORT).show();
    }
}