package com.nayanjai.duhelper.PYQ;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.nayanjai.duhelper.R;
import com.nayanjai.duhelper.SYLLABUS.UG.UG_SYL_COURSE;

public class PYQActivity extends AppCompatActivity {

    CardView ugCV,pgCV,othersCV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pyq1);

        ugCV = findViewById(R.id.ug_pyq_cardview);
        pgCV = findViewById(R.id.pg_pyq_cardview);
        othersCV = findViewById(R.id.others_pyq_cardview);

        ugCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UG_SYL_COURSE.class);
                startActivity(intent);
            }
        });
    }
}