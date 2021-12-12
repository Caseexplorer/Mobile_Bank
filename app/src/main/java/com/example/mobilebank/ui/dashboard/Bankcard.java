package com.example.mobilebank.ui.dashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.mobilebank.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bankcard extends AppCompatActivity {

    private ListView listView;
    private SimpleAdapter adapter;
    private List<Map<String,Object>>list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bankcard);
        setTitle("选择账户");

        listView = findViewById(R.id.mainListView2);
        list = new ArrayList<>();
        adapter = new SimpleAdapter(this,a(),R.layout.item,new String[]{"图片","文字"},new int []{R.id.itemImageView1,R.id.itemTextView1});
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0)
                {
                    Intent intent = new Intent(Bankcard.this,Cardfee.class);
                    startActivity(intent);
                }

            }
        });

    }

    private List<Map<String,Object>>a()
    {
        Map<String,Object>map1 = new HashMap<String,Object>();
        map1.put("图片",R.drawable.bankcard);
        map1.put("文字","长城电子借记卡");
        list.add(map1);
        return list;
    }
}