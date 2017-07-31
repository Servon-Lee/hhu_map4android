package com.servon.hhu_map;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

/**
 * Created by Servon on 2017/7/19.
 */

public class StartActivity extends Activity {
    private ImageView welcomeImg = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);
        welcomeImg = (ImageView) this.findViewById(R.id.welcome_img);

        AlphaAnimation anima1 = new AlphaAnimation(0.8f, 1.0f);
        anima1.setDuration(5000);// 设置动画1显示时间
        welcomeImg.startAnimation(anima1);

        anima1.setAnimationListener(new AnimationImpl());

    }

    private class AnimationImpl implements AnimationListener {

        @Override
        public void onAnimationStart(Animation animation) {
            welcomeImg.setBackgroundResource(R.drawable.mapcover);
        }

        @Override
        public void onAnimationEnd(Animation animation) {
            skip(); // 动画结束后跳转到别的页面
        }

        @Override
        public void onAnimationRepeat(Animation animation) {

        }

    }

    private void skip() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
