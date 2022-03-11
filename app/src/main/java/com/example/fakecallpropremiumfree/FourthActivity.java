package com.example.fakecallpropremiumfree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.ToggleButton;

import java.io.*;
import java.util.*;
public class FourthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
    }

    public void send(View view){
        // Waiting & getting user input
        EditText aja = (EditText)findViewById(R.id.editTextTextPersonName2);
        String aika1 = aja.getText().toString();
        Float aika = Float.parseFloat(aika1) * 60000;
        android.widget.Button saved = (android.widget.Button)findViewById(R.id.button4);
        android.widget.Button invisible_button3 = (android.widget.Button)findViewById(R.id.button3);
        ToggleButton screen = (ToggleButton) findViewById(R.id.toggleButton);
        // Keeping screen on
        if(screen.isChecked()){
            getWindow().addFlags(android.view.WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        }
        saved.setVisibility(View.VISIBLE);
        invisible_button3.setVisibility(View.INVISIBLE);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                tee();
            }
        }, Math.round(aika));

    }
    // Going to call screen with specified user name
    private void tee() {
        EditText name = (android.widget.EditText) findViewById(R.id.editTextTextPersonName);
        String actual_name = name.getText().toString();
        android.content.Intent intent = new android.content.Intent(this, SecondActivity.class);
        intent.putExtra("name_user_set", actual_name);
        startActivity(intent);
    }
}