package com.br.sweetmusic.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.br.sweetmusic.R;
import com.br.sweetmusic.interfaces.TrackOnClick;
import com.br.sweetmusic.pojos.Track;

import java.util.ArrayList;
import java.util.List;

public class FavoritosRecyclerViewAdapter extends RecyclerView.Adapter<FavoritosRecyclerViewAdapter.ViewHolder> {

    private List<Track> favoriteTrackList;
    private TrackOnClick listener;

    public FavoritosRecyclerViewAdapter(List<Track> favoriteTrackList, TrackOnClick listener) {
        this.favoriteTrackList = favoriteTrackList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_musica_favoritos, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Track track = this.favoriteTrackList.get(position);
        holder.bind(track);
        holder.buttonFavorito.setOnClickListener(v -> listener.trackOnClick(track));
    }

    @Override
    public int getItemCount() {
        return favoriteTrackList.size();
    }

    public void setUpdate(List<Track> tracks) {
        if (this.favoriteTrackList.isEmpty()) {
            this.favoriteTrackList = tracks;
        } else {
            this.favoriteTrackList.addAll(tracks);
        }
        notifyDataSetChanged();
    }

    public void clear() {
        this.favoriteTrackList.clear();
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewMusica;
        private TextView textViewBanda;
        private ImageView buttonFavorito;

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