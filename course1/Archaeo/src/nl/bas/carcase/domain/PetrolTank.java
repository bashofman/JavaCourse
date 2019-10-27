package nl.bas.carcase.domain;

public class PetrolTank {

    private double maxLevel;
    private double minLevel;
    private double currentLevel;

    public PetrolTank(double currentLevel){

        this.currentLevel = currentLevel;
    }

    public void dec(){
        currentLevel--;

    }


    public void fill(){
        currentLevel++;
    }

    public void fill(double liters){
        this.currentLevel = currentLevel + liters;


    }



    }








