package org.example.pattern.behavioral.Iterator;

public interface Iterator {
    Object next();
    boolean hasNext();

    Object currentItem();
}
