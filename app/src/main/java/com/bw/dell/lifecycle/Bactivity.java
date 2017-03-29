package com.bw.dell.lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by dell on 2017/3/29.
 */

public class Bactivity extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        Log.e("lxh","这是B页面的onCreate方法");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bactivity);
        Button fh = (Button) findViewById(R.id.fh);
        fh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bactivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
        Button xh = (Button) findViewById(R.id.xh);
        xh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        Log.e("lxh","这是B页面的onStart方法");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e("lxh","这是B页面的onResume方法");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.e("lxh","这是B页面的onPause方法");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e("lxh","这是B页面的onStop方法");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e("lxh","这是B页面的onDestroy方法");
        super.onDestroy();
    }

    @Override
    protected void onRestart() {
        Log.e("lxh","这是B页面的onRestart方法");
        super.onRestart();
    }
}
