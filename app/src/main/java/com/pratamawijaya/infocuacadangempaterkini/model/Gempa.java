package com.pratamawijaya.infocuacadangempaterkini.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by pratama on 6/13/15.
 */
@Root(name = "gempa")
public class Gempa {
    @Element(name = "Tanggal")
    private String tanggal;
    @Element(name = "Jam")
    private String jam;
    @Element(name = "Magnitude")
    private String magnitude;
    @Element(name = "Kedalaman")
    private String kedalaman;
    @Element(name = "Wilayah")
    private String wilayah;
    @Element(name = "point")
    private Point point;
    @Element(name = "Lintang")
    private String lintang;
    @Element(name = "Bujur")
    private String bujur;
    @Element(name = "_symbol")
    private String symbol;

    public String getLintang() {
        return lintang;
    }

    public void setLintang(String lintang) {
        this.lintang = lintang;
    }

    public String getBujur() {
        return bujur;
    }

    public void setBujur(String bujur) {
        this.bujur = bujur;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(String magnitude) {
        this.magnitude = magnitude;
    }

    public String getKedalaman() {
        return kedalaman;
    }

    public void setKedalaman(String kedalaman) {
        this.kedalaman = kedalaman;
    }

    public String getWilayah() {
        return wilayah;
    }

    public void setWilayah(String wilayah) {
        this.wilayah = wilayah;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }
}
