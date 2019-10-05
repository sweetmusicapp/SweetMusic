package com.br.sweetmusic.adapter;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.br.sweetmusic.R;
import com.br.sweetmusic.interfaces.RecyclerViewOnClick;
import com.br.sweetmusic.models.Musica;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterListaMusicas extends RecyclerView.Adapter<AdapterListaMusicas.ViewHolder> {

    private List<Musica> musicaList;
    private RecyclerViewOnClick listener;

    public AdapterListaMusicas(List<Musica> musicas, RecyclerViewOnClick listener){
        this.musicaList = musicas;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_item_recyclerview, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final Musica musica = musicaList.get(i);
        viewHolder.bind(musica);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
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

        public ViewHolder(@NonNull View itemView){
            super (itemView);
            textoMusica = itemView.findViewById(R.id.text_card_name);
            textoArtista = itemView.findViewById(R.id.text_artista_card);
            imageViewArtista = itemView.findViewById(R.id.img_card);

        }

        public void bind(Musica musica){

            //Log.i("Erro do drawable",String.format(musica.getImagemArtista()));
            Drawable drawable = itemView.getResources().getDrawable(musica.getImagemArtista());

            textoMusica.setText(musica.getNomeMusica());
            textoArtista.setText(musica.getNomeArtista());
            //imageViewArtista.setImageDrawable(drawable);

        }

    }
}
