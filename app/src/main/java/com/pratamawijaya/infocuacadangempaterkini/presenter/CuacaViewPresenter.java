package com.pratamawijaya.infocuacadangempaterkini.presenter;


import com.pratamawijaya.infocuacadangempaterkini.data.NetworkAPI;
import com.pratamawijaya.infocuacadangempaterkini.helper.LogUtils;
import com.pratamawijaya.infocuacadangempaterkini.model.CuacaIndo;
import com.pratamawijaya.infocuacadangempaterkini.view.cuaca.interfaces.iCuacaView;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by pratama on 6/13/15.
 */
public class CuacaViewPresenter {
    private iCuacaView view;
    private NetworkAPI api;

    public CuacaViewPresenter(iCuacaView view) {
        this.view = view;
        api = new NetworkAPI();
    }

    public void loadData() {
        api.getService()
                .getCuacaIndonesian()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<CuacaIndo>() {
                    @Override
                    public void onCompleted() {
                        LogUtils.TRACE("cuacapresenter", "complete ");
                    }

                    @Override
                    public void onError(Throwable e) {
                        LogUtils.TRACE("cuacapresenter", "error " + e.getMessage());
                    }

                    @Override
                    public void onNext(CuacaIndo cuacaIndo) {
                        view.loadData(cuacaIndo.getIsi().getRowList());
                    }
                });
    }
}

