package com.example.eunbee.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Eun bee on 2016-06-15.
 */
public class StartActivity extends AppCompatActivity implements View.OnClickListener{
    TextView score;
    ImageButton stop,hole1,hole2,hole3;
    Button playing, restart, end;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        score = (TextView)findViewById(R.id.score);
        stop = (ImageButton)findViewById(R.id.stop);
        hole1 = (ImageButton)findViewById(R.id.hole1);
        hole2 = (ImageButton)findViewById(R.id.hole2);
        hole3 = (ImageButton)findViewById(R.id.hole3);
    }
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, StopActivity.class);
        if(v.getId()==R.id.stop)
            startActivity(intent);
    }
}
