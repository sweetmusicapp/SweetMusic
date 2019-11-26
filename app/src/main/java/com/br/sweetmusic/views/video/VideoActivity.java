package com.br.sweetmusic.views.video;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import com.br.sweetmusic.R;
import com.br.sweetmusic.model.Musica;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

import static com.br.sweetmusic.views.InicioFragment.MUSICA_KEY;

public class VideoActivity extends AppCompatActivity {
    private YouTubePlayerView youTubePlayerView;
    private String videoId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //remove barra de título
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_video);

        //evita que a activity seja destruída se for clicado fora
        //this.setFinishOnTouchOutside(false);

        if (getIntent() != null && getIntent().getExtras() != null) {
            Musica musica = getIntent().getParcelableExtra(MUSICA_KEY);

            if(musica != null){
                videoId = musica.getVideoId();
            }
        }

        initYouTubePlayerView();
    }

    private void initYouTubePlayerView() {
        youTubePlayerView = findViewById(R.id.youtube_player_view);

        getLifecycle().addObserver(youTubePlayerView);
        initPictureInPicture(youTubePlayerView);

        youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

    }

    private void initPictureInPicture(YouTubePlayerView youTubePlayerView) {
        ImageView pictureInPictureIcon = new ImageView(this);
        pictureInPictureIcon.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_picture_in_picture));

        pictureInPictureIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    boolean supportsPIP = getPackageManager().hasSystemFeature(PackageManager.FEATURE_PICTURE_IN_PICTURE);
                    if (supportsPIP)
                        enterPictureInPictureMode();
                } else {
                    new AlertDialog.Builder(getApplicationContext())
                            .setTitle("Can't enter picture in picture mode")
                            .setMessage("In order to enter picture in picture mode you need a SDK version >= N.")
                            .show();
                }
            }
        });
        youTubePlayerView.getPlayerUiController().addView(pictureInPictureIcon);
    }

    @Override
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);

        if (isInPictureInPictureMode) {
            youTubePlayerView.enterFullScreen();
            youTubePlayerView.getPlayerUiController().showUi(false);
        } else {
            youTubePlayerView.exitFullScreen();
            youTubePlayerView.getPlayerUiController().showUi(true);
        }
    }


}
