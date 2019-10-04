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
    private ImageView btnEditarEmail;
    private ImageView btnAlterarSenha;
    private ImageView btnEditarnome;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        initViews();


        btnEditarEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PerfilActivity.this, EditarPerfil.class));
            }});

        btnAlterarSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PerfilActivity.this, AlterarSenha.class));
            }});

        btnEditarnome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PerfilActivity.this, EditarPerfil.class));
            }});



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
        btnEditarEmail = findViewById(R.id.img_editar_email);
        btnAlterarSenha = findViewById(R.id.img_editar_senha);
        btnEditarnome = findViewById(R.id.img_editar_nome);
    }
}
