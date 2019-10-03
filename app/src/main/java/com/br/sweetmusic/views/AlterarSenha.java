package com.br.sweetmusic.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;

import com.br.sweetmusic.R;
import com.google.android.material.textfield.TextInputLayout;

public class AlterarSenha extends AppCompatActivity {

    private TextInputLayout inputNovaSenha;
    private TextInputLayout inputConfirmarSenha;
    private Button btnSalvarSenha;

    public static final String NOVA_SENHA_KEY = "novaSenha";
    public static final String CONFIRMAR_SENHA_KEY = "ConfirmarSenha";

    private String email, novaSenha;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alterar_senha);

        btnSalvarSenha = findViewById(R.id.button_salvarSenha);
        inputNovaSenha = findViewById(R.id.textInputLayout_alterar_senha);
        inputConfirmarSenha = findViewById(R.id.textInputLayout_confirmar_senhaAlterada);



        String senha = inputNovaSenha.getEditText().getText().toString();


        if (!senha.isEmpty()){
            Intent intent = new Intent(AlterarSenha.this, PerfilActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString(NOVA_SENHA_KEY, senha);
            intent.putExtras(bundle);
            startActivity(intent);

        }else{
            inputNovaSenha.setError("Preencha o campo nome!");
        }


        startActivity(new Intent(AlterarSenha.this, PerfilActivity.class));




        }


    public void validarCampos() {
        email = inputEmail.getEditText().getText().toString().trim();
        novaSenha = inputNovaSenha.getEditText().getText().toString().trim();

        if (!validarEmail(email) && !validateNovaSenha(novaSenha)) {
            inputEmail.setError("Digite um e-mail ");
            inputNovaSenha.setError("Sua senha deve ter mais de 6 caracteres!");
        } else if (!validateNovaSenha(novaSenha)) {
            inputNovaSenha.setError("Sua senha deve ter mais de 6 caracteres!");
            inputEmail.setErrorEnabled(false);
        } else if (!validarEmail(email)) {
            inputNovaSenha.setError("Digite um e-mail válido");
            inputSenha.setErrorEnabled(false);
        } else {
            inputNovaSenha.setErrorEnabled(false);
            inputSenha.setErrorEnabled(false);
        }
    }



    public boolean validateNovaSenha(String novaSenha) {
        return novaSenha.length() > 5;
    }













}
