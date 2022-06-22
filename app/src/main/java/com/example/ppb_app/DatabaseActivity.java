package com.example.ppb_app;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteException;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class DatabaseActivity extends AppCompatActivity {
    EditText editName, editSurname;
    TextView tvHasildata;
    DB_Controller controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database);
        editName = findViewById(R.id.editName);
        editSurname = findViewById(R.id.editSurname);
        tvHasildata = findViewById(R.id.tvHasildata);

        controller = new DB_Controller(this,"",null,1);
    }
    public void btn_click(View view){
        switch (view.getId()){
            case R.id.btnTambahdata:
                try {
                    controller.tambah_mahasiswa(editName.getText().toString(), editSurname.getText().toString());
                    Toast.makeText(DatabaseActivity.this,"Tambah Data Sukses", Toast.LENGTH_SHORT).show();
                }catch (SQLiteException e){
                    Toast.makeText(DatabaseActivity.this, "Data sudah Ada", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.btnHapusdata:

                controller.hapus_mahasiswa(editName.getText().toString());
                Toast.makeText(getApplicationContext(), "Hapus Data Sukses", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnUpdatedata:
                AlertDialog.Builder dialog = new AlertDialog.Builder(DatabaseActivity.this);
                dialog.setTitle("Masukan Nama Pertama");
                final EditText new_name = new EditText(this);
                dialog.setView(new_name);

                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        controller.edit_mahasiswa(editName.getText().toString(), new_name.getText().toString());
                    }
                });
                dialog.show();
                break;
            case R.id.btnListdata:
                controller.list_mahasiswa(tvHasildata);
                Toast.makeText(getApplicationContext(), "Melihat Keseluruhan Data...", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}