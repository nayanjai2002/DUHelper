package com.nayanjai.duhelper.SYLLABUS.UG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nayanjai.duhelper.CustomAdapter.CustomAdapter;
import com.nayanjai.duhelper.R;

public class UG_Paper_Syl_LINKS_Activity extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapter customAdapter;

    String []urls;
    String []titles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ug_paper_syl_links);


        recyclerView = (RecyclerView) findViewById(R.id.ug_syl_recyclerview);


        //..................................HISTORY.................................//
        urls = new String[] {

              "https://drive.google.com/file/d/12XcoKJcaGGeH7xsmgxZqSYnkjKd2rVJi/view?usp=sharing",
                "https://drive.google.com/file/d/12XcoKJcaGGeH7xsmgxZqSYnkjKd2rVJi/view?usp=sharing",





        };

        titles = new String[] {

                "B.A. (Hons.) History",
                "B.A. (Prog.) History",
                "Semester Wise Sequence of Papers in B.A. (Hons.) History & B.A. (Prog.)",
                "Revised Syllabus of B.A. (Hons.) History",
                "Revised Syllabus of B.A. (Prog.) History",




        };

        customAdapter = new CustomAdapter(this,titles,urls);
        recyclerView.setLayoutManager(new LinearLayoutManager(this ));
        recyclerView.setAdapter(customAdapter);

        //..................................HISTORY.................................//


    }
}