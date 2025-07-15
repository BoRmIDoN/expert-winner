package com.example.warthunder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etLogin = findViewById(R.id.etLogin);
        EditText etPassword = findViewById(R.id.etPassword);
        Button btnRegister = findViewById(R.id.btnRegister);
        TextView tvStatus = findViewById(R.id.tvStatus);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = etLogin.getText().toString().trim();
                String password = etPassword.getText().toString().trim();

                if (login.isEmpty() || password.isEmpty()) {
                    tvStatus.setText("Введите логин и пароль!");
                    return;
                }

                if (password.length() < 6) {
                    tvStatus.setText("Пароль должен быть не менее 6 символов!");
                    return;
                }

                // Переход на SecondActivity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("LOGIN", login);  // Передаём логин в новое окно
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Добро пожаловать, " + login + "!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}