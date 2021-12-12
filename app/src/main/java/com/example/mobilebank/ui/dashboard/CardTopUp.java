package com.example.mobilebank.ui.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mobilebank.R;

public class CardTopUp extends AppCompatActivity {

    private Button starttop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_top_up);
        setTitle("校园卡");

        starttop = findViewById(R.id.cardstart);

        starttop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                starttop.setVisibility(View.GONE);

            }
        });
    }
}