package src.main.java;

import java.util.HashMap;
import java.util.Map;

public class User {
    private int userId;
    private String name;
    private String email;
    private Map<User, Double> pendingPayments;
    private double CashBalance;
    private double UPIBalance;

    private static int userCount = 0;

    public User(int userId, String name, String email, double CashBalance, double UPIBalance) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.pendingPayments = new HashMap<>();
        this.CashBalance = CashBalance;
        this.UPIBalance = UPIBalance;
        userCount++;
    }

    // Getters and setters
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<User, Double> getPendingPayments() {
        return pendingPayments;
    }

    public void setPendingPayments(Map<User, Double> pendingPayments) {
        this.pendingPayments = pendingPayments;
    }

    public void displayPendingPayments() {
        // Print the contents of the HashMap
        for (Map.Entry<User, Double> entry : pendingPayments.entrySet()) {
            User user = entry.getKey();
            Double amount = entry.getValue();
            System.out.println("\t" + user.getName() + " : " + amount);
        }
    }

    public double getCashBalance() {
        return CashBalance;
    }

    public void setCashBalance(double CashBalance) {
        this.CashBalance = CashBalance;
    }

    public double getUPIBalance() {
        return UPIBalance;
    }

    public void setUPIBalance(double UPIBalance) {
        this.UPIBalance = UPIBalance;
    }

    // Getter for userCount
    public static int getUserCount() {
        return userCount;
    }

    // toString method to print user details
    @Override
    public String toString() {
        return String.format("%s", name);
    }
}
