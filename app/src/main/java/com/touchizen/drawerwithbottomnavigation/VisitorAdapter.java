package com.touchizen.drawerwithbottomnavigation;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class VisitorAdapter extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public VisitorAdapter(Context context, int totalTabs,@NonNull FragmentManager fm) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                MyFragment myFragment = new MyFragment();
                return myFragment;
            case 1:
                MemberVisitorFragment memberVisitorFragment = new MemberVisitorFragment();
                return memberVisitorFragment;
            case 2:
                DailyVisitorFragment dailyVisitorFragment = new DailyVisitorFragment();
                return dailyVisitorFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
