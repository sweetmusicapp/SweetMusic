package com.br.sweetmusic.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.br.sweetmusic.R;
import com.google.android.material.snackbar.Snackbar;

import static com.br.sweetmusic.views.EditarPerfil.EMAIL_KEY;
import static com.br.sweetmusic.views.EditarPerfil.NOME_KEY;

public class PerfilActivity extends AppCompatActivity {
    private TextView txtNome;
    private TextView txtEmail;
    private TextView txtSenha;
    private Button btnEditarPerdil;
    private Button btnAlterarSenha;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        txtNome = findViewById(R.id.txtNomeUsuario);
        txtEmail = findViewById(R.id.txtNomePerfil);
        txtSenha = findViewById(R.id.txtSenhaPerfil);

        Intent intent = getIntent();


        if (getIntent() != null && intent.getExtras() != null) {


            Bundle bundle = intent.getExtras();

            String nome = bundle.getString(NOME_KEY);
            String telefone = bundle.getString(EMAIL_KEY);
            txtNome.setText(nome);
            txtEmail.setText(telefone);
        } else {
            Snackbar.make(txtEmail, "Não a dados!", Snackbar.LENGTH_LONG).show();
        }


        btnEditarPerdil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PerfilActivity.this, EditarPerfil.class));
            }});

        btnAlterarSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PerfilActivity.this, AlterarSenha.class));
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

}
