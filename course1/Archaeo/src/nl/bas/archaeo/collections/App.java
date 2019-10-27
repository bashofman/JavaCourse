package nl.bas.archaeo.collections;

import java.util.*;
import static java.lang.Math.PI;


public class App {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(34,45,1,34,2,789,45,21));

        System.out.println(numbers);

        Collections.sort(numbers);

        System.out.println(numbers);

        Collections.sort(numbers, (a,b) -> b-a);

        System.out.println(numbers);

        System.out.println(PI);






    }
}
