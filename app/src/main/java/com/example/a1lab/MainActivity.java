package com.example.a1lab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button change_count_bttn;
    TextView count_tv;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        count_tv = (TextView) findViewById(R.id.counter_tv);
        change_count_bttn = (Button) findViewById(R.id.change_count_bttn);
        change_count_bttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                count_tv.setText(String.valueOf(count));
            }
        });
    }
}