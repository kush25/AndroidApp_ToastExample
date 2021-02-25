package com.example.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    protected Button myButton;
    String myString = "This is Toast";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myButton = (Button)findViewById(R.id.buttonId);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),myString,Toast.LENGTH_LONG).show();
            }
        });


    }


    public void displayToast(View view){

        Toast.makeText(this,"Message Sent",Toast.LENGTH_LONG).show();

    }


    public void displayMessage(View view){


        Toast toast = Toast.makeText(getApplicationContext(),"Welcome Kush",Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP,0,0);
        toast.show();

    }
}