package com.example.fakecallpropremiumfree;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import java.io.*;
import java.util.*;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void random(View view) {
        android.content.Intent intent = new android.content.Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void selected(View view) {
        android.content.Intent intent = new android.content.Intent(this, FourthActivity.class);
        startActivity(intent);
    }


}