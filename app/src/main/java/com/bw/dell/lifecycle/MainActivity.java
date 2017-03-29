package com.bw.dell.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("lxh","这是A页面的onCreate方法");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Bactivity.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onStart() {
        Log.e("lxh","这是A页面的onStart方法");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e("lxh","这是A页面的onResume方法");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.e("lxh","这是A页面的onPause方法");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e("lxh","这是A页面的onStop方法");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e("lxh","这是A页面的onDestroy方法");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.e("lxh","这是A页面的onRestart方法");
        super.onRestart();
    }
}
