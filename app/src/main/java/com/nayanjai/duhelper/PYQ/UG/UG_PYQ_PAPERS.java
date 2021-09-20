package com.nayanjai.duhelper.PYQ.UG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.nayanjai.duhelper.PYQ.UG.ADAPTERS.UG_PYQ_PAPER_ADAPTER;
import com.nayanjai.duhelper.R;
import com.nayanjai.duhelper.SYLLABUS.CustomAdapter.UG_SYL_PAPER_ADAPTER;

public class UG_PYQ_PAPERS extends AppCompatActivity {

    RecyclerView recyclerView;
    UG_PYQ_PAPER_ADAPTER ug_pyq_paper_adapter;

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
        setContentView(R.layout.activity_ug_pyq_papers);
        getWindow().setStatusBarColor(Color.parseColor("#3D6DEA"));

        recyclerView = findViewById(R.id.ug_pyq_papers_recyclerview);

        Intent i = getIntent();
        String Branch = i.getStringExtra("pyqcoursesclasses");
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
                ug_pyq_paper_adapter = new UG_PYQ_PAPER_ADAPTER(this,FSStitle );
                break;

            case "Faculty of Science":
                ug_pyq_paper_adapter = new UG_PYQ_PAPER_ADAPTER(this,FStitle);
                break;

            case "Faculty of Mathematical Sciences":
                ug_pyq_paper_adapter = new UG_PYQ_PAPER_ADAPTER(this,FMStitle);
                break;

            case "Faculty of Inter-disciplinary & Applied Sciences":
                ug_pyq_paper_adapter = new UG_PYQ_PAPER_ADAPTER(this,FIDAStitle);
                break;

            case "Faculty of Commerce & Business Studies":
                ug_pyq_paper_adapter = new UG_PYQ_PAPER_ADAPTER(this,FCBStitle);
                break;

            case "Faculty of Arts":
                ug_pyq_paper_adapter = new UG_PYQ_PAPER_ADAPTER(this,FAtitle);
                break;

            case "Faculty of Applied Social Sciences & Humanities":
                ug_pyq_paper_adapter = new UG_PYQ_PAPER_ADAPTER(this,FASSHtitle);
                break;
            default:
                Toast.makeText(getApplicationContext(), "Error Generated", Toast.LENGTH_SHORT).show();

        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(ug_pyq_paper_adapter);
        ;
    }
    }

