
package com.krishang.braintester;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FAQ extends AppCompatActivity {
    TextView tv1,tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_a_q);
        tv1=findViewById(R.id.tv1);
        tv2=findViewById(R.id.tv2);

        tv1.setText("\n Blocks of Tiles of Different Colours will be Displayed on the Screen for 10 seconds. Player had to try Remember colour of the Tile corresponding to their Position");
        tv2.setText(" Then all tiles converts to Gray . Now the Player had to to select tiles corresponding to the Displayed colour. If correct tile is selected score will increase and id any wrong tile is selected game will end");


    }
}
