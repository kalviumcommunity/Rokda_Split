package src.main.java;

public abstract class Payment {
    public abstract void makePayment(double amount);
    public abstract String getPaymentStatus();
}

class CreditCardPayment extends Payment {
    private String cardNumber;
    private String expiryDate;
    private String cardHolderName;
    private String cvv;

    public CreditCardPayment(String cardNumber, String cardHolderName, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    @Override
    public void makePayment(double amount) {
        // Implement credit card payment logic
    }

    @Override
    public String getPaymentStatus() {
        // Implement credit card payment status logic
        return "Payment successful";
    }
}

class PayPalPayment extends Payment {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void makePayment(double amount) {
        // Implement PayPal payment logic
    }

    @Override
    public String getPaymentStatus() {
        // Implement PayPal payment status logic
        return "Payment successful";
    }
}