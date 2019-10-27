package nl.bas.carcase.domain;

import java.util.Objects;

public class Car {

    private int speed;
    private double price;
    private String licensePlate;
    private int mileAge;
    private PetrolTank petrolTank;


    public Car(String licensePlate, double price, double maxLevel) {
        this.licensePlate = licensePlate;
        this.price = price;
        this.petrolTank = new PetrolTank(maxLevel);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getMileAge() {
        return mileAge;
    }

    public void setMileAge(int mileAge) {
        this.mileAge = mileAge;
    }

    public void fill() {
        petrolTank.fill();
    }


    public void fill(double liters) {
        petrolTank.fill(liters);
    }


    public void drive() {
        mileAge++;
    }

    public void drive(int kms) {
        this.mileAge = mileAge + kms;
    }

    public void driveAlternate(int km) {
        while (speed > 0) {
            drive();
        }
    }


    @Override
    public java.lang.String toString() {
        return licensePlate + "  " + price;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return licensePlate.equals(car.licensePlate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(licensePlate);
    }




}
