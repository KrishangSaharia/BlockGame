package com.krishang.braintester;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class setting extends AppCompatActivity {
    Button btnSend;
    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        btnSend=findViewById(R.id.btnSend);
        final String message;
        if(et2.getText().toString().equals("")){
            Toast.makeText(this, "Please enter all Fields", Toast.LENGTH_SHORT).show();
            message="";
        }
        else {

            String name=et1.getText().toString().trim();
            message=et2.getText().toString().trim();

        }
        //final String message=et2.getText().toString().trim();
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(Intent.ACTION_SENDTO);
                //intent.setType("plain/text");
                //intent.setData(Uri.parse("mailto:krishangsaharia2@gmail.com"));


                //intent.putExtra(Intent.EXTRA_EMAIL, new String[]{ "mailto:krishangsaharia2@gmail.com"});
                //intent.putExtra(Intent.EXTRA_SUBJECT, "FEEDBACK");
                //intent.putExtra(Intent.EXTRA_TEXT,message);

                Intent emailIntent = new Intent(Intent.ACTION_SEND);
// The intent does not have a URI, so declare the "text/plain" MIME type
                emailIntent.setType("plain/text");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"krishangsaharia2@gmail.com"}); // recipients
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "FEEDBACK for BrainTester");
                emailIntent.putExtra(Intent.EXTRA_TEXT, et2.getText());
                //emailIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("content://path/to/email/attachment"));
                emailIntent.setType("message/rfc822");
                startActivity(emailIntent);
// You can also attach multiple items by passing an ArrayList of Uris

                //startActivity(Intent.createChooser(intent, "Choose an email client from..."));
            }
        });


    }
}
