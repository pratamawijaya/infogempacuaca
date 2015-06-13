package com.pratamawijaya.infocuacadangempaterkini.model;

import android.support.v4.app.Fragment;

/**
 * Created by pratama on 6/12/15.
 */
public class FragmentModels {
    private Fragment fragment;
    private String title;

    public FragmentModels(Fragment fragment, String title) {
        this.fragment = fragment;
        this.title = title;
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
