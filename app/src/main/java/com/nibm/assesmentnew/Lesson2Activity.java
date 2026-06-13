package com.nibm.assesmentnew;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Lesson2Activity extends AppCompatActivity {

    EditText name, email, mobile;
    Button btnSubmit, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson2);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        mobile = findViewById(R.id.mobile);

        btnSubmit = findViewById(R.id.btnSubmit);
        btnClear = findViewById(R.id.btnClear);

        btnSubmit.setOnClickListener(v -> {

            Intent intent = new Intent(Lesson2Activity.this, DisplayActivity.class);

            intent.putExtra("name", name.getText().toString());
            intent.putExtra("email", email.getText().toString());
            intent.putExtra("mobile", mobile.getText().toString());

            startActivity(intent);

        });

        btnClear.setOnClickListener(v -> {

            name.setText("");
            email.setText("");
            mobile.setText("");

        });

    }
}