package com.example.scric.familycall3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.getbase.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final FloatingActionButton floatingActionButton2 = (FloatingActionButton) findViewById(R.id.floatingbutton);
        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(floatingActionButton2);
                Toast.makeText(MainActivity.this, "你触及我心脏", Toast.LENGTH_SHORT).show();
            }
        });


        Button button = (Button) findViewById(R.id.buttonPanel);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:13879988566"));
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.buttonPanel2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:13979965978"));
                startActivity(intent);
            }
        });

        Button button3 = (Button) findViewById(R.id.buttonPanel3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"是不是想我啦",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:13026360905"));

                startActivity(intent);
            }
        });

        Button button4 = (Button) findViewById(R.id.buttonPanel4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:7168083"));
                startActivity(intent);
            }
        });

        Button button5 = (Button) findViewById(R.id.buttonPanel5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:13657996888"));
                startActivity(intent);
            }
        });
    }
    private void showPopupMenu(View view) {

        // View 当前 PopupMenu 显示的相对 View 的位置
        PopupMenu popupMenu = new PopupMenu(this, view);

        // menu 布局
        popupMenu.getMenuInflater().inflate(R.menu.menu, popupMenu.getMenu());

        // menu 的 item 点击事件
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.github_she:
                        Toast.makeText(MainActivity.this,"有点害羞(｡￫∀￩｡)♡",Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Intent.ACTION_VIEW);
                        intent.setData(Uri.parse("https://www.zybuluo.com/scric/note/745653"));
                        startActivity(intent);
                        break;
                    case R.id.github_me:
                        Toast.makeText(MainActivity.this,"ღ( ´･ᴗ･` )比心",Toast.LENGTH_SHORT).show();
                        Intent intent1 = new Intent(Intent.ACTION_VIEW);
                        intent1.setData(Uri.parse("https://www.zybuluo.com/scric/note/745630"));
                        startActivity(intent1);
                        break;
                    case R.id.readingnotes:
                        Toast.makeText(MainActivity.this,"每天都会更一点哦(〃∀〃)ゞ",Toast.LENGTH_SHORT).show();
                        Intent intent2 = new Intent(Intent.ACTION_VIEW);
                        intent2.setData(Uri.parse("https://scric.github.io/index"));
                        startActivity(intent2);
                        break;
                    case R.id.exit:
                        Toast.makeText(MainActivity.this, "啊不要这样子啦( 。ớ ₃ờ)ھ", Toast.LENGTH_SHORT).show();
                        finish();
                        break;
                    default:
                }
                return false;
            }
        });
        // PopupMenu 关闭事件
//        popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() {
//            @Override
//            public void onDismiss(PopupMenu menu) {
//                Toast.makeText(getApplicationContext(), "关闭 PopupMenu", Toast.LENGTH_SHORT).show();
//            }
//        });
        popupMenu.show();
    }
    //     显示菜单
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return true;
    }

    // 实现功能

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
//            case R.id.github_she:
//                Toast.makeText(this,"有点害羞(｡￫∀￩｡)♡",Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("https://github.com/scric/Lady-X/blob/master/%E5%86%99%E7%BB%99%E6%9C%AA%E6%9D%A5%20X%20%E5%B0%8F%E5%A7%90.md"));
//                startActivity(intent);
//                break;
//            case R.id.github_me:
//                Toast.makeText(this,"ღ( ´･ᴗ･` )比心",Toast.LENGTH_SHORT).show();
//                Intent intent1 = new Intent(Intent.ACTION_VIEW);
//                intent1.setData(Uri.parse("https://github.com/scric/Lady-X/blob/master/%E7%BB%99%E8%BF%87%E5%8E%BB%E8%87%AA%E5%B7%B1%E7%9A%84%E4%B8%80%E5%B0%81%E4%BF%A1.md"));
//                startActivity(intent1);
//                break;
//            case R.id.readingnotes:
//                Toast.makeText(this,"每天都会更一点哦(〃∀〃)ゞ",Toast.LENGTH_SHORT).show();
//                Intent intent2 = new Intent(Intent.ACTION_VIEW);
//                intent2.setData(Uri.parse("https://scric.github.io/index"));
//                startActivity(intent2);
//                break;
            case R.id.update:
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://www.zybuluo.com/scric/note/745528"));
                startActivity(intent);
                break;
            case R.id.exit:
                Toast.makeText(this, "啊不要这样子啦( 。ớ ₃ờ)ھ", Toast.LENGTH_SHORT).show();
                finish();
                break;
            default:
        }
        return true;
    }
}
