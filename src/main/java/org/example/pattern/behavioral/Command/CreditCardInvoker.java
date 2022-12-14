package org.example.pattern.behavioral.Command;

public class CreditCardInvoker {
    // Invoker class
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public CreditCardInvoker() {
    }

    public void run(){
        command.execute();
    }
}
