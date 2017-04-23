package com.example.scric.uicustomviews;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


/**
 * Created by scric on 2017/4/23.
 */

public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(R.layout.title, this);//动态加载一个布局文件
        Button titleBack = (Button) findViewById(R.id.title_back);
        Button titleEdit = (Button) findViewById(R.id.title_edit);

        titleBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                ((Activity)getContext()).finish();
            }
        });

        titleEdit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "You clicked Edit button",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
