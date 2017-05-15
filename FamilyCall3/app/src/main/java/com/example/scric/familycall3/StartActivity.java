//package com.example.scric.familycall3;
//
//import android.content.Intent;
//import android.os.Handler;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//public class StartActivity extends AppCompatActivity {
//    private static final long SPLASH_DELAY_MILLIS = 3000;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_start);
//
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                goHome();
//            }
//        }, SPLASH_DELAY_MILLIS);
//
////        welcomeImage = (ImageView)this.findViewById(R.id.image_start);
////        AlphaAnimation alphaAnimation = new AlphaAnimation(0.3f, 1.0f);
////        alphaAnimation.setDuration(3000);
////        welcomeImage.startActionMode((ActionMode.Callback) alphaAnimation);
////        alphaAnimation.setAnimationListener(new Animation.AnimationListener() {
////            @Override
////            public void onAnimationStart(Animation animation) {
////                welcomeImage.setBackgroundResource(R.drawable.me);
////            }
////
////            @Override
////            public void onAnimationEnd(Animation animation) {
////                skip();
////            }
////
////            @Override
////            public void onAnimationRepeat(Animation animation) {
////
////            }
////        });
//    }
//
//    private void goHome() {
//        Intent intent = new Intent(StartActivity.this, MainActivity.class);
//        StartActivity.this.startActivity(intent);
//        StartActivity.this.finish();
//
//    }
////    class splashhandler implements Runnable {
////        public void run() {
////            startActivity(new Intent(StartActivity.this, MainActivity.class));
////            StartActivity.this.finish();
////        }
////
////    }
////    private void skip() {
////        startActivity(new Intent(StartActivity.this, MainActivity.class));
////        finish();
////    }
//}
