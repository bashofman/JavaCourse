package nl.bas.archaeo.exercises;

import java.util.Scanner;

public class binApp {

    public static void main(String[] args) {


        int i = 0;
        int remainder = 0;
        int[] sum = new int[20];
        Scanner sc = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        int bin1 = sc.nextInt();
        System.out.print("Input second binary number ");
        int bin2 = sc.nextInt();

        while (bin1 != 0 || bin2!=0){

            sum[i++] = (int)((bin1 % 10 + bin2 % 10 + remainder) % 2);
            remainder = (int)((bin1 % 10 + bin2 % 10 + remainder) / 2);
            bin1 = bin1/10;
            bin2 = bin2/10;
            System.out.println("i=" + i);
            System.out.println("remainder = " + remainder);
        }
        if(remainder != 0){
            sum[i++] = remainder;

        }
        else{
            i--;

        }

        System.out.println("remainder = " + remainder);
        System.out.print("Sum of binary number: ");
        while (i >= 0){
            System.out.print(sum[i--]);
        }
        System.out.print("\n");




    }

}
