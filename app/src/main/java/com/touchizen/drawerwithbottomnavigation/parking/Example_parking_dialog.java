package com.touchizen.drawerwithbottomnavigation.parking;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.touchizen.drawerwithbottomnavigation.MyParking;
import com.touchizen.drawerwithbottomnavigation.R;

public class Example_parking_dialog extends AppCompatDialogFragment {
    EditText edt_vehicle1, edtvehicle2;
    FirebaseDatabase mdatabse;
    DatabaseReference mref, databaseReference;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.c1_dialogbox,null);
        builder.setView(view)
                .setTitle("C1 Parking")
                .setNegativeButton("cancle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String vh1 =edt_vehicle1.getText().toString();
                        String vh2 = edtvehicle2.getText().toString();

                        if (vh1.isEmpty() || vh2.isEmpty()){
                            Toast.makeText(getContext(), "Please enter the data", Toast.LENGTH_SHORT).show();
                        }else{
                            String userid = mref.push().getKey();
                            ParkingModelClass parkingModelClass =new ParkingModelClass();
                            parkingModelClass.setVehicle1(vh1);
                            parkingModelClass.setVehicle2(vh2);


                            mref.child(userid).setValue(parkingModelClass, new DatabaseReference.CompletionListener() {
                                @Override
                                public void onComplete(@Nullable DatabaseError databaseError, @NonNull DatabaseReference ref) {

                                    if (databaseError == null){
                                        Toast.makeText(getContext(), "insert data is successfully", Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(getContext(), MyParking.class);
                                        startActivity(intent);
                                    }else{
                                        Toast.makeText(getContext(), "some issues are here ", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            });
                        }

                    }
                });

        edt_vehicle1 = view.findViewById(R.id.edit_vehicle1);
        edtvehicle2 = view.findViewById(R.id.edit_vehicle2);

        mdatabse = FirebaseDatabase.getInstance();
        mref = mdatabse.getReference();
        return builder.create();
    }
}
