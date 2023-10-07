package src.main.java;

public class PaidByUser extends User {
    private String paymentMethod;

    public PaidByUser(int userId, String name, String email, double CashBalance, double UPIBalance,
            String paymentMethod) {
        super(userId, name, email, CashBalance, UPIBalance);
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}