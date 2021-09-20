package com.nayanjai.duhelper.OTHERS;

import androidx.appcompat.app.AppCompatActivity;
import com.nayanjai.duhelper.R;

import android.graphics.Color;
import android.os.Bundle;

public class OthersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others1);
        getWindow().setStatusBarColor(Color.parseColor("#2A90C3"));
    }
}