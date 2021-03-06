package com.nayanjai.duhelper.SYLLABUS;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.nayanjai.duhelper.R;
import com.nayanjai.duhelper.SYLLABUS.UG.UG_SYL_COURSES;
import com.nayanjai.duhelper.SYLLABUS.UG.UG_SYL_PAPERS;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class SyllabusActivity extends AppCompatActivity {
    //Variables
    CardView ugCV,pgCV,revCV,othersCV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus1);
        getWindow().setStatusBarColor(Color.parseColor("#63C6AA"));

        ////Hooks
        ugCV = (CardView)findViewById(R.id.ug_cardview);
        pgCV = (CardView)findViewById(R.id.pg_cardview);
        revCV = (CardView)findViewById(R.id.rev_cardview);
        othersCV = (CardView)findViewById(R.id.others_cardview);



        ugCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UG_SYL_COURSES.class);
                startActivity(intent);
            }
        });


    }
}