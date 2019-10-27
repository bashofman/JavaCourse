package nl.bas.archaeo.exercises;

import java.util.Scanner;

public class BoolApp {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Give a number: ");
        int number = sc.nextInt();

        if(number >= 0){
               System.out.println("number is positive");
            }
        else System.out.println("number is negative");

        }


}
