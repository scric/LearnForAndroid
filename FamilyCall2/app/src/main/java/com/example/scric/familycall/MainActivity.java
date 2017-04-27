package com.example.scric.familycall;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

        Button button1 = (Button) findViewById(R.id.buttonPanel);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:13006299019"));
                startActivity(intent);
            }
        });

        Button button2 = (Button) findViewById(R.id.buttonPanel2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:13036291929"));
                startActivity(intent);
            }
        });
        Button button3 = (Button) findViewById(R.id.buttonPanel3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:13554422887"));
                startActivity(intent);
            }
        });
        Button button4 = (Button) findViewById(R.id.buttonPanel4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:15827065216"));
                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.sos:
                Toast.makeText(this,"马上拨打 110 ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:110"));
                startActivity(intent);
                break;
            case R.id.help:
                Toast.makeText(this,"马上拨打 119 ", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(Intent.ACTION_DIAL);
                intent1.setData(Uri.parse("tel:119"));
                startActivity(intent1);
                break;
            case R.id.exit:
                Toast.makeText(this, "退出", Toast.LENGTH_SHORT).show();
                finish();
                break;
            default:
        }
        return true;
    }

}
