package com.br.sweetmusic.views;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.br.sweetmusic.R;
import com.br.sweetmusic.adapters.MusicasAdapter;
import com.br.sweetmusic.models.Artista;
import com.br.sweetmusic.models.Musica;
import com.google.android.material.appbar.CollapsingToolbarLayout;

import java.util.ArrayList;
import java.util.List;

import static com.br.sweetmusic.views.FavoritosFragment.MUSICA_KEY;

public class DetalheActivity extends AppCompatActivity {
    private CollapsingToolbarLayout toolbarLayout;
    private ImageView imagemBanda;
    private RecyclerView recyclerMusicas;
    private MusicasAdapter adapter;
    private Artista artista;
    private List<Musica> listaMusicas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initViews();

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        if (getIntent() != null && getIntent().getExtras() != null) {
            Musica musica = getIntent().getExtras().getParcelable(MUSICA_KEY);

            if (musica != null) {
                Drawable drawable = getResources().getDrawable(musica.getImagemArtista());

                toolbarLayout.setTitle(musica.getNomeArtista());
                imagemBanda.setImageDrawable(drawable);

                listaMusicas = musicasArtista(musicasDaBanda(), musica.getIdArtista()).getListaMusica();

            }
        }

        adapter = new MusicasAdapter(listaMusicas);
        recyclerMusicas.setAdapter(adapter);
        ViewCompat.setNestedScrollingEnabled(recyclerMusicas, false);
        recyclerMusicas.setLayoutManager(new LinearLayoutManager(this));
    }

    private static Artista musicasArtista(List<Musica> musicas, long idArtista) {
        List<Musica> musicasArtista = new ArrayList<>();
        for (Musica musica : musicas) {
            if (!musicas.isEmpty() && musicas.get(0).getIdArtista() == idArtista) {
                musicasArtista.add(musica);
            }
        }

        Artista artista = new Artista(musicasArtista);
        return artista;
    }


    public void initViews() {
        toolbarLayout = findViewById(R.id.toolbar_layout);
        imagemBanda = findViewById(R.id.imageView_detalhe_banda);
        recyclerMusicas = findViewById(R.id.recycler_detalhe_musicas);

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    public List<Musica> musicasDaBanda() {
        listaMusicas.add(new Musica(true, "Scar Tissue", "Californication", "Red Hot Chili Peppers"));
        listaMusicas.add(new Musica(false, "Californication", "Californication", "Red Hot Chili Peppers"));
        listaMusicas.add(new Musica(true, "Otherside", "Californication", "Red Hot Chili Peppers"));
        listaMusicas.add(new Musica(false, "Parallel Universe", "Californication", "Red Hot Chili Peppers"));
        listaMusicas.add(new Musica(true, "Easily", "Californication", "Red Hot Chili Peppers"));
        listaMusicas.add(new Musica(false, "Savior", "Californication", "Red Hot Chili Peppers"));
        listaMusicas.add(new Musica(true, "Purple Stain", "Californication", "Red Hot Chili Peppers"));
        listaMusicas.add(new Musica(false, "Road Trippin'", "Californication", "Red Hot Chili Peppers"));
        listaMusicas.add(new Musica(true, "Scar Tissue", "Californication", "Red Hot Chili Peppers"));
        listaMusicas.add(new Musica(false, "Californication", "Californication", "Red Hot Chili Peppers"));
        listaMusicas.add(new Musica(true, "Otherside", "Californication", "Red Hot Chili Peppers"));

        return listaMusicas;
    }

}
