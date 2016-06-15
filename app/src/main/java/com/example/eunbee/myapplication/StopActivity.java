package com.example.eunbee.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Eun bee on 2016-06-15.
 */
public class StopActivity extends AppCompatActivity implements View.OnClickListener{
    Button playing, restart, end;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop);
        playing = (Button)findViewById(R.id.playing);
        restart = (Button)findViewById(R.id.restart);
        end = (Button)findViewById(R.id.end);
    }
    @Override
    public void onClick(View v) {

    }
}
