package com.example.alarmclock;

import static android.content.Context.VIBRATOR_SERVICE;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.RequiresApi;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    // implement onReceive() method
    public void onReceive(Context context, Intent intent) {

        Toast.makeText(context, "Alarm! Wake up! Wake up!", Toast.LENGTH_LONG).show();
        Intent i = new Intent(context, RingtoneService.class);
        i.putExtra("title", "Sample");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            context.startForegroundService(i);
        }
        else
            context.startService(i);
    }
}
