package nl.bas.archaeo.model;

import javax.naming.Name;

public class Pallace extends Site {

    private double area;
    private String location;
    private int _lat;
    private int _long;

    public Pallace(String name, String type) {
        super (name, type);
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int get_lat() {
        return _lat;
    }

    public void set_lat(int _lat) {
        this._lat = _lat;
    }

    public int get_long() {
        return _long;
    }

    public void set_long(int _long) {
        this._long = _long;
    }

    @Override
    public void decline () {}




}


