package com.br.sweetmusic.views.perfil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.br.sweetmusic.R;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;


public class PerfilActivity extends AppCompatActivity {
    private TextView txtNome;
    private TextView txtEmail;
    private TextView txtSenha;
    private CircleImageView imgPerfil;
    private SignInButton googleSignInButton;
    private GoogleSignInClient googleSignInClient;
    private FirebaseUser user;
    public static final String GOOGLE_ACCOUNT = "google_account";
    private static final int PERMISSION_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        initViews();

        user = FirebaseAuth.getInstance().getCurrentUser();

        GoogleSignInOptions gso = new GoogleSignInOptions
                .Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();

        googleSignInClient = GoogleSignIn.getClient(this,gso);
        retornarOsDados();

        txtNome.setText(user.getDisplayName());
        //imgPerfil.setImageResource(R.drawable.sweetperfil);

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

    private void retornarOsDados() {
        GoogleSignInAccount googleSignInAccount = getIntent().getParcelableExtra(GOOGLE_ACCOUNT);
        //Picasso.get().load(googleSignInAccount.getPhotoUrl()).centerInside().fit().into(imgPerfil);
        //txtNome.setText(googleSignInAccount.getDisplayName());
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
        imgPerfil = findViewById(R.id.imagemPerfil);
    }
}
