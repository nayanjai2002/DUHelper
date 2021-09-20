package com.nayanjai.duhelper.PYQ;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.nayanjai.duhelper.PYQ.UG.UG_PYQ_COURSE;
import com.nayanjai.duhelper.R;

public class PYQActivity extends AppCompatActivity {

    CardView ugCV,pgCV,othersCV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyq1);
        getWindow().setStatusBarColor(Color.parseColor("#3D6DEA"));

        ugCV = findViewById(R.id.ug_pyq_cardview);
        pgCV = findViewById(R.id.pg_pyq_cardview);
        othersCV = findViewById(R.id.others_pyq_cardview);

        ugCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UG_PYQ_COURSE.class);
                startActivity(intent);
            }
        });
    }
}