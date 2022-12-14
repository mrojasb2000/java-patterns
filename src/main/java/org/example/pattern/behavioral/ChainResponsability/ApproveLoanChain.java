package org.example.pattern.behavioral.ChainResponsability;

public interface ApproveLoanChain {
    void setNext(ApproveLoanChain loan);
    ApproveLoanChain getNext();
    void creditCardLoan(int totalLoan);
}
