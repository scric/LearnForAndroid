package com.example.scric.familycall3;

import android.app.ProgressDialog;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    WebView webView;
    ProgressDialog dialog;
    SwipeRefreshLayout swipeRefreshLayout;
    WebSettings webSettings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swiperefresh);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener(){
            @Override
            public void onRefresh() {
                webView.loadUrl(webView.getUrl());

            }
        });
        swipeRefreshLayout.setColorSchemeResources(R.color.holo_red_light,R.color.holo_blue_dark);


        webView = (WebView) findViewById(R.id.web_view1);

        // 取消滚动条
        webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        // 触摸焦点起作用
        webView.requestFocus();

        webView.setWebViewClient(new WebViewClient());
        switch (getIntent().getStringExtra("extra_data")) {
            case "likeme":
                webView.loadUrl("https://www.zybuluo.com/scric/note/745630");
                break;
            case "reading":
                webView.loadUrl("https://scric.github.io/index");
                break;
            case "updating":
                webView.loadUrl("https://www.zybuluo.com/scric/note/745528");
                break;
            case "writeToyou":
                webView.loadUrl("https://www.zybuluo.com/scric/note/745653");
                break;
            case "dating":
                webView.loadUrl("https://www.zybuluo.com/scric/note/746229");
                break;

            default:
                Toast.makeText(SecondActivity.this,"咦, 竟然出现了错误 ,Ｏ(≧口≦)Ｏ",Toast.LENGTH_SHORT).show();
        }


        webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
                return true;
            }
        });


        //这是一个进度条
        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {

                if (newProgress == 100) {
                    // 加载完毕
                    closeDialog(newProgress);
                    swipeRefreshLayout.setRefreshing(false);
                } else {
//                    ProgressDialog(newProgress);
                    swipeRefreshLayout.setRefreshing(true);
                }
                super.onProgressChanged(view, newProgress);
            }

//            private void ProgressDialog(int newProgress) {
//                if (dialog == null) {
//                    dialog = new ProgressDialog(SecondActivity.this);
//                    dialog.setTitle("正在加载");
//                    dialog.setMessage("Loading.....");
////                    dialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
//                    dialog.setProgress(newProgress);
//                    dialog.show();
//                } else {
//                    dialog.setProgress(newProgress);
//                }
//            }
            private void closeDialog(int newProgress) {
                if (dialog != null && dialog.isShowing()) {
                    dialog.dismiss();
                    dialog = null;
                }
            }
        });

    }
}
