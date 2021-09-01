package com.nayanjai.duhelper.SYLLABUS.UG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nayanjai.duhelper.CustomAdapter.CustomAdapterLinks;
import com.nayanjai.duhelper.CustomAdapter.CustomAdapterLinks;
import com.nayanjai.duhelper.R;

public class UG_SYL_LINKS extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapterLinks customAdapterLinks;

    String []urls;
    String []titles;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ug_syl_links);


        recyclerView = (RecyclerView) findViewById(R.id.ug_syl_recyclerview);


        //..................................HISTORY.................................//
        urls = new String[] {

            "https://drive.google.com/file/d/12XcoKJcaGGeH7xsmgxZqSYnkjKd2rVJi/view?usp=sharing",
            "https://drive.google.com/file/d/12XcoKJcaGGeH7xsmgxZqSYnkjKd2rVJi/view?usp=sharing",
            "https://drive.google.com/file/d/12XcoKJcaGGeH7xsmgxZqSYnkjKd2rVJi/view?usp=sharing",
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

        customAdapterLinks = new CustomAdapterLinks(this,titles,urls);
        recyclerView.setLayoutManager(new LinearLayoutManager(this ));
        recyclerView.setAdapter(customAdapterLinks);

        //..................................HISTORY.................................//


    }
}
