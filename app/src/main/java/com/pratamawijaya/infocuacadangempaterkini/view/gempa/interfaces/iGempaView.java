package com.pratamawijaya.infocuacadangempaterkini.view.gempa.interfaces;


import com.pratamawijaya.infocuacadangempaterkini.model.Gempa;

import java.util.List;

/**
 * Created by pratama on 6/13/15.
 */
public interface iGempaView {
    void loadData(List<Gempa> gempa);

    void showLoading(boolean show);
}
