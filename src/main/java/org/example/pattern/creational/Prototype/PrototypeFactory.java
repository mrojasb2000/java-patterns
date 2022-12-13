package org.example.pattern.creational.Prototype;

import java.util.HashMap;
import java.util.Map;

import static org.example.pattern.creational.Prototype.PrototypeFactory.CardType.AMEX;
import static org.example.pattern.creational.Prototype.PrototypeFactory.CardType.VISA;

public class PrototypeFactory {
    public static class CardType {
        public static final String VISA = "visa";
        public static final String AMEX = "amex";
    }

    private static Map<String, PrototypeCard> prototypes = new HashMap<>();

    public static PrototypeCard getInstance(String type) throws CloneNotSupportedException {
        return prototypes.get(type).clode();
    }

    public static void loadCard(){
        VisaCard visaCard = new VisaCard();
        prototypes.put(VISA, visaCard);
        AmexCard amexCard = new AmexCard();
        prototypes.put(AMEX, amexCard);
    }
}
