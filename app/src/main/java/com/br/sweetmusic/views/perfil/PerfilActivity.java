package com.br.sweetmusic.views.perfil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.br.sweetmusic.R;


public class PerfilActivity extends AppCompatActivity {
    private TextView txtNome;
    private TextView txtEmail;
    private TextView txtSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        initViews();

        txtEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PerfilActivity.this, EditarPerfil.class));
            }
        });

        txtSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PerfilActivity.this, AlterarSenha.class));
            }
        });

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
        }

    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    private void initViews() {
        txtNome = findViewById(R.id.txtNomeUsuario);
        txtEmail = findViewById(R.id.txtNomePerfil);
        txtSenha = findViewById(R.id.txtSenhaPerfil);
    }
}
