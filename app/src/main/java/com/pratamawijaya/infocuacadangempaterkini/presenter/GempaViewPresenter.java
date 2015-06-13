package com.pratamawijaya.infocuacadangempaterkini.presenter;

import android.util.Log;

import com.pratamawijaya.infocuacadangempaterkini.data.NetworkAPI;
import com.pratamawijaya.infocuacadangempaterkini.helper.LogUtils;
import com.pratamawijaya.infocuacadangempaterkini.model.GempaTerkini;
import com.pratamawijaya.infocuacadangempaterkini.view.gempa.interfaces.iGempaView;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by pratama on 6/13/15.
 */
public class GempaViewPresenter {
    private iGempaView view;
    private NetworkAPI api;

    public GempaViewPresenter(iGempaView view) {
        this.view = view;
        api = new NetworkAPI();
    }

    public void getDataGempa() {
        LogUtils.TRACE("GempaPresenter", "Load Data");
        view.showLoading(true);
        api.getService()
                .getGempaTerkini()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<GempaTerkini>() {
                    @Override
                    public void onCompleted() {
                        LogUtils.TRACE("GempaPresenter", "Load Data Complete");
                        view.showLoading(false);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("debug", "error " + e.getMessage());
                        LogUtils.TRACE("GempaPresenter", "Load Data Error");
                        view.showLoading(false);
                    }

                    @Override
                    public void onNext(GempaTerkini gempaTerkini) {
//                        Log.d("debug", "data : " + gempaTerkini.getGempaList().get(0).getWilayah());
                        view.loadData(gempaTerkini.getGempaList());
                    }
                });
        LogUtils.TRACE("GempaPresenter", "Load Data Done");
    }
}
