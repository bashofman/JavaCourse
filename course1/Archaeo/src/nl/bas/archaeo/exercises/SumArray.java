package nl.bas.archaeo.exercises;


import java.util.Arrays;

public class SumArray {

    public static void main(String[] args) {

        int[] array3 = {43, 45, 65, 23, 345 ,12, 23};
        int sum = 0;

 //       for (int i : array3){ //snelle mannier: int i element van array3
 //           sum = sum + i;
            for (int i = 0; i < array3.length; i++){
            sum = sum + array3[i];

        }
        System.out.println(sum);

    }

}
