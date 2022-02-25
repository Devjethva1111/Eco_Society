package com.touchizen.drawerwithbottomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.touchizen.drawerwithbottomnavigation.parking.A_BLOCK;
import com.touchizen.drawerwithbottomnavigation.parking.B_BLOCK;

import java.util.ArrayList;
import java.util.List;

public class Request_Parking extends AppCompatActivity{
    CardView ablock,bblock,cblock,dblock,eblock,fblock,gblock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_parking);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_search);
        if(getSupportActionBar() == null) {
            setSupportActionBar(toolbar);
        }else toolbar.setVisibility(View.GONE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ablock = findViewById(R.id.a_block_card);
        bblock = findViewById(R.id.b_block_card);
        cblock = findViewById(R.id.c_block_card);
        dblock = findViewById(R.id.d_block_card);
        fblock = findViewById(R.id.f_block_card);
        gblock = findViewById(R.id.g_block_card);

        ablock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(getApplicationContext(), A_BLOCK.class);
                startActivity(i1);
            }
        });

        bblock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(), B_BLOCK.class);
                startActivity(i2);
            }
        });

    }





    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}