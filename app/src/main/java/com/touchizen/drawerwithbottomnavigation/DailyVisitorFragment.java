package com.touchizen.drawerwithbottomnavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class DailyVisitorFragment extends Fragment {

    FloatingActionButton fab_daily_visitor;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_daily_visitor, container, false);

        fab_daily_visitor = root.findViewById(R.id.fab_daily_visitor);

        fab_daily_visitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), DailyVisitorPage.class);
                startActivity(i);

            }
        });
        return root;
    }
}