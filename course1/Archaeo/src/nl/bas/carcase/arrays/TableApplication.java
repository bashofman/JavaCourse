package nl.bas.carcase.arrays;

public class TableApplication {

    public static void main(String[] args) {

        int[][] tables = new int[11][11];

        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                tables[i][j] = i * j;
            }
        }

        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {

                String result = String.format(" %dx%d=%2d ", i, j, tables[i][j]);
                System.out.print(result + "\t");
            }
            System.out.println();

        }


    }
}