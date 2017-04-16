package com.example.scric.activitytestt;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("FirstActivity", returnedData);
                }
                break;
            default:
                Toast.makeText(FirstActivity.this, "真的要退出啦", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);  // 通过 getMenuInflater() 方法得到 MenuInflater 对象, 再调用它的 inflate() 方法给当前活动创建菜单
        // inflate() 方法接收两个参数, 第一个参数用于指定我们通过哪一个资源文件创建菜单 . 第二个参数用于指定我们的菜单项将添加到哪一个 Menu 对象中.
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "你选择了添加", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "你选择了删除", Toast.LENGTH_SHORT).show();
                break;
            case R.id.exploer_item:
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://zxabs.xyz"));
                Toast.makeText(FirstActivity.this, "你对我有意思?", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                break;
            case R.id.exit_item:
                Toast.makeText(this,"你选择了退出",Toast.LENGTH_SHORT).show();
                finish();
            default:
        }
        return true;
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
//        int n = 0;
//        while (true)
//        {
//            if (n <= 3)
//            {
//                n += 1;
                Button button1 = (Button) findViewById(R.id.buttonPanel); // 通过 findViewById() 方法获取到在布局文件中(first_layout.mxl)中定义的元素, 这里传入 R.id.buttonPane1, 来获得按钮的实例. 它返回的是一个 View 对象.所以我们要向下转型成 Button 对象.
                button1.setOnClickListener(new View.OnClickListener()
                { // 调用 setOnClickListener() 方法 为按钮注册一个监听器, 当点击按钮时, 就会执行监听器中的 onClick() 方法. 所以弹出 Toast 的功能要在 onClick() 中重写
                    @Override
                    public void onClick(View v) {
//                        Toast.makeText(FirstActivity.this, "瞎碰啥,再碰剁手哦" + ", 你还有" +  " 次机会", Toast.LENGTH_SHORT).show();
//                        Intent intent = new Intent(FirstActivity.this, SecondActivity.class); // 这是显式 Intent
                        Intent intent = new Intent("com.example.activitytest.ACTION_START");  // 这是隐式 Intent
                        intent.addCategory("com.example.activitytest.MY_CATEGORY");
                        startActivity(intent);
                    }
                });
//            }
//            else
//                Toast.makeText(FirstActivity.this,"退出啦",Toast.LENGTH_SHORT).show();
//                finish();
//                break;
//        }
        Button button2 = (Button) findViewById(R.id.buttonPane2);
        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this, "真别碰, 这是退出啦", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        Button button3 = (Button) findViewById(R.id.buttonPane3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(FirstActivity.this,"你还是真的很调皮啊",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.buttonPane4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String data = "Hello SecondActivity";
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class); // 这是一个显式 Intent
//                intent.putExtra("extra_data", data); // putExtra 接受两个键, 一个参数是键, 用于后面从 Intent 中取值, 第二个参数是真正要传递的数据
//                startActivity(intent);
                startActivityForResult(intent, 1);
            }
        });

    }
}
// 如何设置成按多少次按键就退出呢？

