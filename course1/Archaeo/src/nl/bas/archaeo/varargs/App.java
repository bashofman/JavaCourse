package nl.bas.archaeo.varargs;

public class App {
    public static void main(String[] args) {
        int kleinste = min (2,4,9,34,23,90,5);

        System.out.println(kleinste);


    }

    public static int min(int first, int ... rest) {

        int min = first;
        for (int element: rest) {
            if(element < min) {
                min = element;
            }
        }
        return min;
    }

}
