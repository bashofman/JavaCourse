package nl.bas.archaeo.carcase.domain;

public class Truck extends Vehicle{

    private int weight;

    public Truck(int price) {
        super(price);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void fill() {

    }

    @Override
    public void fill(int liters) {

    }

    @Override
    public void drive() {

    }

    @Override
    public void drive(int kms) {

    }
}
