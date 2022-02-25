package com.touchizen.drawerwithbottomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class SosCardActivity extends AppCompatActivity implements View.OnClickListener{


    private PopupWindowHelper popupWindowHelper, popupWindowHelper2,popupWindowHelper3,popupWindowHelper4,
            popupWindowHelper5,popupWindowHelper6,popupWindowHelper7,popupWindowHelper8,
            popupWindowHelper9;
    private View popupview;
    private Toolbar toolbar;

    @SuppressLint("InflateParams")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos_card);
        toolbar = (Toolbar) findViewById(R.id.toolbar_search);
        if(getSupportActionBar() == null) {
            setSupportActionBar(toolbar);
        }else toolbar.setVisibility(View.GONE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        findViewById(R.id.medicalemergencycard).setOnClickListener(this);
        findViewById(R.id.Earthquakecard).setOnClickListener(this);
        findViewById(R.id.abusecard).setOnClickListener(this);
        findViewById(R.id.stuckinliftcard).setOnClickListener(this);
        findViewById(R.id.Animalthreatcard).setOnClickListener(this);
        findViewById(R.id.visitorthreadcard).setOnClickListener(this);
        findViewById(R.id.thiefcard).setOnClickListener(this);
        findViewById(R.id.firecard).setOnClickListener(this);
        findViewById(R.id.othersoscard).setOnClickListener(this);

        popupview = LayoutInflater.from(this).inflate(R.layout.popupview, null);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.medicalemergencycard:
                popupWindowHelper = new PopupWindowHelper(popupview);
                popupWindowHelper.showFromBottom(v);
                break;
            case R.id.Earthquakecard:
                popupWindowHelper2 = new PopupWindowHelper(popupview);
                popupWindowHelper2.showFromBottom(v);
                break;
            case R.id.abusecard:
                popupWindowHelper3 = new PopupWindowHelper(popupview);
                popupWindowHelper3.showFromBottom(v);
                break;
            case R.id.stuckinliftcard:
                popupWindowHelper4 = new PopupWindowHelper(popupview);
                popupWindowHelper4.showFromBottom(v);
                break;
            case R.id.Animalthreatcard:
                popupWindowHelper5 = new PopupWindowHelper(popupview);
                popupWindowHelper5.showFromBottom(v);
                break;
            case R.id.visitorthreadcard:
                popupWindowHelper6 = new PopupWindowHelper(popupview);
                popupWindowHelper6.showFromBottom(v);
                break;
            case R.id.thiefcard:
                popupWindowHelper7 = new PopupWindowHelper(popupview);
                popupWindowHelper7.showFromBottom(v);
                break;
            case R.id.firecard:
                popupWindowHelper8 = new PopupWindowHelper(popupview);
                popupWindowHelper8.showFromBottom(v);
                break;
            case R.id.othersoscard:
                popupWindowHelper9 = new PopupWindowHelper(popupview);
                popupWindowHelper9.showFromBottom(v);
                break;
                default:
                break;
        }

    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}