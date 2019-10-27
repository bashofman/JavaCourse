package nl.bas.archaeo.exercises;

import java.util.Scanner;

public class GreatestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" Give the first number: ");
        int number1 = sc.nextInt();
        System.out.print(" Give the second number: ");
        int number2 = sc.nextInt();
        System.out.print(" Give the third number: ");
        int number3 = sc.nextInt();

        if(number1>number2) {
            if (number1 > number3)
                System.out.println("The greatest number is: " + number1);
                else
                System.out.println("The greatest number is: " + number3);
            }
        else if(number2 > number3) {
            System.out.println("The greatest number is: " + number2);
            }
        else
            System.out.println("The greatest number is: " + number3);
    }
}
