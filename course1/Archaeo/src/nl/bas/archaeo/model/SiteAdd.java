package nl.bas.archaeo.model;

public class SiteAdd {

    public static Homestead getHomestead(String name, String type){
        Homestead result = new Homestead (name, type);
        result.setName(name);
        result.setType(type);

        return result;
    }

}
