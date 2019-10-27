package nl.bas.archaeo.test;

import java.util.ArrayList;
import java.util.List;

public class CarTest {

    public static void main(String[] args) {
        System.out.println("Welcome to my very first car application! Yahoo!");

        int speed = 60;
        int age = 10;
        int yearOfRegistration = 2009;

        System.out.println(speed);

        int ageRegistration[] = new int[]{age, yearOfRegistration};

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < ageRegistration.length; i++) {
            System.out.println(ageRegistration[i]);
            numbers.add(ageRegistration[i]);
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

        }

    }

}
