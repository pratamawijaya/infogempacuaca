package com.pratamawijaya.infocuacadangempaterkini.data;

import com.mobprofs.retrofit.converters.SimpleXmlConverter;
import com.pratamawijaya.infocuacadangempaterkini.BuildConfig;
import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by pratama on 6/13/15.
 */
public class NetworkAPI {

    private static final String URL = "http://data.bmkg.go.id/";

    private final BMKGService service;

    public NetworkAPI() {
        OkHttpClient httpClient = new OkHttpClient();

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(URL)
                .setLogLevel(BuildConfig.DEBUG ?
                        RestAdapter.LogLevel.FULL :
                        RestAdapter.LogLevel.NONE)
                .setClient(new OkClient(httpClient))
                .setConverter(new SimpleXmlConverter())
                .build();

        service = restAdapter.create(BMKGService.class);
    }

    public BMKGService getService() {
        return service;
    }
}
