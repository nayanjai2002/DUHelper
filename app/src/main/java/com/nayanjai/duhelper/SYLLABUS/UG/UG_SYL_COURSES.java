package com.nayanjai.duhelper.SYLLABUS.UG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nayanjai.duhelper.R;
import com.nayanjai.duhelper.SYLLABUS.CustomAdapter.CustomAdapterCourses;
import com.nayanjai.duhelper.SYLLABUS.CustomAdapter.CustomAdapterPapers;

public class UG_SYL_COURSES extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapterCourses customAdapterCourses;

    String []coursestitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ug_syl_courses);

        coursestitle = new String[] {

                "Faculty of Social Sciences",
                "Faculty of Science",
                "Faculty of Mathematical Sciences",
                "Faculty of Inter-disciplinary & Applied Sciences",
                "Faculty of Commerce & Business Studies",
                "Faculty of Arts",
                "Faculty of Applied Social Sciences & Humanities",

        };

        customAdapterCourses = new CustomAdapterCourses(this,coursestitle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(customAdapterCourses);


    }
}