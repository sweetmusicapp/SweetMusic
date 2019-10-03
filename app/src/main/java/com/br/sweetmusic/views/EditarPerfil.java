package com.br.sweetmusic.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.br.sweetmusic.R;

import com.br.sweetmusic.views.login.LoginActivity;
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

        btnSalvarEdicao = findViewById(R.id.button_salvarEdicao);
        inputNome = findViewById(R.id.textInputLayout_editar_nome);
        inputNovoEmail = findViewById(R.id.textInputLayout_editar_email);


        btnSalvarEdicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nome = inputNome.getEditText().getText().toString();
                String email = inputNovoEmail.getEditText().getText().toString();

                if (!nome.isEmpty() && !email.isEmpty()) {
                    Intent intent = new Intent(EditarPerfil.this, PerfilActivity.class);
                    Bundle bundle = new Bundle();
                    bundle.putString(NOME_KEY, nome);
                    bundle.putString(EMAIL_KEY, email);
                    intent.putExtras(bundle);
                    startActivity(intent);

                } else {
                    inputNome.setError("Preencha o campo nome!");
                    inputNovoEmail.setError("Preencha o campo Email!");
                }


                validarCampos();

                }



            public boolean validarEmail(String email) {
                matcher = pattern.matcher(email);
                return matcher.matches();
            }

            public void validarCampos() {
                email = inputNovoEmail.getEditText().getText().toString().trim();
                nome = inputNome.getEditText().getText().toString().trim();

                if (!validarEmail(email) && !validateNome(nome)) {
                    inputNovoEmail.setError("Digite um e-mail ");
                    inputNome.setError("Digite um Nome ");
                } else if (!validateNome(nome)) {
                    inputNome.setError("Digite um Nome ");
                    inputNovoEmail.setErrorEnabled(false);
                } else if (!validarEmail(email)) {
                    inputNovoEmail.setError("Digite um e-mail válido");
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




            });















        }
    }
