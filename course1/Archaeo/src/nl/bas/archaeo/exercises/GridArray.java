package nl.bas.archaeo.exercises;

public class GridArray {

    public static void main(String[] args) {

        int [][] grid1 = new int [10][10];
        for (int i = 0; i < 10; i++){

            for (int j = 0; j < 10; j++){
                System.out.printf("%2d", grid1[i][j]);
            }
            System.out.println();
        }



    }
}
