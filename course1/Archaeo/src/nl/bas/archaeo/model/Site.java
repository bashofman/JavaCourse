package nl.bas.archaeo.model;

public abstract class Site {

    //static variable
    public static int Counter = 0;


    //fields or variables
    public String name;
    public String type;
    private int inhabitants;
    private int years_excavated;
    private double excavated;
    private int density;


    //constructor
    public Site (String name, String type){
        this.name = name;
        this.type = type;
        Counter++;
    }


    // getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }

    public int getYears_excavated() {
        return years_excavated;
    }

    public void setYears_excavated(int years_excavated) {
        this.years_excavated = years_excavated;
    }

    public double getExcavated() {
        return excavated;
    }

    public void setExcavated(double excavated) {
        this.excavated = excavated;
    }

    public int getDensity() {
        return density;
    }

    public void setDensity(int density) {
        this.density = density;
    }

    double artifacts (){
        return excavated * density;

    }

    public abstract void decline ();

}
