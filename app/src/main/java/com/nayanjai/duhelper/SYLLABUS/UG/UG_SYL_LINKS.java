package com.nayanjai.duhelper.SYLLABUS.UG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.nayanjai.duhelper.CustomAdapter.CustomAdapterLinks;
import com.nayanjai.duhelper.CustomAdapter.CustomAdapterLinks;
import com.nayanjai.duhelper.R;

public class UG_SYL_LINKS extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapterLinks customAdapterLinks;

    String[] hisurls;
    String[] histitles;
    String[] geoTitle;
    String[] geourls;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ug_syl_links);


        recyclerView = (RecyclerView) findViewById(R.id.ug_syl_recyclerview);


        Intent i = getIntent();
        String subject = i.getStringExtra("courseclasses");
        Log.d("subject", subject);

        //..................................HISTORY.................................//
        hisurls = new String[]{

                "https://drive.google.com/file/d/12XcoKJcaGGeH7xsmgxZqSYnkjKd2rVJi/view?usp=sharing",
                "https://drive.google.com/file/d/12XcoKJcaGGeH7xsmgxZqSYnkjKd2rVJi/view?usp=sharing",
                "https://drive.google.com/file/d/12XcoKJcaGGeH7xsmgxZqSYnkjKd2rVJi/view?usp=sharing",
                "https://drive.google.com/file/d/12XcoKJcaGGeH7xsmgxZqSYnkjKd2rVJi/view?usp=sharing",
                "https://drive.google.com/file/d/12XcoKJcaGGeH7xsmgxZqSYnkjKd2rVJi/view?usp=sharing",


        };

        histitles = new String[]{

                "B.A. (Hons.) History",
                "B.A. (Prog.) History",
                "Semester Wise Sequence of Papers in B.A. (Hons.) History & B.A. (Prog.)",
                "Revised Syllabus of B.A. (Hons.) History",
                "Revised Syllabus of B.A. (Prog.) History",


        };
        //..................................HISTORY.................................//

        // Geography
        geourls = new String[]{

                "https://drive.google.com/file/d/12XcoKJcaGGeH7xsmgxZqSYnkjKd2rVJi/view?usp=sharing",
                "https://drive.google.com/file/d/12XcoKJcaGGeH7xsmgxZqSYnkjKd2rVJi/view?usp=sharing",
                "https://drive.google.com/file/d/12XcoKJcaGGeH7xsmgxZqSYnkjKd2rVJi/view?usp=sharing",
                "https://drive.google.com/file/d/12XcoKJcaGGeH7xsmgxZqSYnkjKd2rVJi/view?usp=sharing",
                "https://drive.google.com/file/d/12XcoKJcaGGeH7xsmgxZqSYnkjKd2rVJi/view?usp=sharing",


        };

        geoTitle = new String[]{

                "B.A. (Hons.) History",
                "B.A. (Prog.) History",
                "Semester Wise Sequence of Papers in B.A. (Hons.) History & B.A. (Prog.)",
                "Revised Syllabus of B.A. (Hons.) History",
                "Revised Syllabus of B.A. (Prog.) History",

        };

        switch (subject) {
            case "HISTORY":
                customAdapterLinks = new CustomAdapterLinks(this, histitles, hisurls);
                break;

            case "GEOGRAPHY":
                customAdapterLinks = new CustomAdapterLinks(this, geoTitle, geourls);
                break;
            default:
                Toast.makeText(getApplicationContext(), "Error Generated", Toast.LENGTH_SHORT).show();

        }


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(customAdapterLinks);


    }
}
