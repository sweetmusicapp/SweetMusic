package com.br.sweetmusic.menus.favoritos;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.br.sweetmusic.R;

public class FavoritosFragment extends Fragment {


    public FavoritosFragment() {
        // Required empty public constructor
    }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            // Inflate the layout for this fragment
            return inflater.inflate(R.layout.fragment_favoritos, container, false);
        }

}
