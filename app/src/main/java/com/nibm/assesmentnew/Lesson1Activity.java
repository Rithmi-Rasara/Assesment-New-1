package com.nibm.assesmentnew;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Lesson1Activity extends AppCompatActivity {

    EditText editTextName;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson1);

        editTextName = findViewById(R.id.editTextName);
        btnSubmit = findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name = editTextName.getText().toString();

                if (name.isEmpty()) {
                    Toast.makeText(Lesson1Activity.this,
                            "Please enter your name",
                            Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Lesson1Activity.this,
                            "Hello " + name,
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}