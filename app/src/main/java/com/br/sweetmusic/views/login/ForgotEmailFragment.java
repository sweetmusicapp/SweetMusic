package com.br.sweetmusic.views.login;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.br.sweetmusic.R;
import com.google.android.material.textfield.TextInputLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class ForgotEmailFragment extends Fragment {
    private TextInputLayout inputEmail;
    private Button btnRecuperar;

    String email;

    public ForgotEmailFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_forgot_email, container, false);

        initViews(view);

        btnRecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email = inputEmail.getEditText().getText().toString().trim();
                //Checar se o e-mail está cadastrado
                if (!email.isEmpty()) {
                    //mudar para o fragment de confirmação
                    nextFragment();
                } else {
                    inputEmail.setError(getString(R.string.forgot_email_nao_cadastrado));
                }

            }
        });

        return view;
    }

    public void initViews(View view) {
        inputEmail = view.findViewById(R.id.textInputLayout_forgot_email);
        btnRecuperar = view.findViewById(R.id.button_recuperar_senha);
    }

    public void nextFragment() {
        int parentView = ((ViewGroup) getView().getParent()).getId();

        getActivity().getSupportFragmentManager().beginTransaction()
                .replace(parentView, new ForgotConfirmacaoFragment())
                .addToBackStack(null)
                .commit();
    }

}
