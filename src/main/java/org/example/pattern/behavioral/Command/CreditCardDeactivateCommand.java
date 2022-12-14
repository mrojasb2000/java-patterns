package org.example.pattern.behavioral.Command;

public class CreditCardDeactivateCommand implements Command{
    private CreditCard creditCard;

    public CreditCardDeactivateCommand(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    @Override
    public void execute() {
        creditCard.deactivate();
        creditCard.sendSMSToCustomerDeactivate();
    }
}
