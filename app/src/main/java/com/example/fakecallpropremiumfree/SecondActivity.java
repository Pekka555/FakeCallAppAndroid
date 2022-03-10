package com.example.fakecallpropremiumfree;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import java.io.*;
import java.util.*;

public class SecondActivity extends AppCompatActivity {
    MediaPlayer player;
    public String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int width  = android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels;
        int height = android.content.res.Resources.getSystem().getDisplayMetrics().heightPixels;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle extras = getIntent().getExtras();
        String random;
        android.widget.TextView theTextView = (android.widget.TextView) findViewById(R.id.textView2);
        if (extras != null) {
            random = extras.getString("nimii");
        }else{
            ArrayList<String> nimet = new ArrayList<>(Arrays.asList("Andrew", "Thomas", "George", "James", "Oliver", "Jack", "Oscar", "William"));
            Random r = new Random();
            random = nimet.get(r.nextInt(nimet.size()));

        }
        name = random;
        theTextView.setText(random);

        if(player == null){
            player = MediaPlayer.create(SecondActivity.this, R.raw.ring);
        }
        player.start();
    }

    public void third(View view){
        if (player != null && player.isPlaying()) {
            player.stop();
            player.release();
            player = null;
        }
        android.content.Intent intent = new android.content.Intent(this, ThirdActivity.class);
        intent.putExtra("nimi",name);
        startActivity(intent);
    }

    public void batman(View view){
        if (player != null && player.isPlaying()) {
            player.stop();
            player.release();
            player = null;
        }
        android.content.Intent intent = new android.content.Intent(this, MainActivity.class);
        startActivity(intent);
    }


}