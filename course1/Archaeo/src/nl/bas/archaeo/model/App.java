package nl.bas.archaeo.model;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {




        List<String> strings = new ArrayList<>();

        strings.add("Knossos");

        System.out.println(strings);

        Homestead B = SiteAdd.getHomestead ("Aghia Triada", "Farmstead");

        System.out.println(B.getName());


    }

}
