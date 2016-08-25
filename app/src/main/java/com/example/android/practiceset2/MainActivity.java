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
        String firstName = "Lyla";
        String lastName = "Fujiwara";
        String contactInfo = firstName + " " + lastName;
        contactInfo = "<" + lastName + "." + firstName + "@justjava.com>";
        display(contactInfo);
    }

    public void display (String i) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(""+i);
    }
}
