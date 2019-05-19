package com.example.admin.mhabibnf;
/**
 * TANGGAL PENGERJAAN : 15 MEI 2019
 * NIM                : 10116369
 * NAMA               : MUHAMMAD HABIB NUR FAUZAN
 * KELAS              : IF - 8
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import static com.example.admin.mhabibnf.TabFragment.int_items;


public class MyAdapter  extends FragmentPagerAdapter {


    public MyAdapter(FragmentManager fm)
    {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new MutualFundFragment();
            case 1:
                return new UlipFragment();


        }
        return null;
    }

    @Override
    public int getCount() {


        return int_items;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Main";
            case 1:
                return "About Apps";


        }

        return null;
    }
}
