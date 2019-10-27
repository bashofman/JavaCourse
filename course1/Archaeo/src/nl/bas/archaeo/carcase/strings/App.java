package nl.bas.archaeo.carcase.strings;

public class App {

    public static void main(String[] args) {
        String string = "zoek karakter";

        System.out.println(string.charAt(3));

        String str ="Piet";
        System.out.println(str.isEmpty());

        String leeg = "";
        System.out.println(leeg.isEmpty());

        String leeg2 = " ";
        System.out.println(leeg2.isEmpty());

        String c = "Compute";
        String d = "r";

        String result = "Computer";

        String concat = c + d;

        System.out.println(concat);

        System.out.println(concat.equals(result));

        StringBuilder b = new StringBuilder();

        b.append("Computer");

        System.out.println(b);

        String computer = b.toString();

        System.out.println(computer);

        System.out.println(computer.equals("Computer"));


    }
}
