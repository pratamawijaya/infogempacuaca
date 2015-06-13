package com.pratamawijaya.infocuacadangempaterkini.view.main.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.pratamawijaya.infocuacadangempaterkini.model.FragmentModels;

import java.util.List;

/**
 * Created by pratama on 6/12/15.
 */
public class MainViewAdapter extends FragmentPagerAdapter {
    private List<FragmentModels> fragmentModels;

    public MainViewAdapter(FragmentManager fm, List<FragmentModels> fragmentModels) {
        super(fm);
        this.fragmentModels = fragmentModels;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentModels.get(position).getFragment();
    }

    @Override
    public int getCount() {
        return fragmentModels.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentModels.get(position).getTitle();
    }
}
