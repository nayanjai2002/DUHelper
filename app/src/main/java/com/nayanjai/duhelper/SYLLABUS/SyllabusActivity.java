package com.nayanjai.duhelper.SYLLABUS;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.nayanjai.duhelper.R;
import com.nayanjai.duhelper.SYLLABUS.UG.UG_SYL_COURSE;
import com.nayanjai.duhelper.SYLLABUS.UG.UG_SYL_LINKS;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SyllabusActivity extends AppCompatActivity {
    //Variables
    CardView ugCV,pgCV,revCV,othersCV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus1);

        ////Hooks
        ugCV = (CardView)findViewById(R.id.ug_cardview);
        pgCV = (CardView)findViewById(R.id.pg_cardview);
        revCV = (CardView)findViewById(R.id.rev_cardview);
        othersCV = (CardView)findViewById(R.id.others_cardview);



        ugCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UG_SYL_COURSE.class);
                startActivity(intent);
            }
        });


    }
}