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
    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public User getPayer() {
        return payer;
    }

    public void setPayer(User payer) {
        this.payer = payer;
    }

    public User getPayee() {
        return payee;
    }

    public void setPayee(User payee) {
        this.payee = payee;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}