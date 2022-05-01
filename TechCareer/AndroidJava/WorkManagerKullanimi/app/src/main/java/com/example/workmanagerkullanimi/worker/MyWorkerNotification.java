package com.example.workmanagerkullanimi.worker;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import com.example.workmanagerkullanimi.MainActivity;
import com.example.workmanagerkullanimi.R;

public class MyWorkerNotification extends Worker {
    public MyWorkerNotification(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        showNotification();
        return Result.success();
    }

    private void showNotification() {
        NotificationCompat.Builder builder;

        NotificationManager notificationManager =
                (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        PendingIntent pendingIntent =
                PendingIntent.getActivity(getApplicationContext(), 1, intent, PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            String channelId = "channelId";
            String channelName = "channelName";
            String channelDefinition = "channelDefinition";
            int channelPriority = NotificationManager.IMPORTANCE_HIGH;

            NotificationChannel channel = notificationManager.getNotificationChannel(channelId);

            if (channel == null){
                channel = new NotificationChannel(channelId, channelName, channelPriority);
                channel.setDescription(channelDefinition);
                notificationManager.createNotificationChannel(channel);
            }
            builder = new NotificationCompat.Builder(getApplicationContext(), channelId);
            builder.setContentTitle("Title")
                    .setContentText("Content")
                    .setContentIntent(pendingIntent)
                    .setSmallIcon(R.drawable.notificationimage)
                    .setAutoCancel(true);
        }else {
            builder = new NotificationCompat.Builder(getApplicationContext());
            builder.setContentTitle("Title")
                    .setContentText("Content")
                    .setContentIntent(pendingIntent)
                    .setSmallIcon(R.drawable.notificationimage)
                    .setAutoCancel(true)
                    .setPriority(Notification.PRIORITY_HIGH);
        }

        notificationManager.notify(1, builder.build());
    }
}
