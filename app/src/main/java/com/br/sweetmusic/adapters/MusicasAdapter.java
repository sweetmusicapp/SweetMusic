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

public class MusicasAdapter extends RecyclerView.Adapter<MusicasAdapter.ViewHolder> {
    private List<Musica> listaMusicas;

    public MusicasAdapter(List<Musica> listaMusicas) {
        this.listaMusicas = listaMusicas;
    }

    @NonNull
    @Override
    public MusicasAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_musica_favoritos, parent, false);
        return new MusicasAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicasAdapter.ViewHolder holder, int position) {
        Musica musica = listaMusicas.get(position);
        holder.onBind(musica);
    }

    @Override
    public int getItemCount() {
        return listaMusicas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgPlay;
        private TextView nomeMusica;
        private TextView nomeArtista;
        private ToggleButton imgFavorito;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPlay = itemView.findViewById(R.id.playMusic);
            nomeMusica = itemView.findViewById(R.id.nomeDaMusica);
            nomeArtista = itemView.findViewById(R.id.nomeDaBanda);
            imgFavorito = itemView.findViewById(R.id.favorito);
        }

        public void onBind(final Musica musica) {

            nomeMusica.setText(musica.getNomeMusica());
            nomeArtista.setText(musica.getNomeArtista());

            imgPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //TODO: levar para o video flutuante
                }
            });

            final Drawable filled = itemView.getResources().getDrawable(R.drawable.ic_favorite);
            final Drawable outline = itemView.getResources().getDrawable(R.drawable.ic_favorite_border);

            if(musica.isFavorita()){
                imgFavorito.setBackgroundDrawable(filled);
            } else{
                imgFavorito.setBackgroundDrawable(outline);
            }

            imgFavorito.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                    if (isChecked) {
                        imgFavorito.setBackgroundDrawable(filled);
                        musica.setFavorita(true);
                    } else {
                        imgFavorito.setBackgroundDrawable(outline);
                        musica.setFavorita(false);
                    }
                }
            });
        }
    }
}
