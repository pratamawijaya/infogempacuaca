package com.pratamawijaya.infocuacadangempaterkini.model;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by pratama on 6/13/15.
 */
@Root(name = "InfoGempa")
public class GempaTerkini {
    @ElementList(inline = true)
    private List<Gempa> gempaList;

    public List<Gempa> getGempaList() {
        return gempaList;
    }

    public void setGempaList(List<Gempa> gempaList) {
        this.gempaList = gempaList;
    }
}
