package com.application.week3application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Todo Step1: Button Variable

    Button myButton, anotherButton;
    EditText myEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Todo Step 2: Button Link to its id
        myButton = findViewById(R.id.button);
        myEditText = findViewById(R.id.editTextTextPersonName);
        anotherButton = findViewById(R.id.button2);



        //Todo Step 3: Button OnClick Listener
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Hello World!", Toast.LENGTH_SHORT).show();

                String valueFromEditText = myEditText.getText().toString();


                Intent myIntent = new Intent(MainActivity.this, SecondActivity.class);
//                myIntent.putExtra("my_value","SIT305");
                myIntent.putExtra("my_value", valueFromEditText);
                startActivity(myIntent);


            }
        });

        anotherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.deakin.edu.au/"));
                startActivity(i);

                Uri number = Uri.parse("tel:5551234");
                Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
                startActivity(callIntent);
            }
        });




    }
}