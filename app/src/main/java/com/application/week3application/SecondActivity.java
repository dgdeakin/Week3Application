package com.application.week3application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView myTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        myTextView = findViewById(R.id.textView);

        Intent valueFromIntent = getIntent();
        String value = valueFromIntent.getStringExtra("my_value");


        myTextView.setText(value);
        Toast.makeText(SecondActivity.this, value, Toast.LENGTH_SHORT).show();



    }
}