package com.nayanjai.duhelper.EBOOKS;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.nayanjai.duhelper.EBOOKS.UG.UG_EBK_COURSE;
import com.nayanjai.duhelper.PYQ.UG.UG_PYQ_COURSE;
import com.nayanjai.duhelper.R;

public class eBooksActivity extends AppCompatActivity {

    CardView ugCV,pgCV,othersCV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebooks1);

        ugCV = findViewById(R.id.ug_ebk_cardview);
        pgCV = findViewById(R.id.pg_ebk_cardview);
        othersCV = findViewById(R.id.others_ebk_cardview);

        ugCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UG_EBK_COURSE.class);
                startActivity(intent);
            }
        });

        pgCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UG_EBK_COURSE.class);
                startActivity(intent);
            }
        });

        othersCV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UG_EBK_COURSE.class);
                startActivity(intent);
            }
        });
    }
}