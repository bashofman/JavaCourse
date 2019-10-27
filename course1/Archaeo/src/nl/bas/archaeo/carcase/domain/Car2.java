package nl.bas.archaeo.carcase.domain;

import java.time.*;

public class Car2 extends Vehicle{

    private double speed;
    private String licensePlate;
    private int mileAge;
    private PetrolTank2 petrolTank;
    private LocalDate registrationDate;

    public Car2(int price, String licensePLate, double maxLevel, double currentLevel, int year, int month, int dayOfMonth) {
        super(price);
        this.licensePlate = licensePLate;
        this.petrolTank = new PetrolTank2(maxLevel, currentLevel);
        this.registrationDate = LocalDate.of(year, month, dayOfMonth);
    }


    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getLicenseplate() {
        return licensePlate;
    }

    public void setLicenseplate(String licenseplate) {
        this.licensePlate = licenseplate;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public int getMileAge() {
        return mileAge;
    }

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }

    public String toString(){
        return "Licenseplate = " + licensePlate + " current level: " + petrolTank.getCurrentLevel() + " maximum level: " + petrolTank.getMaxLevel() + "registration date: " + getRegistrationDate();

    }
    @Override
    public void fill(){
        petrolTank.incr();
    }
    @Override
    public void fill(int liters){
        petrolTank.incrLiters(liters);
    }

    @Override
    public void drive(){
        mileAge++;
        petrolTank.dec();
    }

    @Override
    public void drive(int kms){
        mileAge = mileAge + kms;
        petrolTank.decrLiters(kms);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car2)) return false;
        Car2 car2 = (Car2) o;
        return licensePlate.equals(car2.licensePlate);
    }

    @Override
    public int hashCode() {
        return licensePlate.hashCode();
    }


 //   public void driveAlternate(int km){
 //       while(petrolTank.getCurrentLevel() > petrolTank.getMinLevel()){
 //           drive(km);
 //       }
 //   }









}
