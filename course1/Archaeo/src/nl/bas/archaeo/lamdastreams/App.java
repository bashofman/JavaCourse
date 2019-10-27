package nl.bas.archaeo.lamdastreams;

import java.util.ArrayList;
import java.util.List;

import java.util.Arrays;


public class App {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>() ;

        String firstName = "Marije";
        names.add(firstName);
        names.add("Nino");
        names.add("Mees");
        names.add("Stan");
        names.add("Hans");
        names.add("Marije");
        names.add("Nelleke");

        names.stream().filter(n -> n.toLowerCase().contains("a")) .forEach(n -> System.out.println(n));
        names.stream().filter(n -> n.contains("s")) .forEach(n -> System.out.println(n));



    }
}
