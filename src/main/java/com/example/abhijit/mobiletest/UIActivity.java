package com.example.abhijit.mobiletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class UIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.ui_name);
        setContentView(R.layout.activity_ui);
    }
}
