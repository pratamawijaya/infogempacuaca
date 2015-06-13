package com.pratamawijaya.infocuacadangempaterkini.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by pratama on 6/13/15.
 */
@Root(name = "Cuaca")
public class CuacaIndo {

    @Element(name = "Tanggal")
    private Tanggal tanggal;

    @Element(name = "Isi")
    private Isi isi;

    public Tanggal getTanggal() {
        return tanggal;
    }

    public void setTanggal(Tanggal tanggal) {
        this.tanggal = tanggal;
    }

    public Isi getIsi() {
        return isi;
    }

    public void setIsi(Isi isi) {
        this.isi = isi;
    }

}

