package com.br.sweetmusic.adapters;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.br.sweetmusic.R;
import com.br.sweetmusic.interfaces.RecyclerOnPlay;
import com.br.sweetmusic.interfaces.RecyclerViewOnClick;
import com.br.sweetmusic.models.Musica;

import java.util.List;

public class FavoritosAdapter extends RecyclerView.Adapter<FavoritosAdapter.ViewHolder> {
    private List<Musica> listaMusicasFavoritas;
    private RecyclerViewOnClick listener;
    private RecyclerOnPlay listenerPlay;

    public FavoritosAdapter(List<Musica> listaMusicasFavoritas, RecyclerViewOnClick listener, RecyclerOnPlay listenerPlay) {
        this.listaMusicasFavoritas = listaMusicasFavoritas;
        this.listener = listener;
        this.listenerPlay = listenerPlay;
    }

    @NonNull
    @Override
    public FavoritosAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_musica_favoritos, parent, false);
        return new FavoritosAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        final Musica musica = listaMusicasFavoritas.get(position);
        if (musica.isFavorita()) {
            holder.onBind(musica);

            //Remove favoritas da lista
            holder.imgFavorito.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    removerItem(position);
                    musica.setFavorita(false);
                }
            });

        }
    }

    @Override
    public int getItemCount() {
        return listaMusicasFavoritas.size();
    }

    private void removerItem(int position) {
        listaMusicasFavoritas.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, listaMusicasFavoritas.size());
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgPlay;
        private TextView nomeMusica;
        private TextView nomeBanda;
        private ToggleButton imgFavorito;

        public ViewHolder(View view) {
            super(view);

            imgPlay = view.findViewById(R.id.playMusic);
            nomeMusica = view.findViewById(R.id.nomeDaMusica);
            nomeBanda = view.findViewById(R.id.nomeDaBanda);
            imgFavorito = view.findViewById(R.id.favorito);
        }

        public void onBind(final Musica musica) {

            final Drawable filled = itemView.getResources().getDrawable(R.drawable.ic_favorite);

            if (!musica.getVideoId().isEmpty()) {
                imgPlay.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        listenerPlay.onPlay(musica);
                    }
                });
            } else {
                imgPlay.setVisibility(View.GONE);
            }

            if (musica.isFavorita()) {
                imgFavorito.setBackgroundDrawable(filled);
                imgFavorito.setChecked(true);
            }

            nomeMusica.setText(musica.getNomeMusica());
            nomeBanda.setText(musica.getNomeArtista());


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(musica);
                }
            });
        }
    }
}
