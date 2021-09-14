package com.nayanjai.duhelper.EBOOKS.UG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nayanjai.duhelper.EBOOKS.UG.ADAPTERS.UG_EBK_COURSE_ADAPTER;
import com.nayanjai.duhelper.PYQ.UG.ADAPTERS.UG_PYQ_COURSE_ADAPTER;
import com.nayanjai.duhelper.R;


public class UG_EBK_COURSE extends AppCompatActivity {

    RecyclerView recyclerViewcourse;
    UG_EBK_COURSE_ADAPTER ug_ebk_course_adapter;
    String []ebkcoursestitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ug_ebk_course);
        recyclerViewcourse = findViewById(R.id.ug_ebk_course_recyclerview);

        ebkcoursestitle = new String[] {

                "Faculty of Social Sciences",
                "Faculty of Science",
                "Faculty of Mathematical Sciences",
                "Faculty of Inter-disciplinary & Applied Sciences",
                "Faculty of Commerce & Business Studies",
                "Faculty of Arts",
                "Faculty of Applied Social Sciences & Humanities",

        };

        ug_ebk_course_adapter = new UG_EBK_COURSE_ADAPTER(this,ebkcoursestitle);
        recyclerViewcourse.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewcourse.setAdapter(ug_ebk_course_adapter);


    }
}