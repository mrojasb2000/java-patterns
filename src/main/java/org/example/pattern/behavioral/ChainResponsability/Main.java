package org.example.pattern.behavioral.ChainResponsability;

public class Main {
    public static void main(String[] args) {
        CardApproveFlowManager cardApproveFlowManager = new CardApproveFlowManager();
        cardApproveFlowManager.creditCardLoan(119_000);
    }
}