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
import com.br.sweetmusic.models.Musica;

import java.util.List;

public class MusicaAdapter extends RecyclerView.Adapter<MusicaAdapter.ViewHolder> {
    private List<Musica> listaMusicasFavoritas;

    public MusicaAdapter(List<Musica> listaMusicasFavoritas) {
        this.listaMusicasFavoritas = listaMusicasFavoritas;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_musica_favoritos, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Musica musica = listaMusicasFavoritas.get(position);
        holder.onBind(musica);

    }

    @Override
    public int getItemCount() {
        return listaMusicasFavoritas.size();
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

            imgPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //TODO: levar para o video flutuante
                }
            });

            final Drawable filled = itemView.getResources().getDrawable(R.drawable.ic_favorite);
            final Drawable outline = itemView.getResources().getDrawable(R.drawable.ic_favorite_border);

            imgFavorito.setChecked(true);
            imgFavorito.setBackgroundDrawable(filled);
            imgFavorito.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    if (isChecked) {
                        //TODO: permitir que remova da lista (musica.isFavorita())
                        imgFavorito.setBackgroundDrawable(filled);
                    } else {
                        imgFavorito.setBackgroundDrawable(outline);
                    }
                }
            });

            nomeMusica.setText(musica.getNome());
            nomeBanda.setText(musica.getArtista());
        }
    }
}
