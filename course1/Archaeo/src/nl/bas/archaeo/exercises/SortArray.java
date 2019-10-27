package nl.bas.archaeo.exercises;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {

    public static void main(String[] args) {

        int[] array1 = {4233, 43556, 6656,876,1234,5555};

        String[] array2 = {"Mees", "Stan" , "Nino", "Marije", "Bas"};

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(4233, 43556, 6656,876,1234,5555));

        System.out.println(Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
        System.out.println(list1);
        Collections.sort(list1);
        System.out.println(list1);

    }




}
