package com.example.ppb_app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText EditName, EditPassword;
    private Button btnLogin;
    String user, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditName = findViewById(R.id.EditName);
        EditPassword = findViewById(R.id.EditPassword);
        btnLogin = findViewById(R.id.btnLogin);

        //action login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //call login function
                doLogin();
                finish();
            }
        });
    }
    //login function
    private void doLogin() {
        user = EditName.getText().toString();
        pass = EditPassword.getText().toString();

        if (user.equals("admin") && pass.equals("admin123")){
            Toast.makeText(getApplicationContext(),"Login Success...", Toast.LENGTH_LONG).show();
            Intent access_dashboard = new Intent(LoginActivity.this, DashboardActivity.class);
            startActivity(access_dashboard);
        }
        else {
            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this);
            builder.setMessage("Username atau Password Tidak Sesuai").setNegativeButton("Ulangi lagi", null).create().show();
        }
    }
}