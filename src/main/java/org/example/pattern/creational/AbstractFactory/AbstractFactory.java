package org.example.pattern.creational.AbstractFactory;

public interface AbstractFactory<T> {
    T create(String type);
}
