package com.addybuilds.aadharvoting;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Window;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    protected Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        b2 = findViewById(R.id.prev);
        b3 = findViewById(R.id.upcoming);
        b1 = (Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                int x;
                x=verifyAadhar();
                if(x==1)
                {openActivity2();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"AADHAAR NOT FOUND",Toast.LENGTH_LONG).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(MainActivity.this, prevtrends.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent i = new Intent(MainActivity.this, upcomingtrends.class);
                startActivity(i);
            }
        });
    }
    public int verifyAadhar()
    {
        EditText u = (EditText)findViewById(R.id.adhrDet);
        String aNo = u.getText().toString();
        if(aNo.equals("123456781234") || aNo.equals("123409876541") || aNo.equals("123456789012"))
        {
            return(1);
        }
        else
        {
            return(0);
        }
    }
    public void openActivity2()
    {
        Intent i = new Intent(MainActivity.this, fingerprint.class);
        startActivity(i);
        finish();
    }
}