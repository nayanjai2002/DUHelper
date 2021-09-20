package com.nayanjai.duhelper.PYQ.UG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
import android.os.Bundle;

import com.nayanjai.duhelper.PYQ.UG.ADAPTERS.UG_PYQ_COURSE_ADAPTER;
import com.nayanjai.duhelper.R;


public class UG_PYQ_COURSE extends AppCompatActivity {

    RecyclerView recyclerViewcourse;
    UG_PYQ_COURSE_ADAPTER ug_pyq_course_adapter;
    String []pyqcoursestitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ug_pyq_course);
        getWindow().setStatusBarColor(Color.parseColor("#003D6DEA"));
        recyclerViewcourse = findViewById(R.id.ug_pyq_course_recyclerview);

        pyqcoursestitle = new String[] {

                "Faculty of Social Sciences",
                "Faculty of Science",
                "Faculty of Mathematical Sciences",
                "Faculty of Inter-disciplinary & Applied Sciences",
                "Faculty of Commerce & Business Studies",
                "Faculty of Arts",
                "Faculty of Applied Social Sciences & Humanities",

        };

        ug_pyq_course_adapter = new UG_PYQ_COURSE_ADAPTER(this,pyqcoursestitle);
        recyclerViewcourse.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewcourse.setAdapter(ug_pyq_course_adapter);


    }
}