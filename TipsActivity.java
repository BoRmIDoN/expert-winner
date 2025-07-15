package com.example.warthunder;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class TipsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        // Создаем список советов
        ArrayList<String> tips = new ArrayList<>();
        tips.add("Совет 1: Отключите траву в настройках прицела для лучшей видимости противника:\n" +
                "                \"1. Откройте Настройки → Основные параметры → Танковые боевые настройки \n" +
                "                \"2. Найдите параметр 'Трава в прицеле'\n" +
                "                \"3. Установите значение 'Нет'");
        tips.add("Совет 2: Поставьте в настройках дальномер - это поможет точно определить расстояние до противника:\n" +
                "                \"1. Откройте Управление → Танк → Разное \n" +
                        "                \"2. Найдите параметр 'Дальномер'\n" +
                        "                \"3. Установите значение на любую удобную для вас клавишу");
        tips.add("Совет 3: Настройка грамотного звука в игре. Это даст вам небольшое преимущество перед другими игроками:\n" +
                "                \"1. Откройте Настройки → Звуки → Ставим на минимальное значение 'Громкость своего двигателя'  \n" +
                "                \"2. Далее находим 'Громкость двигателя других игроков' и ставим на максимум\n" +
                "                \"3. Также советую убавить остальные параметры звука для большей слышимости противника ");


        // Настраиваем простой ListView
        ListView tipsListView = findViewById(R.id.tipsListView);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                tips
        );
        tipsListView.setAdapter(adapter);

        // Кнопка назад
        findViewById(R.id.btnBack).setOnClickListener(v -> finish());
    }
}