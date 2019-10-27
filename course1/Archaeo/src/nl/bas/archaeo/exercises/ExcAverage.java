package nl.bas.archaeo.exercises;

import java.util.Scanner;

public class ExcAverage {
    public static void main(String[] args) {

        double num = 0;
        int x = 1;

        Scanner in = new Scanner(System.in);

        System.out.print("Give n numbers to calculate average: ");
        int n = in.nextInt();

        while (x <= n){
            System.out.println("Input number (" + x + ") :");
            num = num + in.nextInt();
            x++;

        }

        double avgn = (num / n);

        System.out.println("The average is: " + avgn);

    }

}
