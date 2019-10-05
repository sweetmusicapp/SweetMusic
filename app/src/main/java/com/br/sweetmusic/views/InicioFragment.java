package com.br.sweetmusic.views;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.br.sweetmusic.R;
import com.br.sweetmusic.adapters.MusicasGridAdapter;
import com.br.sweetmusic.interfaces.RecyclerViewOnClick;
import com.br.sweetmusic.models.Musica;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class InicioFragment extends Fragment implements RecyclerViewOnClick {
    public static final String MUSICA_KEY = "musica";
    private RecyclerView recyclerHome;
    private MusicasGridAdapter adapter;
    private List<Musica> gridMusicas = new ArrayList<>();

    public InicioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_inicio, container, false);

        recyclerHome = view.findViewById(R.id.recyclerViewMusicas);
        adapter = new MusicasGridAdapter(listarMusicas(), this);
        recyclerHome.setAdapter(adapter);
        recyclerHome.setLayoutManager(new GridLayoutManager(this.getContext(), 3));

        return view;
    }

    private List<Musica> listarMusicas() {
        gridMusicas.add(new Musica(false, "The Number of the Beast", "The Number of the Beast", "Iron Maiden",
                R.drawable.ironmaiden,
                "The Number of the Beast é o sétimo single e segundo do álbum de mesmo nome da banda de heavy metal Iron Maiden. A música foi escrita inspirada em um pesadelo do fundador da banda, Steve Harris após ver o filme Damien: Omen II (A Profecia II) e na história do poema Tam o' Shanter. \"The Number of the Beast\" é um dos maiores sucessos da banda e é sempre executada durante concertos e chegou ao décimo oitavo lugar das paradas britânicas. A canção é bastante conhecida pelo estridente e grutal grito de Bruce Dickinson segundos após a introdução. No documentário sobre o álbum de mesmo nome, parte da série Classic Albums da BBC, Dickinson conta que o produtor Martin Birch forçava ele a cantar durante várias vezes as quatro primeiras linhas durante várias e várias horas. Todo esse treino culminou em um tom cada vez mais estridente do grito no começo da música."));
        gridMusicas.add(new Musica(true, "Scar Tissue", "Californication", "Red Hot Chili Peppers",
                R.drawable.rhcp,
                "The Number of the Beast é o sétimo single e segundo do álbum de mesmo nome da banda de heavy metal Iron Maiden. A música foi escrita inspirada em um pesadelo do fundador da banda, Steve Harris após ver o filme Damien: Omen II (A Profecia II) e na história do poema Tam o' Shanter. \"The Number of the Beast\" é um dos maiores sucessos da banda e é sempre executada durante concertos e chegou ao décimo oitavo lugar das paradas britânicas. A canção é bastante conhecida pelo estridente e grutal grito de Bruce Dickinson segundos após a introdução. No documentário sobre o álbum de mesmo nome, parte da série Classic Albums da BBC, Dickinson conta que o produtor Martin Birch forçava ele a cantar durante várias vezes as quatro primeiras linhas durante várias e várias horas. Todo esse treino culminou em um tom cada vez mais estridente do grito no começo da música."));
        gridMusicas.add(new Musica(false, "The Number of the Beast", "The Number of the Beast", "Iron Maiden",
                R.drawable.ironmaiden,
                "The Number of the Beast é o sétimo single e segundo do álbum de mesmo nome da banda de heavy metal Iron Maiden. A música foi escrita inspirada em um pesadelo do fundador da banda, Steve Harris após ver o filme Damien: Omen II (A Profecia II) e na história do poema Tam o' Shanter. \"The Number of the Beast\" é um dos maiores sucessos da banda e é sempre executada durante concertos e chegou ao décimo oitavo lugar das paradas britânicas. A canção é bastante conhecida pelo estridente e grutal grito de Bruce Dickinson segundos após a introdução. No documentário sobre o álbum de mesmo nome, parte da série Classic Albums da BBC, Dickinson conta que o produtor Martin Birch forçava ele a cantar durante várias vezes as quatro primeiras linhas durante várias e várias horas. Todo esse treino culminou em um tom cada vez mais estridente do grito no começo da música."));
        gridMusicas.add(new Musica(true, "Scar Tissue", "Californication", "Red Hot Chili Peppers",
                R.drawable.rhcp,
                "The Number of the Beast é o sétimo single e segundo do álbum de mesmo nome da banda de heavy metal Iron Maiden. A música foi escrita inspirada em um pesadelo do fundador da banda, Steve Harris após ver o filme Damien: Omen II (A Profecia II) e na história do poema Tam o' Shanter. \"The Number of the Beast\" é um dos maiores sucessos da banda e é sempre executada durante concertos e chegou ao décimo oitavo lugar das paradas britânicas. A canção é bastante conhecida pelo estridente e grutal grito de Bruce Dickinson segundos após a introdução. No documentário sobre o álbum de mesmo nome, parte da série Classic Albums da BBC, Dickinson conta que o produtor Martin Birch forçava ele a cantar durante várias vezes as quatro primeiras linhas durante várias e várias horas. Todo esse treino culminou em um tom cada vez mais estridente do grito no começo da música."));
        gridMusicas.add(new Musica(false, "The Number of the Beast", "The Number of the Beast", "Iron Maiden",
                R.drawable.ironmaiden,
                "The Number of the Beast é o sétimo single e segundo do álbum de mesmo nome da banda de heavy metal Iron Maiden. A música foi escrita inspirada em um pesadelo do fundador da banda, Steve Harris após ver o filme Damien: Omen II (A Profecia II) e na história do poema Tam o' Shanter. \"The Number of the Beast\" é um dos maiores sucessos da banda e é sempre executada durante concertos e chegou ao décimo oitavo lugar das paradas britânicas. A canção é bastante conhecida pelo estridente e grutal grito de Bruce Dickinson segundos após a introdução. No documentário sobre o álbum de mesmo nome, parte da série Classic Albums da BBC, Dickinson conta que o produtor Martin Birch forçava ele a cantar durante várias vezes as quatro primeiras linhas durante várias e várias horas. Todo esse treino culminou em um tom cada vez mais estridente do grito no começo da música."));
        gridMusicas.add(new Musica(true, "Scar Tissue", "Californication", "Red Hot Chili Peppers",
                R.drawable.rhcp,
                "The Number of the Beast é o sétimo single e segundo do álbum de mesmo nome da banda de heavy metal Iron Maiden. A música foi escrita inspirada em um pesadelo do fundador da banda, Steve Harris após ver o filme Damien: Omen II (A Profecia II) e na história do poema Tam o' Shanter. \"The Number of the Beast\" é um dos maiores sucessos da banda e é sempre executada durante concertos e chegou ao décimo oitavo lugar das paradas britânicas. A canção é bastante conhecida pelo estridente e grutal grito de Bruce Dickinson segundos após a introdução. No documentário sobre o álbum de mesmo nome, parte da série Classic Albums da BBC, Dickinson conta que o produtor Martin Birch forçava ele a cantar durante várias vezes as quatro primeiras linhas durante várias e várias horas. Todo esse treino culminou em um tom cada vez mais estridente do grito no começo da música."));
        gridMusicas.add(new Musica(false, "The Number of the Beast", "The Number of the Beast", "Iron Maiden",
                R.drawable.ironmaiden,
                "The Number of the Beast é o sétimo single e segundo do álbum de mesmo nome da banda de heavy metal Iron Maiden. A música foi escrita inspirada em um pesadelo do fundador da banda, Steve Harris após ver o filme Damien: Omen II (A Profecia II) e na história do poema Tam o' Shanter. \"The Number of the Beast\" é um dos maiores sucessos da banda e é sempre executada durante concertos e chegou ao décimo oitavo lugar das paradas britânicas. A canção é bastante conhecida pelo estridente e grutal grito de Bruce Dickinson segundos após a introdução. No documentário sobre o álbum de mesmo nome, parte da série Classic Albums da BBC, Dickinson conta que o produtor Martin Birch forçava ele a cantar durante várias vezes as quatro primeiras linhas durante várias e várias horas. Todo esse treino culminou em um tom cada vez mais estridente do grito no começo da música."));
        gridMusicas.add(new Musica(true, "Scar Tissue", "Californication", "Red Hot Chili Peppers",
                R.drawable.rhcp,
                "The Number of the Beast é o sétimo single e segundo do álbum de mesmo nome da banda de heavy metal Iron Maiden. A música foi escrita inspirada em um pesadelo do fundador da banda, Steve Harris após ver o filme Damien: Omen II (A Profecia II) e na história do poema Tam o' Shanter. \"The Number of the Beast\" é um dos maiores sucessos da banda e é sempre executada durante concertos e chegou ao décimo oitavo lugar das paradas britânicas. A canção é bastante conhecida pelo estridente e grutal grito de Bruce Dickinson segundos após a introdução. No documentário sobre o álbum de mesmo nome, parte da série Classic Albums da BBC, Dickinson conta que o produtor Martin Birch forçava ele a cantar durante várias vezes as quatro primeiras linhas durante várias e várias horas. Todo esse treino culminou em um tom cada vez mais estridente do grito no começo da música."));
        gridMusicas.add(new Musica(false, "The Number of the Beast", "The Number of the Beast", "Iron Maiden",
                R.drawable.ironmaiden,
                "The Number of the Beast é o sétimo single e segundo do álbum de mesmo nome da banda de heavy metal Iron Maiden. A música foi escrita inspirada em um pesadelo do fundador da banda, Steve Harris após ver o filme Damien: Omen II (A Profecia II) e na história do poema Tam o' Shanter. \"The Number of the Beast\" é um dos maiores sucessos da banda e é sempre executada durante concertos e chegou ao décimo oitavo lugar das paradas britânicas. A canção é bastante conhecida pelo estridente e grutal grito de Bruce Dickinson segundos após a introdução. No documentário sobre o álbum de mesmo nome, parte da série Classic Albums da BBC, Dickinson conta que o produtor Martin Birch forçava ele a cantar durante várias vezes as quatro primeiras linhas durante várias e várias horas. Todo esse treino culminou em um tom cada vez mais estridente do grito no começo da música."));

        return gridMusicas;
    }

    @Override
    public void onClick(Musica musica) {
        Intent intent = new Intent(this.getContext(), DetalheMusicaActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(MUSICA_KEY, musica);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
