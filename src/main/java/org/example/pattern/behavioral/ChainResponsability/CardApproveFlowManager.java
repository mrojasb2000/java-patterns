package org.example.pattern.behavioral.ChainResponsability;

public class CardApproveFlowManager implements ApproveLoanChain{
    private ApproveLoanChain next;
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
        GoldApprove goldApprove = new GoldApprove();
        this.setNext(goldApprove);

        PlatinumApprove platinumApprove = new PlatinumApprove();
        goldApprove.setNext(platinumApprove);

        BlackApprove blackApprove = new BlackApprove();
        platinumApprove.setNext(blackApprove);

        next.creditCardLoan(totalLoan);
    }
}
