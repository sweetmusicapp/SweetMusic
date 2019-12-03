package com.br.sweetmusic.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.br.sweetmusic.R;
import com.br.sweetmusic.interfaces.AlbumOnClick;
import com.br.sweetmusic.pojos.Album;
import com.squareup.picasso.Picasso;

import java.util.List;

public class RecyclerViewAdapater extends RecyclerView.Adapter<RecyclerViewAdapater.ViewHolder> {

    private List<Album> albumList;
    private AlbumOnClick listener;

    public RecyclerViewAdapater(List<Album> albums, AlbumOnClick listener) {
        this.albumList = albums;
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
        final Album album = albumList.get(position);
        holder.bind(album);

        holder.itemView.setOnClickListener(v -> {
            listener.albumOnClick(album);
        });
    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }

    public void setUpdate(List<Album> albums) {
        if (this.albumList.isEmpty()) {
            this.albumList = albums;
        } else {
            this.albumList.addAll(albums);
        }
        notifyDataSetChanged();
    }

    public void clear() {
        this.albumList.clear();
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
