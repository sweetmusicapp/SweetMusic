package com.br.sweetmusic.views.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.br.sweetmusic.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {
    private ImageView imgSplash;
    private Timer timer = new Timer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imgSplash = findViewById(R.id.imageView_splash_logo);

        imgSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextScreen();
            }
        });

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                nextScreen();
            }
        }, 2500);
    }

    public void nextScreen() {
        timer.cancel();
        startActivity(new Intent(SplashActivity.this, LoginActivity.class));
        finish();
    }

}
