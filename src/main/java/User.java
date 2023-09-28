package src.main.java;

import java.util.HashMap;
import java.util.Map;

public class User {
    private int userId;
    private String name;
    private String email;
    private Map<User, Double> pendingPayments;

    public User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.pendingPayments = new HashMap<>();
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
            System.out.println("User: " + user.getName() + ", Amount: " + amount);
        }
    }

    // toString method to print user details
    // @Override
    // public String toString() {
    // return String.format("%s", name);
    // }

    @Override
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(String.format("name='%s', pendingPayments={ \n", name));
    for (Map.Entry<User, Double> entry : pendingPayments.entrySet()) {
    sb.append(String.format("%s=%.2f, ", entry.getKey().getName(),
    entry.getValue()));
    }
    sb.append("}}");
    return sb.toString();
    }

    // @Override
    // public String toString() {
    //     StringBuilder sb = new StringBuilder();
    //     sb.append("{");
    //     for (Map.Entry<User, Double> entry : pendingPayments.entrySet()) {
    //         sb.append(String.format("%s=%.2f, ", entry.getKey().getName(), entry.getValue()));
    //     }
    //     sb.append("}");
    //     return sb.toString();
    // }
}
