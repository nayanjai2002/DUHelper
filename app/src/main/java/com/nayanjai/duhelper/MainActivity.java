package com.nayanjai.duhelper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.navigation.NavigationView;
import com.nayanjai.duhelper.DOWNLOADS.DownloadActivity;
import com.nayanjai.duhelper.OTHERS.OthersActivity;
import com.nayanjai.duhelper.PYQ.PYQActivity;
import com.nayanjai.duhelper.SYLLABUS.SyllabusActivity;
import com.nayanjai.duhelper.EBOOKS.eBooksActivity;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener  {

    //Variables
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    CardView cardView_syllabus,cardView_ebooks,cardView_pyq,cardView_others,cardView_download;
     
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        /*-------------------------------------Hooks--------------------------------------*/
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbar = findViewById(R.id.toolbar);
        cardView_syllabus = findViewById(R.id.syllabus_cardview);
        cardView_ebooks = findViewById(R.id.ebooks_cardview);
        cardView_pyq = findViewById(R.id.pyq_cardview);
        cardView_others = findViewById(R.id.others_cardview);
        cardView_download = findViewById(R.id.download_cardview);

        /*-------------------------------------Tool bar--------------------------------------*/
        setSupportActionBar(toolbar);

        /*-------------------------------------Navigation Drawer Menu--------------------------------------*/
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);

        navigationView.setCheckedItem(R.id.home_nav);

        cardView_syllabus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),SyllabusActivity.class);
                startActivity(intent);
            }
        });
        cardView_ebooks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),eBooksActivity.class);
                startActivity(intent);
            }
        });
        cardView_pyq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),PYQActivity.class);
                startActivity(intent);
            }
        });
        cardView_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),OthersActivity.class);
                startActivity(intent);
            }
        });
        cardView_download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(), DownloadActivity.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else{
            super.onBackPressed();
        }

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuitem) {
        switch (menuitem.getItemId()) {
            case R.id.home_nav:
                break;
            case R.id.syllabus_nav:
                Intent intent =new Intent(MainActivity.this,SyllabusActivity.class);
                startActivity(intent);
                break;
            case R.id.ebooks_nav:
                Intent intent1 =new Intent(MainActivity.this, eBooksActivity.class);
                startActivity(intent1);
                break;
            case R.id.pyq_nav:
                Intent intent2 =new Intent(MainActivity.this, PYQActivity.class);
                startActivity(intent2);
                break;
            case R.id.others_nav:
                Intent intent3 =new Intent(MainActivity.this, OthersActivity.class);
                startActivity(intent3);
                break;
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}