package nl.bas.archaeo.model;

import java.util.ArrayList;
import java.util.List;

public class Box <E> {

    private List<E> content = new ArrayList<E>();

    public void add(E element) {
        content.add(element);
    }
}
