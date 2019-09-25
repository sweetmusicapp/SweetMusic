package com.br.sweetmusic.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.br.sweetmusic.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegisterActivity extends AppCompatActivity {
    private TextInputLayout inputEmail;
    private TextInputLayout inputNome;
    private TextInputLayout inputSenha;
    private Button btnRegister;
    private ImageView btnGoogle;
    private ImageView btnFacebook;

    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9#_~!$&'()*+,;=:.\"(),:;<>@\\[\\]\\\\]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*$";
    private Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    private Matcher matcher;

    private String nome, email, senha;

    public static final String EMAIL_KEY = "email";
    public static final String SENHA_KEY = "senha";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initViews();

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = inputEmail.getEditText().getText().toString().trim();
                nome = inputNome.getEditText().getText().toString();
                senha = inputSenha.getEditText().getText().toString().trim();

                if (!validateEmail(email)) {
                    inputEmail.setError("Não é um e-mail válido");
                } else if (nome.isEmpty()) {
                    inputNome.setError("Insira um nome de usuário");
                } else if (!validatePassword(senha)) {
                    inputSenha.setError("Senha precisa ter no mínimo 6 caracteres");
                } else {
                    inputNome.setErrorEnabled(false);
                    inputEmail.setErrorEnabled(false);
                    inputSenha.setErrorEnabled(false);

                    sendBundleToLogin();
                }
            }
        });
    }

    public void initViews() {
        inputEmail = findViewById(R.id.textInputLayout_register_email);
        inputNome = findViewById(R.id.textInputLayout_register_nome);
        inputSenha = findViewById(R.id.textInputLayout_register_senha);
        btnRegister = findViewById(R.id.button_registrar);
        btnGoogle = findViewById(R.id.button_register_google);
        btnFacebook = findViewById(R.id.button_register_facebook);
    }

    public boolean validateEmail(String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validatePassword(String password) {
        return password.length() > 5;
    }

    public void sendBundleToLogin() {
        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);

        Bundle bundle = new Bundle();

        bundle.putString(EMAIL_KEY, email);
        bundle.putString(SENHA_KEY, senha);

        intent.putExtras(bundle);

        startActivity(intent);
    }
}
