package com.pratamawijaya.infocuacadangempaterkini.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by pratama on 6/13/15.
 */
@Root(name = "Isi")
public class Isi {
    @ElementList(inline = true)
    private List<Row> rowList;

    @Element(name = "Peringatan")
    private String peringatan;

    public String getPeringatan() {
        return peringatan;
    }

    public void setPeringatan(String peringatan) {
        this.peringatan = peringatan;
    }

    public List<Row> getRowList() {
        return rowList;
    }

    public void setRowList(List<Row> rowList) {
        this.rowList = rowList;
    }
}
