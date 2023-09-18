package src.main.java;

public class Expense {
    private int expenseId;
    private String description;
    private double amount;
    private User paidBy;

    public Expense(int expenseId, String description, double amount, User paidBy) {
        this.expenseId = expenseId;
        this.description = description;
        this.amount = amount;
        this.paidBy = paidBy;
    }

    // Getters for attributes
}