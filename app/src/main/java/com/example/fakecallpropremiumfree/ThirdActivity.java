package com.example.fakecallpropremiumfree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import java.io.*;
import java.util.*;
public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String data1;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Bundle extras = getIntent().getExtras();
        data1 = "";
        if (extras != null) {
            data1 = extras.getString("nimi");
        }
        android.widget.TextView theTextView = (android.widget.TextView) findViewById(R.id.textView);
        theTextView.setText(data1);
    }
}