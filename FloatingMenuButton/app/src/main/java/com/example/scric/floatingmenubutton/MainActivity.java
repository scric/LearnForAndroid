package com.example.scric.floatingmenubutton;

import android.app.Instrumentation;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.buttonPanel);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                simulateKey(KeyEvent.KEYCODE_MENU);
//                Toast.makeText(MainActivity.this, "asd", Toast.LENGTH_SHORT).show();
                showPopupMenu(button);
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
                Toast.makeText(getApplicationContext(), item.getTitle(), Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // PopupMenu 关闭事件
        popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() {
            @Override
            public void onDismiss(PopupMenu menu) {
                Toast.makeText(getApplicationContext(), "关闭 PopupMenu", Toast.LENGTH_SHORT).show();
            }
        });

        popupMenu.show();
    }

    //弹出菜单
//    public static void simulateKey(final int KeyCode) {
//        new Thread() {
//            public void run() {
//                try {
//                    Instrumentation inst = new Instrumentation();
//                    inst.sendKeyDownUpSync(KeyCode);
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }.start();
//    }


//    @Override
//    public void openOptionsMenu() {
//        // TODO Auto-generated method stub
//        super.openOptionsMenu();
//    }
//
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // TODO Auto-generated method stub
//        super.onCreateOptionsMenu(menu);
//        int group1 = 1;
//        int gourp2 = 2;
//        menu.add(group1, 1, 1, "item 11");
//        menu.add(group1, 2, 2, "item 12");
//        menu.add(gourp2, 3, 3, "item 23");
//        menu.add(gourp2, 4, 4, "item 24");
//
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // TODO Auto-generated method stub
//        switch (item.getItemId()) { // 响应每个菜单项 (通过菜单项的 ID)
//            case 1: // do something here
//                Log.i("MenuTest:", "ItemSelected:1");
//                break;
//            case 2: // do something here
//                Log.i("MenuTest:", "ItemSelected:2");
//                break;
//            case 3: // do something here
//                Log.i("MenuTest:", "ItemSelected:3");
//                break;
//            case 4: // do something here
//                Log.i("MenuTest:", "ItemSelected:4");
//                break;
//            default: // 对没有处理的事件，交给父类来处理
//                return super.onOptionsItemSelected(item);
//        } // 返回 true 表示处理完菜单项的事件，不需要将该事件继续传播下去了
//        return true;
//    }
}
