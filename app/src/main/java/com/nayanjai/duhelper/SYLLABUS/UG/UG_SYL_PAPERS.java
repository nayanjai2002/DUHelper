package com.nayanjai.duhelper.SYLLABUS.UG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.nayanjai.duhelper.SYLLABUS.CustomAdapter.CustomAdapterLinks;
import com.nayanjai.duhelper.SYLLABUS.CustomAdapter.CustomAdapterPapers;
import com.nayanjai.duhelper.R;

public class UG_SYL_PAPERS extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapterPapers customAdapterPapers;


    String []FSStitle;
    String []FStitle;
    String []FMStitle;
    String []FIDAStitle;
    String []FCBStitle;
    String []FAtitle;
    String []FASSHtitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ug_syl_papers);

        recyclerView = findViewById(R.id.ug_syl_papers_recyclerview);


        Intent i = getIntent();
        String Branch = i.getStringExtra("coursesclasses");
        Log.d("Branch", "" +Branch);


        FSStitle = new String[] {
               //Faculty of Social Sciences
                "HISTORY",
                "GEOGRAPHY",
                "ECONOMICS",
                "DELHI SCHOOL OF JOURNALISM",
                "POLITICAL SCIENCE",
                "SOCIAL WORK",
                "SOCIOLOGY",
                "VOCATIONAL STUDIES",
                //Faculty of Social Sciences
                };

               FStitle = new String[]{

                       //Faculty of Science
                       "ANTHROPOLOGY",
                       "BIOCHEMISTRY",
                       "BIOMEDICAL SCIENCES",
                       "BOTANY",
                       "BIOLOGICAL SCIENCES (Course)",
                       "CHEMISTRY",
                       "ENVIRONMENTAL STUDIES",
                       "GEOLOGY",
                       "HOME SCIENCE",
                       "LIFE SCIENCES (Course)",
                       "POLYMER SCIENCE",
                       "PHYSICS & ASTROPHYSICS",
                       "ZOOLOGY",
                       //Faculty of Science
               };

               FMStitle = new String[]{

                       //Faculty of Mathematical Sciences
                       "COMPUTER SCIENCE",
                       "MATHEMATICS",
                       "STATISTICS",
                       "OPERATIONAL RESEARCH",
                       //Faculty of Mathematical Sciences
               };

               FIDAStitle = new String[]{
                       //Faculty of Inter-disciplinary & Applied Sciences
                       "ELECTRONIC SCIENCE",
                       "INSTRUMENTATION",
                       "MICROBIOLOGY",
                       "PHYSICAL EDUCATION & SPORTS SCIENCE",
                       //Faculty of Inter-disciplinary & Applied Sciences
               };

               FCBStitle = new String[]{
                       //Faculty of Commerce & Business Studies
                       "COMMERCE",
                       //Faculty of Commerce & Business Studies
               };

               FAtitle = new String[]{
                       //Faculty of Arts
                       "ARABIC",
                       "ENGLISH",
                       "GERMANIC & ROMANCE STUDIES :(FRENCH, GERMAN, ITALIAN AND SPANISH)",
                       "HINDI",
                       "MODERN INDIAN LANGUAGES & LITERARY STUDIES (I) ASSAMESE, " +
                               "(II) BENGALI," +
                               "(III) GUJARATI," +
                               "(IV) MANIPURI," +
                               "(V) MARATHI," +
                               "(VI) ODIA," +
                               "(VII) SINDHI," +
                               "(VIII) TAMIL," +
                               "AND (IX) TELUGU)",
                       "BENGALI HONS.",
                       "PERSIAN",
                       "PHILOSOPHY",
                       "PSYCHOLOGY",
                       "PUNJABI",
                       "SANSKRIT",
                       "URDU",
                       //Faculty of Arts
               };

               FASSHtitle = new String[] {
                //Faculty of Applied Social Sciences & Humanities
                "BUSINESS ECONOMICS",
                "VOCATION",
                //Faculty of Applied Social Sciences & Humanities
        };

        switch (Branch) {
            case "Faculty of Social Sciences":
                customAdapterPapers = new CustomAdapterPapers(this,FSStitle );
                break;

            case "Faculty of Science":
                customAdapterPapers = new CustomAdapterPapers(this,FStitle);
                break;

            case "Faculty of Mathematical Sciences":
                customAdapterPapers = new CustomAdapterPapers(this,FMStitle);
                break;

            case "Faculty of Inter-disciplinary & Applied Sciences":
                customAdapterPapers = new CustomAdapterPapers(this,FIDAStitle);
                break;

            case "Faculty of Commerce & Business Studies":
                customAdapterPapers = new CustomAdapterPapers(this,FCBStitle);
                break;

            case "Faculty of Arts":
                customAdapterPapers = new CustomAdapterPapers(this,FAtitle);
                break;

            case "Faculty of Applied Social Sciences & Humanities":
                customAdapterPapers = new CustomAdapterPapers(this,FASSHtitle);
                break;
            default:
                Toast.makeText(getApplicationContext(), "Error Generated", Toast.LENGTH_SHORT).show();

        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(customAdapterPapers);
;
    }
}