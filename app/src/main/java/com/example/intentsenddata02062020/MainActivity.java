package com.example.intentsenddata02062020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mBtnSendString , mBtnSendArray , mBtnSendObject;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnSendString = findViewById(R.id.buttonSendString);
        mBtnSendArray = findViewById(R.id.buttonSendArray);
        mBtnSendObject = findViewById(R.id.buttonSendObject);

        mBtnSendString.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra(AppConstant.KEY_CHUOI,"Hello main 2");
                startActivity(intent);
            }
        });
        mBtnSendArray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int[] arrayNums = {1,2,3,4,5,6,7,8,9,10};
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra(AppConstant.KEY_ARRAY,arrayNums);
                startActivity(intent);
            }
        });
        mBtnSendObject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sinhvien sinhvien = new Sinhvien();
                sinhvien.age = 25;
                sinhvien.name = "Nguyen Van A";
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra(AppConstant.KEY_OBJECT,sinhvien);
                startActivity(intent);
            }
        });
    }
}