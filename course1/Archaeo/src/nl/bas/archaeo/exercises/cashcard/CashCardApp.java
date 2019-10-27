package nl.bas.archaeo.exercises.cashcard;

import java.util.ArrayList;
import java.util.Scanner;

public class CashCardApp {



    public static void main(String[] args) {

        ArrayList<CashCard> listOfCashCards = new ArrayList<CashCard>();

        Scanner in = new Scanner(System.in);
        String input;

        // Stop console when entering 0 in console
        System.out.println("0: Stop Program");
        System.out.println("1: Add CashCard");

        // Execute this code when entering 1 in console
        System.out.println();
        System.out.print("Enter 0 or 1: ");
        input = in.nextLine();

        if(input.equals("0")){
            System.exit(0);
        }

        else if(input.equals("1")){

            System.out.print("Enter name of the card owner: ");
            String yourname = in.nextLine();

            System.out.println("Enter the amount you want to set on your cashcard: ");
            double youramount = in.nextDouble();

            System.out.print("Enter The Amount This Card Is Already Used: ");
            int youramountcardisused = in.nextInt();

            CashCard cashCard = new CashCard(yourname, youramount, youramountcardisused);

            listOfCashCards.add(cashCard);

            // Do Something to create an CashCard object by using the scanner its input
            // and than put the object inside the ArrayList CashCard.
            // Need help on this part

        }

    }

        }
