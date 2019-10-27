package nl.bas.archaeo.exercises;

public class AvgArray {

    public static void main(String[] args) {


        int [] avgArray = {32, 45, 67, 123, 5646, 55, 2, 90};
        double avg = 0;
        int sum = 0;

        for (int i : avgArray){
            sum = sum + i;
            avg = sum / avgArray.length;

        }
        System.out.println(avg);


    }
}
