package nl.bas.archaeo.exercises;

import java.util.Scanner;

public class sumDigit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("input an integer: ");
        int n = input.nextInt();
        System.out.println("The sum of the digits is: " + sumDigits(n));

    }

    public static int sumDigits(int n){
        int sum = 0;
        while(n != 0){
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }
}
