package com.br.sweetmusic.servicos;

import com.br.sweetmusic.R;
import com.br.sweetmusic.views.login.LoginActivity;
import com.google.firebase.messaging.FirebaseMessagingService;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.core.app.TaskStackBuilder;
import androidx.core.content.ContextCompat;

import com.google.firebase.messaging.RemoteMessage;

public class CustomFirebaseMessagingService extends FirebaseMessagingService {

    @Override
    public void onNewToken(@NonNull String token) {
        Log.i("TAG", "onNewToken: " + token);

    }

    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        if (remoteMessage.getNotification() != null){

            showNotification(remoteMessage.getNotification().getTitle(),
                    remoteMessage.getNotification().getBody());

        } else {
            //TODO :: tratar retorno vazio
        }
    }

    private void showNotification(String title, String body) {

        String canal = "";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            canal = "Android";
        } else {
            //TODO :: Versão Anterior, e agora??
        }

        NotificationCompat.Builder builder = new NotificationCompat
                .Builder(this, canal)
                .setContentTitle(title)
                .setContentText(body)
                .setColor(ContextCompat.getColor(this, R.color.colorAccent))
                .setSmallIcon(R.drawable.ic_arrow_down)
                .setAutoCancel(true);

        Intent intent = new Intent(this, LoginActivity.class);
        TaskStackBuilder taskStackBuilder = TaskStackBuilder.create(this);
        taskStackBuilder.addParentStack(LoginActivity.class);
        taskStackBuilder.addNextIntent(intent);
        PendingIntent pendingIntent = taskStackBuilder
                .getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);

        builder.setContentIntent(pendingIntent);

        Uri uriAudio = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM);
        builder.setSound(uriAudio);

        Notification notification = builder.build();
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(0, notification);

    }


}
