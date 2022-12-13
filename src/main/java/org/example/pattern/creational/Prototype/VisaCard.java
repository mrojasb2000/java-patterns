package org.example.pattern.creational.Prototype;

public class VisaCard implements PrototypeCard{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public PrototypeCard clode() throws CloneNotSupportedException {
        return (VisaCard)super.clone();
    }

    @Override
    public void getCard() {
        System.out.println("Card VISA");
    }
}
