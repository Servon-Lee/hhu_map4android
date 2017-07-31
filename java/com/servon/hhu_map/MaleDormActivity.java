package com.servon.hhu_map;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Servon on 2017/7/21.
 */

public class MaleDormActivity extends Activity {
    private ScaleView mScaleView = null;
    private Button btn_previous = null;
    private Button btn_next = null;
    private int[] imagesID;
    private int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_dorm);
        mScaleView = (ScaleView) findViewById(R.id.scaleView);
        mScaleView.setImageResource(R.drawable.md2);
        btn_previous = (Button) findViewById(R.id.male_previous);
        btn_next = (Button) findViewById(R.id.male_next);

        index=666;

        imagesID = new int[]{
                R.drawable.md2,R.drawable.md1,R.drawable.md3,
                R.drawable.md4,R.drawable.md5,R.drawable.md6
        };

        btn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index--;
                mScaleView.setImageResource(imagesID[index%6]);
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index++;
                mScaleView.setImageResource(imagesID[index%6]);
            }
        });

    }
}
