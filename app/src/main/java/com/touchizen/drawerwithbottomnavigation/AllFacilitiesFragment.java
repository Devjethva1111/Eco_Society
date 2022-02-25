package com.touchizen.drawerwithbottomnavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class AllFacilitiesFragment extends Fragment {
    ImageView garden , gym, auditarium, gamezone, commonpot, library, theator, tennins1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_all_facilities, container, false);
        garden = root.findViewById(R.id.garden_image);
        gym = root.findViewById(R.id.gym_facility);
        auditarium = root.findViewById(R.id.auditarium_image);
        gamezone = root.findViewById(R.id.game_zone_image);
        commonpot = root.findViewById(R.id.common_plot_image);
        library = root.findViewById(R.id.library_image);
        theator = root.findViewById(R.id.theater_facility);
        tennins1 = root.findViewById(R.id.tennis1_image);


        garden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), add_garden_facility.class);
                startActivity(i);
            }
        });

        gym.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), add_gym_facility.class);
                startActivity(i);
            }
        });

        auditarium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), add_auditarium.class);
                startActivity(i);
            }
        });

        theator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), add_theator_activity.class);
                startActivity(i);
            }
        });

        gamezone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), add_game_zone_facilities.class);
                startActivity(i);
            }
        });

        tennins1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Add_tennis_court.class);
                startActivity(i);
            }
        });

        commonpot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), add_common_plot.class);
                startActivity(i);
            }
        });

        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Add_library_facility.class);
                startActivity(i);
            }
        });
        return root;
    }
}