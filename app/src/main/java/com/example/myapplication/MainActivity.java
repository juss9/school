package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.number.IntegerWidth;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] countries = { "~ПОНЕДЕЛЬНИК~", "Математика", "Русский язык", "Химия",
            "~ВТОРНИК~", "Физика","География","Информатика",
            "~СРЕДА~","Биология","Физра","Литература",
            "~ЧЕТВЕРГ~","Русский язык","Английский язык","Литература",
            "~ПЯТНИЦА~","Химия","Биология","Математика","Математика"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView list = findViewById(R.id.countriesList);

        // создаем адаптер
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, countries);

        // устанавливаем для списка адаптер
        list.setAdapter(adapter);

        //переход на страницу с оценками
        Button buttonRating = findViewById(R.id.butNum);
        buttonRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextScreenRating();
            }
        });

        //переход на страницу с домашним заданием
        Button buttonHw = findViewById(R.id.butHW);
        buttonHw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextScreenHomeWork();
            }
        });

    }

    private void nextScreenRating(){
        Intent intent = new Intent(this, RatingActivity.class);
        startActivity(intent);
    }

    private void nextScreenHomeWork(){
        Intent intent = new Intent(this, HomeWorkActivity.class);
        startActivity(intent);
    }
}