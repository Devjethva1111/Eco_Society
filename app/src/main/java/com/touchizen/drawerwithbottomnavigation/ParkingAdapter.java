package com.touchizen.drawerwithbottomnavigation;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ParkingAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public ParkingAdapter(Context context, int totalTabs,@NonNull FragmentManager fm) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                MyParking myParking = new MyParking();
                return myParking;
            case 1:
                MembersParking membersParking = new MembersParking();
                return membersParking;
            case 2:
                VisitorParkingFragment visitorParkingFragment = new VisitorParkingFragment();
                return visitorParkingFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
