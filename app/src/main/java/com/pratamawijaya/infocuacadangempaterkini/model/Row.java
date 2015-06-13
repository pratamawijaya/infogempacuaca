package com.pratamawijaya.infocuacadangempaterkini.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by pratama on 6/13/15.
 */
@Root(name = "Row")
public class Row {
    @Element(name = "Kota")
    private String kota;
    @Element(name = "Cuaca")
    private String cuaca;
    @Element(name = "SuhuMin")
    private String suhuMin;
    @Element(name = "SuhuMax")
    private String suhuMax;
    @Element(name = "KelembapanMin")
    private String kelembapanMin;
    @Element(name = "KelembapanMax")
    private String kelembapanMax;

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getCuaca() {
        return cuaca;
    }

    public void setCuaca(String cuaca) {
        this.cuaca = cuaca;
    }

    public String getSuhuMin() {
        return suhuMin;
    }

    public void setSuhuMin(String suhuMin) {
        this.suhuMin = suhuMin;
    }

    public String getSuhuMax() {
        return suhuMax;
    }

    public void setSuhuMax(String suhuMax) {
        this.suhuMax = suhuMax;
    }

    public String getKelembapanMin() {
        return kelembapanMin;
    }

    public void setKelembapanMin(String kelembapanMin) {
        this.kelembapanMin = kelembapanMin;
    }

    public String getKelembapanMax() {
        return kelembapanMax;
    }

    public void setKelembapanMax(String kelembapanMax) {
        this.kelembapanMax = kelembapanMax;
    }
}
