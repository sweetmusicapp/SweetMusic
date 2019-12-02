package com.br.sweetmusic.views.login;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.br.sweetmusic.utils.AppUtil;
import com.br.sweetmusic.views.HomeActivity;
import com.br.sweetmusic.R;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {

    private static final int RC_SIGN_IN = 1001;
    private TextInputLayout inputEmail;
    private TextInputLayout inputSenha;
    private TextView textEsqueciSenha;
    private Button btnLogin;
    private ImageView btnFacebook;
    private ImageView btnGoogle;
    private TextView txtRegistrese;
    private CallbackManager callbackManager;

    private static final String EMAIL_PATTERN = "^[a-zA-Z0-9#_~!$&'()*+,;=:.\"(),:;<>@\\[\\]\\\\]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*$";
    private Pattern pattern = Pattern.compile(EMAIL_PATTERN);
    private Matcher matcher;

    private String email, senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initViews();

        //CallBack do Facebook
        callbackManager = CallbackManager.Factory.create();

        btnLogin.setOnClickListener(v -> loginEmail());

        btnFacebook.setOnClickListener(v -> loginFacebook());

        //TODO: Mudar lógica para integrar com o Google
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

        AppUtil.printKeyHash(this);
    }

    private void loginFacebook() {

        LoginManager.getInstance().logInWithReadPermissions(this, Arrays.asList("public_profile"));
        LoginManager.getInstance().registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {

                AuthCredential credential = FacebookAuthProvider
                        .getCredential(loginResult.getAccessToken().getToken());

                FirebaseAuth.getInstance().signInWithCredential(credential)
                        .addOnCompleteListener(task -> {
                            irParaHome(loginResult.getAccessToken().getUserId());
                        });
            }

            @Override
            public void onCancel() {
                Toast.makeText(LoginActivity.this, "Cancelado", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onError(FacebookException error) {
                Toast.makeText(LoginActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
            }
        });

    }

    private void irParaHome(String uiid) {

        AppUtil.salvarIdUsuario(getApplication().getApplicationContext(), uiid);
        startActivity(new Intent(getApplicationContext(), HomeActivity.class));
        finish();

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

    public void loginEmail() {

        String email = inputEmail.getEditText().getText().toString();
        String password = inputSenha.getEditText().getText().toString();

        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Campos não podem ser vazios :(", Toast.LENGTH_SHORT).show();
            return;
        }

        // tentamos fazer o login com o email e senha no firebase
        FirebaseAuth.getInstance()
                .signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        irParaHome(FirebaseAuth.getInstance().getCurrentUser().getUid());
                    } else {
                        Snackbar.make(btnLogin, task.getException().getMessage(), Snackbar.LENGTH_LONG).show();
                    }
                });

    }

    public void validarCampos() {
        email = inputEmail.getEditText().getText().toString().trim();
        senha = inputSenha.getEditText().getText().toString().trim();

        if (validarEmail(email) && !validateSenha(senha)) {
            inputEmail.setError(getString(R.string.login_email_vazio));
            inputSenha.setError(getString(R.string.senha_numero_caracteres));
        } else if (!validateSenha(senha)) {
            inputSenha.setError(getString(R.string.senha_numero_caracteres));
            inputEmail.setErrorEnabled(false);
        } else if (validarEmail(email)) {
            inputEmail.setError(getString(R.string.cadastro_email_invalido));
            inputSenha.setErrorEnabled(false);
        } else {
            inputEmail.setErrorEnabled(false);
            inputSenha.setErrorEnabled(false);

            startActivity(new Intent(LoginActivity.this, HomeActivity.class));
        }
    }

    public boolean validarEmail(String email) {
        matcher = pattern.matcher(email);
        return !matcher.matches();
    }

    public boolean validateSenha(String senha) {
        return senha.length() > 5;
    }

    public void esqueciSenha() {
        startActivity(new Intent(LoginActivity.this, ForgotActivity.class));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        callbackManager.onActivityResult(requestCode, resultCode, data);

        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == RC_SIGN_IN) {
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            if (result.isSuccess()){
                GoogleSignInAccount account = result.getSignInAccount();
                autenticacaoGoogle(account);
            }
        }

    }

    private void autenticacaoGoogle(GoogleSignInAccount account) {
        // TODO :: autenticar com o Google e ir para home
    }
}