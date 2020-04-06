package com.krishang.braintester;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;

public class game extends AppCompatActivity {

    TextView tvResult2, tvResult;
    Button btnReplay;
    MediaPlayer mp,punch,click,winning,vibration;
    int score=0;
    int q=0;

    public final int[] idArray={R.id.btn1,R.id.btn2,R.id.btn3,R.id.btn4,R.id.btn5,R.id.btn6,R.id.btn7,R.id.btn8,R.id.btn9,R.id.btn10,R.id.btn11,R.id.btn12,R.id.btn13,R.id.btn14,R.id.btn15,R.id.btn16,R.id.btn17,R.id.btn18,R.id.btn19};
    Button[] btn=new Button[idArray.length];

    @Override
    public void onBackPressed() {

        super.onBackPressed();
        mp.stop();
        punch.stop();
    }

    @Override
    public void onPause() {
        super.onPause();
        this.finish();
        mp.stop();
        punch.stop();
    }

    @Override
    public void onStop() {
        super.onStop();
        finish();
        mp.stop();
        punch.stop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        punch=MediaPlayer.create(game.this, R.raw.punch);
        vibration=MediaPlayer.create(game.this, R.raw.vibration);

        btnReplay=findViewById(R.id.btnReplay);
        btnReplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                recreate();
            }
        });

        for (int m = 0; m <idArray.length; m++) {

            btn[m] = ((Button) findViewById(idArray[m]));
        }
        tvResult2 = findViewById(R.id.tvResult2);
        tvResult = findViewById(R.id.tvResult);
        Intent intent=new Intent();
        mp=MediaPlayer.create(game.this, R.raw.timerclick);
        winning=MediaPlayer.create(game.this, R.raw.winning);
        CountDownTimer Mycountdowntimer = new CountDownTimer(10000,1000) {
            @Override
            public void onTick(long l) {
                tvResult2.setText("Time Left : " + l/1000);
                mp.start();
            }

            @Override
            public void onFinish() {
                punch.start();
                mp.stop();

                btn[1].setBackgroundColor(Color.DKGRAY);
                btn[0].setBackgroundColor(Color.LTGRAY);
                for (int l=0;l<19;l+=3){
                    btn[l].setBackgroundColor(Color.DKGRAY);

                }
                for (int l=1;l<19;l+=3){
                    btn[l].setBackgroundColor(Color.LTGRAY);

                }
                for (int l=2;l<19;l+=3){
                    btn[l].setBackgroundColor(Color.GRAY);

                }

                String[] str={"red","green","blue","purple"};
                Collections.shuffle(Arrays.asList(str));

                if(str[0].equals("red")){
                    tvResult2.setText(("CHOOSE ALL RED TILES"));
                    int i=0;
                    btn[0].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[1].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[2].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[3].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[5].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[6].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[7].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[8].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[0].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[9].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[10].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[11].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[12].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[13].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[15].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[16].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[17].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[14].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });

                    btn[4].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {


                            if(btn[4].isPressed()){
                                btn[4].setBackgroundColor(Color.GREEN);
                                btn[4].setBackgroundColor(Color.GREEN);
                                Toast.makeText(game.this, "Thats Correct!", Toast.LENGTH_SHORT).show();
                                winning.start();

                                    score++;
                                    tvResult.setText("SCORE IS : " + score);
                                    btn[4].setEnabled(false);
                                if(score==2)
                                    Toast.makeText(game.this, "Congo! You Had Selected All The Tiles", Toast.LENGTH_SHORT).show();
                                else
                                    Toast.makeText(game.this, "More Tiles To Go", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });

                    btn[18].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(btn[18].isPressed()){
                                btn[18].setBackgroundColor(Color.GREEN);
                                btn[18].setBackgroundColor(Color.GREEN);
                                Toast.makeText(game.this, "Thats Correct", Toast.LENGTH_SHORT).show();
                                winning.start();

                                    score++;
                                    tvResult.setText("SCORE IS : " + score);
                                btn[18].setEnabled(false);
                                if(score==2)
                                    Toast.makeText(game.this, "Congo! You Had Selected All The Tiles", Toast.LENGTH_SHORT).show();
                                else
                                    Toast.makeText(game.this, "More Tiles To Go", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });


                }

                else if(str[0].equals("blue")){

                    tvResult2.setText(("CHOOSE ALL BLUE TILES"));
                    btn[0].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            if(btn[0].isPressed()){
                                btn[0].setBackgroundColor(Color.GREEN);
                                btn[0].setBackgroundColor(Color.GREEN);
                                Toast.makeText(game.this, "Thats Correct!", Toast.LENGTH_SHORT).show();
                                winning.start();
                                score++;
                                tvResult.setText("SCORE IS : "+score);
                                btn[0].setEnabled(false);
                                if(score==4)
                                    Toast.makeText(game.this, "Congo! You Had Selected All The Tiles", Toast.LENGTH_SHORT).show();
                                else
                                    Toast.makeText(game.this, "More Tiles To Go", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    btn[2].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(btn[2].isPressed()){
                                btn[2].setBackgroundColor(Color.GREEN);
                                btn[2].setBackgroundColor(Color.GREEN);
                                Toast.makeText(game.this, "Thats Correct", Toast.LENGTH_SHORT).show();
                                winning.start();
                                score++;
                                tvResult.setText("SCORE IS : "+score);
                                btn[2].setEnabled(false);
                                if(score==4)
                                    Toast.makeText(game.this, "Congo! You Had Selected All The Tiles", Toast.LENGTH_SHORT).show();
                                else
                                    Toast.makeText(game.this, "More Tiles To Go", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    btn[16].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(btn[16].isPressed()){
                                btn[16].setBackgroundColor(Color.GREEN);
                                btn[16].setBackgroundColor(Color.GREEN);
                                Toast.makeText(game.this, "Thats Correct!", Toast.LENGTH_SHORT).show();
                                winning.start();
                                score++;
                                tvResult.setText("SCORE IS : "+score);
                                btn[16].setEnabled(false);
                                if(score==4)
                                    Toast.makeText(game.this, "Congo! You Had Selected All The Tiles", Toast.LENGTH_SHORT).show();
                                else
                                    Toast.makeText(game.this, "More Tiles To Go", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    btn[17].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(btn[17].isPressed()){
                                btn[17].setBackgroundColor(Color.GREEN);
                                btn[17].setBackgroundColor(Color.GREEN);
                                Toast.makeText(game.this, "Thats Correct", Toast.LENGTH_SHORT).show();
                                winning.start();
                                score++;
                                tvResult.setText("SCORE IS : "+score);
                                btn[17].setEnabled(false);
                                if(score==4)
                                    Toast.makeText(game.this, "Congo! You Had Selected All The Tiles", Toast.LENGTH_SHORT).show();
                                else
                                    Toast.makeText(game.this, "More Tiles To Go", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    btn[14].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[1].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[5].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[3].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[4].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[6].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[7].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[8].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[0].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[9].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[10].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[11].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[12].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[13].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[15].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });

                    btn[18].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });


                }

                else if(str[0].equals("green")){

                    tvResult2.setText(("CHOOSE ALL GREEN TILES"));

                    btn[5].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(btn[5].isPressed()){
                                btn[5].setBackgroundColor(Color.GREEN);
                                btn[5].setBackgroundColor(Color.GREEN);
                                Toast.makeText(game.this, "Thats Correct!", Toast.LENGTH_SHORT).show();
                                winning.start();
                                score++;
                                tvResult.setText("SCORE IS : "+score);
                                btn[5].setEnabled(false);
                                if(score==2)
                                    Toast.makeText(game.this, "Congo! You Had Selected All The Tiles", Toast.LENGTH_SHORT).show();
                                else
                                    Toast.makeText(game.this, "More Tiles To Go", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    btn[14].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(btn[14].isPressed()){
                                btn[14].setBackgroundColor(Color.GREEN);
                                btn[14].setBackgroundColor(Color.GREEN);
                                Toast.makeText(game.this, "Thats Correct", Toast.LENGTH_SHORT).show();
                                winning.start();
                                score++;
                                tvResult.setText("SCORE IS : "+score);
                                btn[14].setEnabled(false);
                                if(score==2)
                                    Toast.makeText(game.this, "Congo! You Had Selected All The Tiles", Toast.LENGTH_SHORT).show();
                                else
                                    Toast.makeText(game.this, "More Tiles To Go", Toast.LENGTH_SHORT).show();

                            }
                        }
                    });

                    btn[0].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[1].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[2].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[3].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[4].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[6].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[7].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[8].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[0].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[9].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[10].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[11].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[12].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[13].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[15].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[16].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[17].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[18].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });

                }

                else if(str[0].equals("purple" )){
                    tvResult2.setText(("CHOOSE ALL PURPLE TILES"));

                    btn[1].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(btn[1].isPressed()){
                                btn[1].setBackgroundColor(Color.GREEN);
                                btn[1].setBackgroundColor(Color.GREEN);
                                Toast.makeText(game.this, "Thats Correct!", Toast.LENGTH_SHORT).show();
                                winning.start();
                                score++;
                                tvResult.setText("SCORE IS : "+score);
                                btn[1].setEnabled(false);
                                if(score==4)
                                    Toast.makeText(game.this, "Congo! You Had Selected All The Tiles", Toast.LENGTH_SHORT).show();
                                else
                                    Toast.makeText(game.this, "More Tiles To Go", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    btn[3].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(btn[3].isPressed()){
                                btn[3].setBackgroundColor(Color.GREEN);
                                btn[3].setBackgroundColor(Color.GREEN);
                                Toast.makeText(game.this, "Thats Correct", Toast.LENGTH_SHORT).show();
                                winning.start();
                                score++;
                                tvResult.setText("SCORE IS : "+score);
                                btn[3].setEnabled(false);
                                if(score==4)
                                    Toast.makeText(game.this, "Congo! You Had Selected All The Tiles", Toast.LENGTH_SHORT).show();
                                else
                                    Toast.makeText(game.this, "More Tiles To Go", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    btn[7].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            if(btn[7].isPressed()){
                                btn[7].setBackgroundColor(Color.GREEN);
                                btn[7].setBackgroundColor(Color.GREEN);
                                Toast.makeText(game.this, "Thats Correct!", Toast.LENGTH_SHORT).show();
                                winning.start();
                                score++;
                                tvResult.setText("SCORE IS : "+score);
                                btn[7].setEnabled(false);
                                if(score==4)
                                    Toast.makeText(game.this, "Congo! You Had Selected All The Tiles", Toast.LENGTH_SHORT).show();
                                else
                                    Toast.makeText(game.this, "More Tiles To Go", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    btn[13].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            if(btn[13].isPressed()){
                                btn[13].setBackgroundColor(Color.GREEN);
                                btn[13].setBackgroundColor(Color.GREEN);
                                Toast.makeText(game.this, "Thats Correct", Toast.LENGTH_SHORT).show();
                                winning.start();
                                score++;
                                tvResult.setText("SCORE IS : "+score);
                                btn[13].setEnabled(false);
                                if(score==4)
                                    Toast.makeText(game.this, "Congo! You Had Selected All The Tiles", Toast.LENGTH_SHORT).show();
                                else
                                    Toast.makeText(game.this, "More Tiles To Go", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    btn[0].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });

                    btn[2].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[4].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[5].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[6].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[8].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[9].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[10].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[11].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[12].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[14].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[15].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[16].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });
                    btn[17].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });

                    btn[18].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            vibration.start();
                        }
                    });


                }
            }
        }.start();
    }
}



