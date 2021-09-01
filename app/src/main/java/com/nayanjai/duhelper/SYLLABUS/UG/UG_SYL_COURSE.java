package com.nayanjai.duhelper.SYLLABUS.UG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nayanjai.duhelper.CustomAdapter.CustomAdapterCourse;
import com.nayanjai.duhelper.R;

public class UG_SYL_COURSE extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapterCourse customAdapterCourse;

    String []courseclass;
    String []coursetitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ug_syl_course);

        recyclerView = findViewById(R.id.ug_syl_course_recyclerview);

        courseclass = new String[] {

                "",
                "",
                "",
                "",
                "",
                "",
        };

        coursetitle = new String[] {
                "HISTORY",
                "GEOGRAPHY",
                "ECONOMICS",
                "SCIENCE",
                "MATHS",
                "ENGLISH",
        };

        customAdapterCourse = new CustomAdapterCourse(this,coursetitle,courseclass);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(customAdapterCourse);
    }
}