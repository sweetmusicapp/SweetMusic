package com.br.sweetmusic.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.br.sweetmusic.R;
import com.br.sweetmusic.data.SweetDao;
import com.br.sweetmusic.interfaces.TrackOnClick;
import com.br.sweetmusic.pojos.Track;
import com.br.sweetmusic.viewmodel.TracksViewModel;

import java.util.List;

public class TracksRecyclerViewAdapter extends RecyclerView.Adapter<TracksRecyclerViewAdapter.ViewHolder> {

    private List<Track> trackList;
    private TrackOnClick listener;

    public TracksRecyclerViewAdapter(List<Track> trackList, TrackOnClick listener) {
        this.trackList = trackList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public TracksRecyclerViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_musica_favoritos, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TracksRecyclerViewAdapter.ViewHolder holder, int position) {
        Track track = this.trackList.get(position);
        holder.bind(track);
        holder.buttonFavorito.setOnClickListener(v -> listener.trackOnClick(track));
    }

    @Override
    public int getItemCount() {
        return trackList.size();
    }

    public void setUpdate(List<Track> tracks) {
        if (this.trackList.isEmpty()) {
            this.trackList = tracks;
        } else {
            this.trackList.addAll(tracks);
        }
        notifyDataSetChanged();
    }

    public void clear() {
        this.trackList.clear();
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewMusica;
        private TextView textViewBanda;
        private ImageButton buttonFavorito;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewMusica = itemView.findViewById(R.id.nomeDaMusica);
            textViewBanda = itemView.findViewById(R.id.nomeDaBanda);
            buttonFavorito = itemView.findViewById(R.id.favorito);
        }

        public void bind(Track track) {
            textViewMusica.setText(track.getStrTrack());
            textViewBanda.setText(track.getStrArtist());
        }
    }
}
