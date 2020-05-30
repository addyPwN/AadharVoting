package com.addybuilds.aadharvoting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    private Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main2);
        b1 = (Button)findViewById(R.id.b45);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            { openActivity3();}});

    }
    public void openActivity3()
    {
        Intent i = new Intent(Activity2.this, Activity3.class);
        startActivity(i);
        finish();
    }
}
