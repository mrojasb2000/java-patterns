package org.example.pattern.behavioral.ChainResponsability;

public class GoldApprove implements ApproveLoanChain{
    ApproveLoanChain next;
    @Override
    public void setNext(ApproveLoanChain loan) {
        next = loan;
    }

    @Override
    public ApproveLoanChain getNext() {
        return next;
    }

    @Override
    public void creditCardLoan(int totalLoan) {
        if(totalLoan <= 10_000) {
            System.out.printf("Gold card");
        } else {
            next.creditCardLoan(totalLoan);
        }
    }
}
