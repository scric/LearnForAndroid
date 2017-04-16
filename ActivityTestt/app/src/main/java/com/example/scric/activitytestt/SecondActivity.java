package com.example.scric.activitytestt;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return", "Hello FirstActivity");
        setResult(RESULT_OK, intent);
        Toast.makeText(SecondActivity.this, "返回键被你激活啦.", Toast.LENGTH_SHORT).show();
        finish();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

//        final Intent intent = getIntent();
//        String data = intent.getStringExtra("extra_data");
//        Log.d("SecondActivity", data);

        Button button = (Button) findViewById(R.id.button_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, "说了不干嘛你还碰,是不是喜欢我啊?", Toast.LENGTH_SHORT).show();
            }
        });

        Button button2 = (Button) findViewById(R.id.button_3);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, "还真的给我打电话, 你是不是对我有意思啊",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:13026360905"));
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.button_4);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, "发出去你会后悔的", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                //发送给电话号码为 13026360905 的人
                intent.setData(Uri.parse("smsto:13026360905"));
                //添加短信内容
                intent.putExtra("sms_body", "张大星真的太帅了");
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.button_5);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.putExtra("data_return", "Hello FirstActivity");
                setResult(RESULT_OK, intent1);
                Toast.makeText(SecondActivity.this, "这是一个测试", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
