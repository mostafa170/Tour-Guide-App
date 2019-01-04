package com.example.android.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import layouts.ClubsFragment;
import layouts.Historical_placesFragment;
import layouts.HotelsFragment;
import layouts.RestaurantsFragment;


public class MainActivity extends FragmentPagerAdapter {
        private final int PAGE_COUNT = 4;

        private String tabTitles[] = new String[]{
                ClubsFragment.NAME,
                Historical_placesFragment.NAME,
                HotelsFragment.NAME,
                RestaurantsFragment.NAME};

        private Context mContext;

        public MainActivity(FragmentManager fm, Context context) {
            super(fm);
            mContext = context;
        }

        @Override
        public int getCount() {
            return PAGE_COUNT;
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;
            switch (position) {
                case 0:
                    fragment = Fragment.instantiate(mContext, ClubsFragment.class.getName());
                    break;
                case 1:
                    fragment = Fragment.instantiate(mContext, Historical_placesFragment.class.getName());
                    break;
                case 2:
                    fragment = Fragment.instantiate(mContext, HotelsFragment.class.getName());
                    break;
                case 3:
                    fragment = Fragment.instantiate(mContext, RestaurantsFragment.class.getName());
                    break;
            }
            return fragment;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            // Generate title based on item position
            return tabTitles[position];
        }
    }