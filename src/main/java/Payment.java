package src.main.java;

import java.util.HashMap;
import java.util.Map;

public abstract class Payment {
    public abstract int makePayment(User payee, double amount);

    public abstract boolean getPaymentStatus(int paymentId);
}

class CashPayment extends Payment {
    private PaidByUser payer;
    private Map<Integer, Boolean> paymentHistory;
    private static int paymentId = 0;

    public CashPayment(PaidByUser payer) {
        this.payer = payer;
        this.paymentHistory = new HashMap<>();
    }

    @Override
    public int makePayment(User payee, double amount) {
        paymentId++;
        if (payer.getCashBalance() >= amount) {
            payer.setCashBalance(payer.getCashBalance() - amount);
            payee.setCashBalance(payee.getCashBalance() + amount);
            paymentHistory.put(paymentId, true);
        } else {
            System.out.println("Insufficient balance");
            paymentHistory.put(paymentId, false);
        }

        return paymentId;
    }

    @Override
    public boolean getPaymentStatus(int paymentId) {
        return paymentHistory.get(paymentId);
    }
}

class UPIPayment extends Payment {
    private String UPI_ID;
    private PaidByUser payer;
    private Map<Integer, Boolean> paymentHistory;
    private static int paymentId = 0;

    public UPIPayment(String upi_id, PaidByUser payer) {
        this.UPI_ID = upi_id;
        this.payer = payer;
        this.paymentHistory = new HashMap<>();
    }

    @Override
    public int makePayment(User payee, double amount) {
        paymentId++;
        if (payer.getUPIBalance() >= amount) {
            payer.setUPIBalance(payer.getUPIBalance() - amount);
            payee.setUPIBalance(payee.getUPIBalance() + amount);
            paymentHistory.put(paymentId, true);
        } else {
            System.out.println("Insufficient balance");
            paymentHistory.put(paymentId, false);
        }

        return paymentId;
    }

    @Override
    public boolean getPaymentStatus(int paymentId) {
        return paymentHistory.get(paymentId);
    }
}