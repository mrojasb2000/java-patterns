package org.example.pattern.creational.Prototype;

public interface PrototypeCard extends Cloneable {
    PrototypeCard clode() throws CloneNotSupportedException;

    void getCard();
}
