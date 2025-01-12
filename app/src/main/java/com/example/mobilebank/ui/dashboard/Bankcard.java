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
        adapter = new SimpleAdapter(this,a(),R.layout.item2,new String[]{"图片","文字1","文字2"},new int []{R.id.itemImageView1,R.id.itemTextView1,R.id.itemTextView2});
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0)
                {
                    //设置返回的数据

                    Intent intent = new Intent();

                    intent.putExtra("data", "62320958732905 >");//edtOne.getText().toString().trim()

                    setResult(3, intent);

                    //关闭当前activity

                    finish();

                }

            }
        });


    }

    private List<Map<String,Object>>a()
    {
        Map<String,Object>map1 = new HashMap<String,Object>();
        map1.put("图片",R.drawable.bankcard);
        map1.put("文字1","长城电子借记卡");
        map1.put("文字2","62320958732905");
        list.add(map1);
        return list;
    }

    @Override
    public void onBackPressed() {

        Intent intent = new Intent();
        intent.putExtra("data", "请选择 >");//edtOne.getText().toString().trim()

        setResult(3, intent);

        //关闭当前activity

        finish();

        super.onBackPressed();
    }
}