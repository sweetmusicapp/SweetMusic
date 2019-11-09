package com.br.sweetmusic.views.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.br.sweetmusic.R;

import mehdi.sakout.aboutpage.AboutPage;

public class ContatoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);

        String descricao = " Entre em contato com a equipe de suporte do Sweet Músic";

        View contato = new AboutPage(this)
                .setImage(R.drawable.logosweet)
                .setDescription(descricao)
                .addGroup("Fale conosco")
                .addEmail("sweetmusic@gmail.com", "Envie um e-mail")
                .addWebsite("http://google.com.br", "Acesse nosso site")
                .addGroup("Redes Sociais")
                .addFacebook("google", "Faceboock")
                .addTwitter("google", "Twitter")
                .addYoutube("goggle", "Yotube")
                .addInstagram("gogle", "Instagram")
                .create();

        setContentView(contato);
    }
}
