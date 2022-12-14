package org.example.pattern.behavioral.ChainResponsability;

public class PlatinumApprove implements ApproveLoanChain{
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
        if(totalLoan > 10_000 && totalLoan <= 20_000) {
            System.out.printf("Platinum card");
        } else {
            next.creditCardLoan(totalLoan);
        }
    }
}
