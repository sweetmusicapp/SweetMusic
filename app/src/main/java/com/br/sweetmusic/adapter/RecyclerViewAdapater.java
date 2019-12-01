package com.br.sweetmusic.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.br.sweetmusic.R;
import com.br.sweetmusic.pojos.Album;
import com.br.sweetmusic.pojos.Track;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerViewAdapater extends RecyclerView.Adapter<RecyclerViewAdapater.ViewHolder> {

    private List<Album> albums;

    public RecyclerViewAdapater(List<Album> albums) {
        this.albums = albums;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_item_recyclerview, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Album album = this.albums.get(position);
        holder.bind(album);
    }

    @Override
    public int getItemCount() {
        return albums.size();
    }

    public void setUpdate(List<Album> albums) {
        if (this.albums.isEmpty()) {
            this.albums = albums;
        } else {
            this.albums.addAll(albums);
        }
        notifyDataSetChanged();
    }

    public void clear() {
        this.albums.clear();
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView titulo;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imageView_gridItem_artista);
            titulo = itemView.findViewById(R.id.textView_gridItem_artista);
        }

        public void bind(Album album) {
            titulo.setText(album.getStrAlbum());

            Picasso.get().load(album.getStrAlbumThumb()).into(img);

        }
    }
}
