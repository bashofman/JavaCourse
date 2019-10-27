package nl.bas.archaeo.carcase.domain;

import java.util.ArrayList;
import java.util.List;

public class testApp {

    public static void main(String[] args) {

        System.out.println("Hello World");

        int speed;
        int age = 5;
        int yearOfRegistration = 6;
        int [] dates = new int[] {age, yearOfRegistration};
        List<Integer> datesList = new ArrayList<>();


        for ( int i=0; i < dates.length; i++){

            datesList.add (dates[i]);

//        Integer[] numberArray = {1,1,2,3,5,8} voorbeeld Arrays.asList
//      List<Integer> numberList = Arrays.asList(numberArray);



        }
        System.out.println(datesList);


    }
}
