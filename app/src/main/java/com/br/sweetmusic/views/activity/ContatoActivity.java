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

        View contato = new AboutPage(this)
                .setImage(R.drawable.logosweet)
                .addGroup("Fale conosco")
                .create();

        setContentView(contato);
    }
}
