package src.main.java;

public class PaidByUser extends User {
    private String paymentMethod;

    public PaidByUser(int userId, String name, String email, String paymentMethod) {
        super(userId, name, email);
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}