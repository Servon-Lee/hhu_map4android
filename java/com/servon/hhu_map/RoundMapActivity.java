package com.servon.hhu_map;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Servon on 2017/7/10.
 */

public class RoundMapActivity extends Activity {

    private ScaleView mScaleView;
    private Button btn_front = null;
    private Button btn_back = null;
    private Button btn_left = null;
    private Button btn_right = null;
    private int[][] imagesID = null;
    private int indexX;
    private int indexY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_round);
        mScaleView = (ScaleView) findViewById(R.id.scaleView);
        mScaleView.setImageResource(R.drawable.m51);

        btn_front = (Button) findViewById(R.id.front);
        btn_back = (Button) findViewById(R.id.back);
        btn_left = (Button) findViewById(R.id.left);
        btn_right = (Button) findViewById(R.id.right);
        imagesID = new int[][]{
                {0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,R.drawable.m15,R.drawable.m16,R.drawable.m17,0},
                {0,0,R.drawable.m22,R.drawable.m23,R.drawable.m24,R.drawable.m25,R.drawable.m26,R.drawable.m27,R.drawable.m28,0},
                {0,0,R.drawable.m32,R.drawable.m33,R.drawable.m34,R.drawable.m35,R.drawable.m36,R.drawable.m37,R.drawable.m38,0},
                {0,0,R.drawable.m42,R.drawable.m43,R.drawable.m44,R.drawable.m45,R.drawable.m46,R.drawable.m47,R.drawable.m48,0},
                {0,R.drawable.m51,R.drawable.m52,R.drawable.m53,0,R.drawable.m55,R.drawable.m56,R.drawable.m57,R.drawable.m58,0},
                {0,0,R.drawable.m62,R.drawable.m63,R.drawable.m64,R.drawable.m65,R.drawable.m66,R.drawable.m67,R.drawable.m68,0},
                {0,0,R.drawable.m72,R.drawable.m73,R.drawable.m74,R.drawable.m75,R.drawable.m76,R.drawable.m77,R.drawable.m78,0},
                {0,0,0,0,R.drawable.m84,R.drawable.m85,R.drawable.m86,R.drawable.m87,0}
        };
        indexX = 5;
        indexY = 1;

        btn_front.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                indexY++;
                if(imagesID[indexX][indexY]==0){
                    Toast.makeText(RoundMapActivity.this,"好疼啊，别点啦！前面没有图片啦！",Toast.LENGTH_LONG).show();
                    indexY--;
                }else {
                    mScaleView.setImageResource(imagesID[indexX][indexY]);
                }
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                indexY--;
                if(imagesID[indexX][indexY]==0){
                    Toast.makeText(RoundMapActivity.this,"好疼啊，别点啦！后面没有图片啦！",Toast.LENGTH_LONG).show();
                    indexY++;
                }else {
                    mScaleView.setImageResource(imagesID[indexX][indexY]);
                }
            }
        });
        btn_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                indexX--;
                if(imagesID[indexX][indexY]==0){
                    Toast.makeText(RoundMapActivity.this,"好疼啊，别点啦！左边没有图片啦！",Toast.LENGTH_LONG).show();
                    indexX++;
                }else {
                    mScaleView.setImageResource(imagesID[indexX][indexY]);
                }
            }
        });
        btn_right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                indexX++;
                if(imagesID[indexX][indexY]==0){
                    Toast.makeText(RoundMapActivity.this,"好疼啊，别点啦！右边没有图片啦！",Toast.LENGTH_LONG).show();
                    indexX--;
                }else {
                    mScaleView.setImageResource(imagesID[indexX][indexY]);
                }
            }
        });

    }
}
