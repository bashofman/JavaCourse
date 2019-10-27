package nl.bas.archaeo.exercises;

import nl.bas.archaeo.exceptions.KasteelException;

import java.sql.ResultSet;
import java.util.Scanner;

public class RootApp {

    public static void main(String[] args) throws KasteelException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = sc.nextInt();
        System.out.print("Input second number: ");
        int b = sc.nextInt();
        System.out.print("Input third number: ");
        int c = sc.nextInt();

        double intermediate = b * b -4*a*c;

        if(a != 0) {

            if (intermediate > 0) {
                double result1 = (-b + intermediate) / (2 * a);
                double result2 = (-b - intermediate) / (2 * a);
                System.out.println("The roots are: " + result1 + " and " + result2);
            } else if (intermediate == 0) {
                double result1 = -b / 2 * a;
                System.out.println("The root is: " + result1);
            } else
                System.out.println(" the equation has no real roots");

        }

        else {
            throw new KasteelException();
        }


    }
}
