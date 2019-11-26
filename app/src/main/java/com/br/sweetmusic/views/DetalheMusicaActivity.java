package com.br.sweetmusic.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.br.sweetmusic.R;
import com.br.sweetmusic.model.Musica;

public class DetalheMusicaActivity extends AppCompatActivity {

    private static final String MUSICA_KEY = "musica";
    private ImageView imageViewArtista;
    private TextView textoNomeArtista;
    private TextView textoMusica;
    private TextView textoAlbum;
    private TextView textoLetraMusica;
    private TextView textoDescricaoMusica;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_musica);

        initViews();

        if (getIntent() != null && getIntent().getExtras() != null){

            Musica musica = getIntent().getExtras().getParcelable(MUSICA_KEY);

            //Drawable drawable = getResources().getDrawable(musica.getImagemArtista());
            //imageViewArtista.setImageDrawable(drawable);
            textoMusica.setText(musica.getNomeMusica());
            textoAlbum.setText(musica.getNomeAlbum());
            textoDescricaoMusica.setText(musica.getDetalheMusica());

        }

    }

    private void initViews() {

        //imageViewArtista = findViewById(R.id.imageViewArtista);
        textoMusica = findViewById(R.id.textViewMusica);
        textoNomeArtista = findViewById(R.id.textViewArtista);
        textoAlbum = findViewById(R.id.textViewAlbum);
        textoDescricaoMusica = findViewById(R.id.textViewDetalhe);

    }
}
