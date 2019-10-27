package nl.bas.carcase;

import nl.bas.carcase.domain.Car;
import nl.bas.carcase.domain.PetrolTank;

import java.util.ArrayList;
import java.util.List;

public class CarApp {
    public static void main(String[] args) {



        List<Car> cars = new ArrayList<>();
        Car volvo = new Car("AB-BB-CC", 9550, 70);
        cars.add(volvo);

        System.out.println(cars.isEmpty());

        Car victim = new Car ("AB-BB-CC", 6700, 56);

        cars.remove(victim);

        System.out.println(cars.isEmpty());

       Car opel = new Car ("AB-BC-CC", 6004, 50);
        cars.add(opel);

        Car ford = new Car ("AB-BC-CD", 5004, 45);
        cars.add(ford);





    }

    public static void newCar(){

            System.out.println("Welcome to my very first car application! Yahoo!");

            Car car = new Car("AA-BB-CC", 7897986,7.0);
            car.fill(89);
            System.out.println(car);


    }

    public static void equalsTest(){

        String first = "first";
        String second = "first";
            if (first.equals(second)){
                System.out.println("They are the same");
            }
            else {
                System.out.println("They are not the same");
            }














    }




}
