package nl.bas.archaeo.exceptions;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class app {

    public static void main(String[] args) {

        try {
            int result = divide(6,3);
            System.out.println(result);
        }
        catch(KasteelException ke) {
            System.out.println("Kasteelexception gevangen");
        }

        try{
            int result = divide(3,0);
        }

        catch(KasteelException ke) {
            System.out.println("Kasteelexception gevangen");
        }



        System.out.println("Einde Programma");

        try {
            int a = parseInt("890");
            System.out.println(a);}

        catch(NumberFormatException ne) {
            isValidNumber("");

        }

        String s = "ggu";
        boolean t = isValidNumber(s); {
            if (t) {
                System.out.println( "valid input");
            }
            else {
                System.out.println("invalid input");
            }
        }




    }

    public static int divide (int a, int b) throws KasteelException {

        if (b != 0) {
            return a / b;
        } else {
            throw new KasteelException();
        }
    }
    public static int parseInt (String s){
        return Integer.parseInt(s);
        }


    public static boolean isValidNumber(String s){

        try {
            int i = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ne){
            return false;
        }

    }






}
