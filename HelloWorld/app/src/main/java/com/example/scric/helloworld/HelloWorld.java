package com.example.scric.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class HelloWorld extends AppCompatActivity {

//    private static final String TAG = "HelloWorld";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        Log.d("HelloWorld", "onCreate execute");
    }
}
