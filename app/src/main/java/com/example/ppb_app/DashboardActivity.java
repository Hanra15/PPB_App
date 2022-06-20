package com.example.ppb_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {
//    inisialisasi variabel btn
    private Button btn_intent, btn_kalkulator, btn_database;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

//        get variabel button from layout
        btn_intent = findViewById(R.id.btn_intent);
        btn_kalkulator = findViewById(R.id.btn_kalkulator);
        btn_database = findViewById(R.id.btn_database);

//        action intent/perpindahan halaman ke halaman intent
        // akses halaman cek intemt
        btn_intent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Notif pindah halaman
                Toast.makeText(getApplicationContext(), "Akses Halaman Intent", Toast.LENGTH_SHORT).show();

//                function perpindahan halaman
                Intent access_intent = new Intent(DashboardActivity.this , IntentActivity.class);
                startActivity(access_intent);
            }
        });
        // akses halaman kalkulator
        btn_kalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Notif pindah halaman
                Toast.makeText(getApplicationContext(), "Akses Halaman Kalkulator", Toast.LENGTH_SHORT).show();

//                function perpindahan halaman
                Intent access_kalkulator = new Intent(DashboardActivity.this , KalkulatorActivity.class);
                startActivity(access_kalkulator);
            }
        });
        // akses halaman kalkulator
        btn_database.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Notif pindah halaman
                Toast.makeText(getApplicationContext(), "Akses Halaman Dashboard", Toast.LENGTH_SHORT).show();

//                function perpindahan halaman
                Intent access_database = new Intent(DashboardActivity.this , DashboardActivity.class);
                startActivity(access_database);
            }
        });

    }
}