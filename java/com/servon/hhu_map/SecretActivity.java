package com.servon.hhu_map;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Servon on 2017/7/25.
 */

public class SecretActivity extends Activity {
    private ScaleView2 mScaleView = null;
    private Button btn_previous = null;
    private Button btn_next = null;
    private int[] imagesID;
    private int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret);
        mScaleView = (ScaleView2) findViewById(R.id.scaleViewsec);
        mScaleView.setImageResource(R.drawable.sec1);
        btn_previous = (Button) findViewById(R.id.secret_previous);
        btn_next = (Button) findViewById(R.id.secret_next);

        index=999;

        imagesID = new int[]{
                R.drawable.sec1,R.drawable.sec2,R.drawable.sec3,R.drawable.sec4,
                R.drawable.sec5,R.drawable.sec6,R.drawable.sec7,R.drawable.sec8,
                R.drawable.sec9
        };

        btn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index--;
                mScaleView.setImageResource(imagesID[index%9]);
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index++;
                mScaleView.setImageResource(imagesID[index%9]);
            }
        });

    }
}
