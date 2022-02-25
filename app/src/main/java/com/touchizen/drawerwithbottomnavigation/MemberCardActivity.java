package com.touchizen.drawerwithbottomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MemberCardActivity extends AppCompatActivity {

    TextView backarrow;
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<modelclass> userList;
    Adapter adapter;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_card);

        initData();
        initRecyclerview();

        toolbar = (Toolbar) findViewById(R.id.toolbar_search);
        if(getSupportActionBar() == null) {
            setSupportActionBar(toolbar);
        }else toolbar.setVisibility(View.GONE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void initData() {

        userList= new ArrayList<>();
        userList.add(new modelclass("1 floor","101","Dev","102","Ajay","103","Abhishek","104","Shreya"));
        userList.add(new modelclass("2 floor","201","Abhishek","202","Ajay","203","Dev","204","Shreya"));
        userList.add(new modelclass("3 floor","301","Ajaysinh","302","Abhishek","303","Dev","304","Shreya"));
        userList.add(new modelclass("4 floor","401","Shreya","402","Ajay","403","Dev","404","Abhishek"));

    }

    private void initRecyclerview() {
        recyclerView=findViewById(R.id.rvn);
        layoutManager= new LinearLayoutManager(this);
        layoutManager.setOrientation(recyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter=new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}