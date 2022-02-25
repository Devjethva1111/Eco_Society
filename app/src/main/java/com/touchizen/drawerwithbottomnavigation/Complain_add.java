package com.touchizen.drawerwithbottomnavigation;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;

public class Complain_add extends AppCompatActivity {

    ImageView photoview;
    int SELECT_PICTURE = 200;
    Spinner spinner_complain;
    Button submit;
    EditText title, description;

    String[] country = { "Electrician", "plumbing", "Commen Area", "Car Parking", "Lift Service","Water Leakage","Security"};

    private FirebaseDatabase db1 = FirebaseDatabase.getInstance();
    private DatabaseReference root1 = db1.getReference().push().child("Complaints");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain_add);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_search);
        if(getSupportActionBar() == null) {
            setSupportActionBar(toolbar);
        }else toolbar.setVisibility(View.GONE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        photoview = findViewById(R.id.imageview);
        submit = findViewById(R.id.sbmitbutton);
        title = findViewById(R.id.complain_title);
        description = findViewById(R.id.addtext);
        spinner_complain = findViewById(R.id.spinner_complain);



        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String desc1 = title.getText().toString();
                String comlaintitle = description.getText().toString();

                HashMap<String, String> usermap = new HashMap<>();
                usermap.put("Title", desc1);
                usermap.put("Description", comlaintitle);

                root1.push().setValue(usermap);
            }
        });






        //Creating the ArrayAdapter instance having the country list
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spinner_complain.setAdapter(aa);

    }

    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        Toast.makeText(getApplicationContext(),country[position] , Toast.LENGTH_LONG).show();
    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }




    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}