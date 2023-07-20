package com.suhun.dbaccess;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private SQLiteDatabase db;
    private MyDBHelper myDBHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDBHelper = new MyDBHelper(this, "happyDB", null, 1);
        db = myDBHelper.getWritableDatabase();
    }
}