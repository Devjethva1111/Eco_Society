package com.touchizen.drawerwithbottomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MarketplaceCardActivity extends AppCompatActivity {
    TabLayout tabLayout_market;
    ViewPager viewPager_market;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marketplace_card);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar_search);
        if(getSupportActionBar() == null) {
            setSupportActionBar(toolbar);
        }else toolbar.setVisibility(View.GONE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tabLayout_market = findViewById(R.id.tabLayout_market);
        viewPager_market = findViewById(R.id.viewPager_market);

        tabLayout_market.addTab(tabLayout_market.newTab().setText("All Classified"));
        tabLayout_market.addTab(tabLayout_market.newTab().setText("My classified"));
        tabLayout_market.setTabGravity(TabLayout.GRAVITY_FILL);
        final MymarketAdapter mymarketAdapter = new MymarketAdapter(this,getSupportFragmentManager(), tabLayout_market.getTabCount());
        viewPager_market.setAdapter(mymarketAdapter);

        viewPager_market.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout_market));

        viewPager_market.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout_market));

        tabLayout_market.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager_market.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {


            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}