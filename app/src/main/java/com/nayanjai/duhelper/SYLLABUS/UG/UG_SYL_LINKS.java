package com.nayanjai.duhelper.SYLLABUS.UG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.ktx.Firebase;
import com.nayanjai.duhelper.SYLLABUS.CustomAdapter.UG_SYL_LINKS_ADAPTER;
import com.nayanjai.duhelper.R;
import com.nayanjai.duhelper.SYLLABUS.Link;

import java.util.ArrayList;

public class UG_SYL_LINKS extends AppCompatActivity {

    RecyclerView recyclerView;
    UG_SYL_LINKS_ADAPTER UGSYLLINKSADAPTER;
    DatabaseReference databaseReference;
    ArrayList<Link> list;


    String[] histitles;
    String[] geotitles;
    String[] geourls;
    String[] ecourls;
    String[] ecotitles;
    String[] dsjurls;
    String[] dsjtitles;
    String[] polsciurls;
    String[] polscititles;
    String[] sowourls;
    String[] sowotitles;
    String[] sociourls;
    String[] sociotitles;
    String[] vocurls;
    String[] voctitles;
    String[] anthrourls;
    String[] anthrotitles;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ug_syl_links);
        getWindow().setStatusBarColor(Color.parseColor("#63C6AA"));

        recyclerView = (RecyclerView) findViewById(R.id.ug_syl_recyclerview);
        databaseReference = FirebaseDatabase.getInstance().getReference("assets/ug/syl/social science/history");



        Intent i = getIntent();
        String subject = i.getStringExtra("papersclasses");
        String type = i.getStringExtra("type");
        Log.d("subject", subject);

        //Faculty of Social Sciences
        //..................................HISTORY.................................//
        /* hisurls = new String[]{

                "https://drive.google.com/file/d/1TN9xjIYbzkeQS9i2htq3Hv6OtrJGCWD4/view?usp=sharing",
                "https://drive.google.com/file/d/1TMtObvomNGBfM_ti3MpdMWHf2_25F7am/view?usp=sharing",
                "https://drive.google.com/file/d/1TNcpMf_ED-4sth7YjFnzEmbI5BOpLACk/view?usp=sharing",
                "https://drive.google.com/file/d/1TN9xjIYbzkeQS9i2htq3Hv6OtrJGCWD4/view?usp=sharing",
                "https://drive.google.com/file/d/1TMtObvomNGBfM_ti3MpdMWHf2_25F7am/view?usp=sharing",


        }; */

        histitles = new String[]{

                "B.A. (Hons.) History",
                "B.A. (Prog.) History",
                "Semester Wise Sequence of Papers in B.A. (Hons.) History & B.A. (Prog.)",
                "Revised Syllabus of B.A. (Hons.) History",
                "Revised Syllabus of B.A. (Prog.) History",


        };
        //..................................HISTORY.................................//

       /* //..................................GEOGRAPHY.................................//
        geourls = new String[]{

                "https://drive.google.com/uc?export=download&id=1TMcAbclD5GXSk414eZDJohYvBqEaaY8g/view?usp=sharing",
                "https://drive.google.com/uc?export=download&id=1TDMYD4vhxrNaUyHnTkvjVAkfR_MNPnYn/view?usp=sharing",

        };

        geotitles = new String[]{

                "B.A. (Hons.) Geography",
                "B.A. (Program) Geography",

        };

        //..................................GEOGRAPHY.................................//

        //..................................ECONOMICS.................................//
        ecourls = new String[]{

                "https://drive.google.com/file/d/1SXAyfnPHYt561RMWMWqiTE8ZwNfUnAaD/view?usp=sharing",
                "https://drive.google.com/file/d/1TAWqqWGriCTqkZwxTh4nMt5ZicghAtr0/view?usp=sharing",
                "https://drive.google.com/file/d/1T4aMLLgLOJrZI2uIwhD6AmTeCWrgCtBM/view?usp=sharing",
                "https://drive.google.com/file/d/1T0Luh5YkqWgWJYsNeaGSnoDzbB1PM-Eo/view?usp=sharing",
                "https://drive.google.com/file/d/1Sl6-JMbS6Y73YnSowvPgfgpYJgVUMzp4/view?usp=sharing",
                "https://drive.google.com/file/d/1ShQgCrVplg09da7A1oHxd3_Enzg09Fl6/view?usp=sharing",
                "https://drive.google.com/file/d/1Sm7hqeN7717FWT3Hi_7r7FiYhnaIVOF6/view?usp=sharing",
                "https://drive.google.com/file/d/1Se42XPP3jMubA5j8UBLml2wROQt7TCu_/view?usp=sharing",
                "https://drive.google.com/file/d/1SmNd8uv9AZNWXnYBYuC9G1tKnNeacgiQ/view?usp=sharing",
                "https://drive.google.com/file/d/1T2xht3zagCKwStJg2AS5ACtJkZBUU0vA/view?usp=sharing",


        };

        ecotitles = new String[]{

                "B.A. (Hons.) Economics",
                "B.A. (Prog.) Economics",
                "Generic Elective Course II (b) - India and Indian Ocean Economy c, 1500-1800",
                "Generic Elective Course IV (b) - Global Political Economy",
                "Skill Enhancement Course (Hons.) - SEC III Research Methodology",
                "Skill Enhancement Course (Hons.) - SEC IV Contemporary Economic Issues",
                "Skill Enhancement Course (Programme) - SEC III Understanding the Economic Survey and Union Budget",
                "Skill Enhancement Course (Programme) - SEC IV Research Methodology",
                "Renumbering of existing GE course IV (b) (Economic History of India)",
                "Interchange of numbering and sequence of the existing Discipline",


        };
        //..................................ECONOMICS.................................//

        //..................................DELHI SCHOOL OF JOURNALISM.................................//
        dsjurls = new String[]{

                "https://drive.google.com/file/d/1SVoBhlcaTJGTEsOcki5ixaBt-_pTv4Co/view?usp=sharing",

        };

        dsjtitles = new String[]{

                "Delhi School of Journalism",

        };

        //..................................DELHI SCHOOL OF JOURNALISM.................................//


        //..................................POL SCI.................................//
        polsciurls = new String[]{

                "https://drive.google.com/file/d/1TozD7aq4rFHcNDk4A-oUeSUBslAn2xwt/view?usp=sharing",
                "https://drive.google.com/file/d/1TqfUI_U3RCyTtZIcGKElA4IY_necZhbS/view?usp=sharing",

        };

        polscititles = new String[]{

                "B.A. (Hons.) Political Science",
                "B.A. (Program) Political Science",

        };

        //..................................POL SCI.................................//

        //..................................SOCIAL WORK.................................//
        sowourls = new String[]{

                "https://drive.google.com/file/d/1TwT5iICEL__gjqfjG1XfUUqYp5vN50_v/view?usp=sharing",

        };

        sowotitles = new String[]{

                "B.A. (Hons.) Social Work",

        };

        //..................................SOCIAL WORK.................................//

        //..................................SOCIOLOGY.................................//
        sociourls = new String[]{

                "https://drive.google.com/file/d/1TtD3Ms3pYz3uskv8f0uvxSqVmqsbzbr6/view?usp=sharing",
                "https://drive.google.com/file/d/1Tsyyr0lSOm1-0drbkilegkteRsoRNgca/view?usp=sharing",
        };

        sociotitles = new String[]{

                "B.A. (Hons.) Sociology",
                "B.A. (Program) Sociology",

        };

        //..................................SOCIOLOGY.................................//

        //..................................VOCATIONAL STUDIES.................................//
        vocurls = new String[]{

                "https://drive.google.com/file/d/1UGHSzEWSRycwB6mz0rVBq0s8m9fPv1TI/view?usp=sharing",
                "https://drive.google.com/file/d/1UiE4SUTVDw2n9tbpBmkxoppmaOPUhTAu/view?usp=sharing",
                "https://drive.google.com/file/d/1UH8LhluOY5PhvI_2uefeROzVnRcRNc9n/view?usp=sharing",
                "https://drive.google.com/file/d/1Uj-1EeJtxiXamljVpKua0moE2w_pblvW/view?usp=sharing",
                "https://drive.google.com/file/d/1UQmTllVpdLI7PlrmlOb84cczS12th5z1/view?usp=sharing",
                "https://drive.google.com/file/d/1UMOgPLQbR3l0drzFnX0ft9NZ3-GgNhOU/view?usp=sharing",
                "https://drive.google.com/file/d/1UajIEfLTZD-wGOpln7odWBIbXq3LMp8x/view?usp=sharing",

        };

        voctitles = new String[]{

                "B.A. (Vocational Studies) Human Resource Management",
                "B.A. (Vocational Studies) Marketing Management and Retail Business",
                "B.A. (Vocational Studies) Tourism Management",
                "B.A. (Vocational Studies) Management and Marketing of Insurance",
                "B.A. (Vocational Studies) Office Management and Secretarial Practice",
                "B.A. (Vocational Studies) Small and Medium Enterprises",
                "B.A. (Vocational Studies) Materials Management",

        };
        //..................................VOCATIONAL STUDIES.................................//
        //Faculty of Social Sciences*/


     //   if (type == "social") {
            switch (subject) {
                case "HISTORY":
                    list = new ArrayList<>();
                    UGSYLLINKSADAPTER = new UG_SYL_LINKS_ADAPTER(this,histitles,list);
                    break;

              /*  case "GEOGRAPHY":
                    UGSYLLINKSADAPTER = new UG_SYL_LINKS_ADAPTER(this, geotitles, geourls);
                    break;

                case "ECONOMICS":
                    UGSYLLINKSADAPTER = new UG_SYL_LINKS_ADAPTER(this, ecotitles, ecourls);
                    break;

                case "DELHI SCHOOL OF JOURNALISM":
                    UGSYLLINKSADAPTER = new UG_SYL_LINKS_ADAPTER(this, dsjtitles, dsjurls);
                    break;

                case "POLITICAL SCIENCE":
                    UGSYLLINKSADAPTER = new UG_SYL_LINKS_ADAPTER(this, polscititles, polsciurls);
                    break;

                case "SOCIAL WORK":
                    UGSYLLINKSADAPTER = new UG_SYL_LINKS_ADAPTER(this, sowotitles, sowourls);
                    break;

                case "SOCIOLOGY":
                    UGSYLLINKSADAPTER = new UG_SYL_LINKS_ADAPTER(this, sociotitles, sociourls);
                    break;

                case "VOCATIONAL STUDIES":
                    UGSYLLINKSADAPTER = new UG_SYL_LINKS_ADAPTER(this, voctitles, vocurls);
                    break;
*/

                default:
                    Toast.makeText(getApplicationContext(), "Error Generated", Toast.LENGTH_SHORT).show();

            }
        //}



/*
        //Faculty of Science
        //..................................ANTHROPOLOGY.................................//
        sociourls = new String[]{

                "https://drive.google.com/file/d/1ReMN7Zp9evB-5v7lrNC5zR12YUK5KTaC/view?usp=sharing",
                "https://drive.google.com/file/d/1RhCYdwzS8nMWRKnRP7d4VVfgNjUQN5-C/view?usp=sharing",
        };

        sociotitles = new String[]{

                "B.Sc. (Hons.) Anthropology",
                "B.Sc. (Hons.) Forensic Science",

        };

        //..................................ANTHROPOLOGY.................................//
        // Faculty of Science

        if (type == "science") {
            switch (subject) {
                case "ANTHROPOLOGY":
                    UGSYLLINKSADAPTER = new UG_SYL_LINKS_ADAPTER(this, anthrotitles, anthrourls);
                    break;

                default:
                    Toast.makeText(getApplicationContext(), "Error Generated", Toast.LENGTH_SHORT).show();
            }
        }

*/

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(UGSYLLINKSADAPTER);

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot dataSnapshot : snapshot.getChildren()) {

                    Link link = dataSnapshot.getValue(Link.class);
                    list.add(link);
                }
                UGSYLLINKSADAPTER.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

    }
}
