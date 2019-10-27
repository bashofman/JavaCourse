package nl.bas.archaeo.casten;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Site> sites = new ArrayList<>();
        sites.add(new Pallace());
        sites.add(new Town());

        demoList(sites);

    }

    public static void demoList(List<Site> sites){

        for(Site site: sites){
            site.name();
            if(site instanceof Pallace){
                Pallace a = (Pallace) site;
                a.typePallace();
            }
            else{
                if(site instanceof Town){
                    Town b = (Town) site;
                    b.typeTown();
                }
            }
        }



    }

    public static void castPrim() {

        int age = 143;
        byte myAge = (byte) age;

        System.out.println(myAge);
    }
}
