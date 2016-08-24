package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Test Comment for Git
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int day1 = 15;
        int day2 = 22;
        int day3 = 18;
        display((day1 + day2 + day3) / 3);
    }

    public void display (int i) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(""+i);
    }
}
