package nl.bas.archaeo.exercises.deerexc;

public class Deer {

    public Deer(){
        System.out.print("Deer");
    }
    private boolean hasHorns(){
        return false;
    }

    public static void main(String[] args) {
        Deer deer = new Reindeer(9);
        System.out.println(","+ deer.hasHorns());
    }
}

class Reindeer extends Deer {

    public Reindeer (int age){
        System.out.print("Reindeer");
    }
    public boolean hasHorns (){
        return true;
    }
}