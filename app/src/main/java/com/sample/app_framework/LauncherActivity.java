package com.sample.app_framework;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sample.app_framework.activity.MainActivity;

public class LauncherActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
        //延迟三秒发送请求
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //启动主页面
                Intent intent = new Intent(LauncherActivity.this, MainActivity.class);
                startActivity(intent);
                //关闭页面
                finish();
            }
        }, 1000);

    }
}
