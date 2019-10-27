package nl.bas.archaeo.exercises;

public class Feedingschedule {

    public static void main(String[] args) {

        int count = 0;
        int x = 3;

        while (count++ < 3){
            int y = (1 + 2 * count) % 3;
            switch (y){
                default:
                case 0: x = x -1;
                break;
                case 1: x = x + 5;
            }
        }

        System.out.println(x);
    }
}
