package com.nayanjai.duhelper.PYQ.UG;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.nayanjai.duhelper.PYQ.UG.ADAPTERS.SECTION;
import com.nayanjai.duhelper.PYQ.UG.ADAPTERS.UG_PYQ_MAINADAPTER;
import com.nayanjai.duhelper.R;

import java.util.ArrayList;
import java.util.List;

public class UG_PYQ_COURSE extends AppCompatActivity {

    List<SECTION> SECTIONList = new ArrayList<>();
    RecyclerView mainRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ug_pyq_course);

        initData();

        mainRecyclerView = findViewById(R.id.mainRecyclerView);
        UG_PYQ_MAINADAPTER UGPYQMAINADAPTER = new UG_PYQ_MAINADAPTER(SECTIONList);
        mainRecyclerView.setAdapter(UGPYQMAINADAPTER);
        //mainRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

    private void initData() {

        String sectionOneName = "Faculty of Social Sciences";
        List<String> sectionOneItems = new ArrayList<>();
        sectionOneItems.add("HISTORY");
        sectionOneItems.add("GEOGRAPHY");
        sectionOneItems.add("ECONOMICS");
        sectionOneItems.add("DELHI SCHOOL OF JOURNALISM");
        sectionOneItems.add("POLITICAL SCIENCE");
        sectionOneItems.add("SOCIAL WORK");
        sectionOneItems.add( "SOCIOLOGY");
        sectionOneItems.add("VOCATIONAL STUDIES");


        String sectionTwoName = "Faculty of Science";
        List<String> sectionTwoItems = new ArrayList<>();
        sectionTwoItems.add("ANTHROPOLOGY");
        sectionTwoItems.add("BIOCHEMISTRY");
        sectionTwoItems.add("BIOMEDICAL SCIENCES");
        sectionTwoItems.add("BOTANY");
        sectionTwoItems.add("BIOLOGICAL SCIENCES (Course)");
        sectionTwoItems.add("CHEMISTRY");
        sectionTwoItems.add("ENVIRONMENTAL STUDIES");
        sectionTwoItems.add("GEOLOGY");
        sectionTwoItems.add("HOME SCIENCE");
        sectionTwoItems.add("LIFE SCIENCES (Course)");
        sectionTwoItems.add("POLYMER SCIENCE");
        sectionTwoItems.add("PHYSICS & ASTROPHYSICS");
        sectionTwoItems.add("ZOOLOGY");

        String sectionThreeName = "Faculty of Mathematical Sciences";
        List<String> sectionThreeItems = new ArrayList<>();
        sectionThreeItems.add("COMPUTER SCIENCE");
        sectionThreeItems.add("MATHEMATICS");
        sectionThreeItems.add("STATISTICS");
        sectionThreeItems.add("OPERATIONAL RESEARCH");


        String sectionFourName = "Faculty of Inter-disciplinary & Applied Sciences";
        List<String> sectionFourItems = new ArrayList<>();
        sectionFourItems.add("ELECTRONIC SCIENCE");
        sectionFourItems.add("INSTRUMENTATION");
        sectionFourItems.add("MICROBIOLOGY");
        sectionFourItems.add("PHYSICAL EDUCATION & SPORTS SCIENCE");



        String sectionFiveName = "Faculty of Commerce & Business Studies";
        List<String> sectionFiveItems = new ArrayList<>();
        sectionFiveItems.add("COMMERCE");



        String sectionSixName = "Faculty of Arts";
        List<String> sectionSixItems = new ArrayList<>();
        sectionSixItems.add("ARABIC");
        sectionSixItems.add("ENGLISH");
        sectionSixItems.add("GERMANIC & ROMANCE STUDIES :(FRENCH, GERMAN, ITALIAN AND SPANISH)");
        sectionSixItems.add("HINDI");
        sectionSixItems.add("MODERN INDIAN LANGUAGES & LITERARY STUDIES (I) ASSAMESE,+\n" +
                "(II) BENGALI,+\n" +
                "(III) GUJARATI,+\n" +
                "(IV) MANIPURI,+\n" +
                "(V) MARATHI,+\n" +
                "(VI) ODIA,+\n" +
                "(VII) SINDHI,+\n" +
                "(VIII) TAMIL,+\n" +
                "AND (IX) TELUGU)");
        sectionSixItems.add("BENGALI HONS.");
        sectionSixItems.add("PERSIAN");
        sectionSixItems.add("PHILOSOPHY");
        sectionSixItems.add("PSYCHOLOGY");
        sectionSixItems.add("PUNJABI");
        sectionSixItems.add("SANSKRIT");
        sectionSixItems.add("URDU");



        String sectionSevenName = "Faculty of Applied Social Sciences & Humanities";
        List<String> sectionSevenItems = new ArrayList<>();
        sectionSevenItems.add("BUSINESS ECONOMICS");
        sectionSevenItems.add("VOCATION");

        SECTIONList.add(new SECTION(sectionOneName,sectionOneItems));
        SECTIONList.add(new SECTION(sectionTwoName,sectionTwoItems));
        SECTIONList.add(new SECTION(sectionThreeName,sectionThreeItems));
        SECTIONList.add(new SECTION(sectionFourName,sectionFourItems));
        SECTIONList.add(new SECTION(sectionFiveName,sectionFiveItems));
        SECTIONList.add(new SECTION(sectionSixName,sectionSixItems));
        SECTIONList.add(new SECTION(sectionSevenName,sectionSevenItems));

    }
}