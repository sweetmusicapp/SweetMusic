package com.br.sweetmusic.views;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.br.sweetmusic.R;
import com.br.sweetmusic.adapter.FavoritosRecyclerViewAdapter;
import com.br.sweetmusic.interfaces.TrackOnClick;
import com.br.sweetmusic.pojos.Track;
import com.br.sweetmusic.viewmodel.FavoritosViewModel;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class FavoritosFragment extends Fragment implements TrackOnClick {

    private RecyclerView recyclerView;
    private FavoritosRecyclerViewAdapter adapter;
    private List<Track> trackList = new ArrayList<>();
    private FavoritosViewModel viewModel;

    public FavoritosFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tracks, container, false);

        initViews(view);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        viewModel.getFavoritos();

        viewModel.retornaTracks().observe(this, tracks -> {
            adapter.setUpdate(tracks);
        });
        return view;
    }

    public void initViews(View view) {
        recyclerView = view.findViewById(R.id.recyclerViewTracks);
        adapter = new FavoritosRecyclerViewAdapter(trackList, this);
        viewModel = ViewModelProviders.of(this).get(FavoritosViewModel.class);
    }

    @Override
    public void trackOnClick(Track track) {
        viewModel.deleteTrack(track);
        adapter.clear();
        Toast.makeText(getContext(), "Música removida com sucesso", Toast.LENGTH_SHORT).show();

    }
}
