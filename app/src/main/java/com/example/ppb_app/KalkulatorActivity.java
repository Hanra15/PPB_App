package com.example.ppb_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class KalkulatorActivity extends AppCompatActivity {
    // inisialisasi
    private EditText Angka1, Angka2;
    private Button btn_tambah, btn_kurang, btn_kali, btn_bagi;
    private TextView Hasil;
    String sAngka1, sAngka2;
    double dAngka1, dAngka2, dHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        // get variabel layout
        Angka1 = findViewById(R.id.Angka1);
        Angka2 = findViewById(R.id.Angka2);
        btn_tambah = findViewById(R.id.btn_tambah);
        btn_kurang = findViewById(R.id.btn_kurang);
        btn_kali = findViewById(R.id.btn_kali);
        btn_bagi = findViewById(R.id.btn_bagi);
        Hasil = findViewById(R.id.Hasil);

        // aksi tiap button
        // button tamnbah
        btn_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Angka pertama
                sAngka1 = Angka1.getText().toString();
                dAngka1 = Double.parseDouble(sAngka1);
                // Angka kedua
                sAngka2 = Angka2.getText().toString();
                dAngka2 = Double.parseDouble(sAngka2);
                // hasil
                dHasil = dAngka1 + dAngka2;
                Hasil.setText("" +dHasil);
            }
        });
        // button kurang
        btn_kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Angka pertama
                sAngka1 = Angka1.getText().toString();
                dAngka1 = Double.parseDouble(sAngka1);
                // Angka kedua
                sAngka2 = Angka2.getText().toString();
                dAngka2 = Double.parseDouble(sAngka2);
                // hasil
                dHasil = dAngka1 - dAngka2;
                Hasil.setText("" +dHasil);
            }
        });
        // button kali
        btn_kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Angka pertama
                sAngka1 = Angka1.getText().toString();
                dAngka1 = Double.parseDouble(sAngka1);
                // Angka kedua
                sAngka2 = Angka2.getText().toString();
                dAngka2 = Double.parseDouble(sAngka2);
                // hasil
                dHasil = dAngka1 * dAngka2;
                Hasil.setText("" +dHasil);
            }
        });
        // button kali
        btn_bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Angka pertama
                sAngka1 = Angka1.getText().toString();
                dAngka1 = Double.parseDouble(sAngka1);
                // Angka kedua
                sAngka2 = Angka2.getText().toString();
                dAngka2 = Double.parseDouble(sAngka2);
                // hasil
                dHasil = dAngka1 / dAngka2;
                Hasil.setText("" +dHasil);
            }
        });

    }
}