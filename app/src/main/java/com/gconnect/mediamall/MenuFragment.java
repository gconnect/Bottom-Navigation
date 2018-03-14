package com.gconnect.mediamall;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.gconnect.mediamall.Model.CustomAdapter;
import com.gconnect.mediamall.Model.GridViewItem;

import java.util.ArrayList;

/**
 * Created by gconnect on 30/08/2017.
 */

public class MenuFragment extends Fragment
        implements NavigationView.OnNavigationItemSelectedListener {
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v= inflater.inflate(R.layout.fragment_menu, container, false);
        gridView = (GridView)v.findViewById(R.id.grid_view);

        CustomAdapter adapter = new CustomAdapter(getActivity(), app_name,app_icon);
        gridView.setAdapter(adapter);
        //event
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override


// This method selects correct fragment.


            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    MenuFragment.this.startActivity(new Intent(MenuFragment.this.getActivity(), AboutActivity.class));
                } else if (position == 1) {
                    MenuFragment.this.startActivity(new Intent(MenuFragment.this.getActivity(), WebFragment.class));
                } else if (position == 2) {
                    MenuFragment.this.startActivity(new Intent(MenuFragment.this.getActivity(), AboutActivity.class));
                } else if (position == 3) {
                    MenuFragment.this.startActivity(new Intent(MenuFragment.this.getActivity(), AboutActivity.class));
                } else if (position == 4) {
                    MenuFragment.this.startActivity(new Intent(MenuFragment.this.getActivity(), AboutActivity.class));
                } else if (position == 5)
                    MenuFragment.this.startActivity(new Intent(MenuFragment.this.getActivity(), AboutActivity.class));
            }
        });
        return v;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
