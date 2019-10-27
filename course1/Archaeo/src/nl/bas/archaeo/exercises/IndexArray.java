package nl.bas.archaeo.exercises;

public class IndexArray {


    public static int findIndex (int [] array5, int t){
        int len = array5.length;
        int i = 0;
        while (i < len){
            if (array5[i] == t) return i;
            else i++;
        }
        return -1;

    }




    public static void main(String[] args) {
        int[] array4 = {23, 45, 45, 2312, 56456, 3, 6, 678, 110};
        System.out.println(IndexArray.findIndex(array4, 110));
    }
}

