package com.example.appbasicphrase;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    public void Play(View view)
    {
        if(view.getTag().toString().equalsIgnoreCase("areyoudone"))
        {
            mediaPlayer=MediaPlayer.create(this,R.raw.areyoudone);

        }
        else if(view.getTag().toString().equalsIgnoreCase("areyoumad"))
        {
            mediaPlayer=MediaPlayer.create(this,R.raw.areyoumad);

        }
        else if(view.getTag().toString().equalsIgnoreCase("goodjob"))
        {
            mediaPlayer=MediaPlayer.create(this,R.raw.goodjob);

        }
        else if(view.getTag().toString().equalsIgnoreCase("goodluck"))
        {
            mediaPlayer=MediaPlayer.create(this,R.raw.goodluck);

        }
       else if(view.getTag().toString().equalsIgnoreCase("goodmorning"))
        {
            mediaPlayer=MediaPlayer.create(this,R.raw.goodmorning);

        }

        else if(view.getTag().toString().equalsIgnoreCase("hello"))
        {
            mediaPlayer=MediaPlayer.create(this,R.raw.hello);

        }

        else if(view.getTag().toString().equalsIgnoreCase("howareyou"))
        {
            mediaPlayer=MediaPlayer.create(this,R.raw.howareyou);

        }

        else if(view.getTag().toString().equalsIgnoreCase("welcome"))
        {
            mediaPlayer=MediaPlayer.create(this,R.raw.welcome);

        }

        mediaPlayer.start();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}