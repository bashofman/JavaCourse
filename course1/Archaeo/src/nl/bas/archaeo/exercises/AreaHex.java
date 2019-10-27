package nl.bas.archaeo.exercises;

import java.util.Scanner;

import static java.lang.Math.*;

public class AreaHex {

    public static void main(String[] args) {

        double area = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Give number of sides Polygon: ");
        int sides = input.nextInt();
        System.out.print("Give length of sides: ");
        double length = input.nextDouble();

        area = sides*pow(length, 2)/(4*tan(PI/sides));

        System.out.println(area);
    }
}
