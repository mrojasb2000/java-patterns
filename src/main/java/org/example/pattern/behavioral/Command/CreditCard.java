package org.example.pattern.behavioral.Command;

public class CreditCard {
    // Receiver object
    public void sendPinNumberToCustomer(){
        System.out.println("Pin number sent to customer.");
    }
    public void sendSMSToCustomerActivate(){
        System.out.println("SMS sent to customer.");
    }
    public void activate(){
        System.out.println("Activate card.");
    }

    public void deactivate(){
        System.out.println("Deactivate card.");
    }

    public void sendSMSToCustomerDeactivate(){
        System.out.println("Deactivate SMS sent to customer.");
    }
}
