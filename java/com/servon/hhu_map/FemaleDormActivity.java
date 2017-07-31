package com.servon.hhu_map;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Servon on 2017/7/21.
 */

public class FemaleDormActivity extends Activity {
    private ScaleView mScaleView = null;
    private Button btn_previous = null;
    private Button btn_next = null;
    private int[] imagesID;
    private int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female_dorm);
        mScaleView = (ScaleView) findViewById(R.id.scaleView);
        mScaleView.setImageResource(R.drawable.fd11);
        btn_previous = (Button) findViewById(R.id.female_previous);
        btn_next = (Button) findViewById(R.id.female_next);

        index=1100;

        imagesID = new int[]{
                R.drawable.fd11,R.drawable.fd1,R.drawable.fd2,R.drawable.fd3,
                R.drawable.fd4, R.drawable.fd5,R.drawable.fd6,R.drawable.fd7,
                R.drawable.fd8, R.drawable.fd9,R.drawable.fd10
        };

        btn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index--;
                mScaleView.setImageResource(imagesID[index%11]);
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index++;
                mScaleView.setImageResource(imagesID[index%11]);
            }
        });

    }
}
