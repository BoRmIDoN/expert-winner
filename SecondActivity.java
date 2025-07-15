package com.example.warthunder;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Получаем логин из предыдущего экрана
        String login = getIntent().getStringExtra("LOGIN");

        // Инициализация кнопок (без статистики)
        Button btnGuides = findViewById(R.id.btnGuides);
        Button btnCalculators = findViewById(R.id.btnCalculators);
        Button btnTips = findViewById(R.id.btnTips);

        // Обработчики кликов
        btnGuides.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, GuidesActivity.class);
            intent.putExtra("LOGIN", login);
            startActivity(intent);
        });

        btnCalculators.setOnClickListener(v -> {
            startActivity(new Intent(SecondActivity.this, CalculatorsActivity.class));
        });

        btnTips.setOnClickListener(v -> {
            startActivity(new Intent(SecondActivity.this, TipsActivity.class));
        });
    }
}