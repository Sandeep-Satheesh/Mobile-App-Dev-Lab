package com.example.multithreading;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    private TextView tvOutput;
    Thread workerThread;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvOutput = (TextView) findViewById(R.id.textView1);

        Button btnStart = findViewById(R.id.button1),
                btnEnd = findViewById(R.id.button2);

        btnStart.setOnClickListener(v -> {
            workerThread = new Thread(() -> {
                long startTime = System.currentTimeMillis();
                while (!Thread.currentThread().isInterrupted()) {
                    runOnUiThread(() -> {
                        long millis = System.currentTimeMillis() - startTime;
                        tvOutput.append("\nTime elapsed: " + String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(millis),
                                TimeUnit.MILLISECONDS.toMinutes(millis) - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS.toHours(millis)),
                                TimeUnit.MILLISECONDS.toSeconds(millis) - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millis))));
                    });
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                        return;
                    }
                }
            });
            workerThread.start();
            Toast.makeText(getApplicationContext(), "Worker thread started!", Toast.LENGTH_SHORT).show();
        });

        btnEnd.setOnClickListener(v -> {
            workerThread.interrupt();
            Toast.makeText(getApplicationContext(), "Worker thread stopped!", Toast.LENGTH_SHORT).show();
        });
    }
}