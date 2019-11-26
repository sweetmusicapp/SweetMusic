package com.br.sweetmusic.views.perfil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.br.sweetmusic.R;

import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EditarPerfil extends AppCompatActivity {
    private Button btnSalvarEdicao;
    private TextInputLayout inputNome;
    private TextInputLayout inputNovoEmail;

    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9#_~!$&'()*+,;=:.\"(),:;<>@\\[\\]\\\\]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*$";
    private Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    private Matcher matcher;
    private String email, nome;

    public static final String NOME_KEY = "nome";
    public static final String EMAIL_KEY = "emailNovo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_perfil);

        initViews();

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
        }

        btnSalvarEdicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validarNovoPerfil();
            }
        });

    }


    public boolean validarEmail(String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public void validarNovoPerfil() {
        email = inputNovoEmail.getEditText().getText().toString().trim();
        nome = inputNome.getEditText().getText().toString().trim();

        if (!validarEmail(email) && !validateNome(nome)) {
            inputNovoEmail.setError(getString(R.string.login_email_vazio));
            inputNome.setError(getString(R.string.cadastro_nome_vazio));
        } else if (!validateNome(nome)) {
            inputNome.setError(getString(R.string.cadastro_nome_vazio));
            inputNovoEmail.setErrorEnabled(false);
        } else if (!validarEmail(email)) {
            inputNovoEmail.setError(getString(R.string.cadastro_email_invalido));
            inputNome.setErrorEnabled(false);
        } else {
            inputNovoEmail.setErrorEnabled(false);
            inputNome.setErrorEnabled(false);

            startActivity(new Intent(EditarPerfil.this, PerfilActivity.class));
        }
    }


    public boolean validateNome(String nome) {
        return nome.length() > 3;
    }

    public void initViews() {
        btnSalvarEdicao = findViewById(R.id.button_salvarEdicao);
        inputNome = findViewById(R.id.textInputLayout_editar_nome);
        inputNovoEmail = findViewById(R.id.textInputLayout_editar_email);
    }

    @Override
    public boolean onSupportNavigateUp() {
        //finish();
        onBackPressed();
        return true;
    }
}