package com.krishang.braintester;

import android.app.ActivityOptions;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView ivOn,ivOff,ivDisplay,ivPlay;
    Button btnFaq,btnSetting,btnDeveloper;
    MediaPlayer mediaplayer;
    MediaPlayer clickSound;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivDisplay=findViewById(R.id.ivDisplay);
        ivOn=findViewById(R.id.inOn);
        ivOff=findViewById(R.id.ivOff);
        ivPlay=findViewById(R.id.ivPlay);
        btnDeveloper=findViewById(R.id.btnDeveloper);
        btnFaq=findViewById(R.id.btFaq);
        btnSetting=findViewById(R.id.btnSetting);
        clickSound=MediaPlayer.create(MainActivity.this, R.raw.click2);

        btnFaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clickSound.start();
                Intent intent =new Intent(MainActivity.this, FAQ.class);
                //startActivity(intent);
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    startActivity(intent,
                            ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
                }
                else
                    startActivity(intent);
                //clickSound.stop();
            }
        });
        btnDeveloper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickSound.start();
                Intent intent =new Intent(MainActivity.this, DEVELOPER.class);
                startActivity(intent);
            }
        });

        ivPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickSound.start();
                Intent intent=new Intent(MainActivity.this, game.class);

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    startActivity(intent,
                            ActivityOptions.makeSceneTransitionAnimation(MainActivity.this).toBundle());
                }
                else
                    startActivity(intent);
            }
        });



        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickSound.start();
                Intent intent=new Intent(MainActivity.this,setting.class);
                startActivity(intent);

            }
        });


        //final int resID=getResources().getIdentifier("song.mp3", "raw", getPackageName());
        mediaplayer=MediaPlayer.create(MainActivity.this, R.raw.songsss);

        ivOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clickSound.start();
                mediaplayer.start();
                //ivOn.setBackgroundColor(Color.RED);

            }
        });
        ivOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickSound.start();
                mediaplayer.stop();
                mediaplayer=MediaPlayer.create(MainActivity.this, R.raw.songsss);


            }
        });

    }
}








