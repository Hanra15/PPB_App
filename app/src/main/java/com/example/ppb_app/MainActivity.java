package com.example.ppb_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    // waktu muncul splash screen
    private int time = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // membuat intent splash screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // perpindahan halaman
                Intent splash = new Intent(MainActivity.this , DashboardActivity.class);
                startActivity(splash);

                finish();
            }
        }, time);

    }
}