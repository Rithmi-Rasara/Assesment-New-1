package com.nibm.assesmentnew;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    TextView txtName, txtEmail, txtMobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        txtName = findViewById(R.id.txtName);
        txtEmail = findViewById(R.id.txtEmail);
        txtMobile = findViewById(R.id.txtMobile);

        String name = getIntent().getStringExtra("name");
        String email = getIntent().getStringExtra("email");
        String mobile = getIntent().getStringExtra("mobile");

        txtName.setText(name);
        txtEmail.setText(email);
        txtMobile.setText(mobile);

    }
}