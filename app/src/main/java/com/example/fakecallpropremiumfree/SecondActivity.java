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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Bundle extras = getIntent().getExtras();
        String random_name;
        android.widget.TextView theTextView = (android.widget.TextView) findViewById(R.id.textView2);
        // If user hasn't set callers name, it will be random:
        if (extras != null) {
            random_name = extras.getString("name_user_set");
        }else{
            ArrayList<String> nimet = new ArrayList<>(Arrays.asList("Andrew", "Thomas", "George", "James", "Oliver", "Jack", "Oscar", "William"));
            Random r = new Random();
            random_name = nimet.get(r.nextInt(nimet.size()));

        }
        name = random_name;
        theTextView.setText(random_name);

        // Playing phone call sound
        if(player == null){
            player = MediaPlayer.create(SecondActivity.this, R.raw.ring);
        }
        player.start();
    }
    // accepting call
    public void accept(View view){
        audio_off();
        android.content.Intent intent = new android.content.Intent(this, ThirdActivity.class);
        intent.putExtra("name",name);
        startActivity(intent);
    }
   // declining call
    public void decline(View view){
        audio_off();
        android.content.Intent intent = new android.content.Intent(this, MainActivity.class);
        startActivity(intent);
    }
    // turning off phone call sound
    private void audio_off(){
        if (player != null && player.isPlaying()) {
            player.stop();
            player.release();
            player = null;
        }
    }

}