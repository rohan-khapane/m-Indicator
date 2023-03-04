package com.example.m_indicator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.navigation.NavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.messaging.FirebaseMessaging;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    Toolbar toolbar_home;
    GridView grid;
    ListView lv_home;
    DrawerLayout drawer_layout_home;
    NavigationView navigationView_home_activity;
    FirebaseAuth mAuth;
//    private static final String CHANNEL_ID="My Channel";
//    private static final int NOTIFICATION_ID=100;
//    private static final int REQ_CODES=100;



    ArrayList<String> home_list=new ArrayList<>();

    int[] icon_img_grid =new int[]{
            R.drawable.local_train_images,
            R.drawable.metro_image,
            R.drawable.mono_rail_images,
            R.drawable.autorickshaw_images,
            R.drawable.taxi_images,
            R.drawable.map_images
    };
    String[] icon_name_grid=new String[]{"Local","Metro","Mono","Auto","Taxi","Map"};
    ArrayList<String>arrNames=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth=FirebaseAuth.getInstance();

        drawer_layout_home=findViewById(R.id.drawer_layout_home);
        NavigationView navigationView_home_activity=findViewById(R.id.navigation_view_home_activity);
        toolbar_home=findViewById(R.id.toolbar);
        navigationView_home_activity.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) this);

        setSupportActionBar(toolbar_home);
//        if(getSupportActionBar()!=null) {
//            getSupportActionBar().setTitle("m-Indicator");
//            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        }
//        toolbar_home.setTitle("m-Indicator");
        ActionBarDrawerToggle toggle_navi=new ActionBarDrawerToggle(this,drawer_layout_home,toolbar_home,R.string.OpenDrawer,R.string.CloseDrawer);
        drawer_layout_home.addDrawerListener(toggle_navi);
        toggle_navi.syncState();

        FirebaseMessaging.getInstance().subscribeToTopic("general")
                .addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        String msg = "Successfull";
                        if (!task.isSuccessful()) {
                            msg = "failed";
                        }
//                        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
                    }
                });




//        navigationView_home_activity.setNavigationItemSelectedListener((NavigationView.OnNavigationItemSelectedListener) MainActivity.this);
//        navigationView_home_activity.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener(){
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                int id = item.getItemId();
//                if(id==R.id.navi_explore_mumbai){
//                    Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
//                    Intent intent=new Intent(MainActivity.this,Local_train.class);
//                    startActivity(intent);
////
//                }else if(id==R.id.navi_travel_hacks){
//                    Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
//                    Intent newintent=new Intent(MainActivity.this,Local_train.class);
//                    startActivity(newintent);
//
//                }else if(id==R.id.navi_features){
//                    Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
//                    Intent intent=new Intent(MainActivity.this,Local_train.class);
//                    startActivity(intent);
//                }else if(id==R.id.navi_suggest_feature){
//                    Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
//                    startActivity(new Intent(MainActivity.this,suggest_feature.class));
////                    Intent intent5=new Intent(MainActivity.this,suggest_feature.class);
////                    startActivity(intent5);
//                }
//                else if(id==R.id.navi_report_issue){
//                    Intent intent6=new Intent(MainActivity.this,report_issue.class);
//                    startActivity(intent6);
//                    Toast.makeText(MainActivity.this, "report", Toast.LENGTH_SHORT).show();
////                    loadFragment(new report_an_issue());
//                }else if(id==R.id.navi_advertise_with_us){
//                    Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
//                    Intent intent=new Intent(MainActivity.this,Local_train.class);
//                    startActivity(intent);
//                }else if(id==R.id.navi_rate_app){
//                    Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
//                    Intent intent=new Intent(MainActivity.this,Local_train.class);
//                    startActivity(intent);
//                }else if(id==R.id.navi_update_app){
//                    Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
//                    Intent intent=new Intent(MainActivity.this,Local_train.class);
//                    startActivity(intent);
//                }else if(id==R.id.navi_about_app){
//                    Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();
//                    Intent intent=new Intent(MainActivity.this,Local_train.class);
//                    startActivity(intent);
//                }else{
//                    Toast.makeText(MainActivity.this, "Out of Index", Toast.LENGTH_SHORT).show();
//                }
//
//                drawer_layout_home.closeDrawer(GravityCompat.START);
//                return true;
//            }
//        }
//        );



//        lv_home=findViewById(R.id.home_lv);
        lv_home=(ListView) findViewById(R.id.home_lv);
        home_list.add("Emergency Contacts");
        home_list.add("Mumbai Map");
        home_list.add("Penalty");
        home_list.add("Amenities");



        ArrayAdapter lv_home_adapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,home_list);
        lv_home.setAdapter(lv_home_adapter);
        lv_home.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position_lv, long l) {
                if(position_lv==0){
                    Intent intent=new Intent(MainActivity.this,Local_train.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Emergency Contacts", Toast.LENGTH_SHORT).show();
                }
                if(position_lv==1){
                    Intent intent=new Intent(MainActivity.this,Map.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Mumbai Map", Toast.LENGTH_SHORT).show();
                }if(position_lv==2){
                    Intent intent=new Intent(MainActivity.this,Penalties_home.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Penalties", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "out of index", Toast.LENGTH_SHORT).show();
                }

            }
        });

        grid=(GridView) findViewById(R.id.home_grid);
        gridAdapter obj=new gridAdapter(icon_img_grid,icon_name_grid,MainActivity.this);
        grid.setAdapter(obj);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                String selectedname=icon_name_grid[position];
                int selectedimg=icon_img_grid[position];

                if(position==0){
                    Intent intent=new Intent(MainActivity.this,Local_train.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Local train ", Toast.LENGTH_SHORT).show();
                }else if(position==1){
                    Intent intent=new Intent(MainActivity.this,Metro.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Metro train ", Toast.LENGTH_SHORT).show();

                }else if(position==2){
                    Intent intent=new Intent(MainActivity.this,Mono.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Mono ", Toast.LENGTH_SHORT).show();

                }else if(position==3){
                    Intent intent=new Intent(MainActivity.this,Autorickshaw.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Autoriskshaw", Toast.LENGTH_SHORT).show();

                }else if(position==4){
                    Intent intent=new Intent(MainActivity.this,Taxi.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Taxi", Toast.LENGTH_SHORT).show();

                }else if(position==5){
                    Intent intent=new Intent(MainActivity.this,Map.class);
                    startActivity(intent);
                    Toast.makeText(MainActivity.this, "Map", Toast.LENGTH_SHORT).show();

                }else{
                    Toast.makeText(MainActivity.this, "OutOfIndex", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }


//    private void loadFragment(Fragment fragment) {
//        FragmentManager fm=getSupportFragmentManager();
//        FragmentTransaction ft=fm.beginTransaction();
//        ft.add(R.id.container,fragment);
//        ft.commit();
//    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user=mAuth.getCurrentUser();
        if(user==null){
            startActivity(new Intent(MainActivity.this,Login_page.class));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu){
        new MenuInflater(this).inflate(R.menu.opt_menu,menu);
        return super.onCreateOptionsMenu(menu);
//        new MenuInflater(this).inflate(R.menu.menu_naivagation_pnl,menu);
//        return super.onCreateOptionsMenu(menu);
//        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int item_id =item.getItemId();
        if(item_id==R.id.menu_Alert){
            Toast.makeText(this, "Enter the alert section", Toast.LENGTH_SHORT).show();
            Intent alert_page=new Intent(MainActivity.this,Alert_page.class);
            startActivity(alert_page);
        }else if (item_id==R.id.menu_News){
            Toast.makeText(this,"Enter the News section",Toast.LENGTH_SHORT).show();
            Intent news_page=new Intent(MainActivity.this,News_page.class);
            startActivity(news_page);
        }
        else{
            super.onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }
    public void onBackPressed(){
        if(drawer_layout_home.isDrawerOpen(GravityCompat.START)){
            drawer_layout_home.closeDrawer(GravityCompat.START);
        }else{
            super.onBackPressed();
        }
    }
    @Override
    public boolean onNavigationItemSelected(MenuItem item){
        int id=item.getItemId();

        switch (id){
            case R.id.navi_explore_mumbai:
                Intent intent11=new Intent(this,Local_train.class);
                startActivity(intent11);
                break;
            case R.id.navi_travel_hacks:
                Intent intent12=new Intent(this,Local_train.class);
                startActivity(intent12);
                break;
            case R.id.navi_features:
                Intent intent13=new Intent(this,App_features.class);
                startActivity(intent13);
                break;
            case R.id.navi_suggest_feature:
                Intent intent14=new Intent(this,suggest_feature.class);
                startActivity(intent14);
                break;
            case R.id.navi_report_issue:
                Intent intent15=new Intent(this,report_issue.class);
                startActivity(intent15);
                break;
            case R.id.navi_advertise_with_us:
                Intent intent16=new Intent(this,Local_train.class);
                startActivity(intent16);
                break;
            case R.id.navi_rate_app:
                Intent intent17=new Intent(this,Local_train.class);
                startActivity(intent17);
                break;
            case R.id.navi_update_app:
                Intent intent18=new Intent(this,Local_train.class);
                startActivity(intent18);
                break;
            case R.id.navi_about_app:
                Intent intent19=new Intent(this,Local_train.class);
                startActivity(intent19);
                break;
            default:
                break;
        }
        drawer_layout_home=findViewById(R.id.drawer_layout_home);
        drawer_layout_home.closeDrawer(GravityCompat.START);
        return true;

    }



}