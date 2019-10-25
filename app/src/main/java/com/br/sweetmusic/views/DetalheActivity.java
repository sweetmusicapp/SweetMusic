package com.br.sweetmusic.views;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.br.sweetmusic.R;
import com.br.sweetmusic.adapters.MusicasAdapter;
import com.br.sweetmusic.interfaces.RecyclerOnPlay;
import com.br.sweetmusic.models.Artista;
import com.br.sweetmusic.models.Musica;
import com.br.sweetmusic.utils.ExpandCollapse;
import com.br.sweetmusic.views.video.VideoActivity;
import com.google.android.material.appbar.CollapsingToolbarLayout;

import java.util.ArrayList;
import java.util.List;

import static com.br.sweetmusic.views.InicioFragment.LISTA_MUSICAS;
import static com.br.sweetmusic.views.InicioFragment.MUSICA_KEY;

public class DetalheActivity extends AppCompatActivity implements RecyclerOnPlay {
    private CollapsingToolbarLayout toolbarLayout;
    private ImageView imagemBanda;
    private RecyclerView recyclerMusicas;
    private MusicasAdapter adapter;
    private List<Musica> listaMusicas = new ArrayList<>();

    private ToggleButton arrowsToggle;
    private LinearLayout detalheContainer;
    private TextView descricaoArtista;

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
            List<Musica> musicas = getIntent().getExtras().getParcelableArrayList(LISTA_MUSICAS);

            if (musica != null) {
                Drawable drawable = getResources().getDrawable(musica.getImagemArtista());

                toolbarLayout.setTitle(musica.getNomeArtista());
                imagemBanda.setImageDrawable(drawable);
                descricaoArtista.setText(musica.getDetalheMusica());

                listaMusicas = musicasArtista(musicas, musica.getIdArtista()).getListaMusica();

            }
        }

        final Drawable arrowDown = getResources().getDrawable(R.drawable.ic_arrow_down);
        final Drawable arrowUp = getResources().getDrawable(R.drawable.ic_arrow_up);

        arrowsToggle.setChecked(false);
        arrowsToggle.setBackgroundDrawable(arrowDown);
        ExpandCollapse.collapse(detalheContainer);

        toolbarLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrowsToggle.isChecked()) {
                    ExpandCollapse.expand(detalheContainer);
                    arrowsToggle.setBackgroundDrawable(arrowUp);
                    arrowsToggle.setChecked(false);
                } else {
                    ExpandCollapse.collapse(detalheContainer);
                    arrowsToggle.setBackgroundDrawable(arrowDown);
                    arrowsToggle.setChecked(true);
                }
            }
        });

        arrowsToggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if (isChecked) {
                    ExpandCollapse.expand(detalheContainer);
                    arrowsToggle.setBackgroundDrawable(arrowUp);
                } else {
                    ExpandCollapse.collapse(detalheContainer);
                    arrowsToggle.setBackgroundDrawable(arrowDown);
                }
            }
        });

        adapter = new MusicasAdapter(listaMusicas, this);
        recyclerMusicas.setAdapter(adapter);
        ViewCompat.setNestedScrollingEnabled(recyclerMusicas, false);
        recyclerMusicas.setLayoutManager(new LinearLayoutManager(this));
    }

    private static Artista musicasArtista(List<Musica> musicas, long idArtista) {
        List<Musica> musicasArtista = new ArrayList<>();
        for (Musica musica : musicas) {
            if (!musicas.isEmpty() && musica.getIdArtista() == idArtista) {
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
        arrowsToggle = findViewById(R.id.arrows);
        detalheContainer = findViewById(R.id.detalhes_container);
        descricaoArtista = findViewById(R.id.texto_detalhes);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    public void onPlay(Musica musica) {
        Intent intent = new Intent(DetalheActivity.this, VideoActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(MUSICA_KEY, musica);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
