package com.example.wallpapermanager_master;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



    public void b1(View v) {
        ((ImageView) findViewById(R.id.back)).setImageResource(R.drawable.galaxy1);
    }

    public void b2(View v) {
        ((ImageView) findViewById(R.id.back)).setImageResource(R.drawable.galaxy2);
    }

    public void b3(View v) {
        ((ImageView) findViewById(R.id.back)).setImageResource(R.drawable.galaxy3);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
}