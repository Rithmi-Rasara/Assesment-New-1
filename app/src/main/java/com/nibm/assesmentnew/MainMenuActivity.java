package com.nibm.assesmentnew;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenuActivity extends AppCompatActivity {

    Button button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);

        button1.setOnClickListener(v -> {
            Intent intent = new Intent(MainMenuActivity.this, Lesson1Activity.class);
            startActivity(intent);
        });

        button2.setOnClickListener(v -> {
            Intent intent = new Intent(MainMenuActivity.this, Lesson2Activity.class);
            startActivity(intent);
        });

        button3.setOnClickListener(v -> {
            Intent intent = new Intent(MainMenuActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}