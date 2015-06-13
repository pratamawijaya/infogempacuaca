package com.pratamawijaya.infocuacadangempaterkini.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by pratama on 6/13/15.
 */
@Root(name = "Tanggal")
public class Tanggal {
    @Element(name = "Mulai")
    private String tanggalMulai;
    @Element(name = "Sampai")
    private String tanggalSampai;

    public String getTanggalMulai() {
        return tanggalMulai;
    }

    public void setTanggalMulai(String tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }

    public String getTanggalSampai() {
        return tanggalSampai;
    }

    public void setTanggalSampai(String tanggalSampai) {
        this.tanggalSampai = tanggalSampai;
    }
}
