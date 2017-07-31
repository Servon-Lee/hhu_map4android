package com.servon.hhu_map;

import android.app.Activity;
import android.os.Bundle;

public class ScaleActivity extends Activity {
    private ScaleView mScaleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_image_view);
        mScaleView = (ScaleView) findViewById(R.id.scaleView);
        mScaleView.setImageResource(R.drawable.hhu2dmap);
    }
}
