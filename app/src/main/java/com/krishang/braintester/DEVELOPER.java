package com.krishang.braintester;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DEVELOPER extends AppCompatActivity {

    ImageView ivCall,ivMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d_e_v_e_l_o_p_e_r);
        ivMail=findViewById(R.id.ivMail);
        ivCall=findViewById(R.id.ivCall);


        ivCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:9521152961"));
                startActivity(intent);


            }
        });
        ivMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:krishangsaharia2@gmail.com"));
                startActivity(emailIntent);
            }
        });

    }
}
