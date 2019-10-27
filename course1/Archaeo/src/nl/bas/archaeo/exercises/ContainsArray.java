package nl.bas.archaeo.exercises;

public class ContainsArray {
    public static boolean contains(int [] arr, int item){
        for(int n : arr){
            if (item == n){
                return true;
            }
        }
        return false;
    }
}
