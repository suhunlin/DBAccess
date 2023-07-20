package com.suhun.dbaccess;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SQLiteDatabase db;
    private MyDBHelper myDBHelper;
    private TextView resultDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultDB = findViewById(R.id.result);
        myDBHelper = new MyDBHelper(this, "happyDB", null, 1);
        db = myDBHelper.getWritableDatabase();
    }

    public void quaryFun(View view){

    }
    public void insertFun(View view){

    }
    public void deleteFun(View view){

    }
    public void updateFun(View view){

    }
}