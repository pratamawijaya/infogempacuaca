package com.pratamawijaya.infocuacadangempaterkini.presenter;

import android.util.Log;

import com.pratamawijaya.infocuacadangempaterkini.model.FragmentModels;
import com.pratamawijaya.infocuacadangempaterkini.view.cuaca.CuacaViewFragment;
import com.pratamawijaya.infocuacadangempaterkini.view.gempa.GempaViewFragment;
import com.pratamawijaya.infocuacadangempaterkini.view.main.interfaces.iMainView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pratama on 6/12/15.
 */
public class MainViewPresenter {
    private iMainView view;
    private List<FragmentModels> fragmentModels;

    public MainViewPresenter(iMainView view) {
        this.view = view;
    }

    public void addFragment() {
        fragmentModels = new ArrayList<>();

        // add cuaca
        fragmentModels.add(new FragmentModels(new CuacaViewFragment(), "Cuaca Hari ini"));

        // add gempa
        fragmentModels.add(new FragmentModels(new GempaViewFragment(), "Gempa Terkini"));

        // pass to view
        view.setupFragment(fragmentModels);
        Log.d("debug", "finish add fragment");
    }
}
