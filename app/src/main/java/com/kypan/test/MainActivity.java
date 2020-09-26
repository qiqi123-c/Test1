package com.kypan.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button mGuanggao,mRun,mStudy,mSecond,mNull,mShoeye,mLuntan,mTongxun,mGeren;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mGuanggao = (Button) findViewById(R.id.btn_guanggao);//找到
        mGuanggao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到Button页面
                Intent intent = new Intent(MainActivity.this, EmptyActivity.class);
                startActivity(intent);

            }
        });
        mRun = (Button) findViewById(R.id.btn_run);//找到
        mRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到Button页面
                Intent intent = new Intent(MainActivity.this, EmptyActivity.class);
                startActivity(intent);

            }
        });
        mStudy = (Button) findViewById(R.id.btn_study);//找到
        mStudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到Button页面
                Intent intent = new Intent(MainActivity.this, EmptyActivity.class);
                startActivity(intent);

            }
        });
        mSecond = (Button) findViewById(R.id.btn_second);//找到
        mSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到Button页面
                Intent intent = new Intent(MainActivity.this, SecondSellActivity.class);
                startActivity(intent);

            }
        });
        mNull = (Button) findViewById(R.id.btn_null);//找到
        mNull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到Button页面
                Intent intent = new Intent(MainActivity.this, EmptyActivity.class);
                startActivity(intent);

            }
        });
        mShoeye = (Button) findViewById(R.id.btn_shouye);//找到
        mShoeye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到Button页面
                Intent intent = new Intent(MainActivity.this, EmptyActivity.class);
                startActivity(intent);

            }
        });
        mLuntan = (Button) findViewById(R.id.btn_luntan);//找到
        mLuntan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到Button页面
                Intent intent = new Intent(MainActivity.this, EmptyActivity.class);
                startActivity(intent);

            }
        });
        mTongxun = (Button) findViewById(R.id.btn_tongxun);//找到
        mTongxun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到Button页面
                Intent intent = new Intent(MainActivity.this, EmptyActivity.class);
                startActivity(intent);

            }
        });
        mGeren = (Button) findViewById(R.id.btn_geren);//找到
        mGeren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到Button页面
                Intent intent = new Intent(MainActivity.this, EmptyActivity.class);
                startActivity(intent);

            }
        });
    }
}