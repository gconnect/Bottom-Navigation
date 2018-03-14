package com.gconnect.mediamall;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.gconnect.mediamall.Model.CustomAdapter;
import com.gconnect.mediamall.Model.GridViewItem;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        gridView = (GridView)findViewById(R.id.grid_view);

        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), app_name,app_icon);
        gridView.setAdapter(adapter);
        //event
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override


// This method selects correct fragment.


            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    HomeActivity.this.startActivity(new Intent(HomeActivity.this.getApplicationContext(), AboutActivity.class));
                } else if (position == 1) {
                    HomeActivity.this.startActivity(new Intent(HomeActivity.this.getApplicationContext(), WebFragment.class));
                } else if (position == 2) {
                    HomeActivity.this.startActivity(new Intent(HomeActivity.this.getApplicationContext(), AboutActivity.class));
                } else if (position == 3) {
                    HomeActivity.this.startActivity(new Intent(HomeActivity.this.getApplicationContext(), AboutActivity.class));
                } else if (position == 4) {
                    HomeActivity.this.startActivity(new Intent(HomeActivity.this.getApplicationContext(), AboutActivity.class));
                } else if (position == 5)
                    HomeActivity.this.startActivity(new Intent(HomeActivity.this.getApplicationContext(), AboutActivity.class));
            }
        });
    }
}
