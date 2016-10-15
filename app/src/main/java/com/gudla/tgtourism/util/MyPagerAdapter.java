package com.gudla.tgtourism.util;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    private Fragment mHistoryFragment,mMoreInfoFragment;

    public MyPagerAdapter(FragmentManager fm, Fragment mHistoryFragment,Fragment mMoreInfoFragment) {
        super(fm);
        this.mHistoryFragment=mHistoryFragment;
        this.mMoreInfoFragment=mMoreInfoFragment;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return mHistoryFragment;
        }
        if(position == 1){
            return mMoreInfoFragment;
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "History";
        }
        if(position == 1){
            return "More Info";
        }
        return super.getPageTitle(position);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
