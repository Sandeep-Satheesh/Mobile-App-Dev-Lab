package com.example.alertonmessage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

public class MainActivity extends AppCompatActivity {
    Button notify;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notify = (Button) findViewById(R.id.button);
        e = (EditText) findViewById(R.id.editText);

        notify.setOnClickListener(v -> {
            NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
            PendingIntent pending = PendingIntent.getActivity(getApplicationContext(), 0, intent, 0);

            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                CharSequence name = "Alerts";
                String description = "Alerts for testing";
                int importance = NotificationManager.IMPORTANCE_HIGH;
                NotificationChannel channel = new NotificationChannel("notif_channel_1", name, importance);
                channel.setDescription(description);
                notificationManager.createNotificationChannel(channel);
            }
            NotificationCompat.Builder noti = new NotificationCompat.Builder(getApplicationContext(), "notif_channel_1")
                    .setContentText(e.getText().toString())
                    .setContentIntent(pending)
                    .setAutoCancel(true)
                    .setSmallIcon(R.mipmap.ic_launcher)
                    .setContentTitle("New Alert!");

            notificationManager.notify(1, noti.build());
        });
    }
}