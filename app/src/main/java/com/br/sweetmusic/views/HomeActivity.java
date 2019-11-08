package com.br.sweetmusic.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.br.sweetmusic.views.Fragments.FavoritosFragment;
import com.br.sweetmusic.views.Fragments.InicioFragment;
import com.br.sweetmusic.views.Fragments.PrincipalFragment;
import com.br.sweetmusic.views.Fragments.SairFragment;
import com.br.sweetmusic.R;
import com.br.sweetmusic.views.activity.ContatoActivity;
import com.br.sweetmusic.views.perfil.PerfilActivity;
import com.google.android.material.navigation.NavigationView;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private AppBarConfiguration mAppBarConfiguration;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        InicioFragment inicioFragment = new InicioFragment();
        FragmentTransaction fragmentTrasaction = getSupportFragmentManager().beginTransaction();
        fragmentTrasaction.replace(R.id.frame_container, inicioFragment);
        fragmentTrasaction.commit();

        //frameLayout = findViewById(R.id.frame_principal);


        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_inicio, R.id.nav_favoritos, R.id.nav_perfil,
                R.id.nav_sobre, R.id.nav_sair, R.id.nav_contato, R.id.nav_principal)
                .setDrawerLayout(drawer)
                .build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
//        NavigationUI.setupWithNavController(navigationView, navController);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();

        if (id == R.id.nav_inicio) {

            InicioFragment inicioFragment = new InicioFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frame_container, inicioFragment);
            transaction.commit();
            //replaceFragment(new InicioFragment());
            //drawer.closeDrawer(GravityCompat.START);

        } else if (id == R.id.nav_favoritos) {

            FavoritosFragment favoritosFragment = new FavoritosFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frame_container, favoritosFragment);
            transaction.commit();

        } else if (id == R.id.nav_perfil) {

            startActivity(new Intent(HomeActivity.this, PerfilActivity.class));

        } else if (id == R.id.nav_sobre) {

            startActivity(new Intent(this, HomeActivity.class));
        } else if (id == R.id.nav_sair) {

            SairFragment sairFragment = new SairFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frame_container, sairFragment);
            transaction.commit();

        } else if (id == R.id.nav_contato) {


           startActivity( new Intent(this, ContatoActivity.class));


        } else if (id == R.id.nav_principal) {

            PrincipalFragment principalFragment = new PrincipalFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frame_container, principalFragment);
            transaction.commit();


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    public void enviarEmail() {

        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{"sweetmusic@gmail.com"});
        email.putExtra(Intent.EXTRA_SUBJECT, "Contato pelo App");
        email.putExtra(Intent.EXTRA_TEXT, "Mensagem automática");

        // configurar apps para email

        email.setType("menssage/rfc822");// ao definir esse tipo, ira abrir aplicativos de envio de email
        startActivity(Intent.createChooser(email, "Escolha o app de email"));
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
