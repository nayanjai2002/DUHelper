package com.nayanjai.duhelper.PYQ.UG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nayanjai.duhelper.CustomAdapter.CustomAdapterCourse;
import com.nayanjai.duhelper.R;

public class UG_PYQ_COURSE extends AppCompatActivity {

    RecyclerView recyclerView;
    CustomAdapterCourse customAdapterCourse;

    String []coursetitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ug_pyq_course);

        recyclerView = findViewById(R.id.ug_syl_course_recyclerview);


        coursetitle = new String[] {
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

                //Faculty of Mathematical Sciences
                "COMPUTER SCIENCE",
                "MATHEMATICS",
                "STATISTICS",
                "OPERATIONAL RESEARCH",
                //Faculty of Mathematical Sciences

                //Faculty of Inter-disciplinary & Applied Sciences
                "ELECTRONIC SCIENCE",
                "INSTRUMENTATION",
                "MICROBIOLOGY",
                "PHYSICAL EDUCATION & SPORTS SCIENCE",
                //Faculty of Inter-disciplinary & Applied Sciences

                //Faculty of Commerce & Business Studies
                "COMMERCE",
                //Faculty of Commerce & Business Studies

                //Faculty of Arts
                "ARABIC",
                "ENGLISH",
                "GERMANIC & ROMANCE STUDIES :(FRENCH, GERMAN, ITALIAN AND SPANISH)",
                "HINDI",
                "MODERN INDIAN LANGUAGES & LITERARY STUDIES (I) ASSAMESE, " +
                        "(II) BENGALI,"+
                        "(III) GUJARATI,"+
                        "(IV) MANIPURI,"+
                        "(V) MARATHI,"+
                        "(VI) ODIA,"+
                        "(VII) SINDHI,"+
                        "(VIII) TAMIL,"+
                        "AND (IX) TELUGU)",
                "BENGALI HONS.",
                "PERSIAN",
                "PHILOSOPHY",
                "PSYCHOLOGY",
                "PUNJABI",
                "SANSKRIT",
                "URDU",
                //Faculty of Arts

                //Faculty of Applied Social Sciences & Humanities
                "BUSINESS ECONOMICS",
                "VOCATION",
                //Faculty of Applied Social Sciences & Humanities
        };

        customAdapterCourse = new CustomAdapterCourse(this,coursetitle);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(customAdapterCourse);
    }


}