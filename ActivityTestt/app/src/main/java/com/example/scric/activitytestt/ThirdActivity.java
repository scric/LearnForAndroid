package com.example.scric.activitytestt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class ThirdActivity extends BaseActivity {
    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return", "Hello FirstActivity");
        setResult(RESULT_OK, intent);
        Toast.makeText(ThirdActivity.this, "返回键被你激活啦.", Toast.LENGTH_SHORT).show();
//        finish();
        ActivityCollector.finishAll();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ThirdActivity", "Task id is" + getTaskId());
        setContentView(R.layout.third_layout);
    }
}
