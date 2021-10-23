package com.example.helloworld;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    int color_selector = 1, font_selector = 1;
    float font = 30;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView t = (TextView) findViewById(R.id.tv);
        Button b1 = findViewById(R.id.b1);
        b1.setOnClickListener(v -> {
            switch (font_selector) {
                case 1:
                    t.setTypeface(Typeface.SERIF);
                    break;

                case 2:
                    t.setTypeface(Typeface.MONOSPACE);
                    break;

                case 3:
                    t.setTypeface(Typeface.DEFAULT);
                    break;

                case 4:
                    t.setTypeface(Typeface.SANS_SERIF);

                case 5:
                    t.setTypeface(Typeface.DEFAULT_BOLD);
            }

            font_selector++;
            if (font_selector == 6) font_selector = 1;
        });
        Button b3 = (Button) findViewById(R.id.b3);
        b3.setOnClickListener(v -> {
            t.setTextSize(font);
            font = font + 5;
            if (font >= 50)
                font = 30;
        });
        Button b2 = (Button) findViewById(R.id.b2);
        b2.setOnClickListener(v -> {
            switch (color_selector) {
                case 1:
                    t.setTextColor(Color.RED);
                    break;
                case 2:
                    t.setTextColor(Color.GREEN);
                    break;
                case 3:
                    t.setTextColor(Color.BLUE);
                    break;
            }
            color_selector++;
            if (color_selector == 4)
                color_selector = 1;
        });
    }
}