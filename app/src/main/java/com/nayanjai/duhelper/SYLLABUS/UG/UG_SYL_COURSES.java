package com.nayanjai.duhelper.SYLLABUS.UG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import com.nayanjai.duhelper.R;
import com.nayanjai.duhelper.SYLLABUS.CustomAdapter.UG_SYL_COURSE_ADAPTER;

public class UG_SYL_COURSES extends AppCompatActivity {

    RecyclerView recyclerViewcourse;
    UG_SYL_COURSE_ADAPTER UGSYLCOURSEADAPTER;

    String []coursestitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ug_syl_courses);
        getWindow().setStatusBarColor(Color.parseColor("#0063C6AA"));

        recyclerViewcourse = findViewById(R.id.ug_syl_course_recyclerview);

        coursestitle = new String[] {

                "Faculty of Social Sciences",
                "Faculty of Science",
                "Faculty of Mathematical Sciences",
                "Faculty of Inter-disciplinary & Applied Sciences",
                "Faculty of Commerce & Business Studies",
                "Faculty of Arts",
                "Faculty of Applied Social Sciences & Humanities",

        };

        UGSYLCOURSEADAPTER = new UG_SYL_COURSE_ADAPTER(this,coursestitle);
        recyclerViewcourse.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewcourse.setAdapter(UGSYLCOURSEADAPTER);


    }
}