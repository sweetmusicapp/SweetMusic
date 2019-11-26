package com.br.sweetmusic.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.br.sweetmusic.R;

public class SobreActivity extends AppCompatActivity {
    private TextView txtAjuda;
    private TextView txtReportar;
    private TextView txtVersao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);

        initViews();

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
        }

        txtAjuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: Mudar a url para a página de ajuda
                String linkAjuda = getString(R.string.link_wiki);
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(linkAjuda));
                startActivity(intent);
            }
        });

        txtReportar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = getString(R.string.nosso_email);
                Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:" + email));
                intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.relato_problema));
                intent.putExtra(Intent.EXTRA_TEXT, "");
                startActivity(Intent.createChooser(intent, getString(R.string.enviar_email_via)));
            }
        });

        txtVersao.setText(R.string.sobre_versao);

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    public void initViews() {
        txtAjuda = findViewById(R.id.textView_sobre_ajuda);
        txtReportar = findViewById(R.id.textView_sobre_reportar);
        txtVersao = findViewById(R.id.textView_sobre_versao);
    }
}
