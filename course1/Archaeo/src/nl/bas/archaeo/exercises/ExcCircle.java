package nl.bas.archaeo.exercises;

import java.util.Scanner;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class ExcCircle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Give diameter of circle: ");
        double diameter = in.nextInt();

        double area = pow((diameter/2), 2) * PI;
        double perimeter = diameter * PI;

        System.out.println("The area of the circle is: " + area + "m2");
        System.out.println("The perimeter of the circle is: " + perimeter + "m");
    }



}