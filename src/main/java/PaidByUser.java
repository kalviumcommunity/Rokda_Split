package src.main.java;

public class PaidByUser extends User {
    private PaymentMethod paymentMethod;

    public PaidByUser(int userId, String name, String email, double CashBalance, double UPIBalance,
            PaymentMethod paymentMethod) {
        super(userId, name, email, CashBalance, UPIBalance);
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public enum PaymentMethod {
        CASH,
        UPI
    }
}