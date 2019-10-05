package com.br.sweetmusic.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;

import com.br.sweetmusic.R;
import com.br.sweetmusic.adapter.AdapterListaMusicas;
import com.br.sweetmusic.interfaces.RecyclerViewOnClick;
import com.br.sweetmusic.model.Musica;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerViewOnClick {

    private static final String MUSICA_KEY = "musica";
    private RecyclerView recyclerViewMusicas;
    private AdapterListaMusicas adapterListaMusicas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewMusicas = findViewById(R.id.recyclerViewMusicas);
        adapterListaMusicas = new AdapterListaMusicas(listaMusicas(), this);
        recyclerViewMusicas.setAdapter(adapterListaMusicas);
        recyclerViewMusicas.setLayoutManager(new GridLayoutManager(this, 2));

    }

    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    private List<Musica> listaMusicas(){
        List<Musica> musicas = new ArrayList<>();
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden));


       /* musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden, "The Number of The Beast", "The Number of the Beast é o sétimo single e segundo do álbum de mesmo nome da banda de heavy metal Iron Maiden. A música foi escrita inspirada em um pesadelo do fundador da banda, Steve Harris após ver o filme Damien: Omen II (A Profecia II) e na história do poema Tam o' Shanter. \"The Number of the Beast\" é um dos maiores sucessos da banda e é sempre executada durante concertos e chegou ao décimo oitavo lugar das paradas britânicas. A canção é bastante conhecida pelo estridente e grutal grito de Bruce Dickinson segundos após a introdução. No documentário sobre o álbum de mesmo nome, parte da série Classic Albums da BBC, Dickinson conta que o produtor Martin Birch forçava ele a cantar durante várias vezes as quatro primeiras linhas durante várias e várias horas. Todo esse treino culminou em um tom cada vez mais estridente do grito no começo da música."));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden, "The Number of The Beast", "The Number of the Beast é o sétimo single e segundo do álbum de mesmo nome da banda de heavy metal Iron Maiden. A música foi escrita inspirada em um pesadelo do fundador da banda, Steve Harris após ver o filme Damien: Omen II (A Profecia II) e na história do poema Tam o' Shanter. \"The Number of the Beast\" é um dos maiores sucessos da banda e é sempre executada durante concertos e chegou ao décimo oitavo lugar das paradas britânicas. A canção é bastante conhecida pelo estridente e grutal grito de Bruce Dickinson segundos após a introdução. No documentário sobre o álbum de mesmo nome, parte da série Classic Albums da BBC, Dickinson conta que o produtor Martin Birch forçava ele a cantar durante várias vezes as quatro primeiras linhas durante várias e várias horas. Todo esse treino culminou em um tom cada vez mais estridente do grito no começo da música."));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden, "The Number of The Beast", "The Number of the Beast é o sétimo single e segundo do álbum de mesmo nome da banda de heavy metal Iron Maiden. A música foi escrita inspirada em um pesadelo do fundador da banda, Steve Harris após ver o filme Damien: Omen II (A Profecia II) e na história do poema Tam o' Shanter. \"The Number of the Beast\" é um dos maiores sucessos da banda e é sempre executada durante concertos e chegou ao décimo oitavo lugar das paradas britânicas. A canção é bastante conhecida pelo estridente e grutal grito de Bruce Dickinson segundos após a introdução. No documentário sobre o álbum de mesmo nome, parte da série Classic Albums da BBC, Dickinson conta que o produtor Martin Birch forçava ele a cantar durante várias vezes as quatro primeiras linhas durante várias e várias horas. Todo esse treino culminou em um tom cada vez mais estridente do grito no começo da música."));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden, "The Number of The Beast", "The Number of the Beast é o sétimo single e segundo do álbum de mesmo nome da banda de heavy metal Iron Maiden. A música foi escrita inspirada em um pesadelo do fundador da banda, Steve Harris após ver o filme Damien: Omen II (A Profecia II) e na história do poema Tam o' Shanter. \"The Number of the Beast\" é um dos maiores sucessos da banda e é sempre executada durante concertos e chegou ao décimo oitavo lugar das paradas britânicas. A canção é bastante conhecida pelo estridente e grutal grito de Bruce Dickinson segundos após a introdução. No documentário sobre o álbum de mesmo nome, parte da série Classic Albums da BBC, Dickinson conta que o produtor Martin Birch forçava ele a cantar durante várias vezes as quatro primeiras linhas durante várias e várias horas. Todo esse treino culminou em um tom cada vez mais estridente do grito no começo da música."));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden, "The Number of The Beast", "The Number of the Beast é o sétimo single e segundo do álbum de mesmo nome da banda de heavy metal Iron Maiden. A música foi escrita inspirada em um pesadelo do fundador da banda, Steve Harris após ver o filme Damien: Omen II (A Profecia II) e na história do poema Tam o' Shanter. \"The Number of the Beast\" é um dos maiores sucessos da banda e é sempre executada durante concertos e chegou ao décimo oitavo lugar das paradas britânicas. A canção é bastante conhecida pelo estridente e grutal grito de Bruce Dickinson segundos após a introdução. No documentário sobre o álbum de mesmo nome, parte da série Classic Albums da BBC, Dickinson conta que o produtor Martin Birch forçava ele a cantar durante várias vezes as quatro primeiras linhas durante várias e várias horas. Todo esse treino culminou em um tom cada vez mais estridente do grito no começo da música."));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden, "The Number of The Beast", "The Number of the Beast é o sétimo single e segundo do álbum de mesmo nome da banda de heavy metal Iron Maiden. A música foi escrita inspirada em um pesadelo do fundador da banda, Steve Harris após ver o filme Damien: Omen II (A Profecia II) e na história do poema Tam o' Shanter. \"The Number of the Beast\" é um dos maiores sucessos da banda e é sempre executada durante concertos e chegou ao décimo oitavo lugar das paradas britânicas. A canção é bastante conhecida pelo estridente e grutal grito de Bruce Dickinson segundos após a introdução. No documentário sobre o álbum de mesmo nome, parte da série Classic Albums da BBC, Dickinson conta que o produtor Martin Birch forçava ele a cantar durante várias vezes as quatro primeiras linhas durante várias e várias horas. Todo esse treino culminou em um tom cada vez mais estridente do grito no começo da música."));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden, "The Number of The Beast", "The Number of the Beast é o sétimo single e segundo do álbum de mesmo nome da banda de heavy metal Iron Maiden. A música foi escrita inspirada em um pesadelo do fundador da banda, Steve Harris após ver o filme Damien: Omen II (A Profecia II) e na história do poema Tam o' Shanter. \"The Number of the Beast\" é um dos maiores sucessos da banda e é sempre executada durante concertos e chegou ao décimo oitavo lugar das paradas britânicas. A canção é bastante conhecida pelo estridente e grutal grito de Bruce Dickinson segundos após a introdução. No documentário sobre o álbum de mesmo nome, parte da série Classic Albums da BBC, Dickinson conta que o produtor Martin Birch forçava ele a cantar durante várias vezes as quatro primeiras linhas durante várias e várias horas. Todo esse treino culminou em um tom cada vez mais estridente do grito no começo da música."));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden, "The Number of The Beast", "The Number of the Beast é o sétimo single e segundo do álbum de mesmo nome da banda de heavy metal Iron Maiden. A música foi escrita inspirada em um pesadelo do fundador da banda, Steve Harris após ver o filme Damien: Omen II (A Profecia II) e na história do poema Tam o' Shanter. \"The Number of the Beast\" é um dos maiores sucessos da banda e é sempre executada durante concertos e chegou ao décimo oitavo lugar das paradas britânicas. A canção é bastante conhecida pelo estridente e grutal grito de Bruce Dickinson segundos após a introdução. No documentário sobre o álbum de mesmo nome, parte da série Classic Albums da BBC, Dickinson conta que o produtor Martin Birch forçava ele a cantar durante várias vezes as quatro primeiras linhas durante várias e várias horas. Todo esse treino culminou em um tom cada vez mais estridente do grito no começo da música."));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden, "The Number of The Beast", "The Number of the Beast é o sétimo single e segundo do álbum de mesmo nome da banda de heavy metal Iron Maiden. A música foi escrita inspirada em um pesadelo do fundador da banda, Steve Harris após ver o filme Damien: Omen II (A Profecia II) e na história do poema Tam o' Shanter. \"The Number of the Beast\" é um dos maiores sucessos da banda e é sempre executada durante concertos e chegou ao décimo oitavo lugar das paradas britânicas. A canção é bastante conhecida pelo estridente e grutal grito de Bruce Dickinson segundos após a introdução. No documentário sobre o álbum de mesmo nome, parte da série Classic Albums da BBC, Dickinson conta que o produtor Martin Birch forçava ele a cantar durante várias vezes as quatro primeiras linhas durante várias e várias horas. Todo esse treino culminou em um tom cada vez mais estridente do grito no começo da música."));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden, "The Number of The Beast", "The Number of the Beast é o sétimo single e segundo do álbum de mesmo nome da banda de heavy metal Iron Maiden. A música foi escrita inspirada em um pesadelo do fundador da banda, Steve Harris após ver o filme Damien: Omen II (A Profecia II) e na história do poema Tam o' Shanter. \"The Number of the Beast\" é um dos maiores sucessos da banda e é sempre executada durante concertos e chegou ao décimo oitavo lugar das paradas britânicas. A canção é bastante conhecida pelo estridente e grutal grito de Bruce Dickinson segundos após a introdução. No documentário sobre o álbum de mesmo nome, parte da série Classic Albums da BBC, Dickinson conta que o produtor Martin Birch forçava ele a cantar durante várias vezes as quatro primeiras linhas durante várias e várias horas. Todo esse treino culminou em um tom cada vez mais estridente do grito no começo da música."));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden, "The Number of The Beast", "The Number of the Beast é o sétimo single e segundo do álbum de mesmo nome da banda de heavy metal Iron Maiden. A música foi escrita inspirada em um pesadelo do fundador da banda, Steve Harris após ver o filme Damien: Omen II (A Profecia II) e na história do poema Tam o' Shanter. \"The Number of the Beast\" é um dos maiores sucessos da banda e é sempre executada durante concertos e chegou ao décimo oitavo lugar das paradas britânicas. A canção é bastante conhecida pelo estridente e grutal grito de Bruce Dickinson segundos após a introdução. No documentário sobre o álbum de mesmo nome, parte da série Classic Albums da BBC, Dickinson conta que o produtor Martin Birch forçava ele a cantar durante várias vezes as quatro primeiras linhas durante várias e várias horas. Todo esse treino culminou em um tom cada vez mais estridente do grito no começo da música."));
        musicas.add(new Musica("The number of the Beast", "Iron Maiden", R.drawable.ironmaiden, "The Number of The Beast", "The Number of the Beast é o sétimo single e segundo do álbum de mesmo nome da banda de heavy metal Iron Maiden. A música foi escrita inspirada em um pesadelo do fundador da banda, Steve Harris após ver o filme Damien: Omen II (A Profecia II) e na história do poema Tam o' Shanter. \"The Number of the Beast\" é um dos maiores sucessos da banda e é sempre executada durante concertos e chegou ao décimo oitavo lugar das paradas britânicas. A canção é bastante conhecida pelo estridente e grutal grito de Bruce Dickinson segundos após a introdução. No documentário sobre o álbum de mesmo nome, parte da série Classic Albums da BBC, Dickinson conta que o produtor Martin Birch forçava ele a cantar durante várias vezes as quatro primeiras linhas durante várias e várias horas. Todo esse treino culminou em um tom cada vez mais estridente do grito no começo da música."));
*/
        return musicas;
    }

    public void onClick(Musica musica){
        Intent intent = new Intent(MainActivity.this, DetalheMusicaActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable(MUSICA_KEY, musica);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
