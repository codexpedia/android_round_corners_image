package com.example.roundcorners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView picasso = (ImageView) findViewById(R.id.iv_picasso);
        Picasso.with(this)
                .load("https://user-images.githubusercontent.com/35174627/37550299-d5fd7992-2958-11e8-8024-d4a8e9f0d3eb.jpg")
                .transform(new RoundCornersTransformation(20, 20, true, true))
                .into(picasso);
    }
}
