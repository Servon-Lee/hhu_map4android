package com.servon.hhu_map;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Servon on 2017/7/25.
 */

public class LibraryActivity extends Activity {
    private ScaleView2 mScaleView = null;
    private Button btn_previous = null;
    private Button btn_next = null;
    private int[] imagesID;
    private int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        mScaleView = (ScaleView2) findViewById(R.id.scaleViewlib);
        mScaleView.setImageResource(R.drawable.lib1);
        btn_previous = (Button) findViewById(R.id.lib_previous);
        btn_next = (Button) findViewById(R.id.lib_next);

        index=1000;

        imagesID = new int[]{
                R.drawable.lib1,R.drawable.lib2,R.drawable.lib3,R.drawable.lib4,
                R.drawable.lib5,R.drawable.lib6,R.drawable.lib7,R.drawable.lib8,
                R.drawable.lib9,R.drawable.lib10
        };

        btn_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index--;
                mScaleView.setImageResource(imagesID[index%10]);
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index++;
                mScaleView.setImageResource(imagesID[index%10]);
            }
        });

    }
}
