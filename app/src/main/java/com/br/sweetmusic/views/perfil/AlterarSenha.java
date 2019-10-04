package com.br.sweetmusic.views.perfil;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.br.sweetmusic.R;
import com.google.android.material.textfield.TextInputLayout;

public class AlterarSenha extends AppCompatActivity {

    private TextInputLayout inputNovaSenha;
    private TextInputLayout inputConfirmarSenha;
    private Button btnSalvarSenha;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_senha);

        initViews();


        btnSalvarSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validarSenhas();
            }
        });



        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);   //show back button
        }

    }


    public void validarSenhas() {
        String senhaConfirmada, novaSenha;
        senhaConfirmada = inputConfirmarSenha.getEditText().getText().toString().trim();
        novaSenha = inputNovaSenha.getEditText().getText().toString().trim();

        if (!validateConfirmarSenha(senhaConfirmada) && !validateNovaSenha(novaSenha)) {
            inputNovaSenha.setError("Sua senha deve ter mais de 6 caracteres!");
            inputConfirmarSenha.setError("Sua senha deve ter mais de 6 caracteres!");
        } else if (!validateNovaSenha(novaSenha)) {
            inputNovaSenha.setError("Sua senha deve ter mais de 6 caracteres!");
            inputConfirmarSenha.setErrorEnabled(false);
        } else if (!validateConfirmarSenha(senhaConfirmada)) {
            inputNovaSenha.setErrorEnabled(false);
            inputConfirmarSenha.setError("Sua senha deve ter mais de 6 caracteres!");
        } else if (!senhaConfirmada.equals(novaSenha)) {
            inputNovaSenha.setErrorEnabled(false);
            inputConfirmarSenha.setError("Senhas divergem");
        } else {
            inputNovaSenha.setErrorEnabled(false);
            inputConfirmarSenha.setError("Senhas divergem");
            startActivity(new Intent(AlterarSenha.this, PerfilActivity.class));
        }


    }

    @Override
    public boolean onSupportNavigateUp() {
        //finish();
        onBackPressed();
        return true;
    }

    public boolean validateNovaSenha(String novaSenha) {
        return novaSenha.length() > 5;
    }

    public boolean validateConfirmarSenha(String SenhaConfirmada) {
        return SenhaConfirmada.length() > 5;
    }

    public void initViews() {
        btnSalvarSenha=findViewById(R.id.button_salvar_senha);
        inputNovaSenha = findViewById(R.id.textInputLayout_alterar_senha);
        inputConfirmarSenha = findViewById(R.id.textInputLayout_confirmar_senhaAlterada);
    }



}
