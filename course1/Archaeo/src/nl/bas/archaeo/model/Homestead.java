package nl.bas.archaeo.model;

public class Homestead extends Site{

    private int number_buildings;
    private String production;
    private String connection_with;

    public Homestead(String name, String type) {
        super (name, type);
    }

    public int getNumber_buildings() {
        return number_buildings;
    }

    public void setNumber_buildings(int number_buildings) {
        this.number_buildings = number_buildings;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getConnection_with() {
        return connection_with;
    }

    public void setConnection_with(String connection_with) {
        this.connection_with = connection_with;
    }
    @Override
    public void decline() {
        System.out.println("The Homestead is stable...");

    }


 }
