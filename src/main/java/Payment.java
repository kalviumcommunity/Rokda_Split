package src.main.java;

public class Payment {
    private int paymentId;
    private User payer;
    private User payee;
    private double amount;

    public Payment(int paymentId, User payer, User payee, double amount) {
        this.paymentId = paymentId;
        this.payer = payer;
        this.payee = payee;
        this.amount = amount;
    }

    // Getters for attributes
}