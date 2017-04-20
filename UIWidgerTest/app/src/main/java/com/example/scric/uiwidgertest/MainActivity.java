package com.example.scric.uiwidgertest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText; // 定义一个私有域
    private ImageView imageView;


    @Override
    public void onBackPressed() {
        Toast.makeText(MainActivity.this, "返回键被激活啦", Toast.LENGTH_SHORT).show();
        finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.buttonPanel);
        editText = (EditText) findViewById(R.id.edit_text);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  //点击按钮退出
//                Toast.makeText(MainActivity.this, "退出啦", Toast.LENGTH_SHORT).show();
//                finish();
                // 获取输入的数据
                switch (v.getId()) {
                    case R.id.buttonPanel:
                        String inputText = editText.getText().toString();
                        Toast.makeText(MainActivity.this, inputText, Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });

        Button button1 = (Button) findViewById(R.id.buttonPanel2);
        imageView  = (ImageView) findViewById(R.id.imag_view);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.buttonPanel2:
//                        D:\LearnForAndroid\UIWidgerTest\app\src\main\res\drawable-xhdpi\
//                        if ( == imageView.getId()) {
//                            imageView.setImageResource(R.drawable.img_2);
//                        }else imageView.setImageResource(R.drawable.img_1);
                        imageView.setImageResource(R.drawable.img_2);
                        break;
                        // 如何实现每次点击就更换一次照片 ?
                    default:
                        break;
                }
            }
        });
        Button button2 = (Button) findViewById(R.id.buttonPanel3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if (imageView.getVisibility() == View.GONE) {
                        imageView.setVisibility(View.VISIBLE);
                    }
                    else
                        imageView.setVisibility(View.GONE);
            }
        });

        Button button3 = (Button) findViewById(R.id.buttonPanel5);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("This is Dialog");
                dialog.setMessage("我可以屏蔽掉其他控件的交互能力哦");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                dialog.show();
            }
        });

        Button button4 = (Button) findViewById(R.id.buttonPanel6);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setTitle("This is ProgressDialog");
                progressDialog.setMessage("Loading....");
                progressDialog.setCancelable(true); // 如果传入 false, 则该不能通过 Back 键取消掉.
                Toast.makeText(MainActivity.this, "可以用 Back 键取消掉哦", Toast.LENGTH_SHORT).show();
                progressDialog.show();

            }
        });
    }
}
