package nl.bas.archaeo.carcase.domain;

public class PetrolTank2 {

    private double maxLevel;
    private double minLevel;
    private double currentLevel;

    public PetrolTank2(double maxLevel, double currentLevel) {
        this.maxLevel = maxLevel;
        this.currentLevel = currentLevel;
    }


    public double getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(double maxLevel) {
        this.maxLevel = maxLevel;
    }

    public double getMinLevel() {
        return minLevel;
    }

    public void setMinLevel(double minLevel) {
        this.minLevel = minLevel;
    }

    public double getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(double currentLevel) {
        this.currentLevel = currentLevel;
    }

    public void dec() {
        if (currentLevel > minLevel) {
            currentLevel--;
        }
    }

    public void decrLiters(double lts) {
        double decrLevel = currentLevel - lts;
        currentLevel = (decrLevel > minLevel) ? decrLevel : currentLevel;
    }

    public void incr(){
        if(currentLevel < maxLevel){
        currentLevel++;}
    }

    public void incrLiters(int liters){
        if(currentLevel < maxLevel)
        { currentLevel = currentLevel + liters;}

    }

    public String toString() {
        return "current level= " + currentLevel;
    }

}
