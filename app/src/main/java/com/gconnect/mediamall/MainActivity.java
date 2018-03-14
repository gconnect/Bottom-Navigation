package com.gconnect.mediamall;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.gconnect.mediamall.Model.CustomAdapter;
import com.gconnect.mediamall.Model.GridViewItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    ArrayList<GridViewItem> data = new ArrayList();



    private static String [] app_name = {
            "About",
            "Npower Build/Agro Test",
            "Test Instruction",
            "Npower Teach Test",
            "Npower Health Test",
            "Npower Tax"

    };

    private static int [] app_icon = {
            R.drawable.media_academy,
            R.drawable.media_academy,
            R.drawable.media_academy,
            R.drawable.media_academy,
            R.drawable.media_academy,
            R.drawable.media_academy

    };

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager fragmentManager= getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    transaction.replace(R.id.content, new MenuFragment()).commit();

                    return true;
                case R.id.navigation_dashboard:
                    transaction.replace(R.id.content, new WebFragment()).commit();
                    return true;

                case R.id.navigation_notifications:


                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView)findViewById(R.id.grid_view);

        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), app_name,app_icon);
        gridView.setAdapter(adapter);
        //event
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override


// This method selects correct fragment.


            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), AboutActivity.class));
                } else if (position == 1) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), WebFragment.class));
                } else if (position == 2) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), AboutActivity.class));
                } else if (position == 3) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), AboutActivity.class));
                } else if (position == 4) {
                    MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), AboutActivity.class));
                } else if (position == 5)
                    MainActivity.this.startActivity(new Intent(MainActivity.this.getApplicationContext(), AboutActivity.class));
            }
        });

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        /*FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.content, new MenuFragment()).commit();*/
    }

}
