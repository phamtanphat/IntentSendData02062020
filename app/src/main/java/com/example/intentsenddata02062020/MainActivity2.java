package com.example.intentsenddata02062020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

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
//        Intent intent = getIntent();
//        if (intent != null) {
//            int[] array = intent.getIntArrayExtra(AppConstant.KEY_ARRAY);
//            Log.d("BBB",array.length + "");
//        }
        // 3 : Nhan dang object(Serializable)
        Intent intent = getIntent();
        if (intent != null) {
            ArrayList<Sinhvien> sinhvien = (ArrayList<Sinhvien>) intent.getSerializableExtra(AppConstant.KEY_OBJECT);
            Log.d("BBB",sinhvien.size() + "");
        }
    }
}