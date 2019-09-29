package com.br.sweetmusic.views.login;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.br.sweetmusic.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ForgotConfirmacaoFragment extends Fragment {
    private Button btnLogin;

    public ForgotConfirmacaoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_forgot_confirmacao, container, false);

        btnLogin = view.findViewById(R.id.button_confirm_toLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), LoginActivity.class));
            }
        });

        return view;
    }

}
