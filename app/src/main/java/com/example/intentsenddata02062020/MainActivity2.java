package com.example.intentsenddata02062020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        // 1 : Nhan du lieu dang String
//        Intent intent = getIntent();
//        if (intent != null){
//            String value = intent.getStringExtra(AppConstant.KEY_CHUOI);
//        }
        // 2: Nhan dang array
        Intent intent = getIntent();
        if (intent != null) {
            int[] array = intent.getIntArrayExtra(AppConstant.KEY_ARRAY);
            Log.d("BBB",array.length + "");
        }
    }
}