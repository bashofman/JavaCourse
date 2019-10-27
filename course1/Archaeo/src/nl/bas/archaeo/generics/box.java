package nl.bas.archaeo.generics;

import java.util.HashSet;
import java.util.Set;

public class box <E> {

    private Set<E> content = new HashSet<>();


    public void add(E element) {
        content.add(element);
    }


}