package com.example.mobilebank.ui.login;


import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mobilebank.R;

public class Login_RegisterView extends AppCompatActivity
{
    private EditText numberReg, pswReg;
    private Button RegisterReg;
    private MyDatabaseHelper dbhelper;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register_view);

        init();
    }


    private void init() {
        numberReg = findViewById(R.id.numberReg);
        pswReg = findViewById(R.id.pswReg);
        RegisterReg = findViewById(R.id.RegisterReg);

        dbhelper = new MyDatabaseHelper(this, "User.db", null, 2);

        RegisterReg.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Register();
            }
        });
    }

    private void Register()
    {
        SQLiteDatabase db = dbhelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("phone_num", numberReg.getText().toString());
        values.put("psw", pswReg.getText().toString());
        db.insert("User", null, values);
        Toast.makeText(null,"注册成功", Toast.LENGTH_LONG).show();
        db.close();
    }
}