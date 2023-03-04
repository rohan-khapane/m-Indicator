package com.example.m_indicator;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class viewpager_local_adapter extends FragmentPagerAdapter {

    public viewpager_local_adapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new station_fragment_local_train();
        }else if(position==1){
            return new A_to_B_fragment_local();
        }
        else{
            return new Fare_local_train();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if(position==0){
            return "Station";
        }else if(position==1){
            return "A to B";
        }else{
            return "Fare";
        }




    }


}
