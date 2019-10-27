package nl.bas.archaeo.exercises;

import java.util.List;

public class Chicken {}

interface Henhouse {public java.util.List<Chicken> getChickens();}

class Chickensong{
    public static void main(String[] args) {
        Henhouse house = new Henhouse() {
            @Override
            public List<Chicken> getChickens() {
                return null;
            }
        };
        Chicken chicken = house.getChickens().get(0);
        for(int i = 0; i<house.getChickens().size(); chicken = house.getChickens().get(i++)){
            System.out.println("Cluck");
        }
    }
}


