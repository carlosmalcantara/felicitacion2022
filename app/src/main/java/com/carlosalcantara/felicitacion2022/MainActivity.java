package com.carlosalcantara.felicitacion2022;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView titulo = findViewById(R.id.textView2);
        TextView titulo1 = findViewById(R.id.textView3);
        TextView titulo2 = findViewById(R.id.textView4);

        Animation animacion = AnimationUtils.loadAnimation(this, R.anim.anim);
        titulo.startAnimation(animacion);

        Animation animacion1 = AnimationUtils.loadAnimation(this, R.anim.slideup);
        titulo1.startAnimation(animacion1);
        titulo2.startAnimation(animacion1);


        MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.day_tripping);
        mediaPlayer.start();




    }
}