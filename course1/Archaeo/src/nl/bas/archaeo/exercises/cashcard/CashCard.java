package nl.bas.archaeo.exercises.cashcard;

import java.util.ArrayList;

public class CashCard {

    private double amount;
    private String name;
    private int amountcardisused;


    public CashCard(String name, double amount, int amountcardisused){
        this.amount = amount;
        this.name = name;
        this.amountcardisused = amountcardisused;

    }

    public String setName(String name){
        return name;
    }
    public double setAmount(double amount){
        return amount;
    }
    public int setTimesCardIsUsed(int amountcardisused){
        return amountcardisused;
    }
}
