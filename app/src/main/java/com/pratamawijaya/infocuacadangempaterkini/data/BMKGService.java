package com.pratamawijaya.infocuacadangempaterkini.data;


import com.pratamawijaya.infocuacadangempaterkini.model.CuacaIndo;
import com.pratamawijaya.infocuacadangempaterkini.model.GempaTerkini;

import retrofit.http.GET;
import rx.Observable;

/**
 * Created by pratama on 6/13/15.
 */
public interface BMKGService {

    @GET("/gempaterkini.xml")
    public Observable<GempaTerkini> getGempaTerkini();

    @GET("/cuaca_indo_1.xml")
    public Observable<CuacaIndo> getCuacaIndonesian();


}
