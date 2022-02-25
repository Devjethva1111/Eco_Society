package com.touchizen.drawerwithbottomnavigation;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.touchizen.drawerwithbottomnavigation.ui.home.HomeFragment;

public class MymarketAdapter extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public MymarketAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                AllClassifiedFragment allClassifiedFragment = new AllClassifiedFragment();
                return allClassifiedFragment;
            case 1:
                MyClassifiedFragment myClassifiedFragment = new MyClassifiedFragment();
                return myClassifiedFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
