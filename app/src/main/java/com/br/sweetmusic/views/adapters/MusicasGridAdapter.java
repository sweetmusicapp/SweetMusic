package com.br.sweetmusic.views.adapters;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.br.sweetmusic.R;
import com.br.sweetmusic.views.interfaces.RecyclerViewOnClick;
import com.br.sweetmusic.models.Musica;

import java.util.List;

public class MusicasGridAdapter extends RecyclerView.Adapter<MusicasGridAdapter.ViewHolder> {
    private List<Musica> musicaList;
    private RecyclerViewOnClick listener;

    public MusicasGridAdapter(List<Musica> musicaList, RecyclerViewOnClick listener) {
        this.musicaList = musicaList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_recyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Musica musica = musicaList.get(position);
        holder.onBind(musica);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(musica);
            }
        });
    }

    @Override
    public int getItemCount() {
        return musicaList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textoMusica;
        TextView textoArtista;
        ImageView imageViewArtista;
        TextView textoAlbum;
        TextView textoDescricaoMusica;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textoMusica = itemView.findViewById(R.id.textView_gridItem_artista);
            textoArtista = itemView.findViewById(R.id.textView_gridItem_musica);
            imageViewArtista = itemView.findViewById(R.id.imageView_gridItem_artista);
        }

        public void onBind(Musica musica) {
            //Log.i("Erro do drawable",String.format(musica.getImagemArtista()));
            Drawable drawable = itemView.getResources().getDrawable(musica.getImagemArtista());

            textoMusica.setText(musica.getNomeMusica());
            textoArtista.setText(musica.getNomeArtista());
            imageViewArtista.setImageDrawable(drawable);
        }
    }
}
