package com.nayanjai.duhelper.EBOOKS.UG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.nayanjai.duhelper.EBOOKS.UG.ADAPTERS.UG_EBK_LINKS_ADAPTER;
import com.nayanjai.duhelper.PYQ.UG.ADAPTERS.UG_PYQ_LINKS_ADAPTER;
import com.nayanjai.duhelper.R;
import com.nayanjai.duhelper.SYLLABUS.CustomAdapter.UG_SYL_LINKS_ADAPTER;

public class UG_EBK_LINKS extends AppCompatActivity {

    RecyclerView recyclerView;
    UG_EBK_LINKS_ADAPTER ug_ebk_links_adapter;

    String[] hisurls;
    String[] histitles;
    String[] geoTitle;
    String[] geourls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ug_ebk_links);
        getWindow().setStatusBarColor(Color.parseColor("#FCD968"));

        recyclerView = (RecyclerView) findViewById(R.id.ug_ebk_link_recyclerview);

        Intent i = getIntent();
        String subject = i.getStringExtra("ebkpapersclasses");
        Log.d("subject", subject);

        //..................................HISTORY.................................//
        hisurls = new String[]{

                "",
                "https://www.google.com/",
                "https://1drv.ms/b/s!AtztU4uHf_vgigXwRmf9hq_SR8DE?e=zeSr5Z",
                "https://1drv.ms/b/s!AtztU4uHf_vgigSZMPw9-rfxZ1LR?e=ROv0Wq",
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

                "https://drive.google.com/uc?export=download&id=12XcoKJcaGGeH7xsmgxZqSYnkjKd2rVJi",
                "https://drive.google.com/uc?export=download&id=1VG7H0AWc3jhbGlPCbiG9Hs2_NVuokIfc",
                "https://drive.google.com/file/d/1M6Oxs-YSgF0wDvzbRCxkq-DYHySaGy_s/view?usp=sharing",
                "https://drive.google.com/file/d/12XcoKJcaGGeH7xsmgxZqSYnkjKd2rVJi/view?usp=sharing",
                "https://drive.google.com/uc?export=download&id=12XcoKJcaGGeH7xsmgxZqSYnkjKd2rVJi/view?usp=sharing",


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
                ug_ebk_links_adapter = new UG_EBK_LINKS_ADAPTER(this, histitles, hisurls);
                break;

            case "GEOGRAPHY":
                ug_ebk_links_adapter = new UG_EBK_LINKS_ADAPTER(this, geoTitle, geourls);
                break;
            default:
                Toast.makeText(getApplicationContext(), "Error Generated", Toast.LENGTH_SHORT).show();

        }


        int numberofColumns = 2;
        recyclerView.setLayoutManager(new GridLayoutManager(this,numberofColumns));
        recyclerView.setAdapter(ug_ebk_links_adapter);
    }
}