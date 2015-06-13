package com.pratamawijaya.infocuacadangempaterkini.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by pratama on 6/13/15.
 */
@Root(name = "point")
public class Point {
    @Element(name = "coordinates")
    private String coordinates;

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }
}
