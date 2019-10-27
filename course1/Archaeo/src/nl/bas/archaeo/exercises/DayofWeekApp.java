package nl.bas.archaeo.exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DayofWeekApp {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Give number between 1 and 7: ");
        int number = sc.nextInt();
        String dagWeek = "";

        switch (number){

            case 1:
                dagWeek = "Monday";
                break;
            case 2:
                dagWeek = "Tuesday";
                break;
            case 3:
                dagWeek = "Wednesday";
                break;
            case 4:
                dagWeek = "Thursday";
                break;
            case 5:
                dagWeek = "Friday";
                break;
            case 6:
                dagWeek = "Saturday";
                break;
            case 7:
                dagWeek = "Sunday";
                break;
            default: dagWeek = "Invalid day range";

        }

        System.out.println(dagWeek);
    }
}
