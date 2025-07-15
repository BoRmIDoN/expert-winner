package com.example.warthunder;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CalculatorsActivity extends AppCompatActivity {

    // Калькулятор репараций и доходности
    private EditText etRepairCost, etReward;
    private TextView tvResult;
    private Button btnCalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculators);

        // Инициализация элементов
        etRepairCost = findViewById(R.id.etRepairCost);
        etReward = findViewById(R.id.etReward);
        tvResult = findViewById(R.id.tvProfitResult);
        btnCalculate = findViewById(R.id.btnCalculateProfit);

        // Калькулятор доходности
        btnCalculate.setOnClickListener(v -> calculateProfit());

        // Кнопка возврата
        Button btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());
    }

    private void calculateProfit() {
        try {
            double repairCost = Double.parseDouble(etRepairCost.getText().toString());
            double reward = Double.parseDouble(etReward.getText().toString());
            double profit = reward - repairCost;

            String resultText = (profit >= 0) ?
                    "Прибыль: +" + profit + " SL" :
                    "Убыток: " + profit + " SL";

            tvResult.setText(resultText);
        } catch (NumberFormatException e) {
            tvResult.setText("Введите корректные числа!");
        }
    }
}