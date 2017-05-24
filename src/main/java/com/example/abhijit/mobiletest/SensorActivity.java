package com.example.abhijit.mobiletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SensorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.sen_name);
        setContentView(R.layout.activity_sensor);
    }
}
