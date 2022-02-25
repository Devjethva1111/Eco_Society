package com.touchizen.drawerwithbottomnavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.touchizen.drawerwithbottomnavigation.parking.ParkingModelClass;


public class MyParking extends Fragment {

    FloatingActionButton fab;
    TextView vhcl1, vhcl2;
    FirebaseDatabase mdatabse;
    DatabaseReference mref;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_my_parking, container, false);

        fab = root.findViewById(R.id.fab);
        vhcl1 = root.findViewById(R.id.txt1_vehicle);
        vhcl2 = root.findViewById(R.id.txt2_vehicle);


        mdatabse = FirebaseDatabase.getInstance();
        mref = mdatabse.getReference();

        mref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot ds: snapshot.getChildren() ){

                    ParkingModelClass cmodel = ds.getValue(ParkingModelClass.class);
                    String vhcll1 =  cmodel.getVehicle1();
                    String vhcll2 = cmodel.getVehicle2();


                    vhcl1.setText(vhcll1);
                    vhcl2.setText(vhcll2);

                }


            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Request_Parking.class);
                startActivity(i);

            }
        });
        return root;
    }
}