package com.example.mobilebank.ui.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.mobilebank.R;

public class Electricity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electricity);
        setTitle("缴纳电费");
    }
}