package com.example.admin.mhabibnf;
/**
 * TANGGAL PENGERJAAN : 15 MEI 2019
 * NIM                : 10116369
 * NAMA               : MUHAMMAD HABIB NUR FAUZAN
 * KELAS              : IF - 8
 */

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    FragmentManager FM;
    FragmentTransaction FT;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);
        navigationView= (NavigationView) findViewById(R.id.navView);

        FM= getSupportFragmentManager();
        FT= FM.beginTransaction();
        FT.replace(R.id.containerView, new TabFragment()).commit();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                drawerLayout.closeDrawers();

                if (item.getItemId()== R.id.nav_home) {
                    FragmentTransaction fragmentTransaction= FM.beginTransaction();
                    fragmentTransaction.replace(R.id.containerView, new TabFragment()).commit();
                }


                else if (item.getItemId()==R.id.nav_profile)
                {
                    FragmentTransaction fragmentTransaction1=FM.beginTransaction();
                    fragmentTransaction1.replace(R.id.containerView,new UlipFragment()).commit();
                }

                else if (item.getItemId()==R.id.nav_contact)
                {
                    FragmentTransaction fragmentTransaction1=FM.beginTransaction();
                    fragmentTransaction1.replace(R.id.containerView,new ContactFragment()).commit();
                }

                else if (item.getItemId()== R.id.nav_friends)
                {
                    FragmentTransaction fragmentTransaction= FM.beginTransaction();
                    fragmentTransaction.replace(R.id.containerView, new ProfileFragment()).commit();
                }
                return false;
            }
        });


        android.support.v7.widget.Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.app_name,R.string.app_name);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


    }
}
