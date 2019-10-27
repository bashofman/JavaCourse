package nl.bas.archaeo.carcase.domain;

public class Racecar extends Car2 {


    public Racecar(int price, String licensePLate, double maxLevel, double currentLevel, int year, int month, int dayOfMonth) {
        super(price, licensePLate, maxLevel, currentLevel, year, month, dayOfMonth);
    }
    @Override
    public void drive() {
        super.drive();
        System.out.println("Driving racecar");
    }
}
