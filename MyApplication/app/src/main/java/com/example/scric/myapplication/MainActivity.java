package com.example.scric.myapplication;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int attr  = android.R.attr.statusBarColor;
        int[] TEMP_ARRAY = new int[1];
        TEMP_ARRAY[0] = attr;
        TypedArray a = this.obtainStyledAttributes(null, TEMP_ARRAY);
        try {
            int resourceId = a.getResourceId(0, 0);
//            String s = String.valueOf(resourceId);
//            Log.d("resourceId",s);
            System.out.println(resourceId);
        }
        finally
        {
            a.recycle();
        }

    }

}
