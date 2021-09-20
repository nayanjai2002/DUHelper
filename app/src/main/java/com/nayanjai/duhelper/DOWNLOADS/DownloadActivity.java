package com.nayanjai.duhelper.DOWNLOADS;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.nayanjai.duhelper.R;

public class DownloadActivity extends AppCompatActivity {

    Animation bounce_anim;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);
        getWindow().setStatusBarColor(Color.parseColor("#81B541"));

        textView = findViewById(R.id.staysoon);
        bounce_anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
        textView.startAnimation(bounce_anim);
        bounce_anim.setRepeatCount(Animation.INFINITE);

    }
}