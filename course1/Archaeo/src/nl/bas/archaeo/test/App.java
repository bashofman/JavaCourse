package nl.bas.archaeo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {


        List<Integer> list = new ArrayList<>();

        for(int i = 1;i<15;i++) {
            list.add(i);
        }

        System.out.println(list);


        list.stream().map(e -> e * e).forEach(e ->
            System.out.println(e));

        List<Integer> list2 = new ArrayList<>();

        list2 = list.stream().map(e -> e * e).collect(Collectors.toList());

        System.out.println(list2);

        List<Integer> list3 = new ArrayList<>();

        int range = 100;

        for(int i = 0; i < range; i++) {
            int randomNumberBelowRange = (int) (Math.random() * range);
            list3.add(randomNumberBelowRange);
        }

        list3 = list3.stream().distinct().sorted().collect(Collectors.toList());

        System.out.println(list3);

    }
}
