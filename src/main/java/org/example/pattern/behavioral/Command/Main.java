package org.example.pattern.behavioral.Command;

public class Main {
    public static void main(String[] args) {
        CreditCardInvoker creditCardInvoker = new CreditCardInvoker();
        CreditCard creditCardActivate = new CreditCard();
        CreditCardActivateCommand creditCardActivateCommand = new CreditCardActivateCommand(creditCardActivate);
        creditCardInvoker.setCommand(creditCardActivateCommand);
        creditCardInvoker.run();

        CreditCard creditCardDeactivate = new CreditCard();
        CreditCardDeactivateCommand creditCardDeactivateCommand = new CreditCardDeactivateCommand(creditCardDeactivate);
        creditCardInvoker.setCommand(creditCardDeactivateCommand);
        creditCardInvoker.run();


    }
}