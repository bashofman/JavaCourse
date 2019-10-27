package nl.bas.archaeo.carcase.domain;

public abstract class Vehicle {


    private int price;

    public Vehicle(int price){
        this.price = price;
    }

    public abstract void fill();

    public abstract void fill(int liters);

    public abstract void drive();

    public abstract void drive(int kms);

    //public abstract PetrolTank2 getPetrolTank();
}


