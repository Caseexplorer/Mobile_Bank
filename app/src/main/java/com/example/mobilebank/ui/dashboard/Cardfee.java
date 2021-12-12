package com.example.mobilebank.ui.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mobilebank.R;

public class Cardfee extends AppCompatActivity {

    private Button next;
    private Button choosecard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardfee);
        setTitle("校园卡缴费");

        next = findViewById(R.id.Cardnext);
        choosecard = findViewById(R.id.Cardchoose);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cardfee.this,Cardinfo.class);
                startActivity(intent);
            }
        });

        choosecard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Cardfee.this,Bankcard.class);
                startActivity(intent);
            }
        });
    }
}