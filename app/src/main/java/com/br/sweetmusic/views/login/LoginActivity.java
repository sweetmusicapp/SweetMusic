package com.br.sweetmusic.views.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.br.sweetmusic.views.HomeActivity;
import com.br.sweetmusic.views.MainActivity;
import com.br.sweetmusic.R;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {

    private TextInputLayout inputEmail;
    private TextInputLayout inputSenha;
    private TextView textEsqueciSenha;
    private Button btnLogin;
    private ImageView btnFacebook;
    private ImageView btnGoogle;
    private TextView txtRegistrese;

    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9#_~!$&'()*+,;=:.\"(),:;<>@\\[\\]\\\\]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*$";
    private Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    private Matcher matcher;

    private String email, senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initViews();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validarCampos();
            }
        });

        //TODO: Mudar lógica para integrar com o Facebook e Google
        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validarCampos();
            }
        });
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validarCampos();
            }
        });

        textEsqueciSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                esqueciSenha();
            }
        });

        txtRegistrese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
    }

    public void initViews() {
        inputEmail = findViewById(R.id.textInputLayout_login_email);
        inputSenha = findViewById(R.id.textInputLayout_login_senha);
        textEsqueciSenha = findViewById(R.id.esqueci_a_senha);
        btnLogin = findViewById(R.id.button_login);
        btnFacebook = findViewById(R.id.button_login_facebook);
        btnGoogle = findViewById(R.id.button_login_google);
        txtRegistrese = findViewById(R.id.text_login_registrar);
    }

    public void validarCampos() {
        email = inputEmail.getEditText().getText().toString().trim();
        senha = inputSenha.getEditText().getText().toString().trim();

        if (!validarEmail(email) && !validateSenha(senha)) {
            inputEmail.setError("Digite um e-mail ");
            inputSenha.setError("Sua senha deve ter mais de 6 caracteres!");
        } else if (!validateSenha(senha)) {
            inputSenha.setError("Sua senha deve ter mais de 6 caracteres!");
            inputEmail.setErrorEnabled(false);
        } else if (!validarEmail(email)) {
            inputEmail.setError("Digite um e-mail válido");
            inputSenha.setErrorEnabled(false);
        } else {
            inputEmail.setErrorEnabled(false);
            inputSenha.setErrorEnabled(false);

            //TODO: Mudar destino em sprints futuras
            startActivity(new Intent(LoginActivity.this, HomeActivity.class));
        }
    }

    public boolean validarEmail(String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public boolean validateSenha(String senha) {
        return senha.length() > 5;
    }

    public void esqueciSenha() {
        startActivity(new Intent(LoginActivity.this, ForgotActivity.class));
    }
}
