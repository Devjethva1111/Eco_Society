package com.touchizen.drawerwithbottomnavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class AllClassifiedFragment extends Fragment {

    ImageView furniture, cars, mobiles, bikes, fashion, pets, sports, books;

    public AllClassifiedFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_all_classified, container, false);
       furniture = root.findViewById(R.id.furniture_market);
       cars = root.findViewById(R.id.cars_market);
       mobiles = root.findViewById(R.id.mobile_market);
       bikes = root.findViewById(R.id.bikes_market);
       fashion = root.findViewById(R.id.fashion_market);
       pets = root.findViewById(R.id.pet_market);
       sports = root.findViewById(R.id.sports_market);
       books = root.findViewById(R.id.books_market);

        furniture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Add_furniture_market.class);
                startActivity(i);
            }
        });

        cars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Add_cars_market.class);
                startActivity(i);
            }
        });

        mobiles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Add_mobile_market.class);
                startActivity(i);
            }
        });

        bikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Add_bikes_marekt.class);
                startActivity(i);
            }
        });

        fashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Add_fashion_market.class);
                startActivity(i);
            }
        });

        pets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Add_pets_market.class);
                startActivity(i);
            }
        });

        sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Add_sports_market.class);
                startActivity(i);
            }
        });

        books.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Add_books_market.class);
                startActivity(i);
            }
        });
        return root;

    }
}