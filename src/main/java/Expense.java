package src.main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Expense {
    private int expenseId;
    private String description;
    private double amount;
    private User paidBy;
    private Group group;
    private List<User> benefactors;
    private double individualShare;

    public Expense(int expenseId, String description, double amount, User paidBy, Group group) {
        this.expenseId = expenseId;
        this.description = description;
        this.amount = amount;
        this.paidBy = paidBy;
        this.group = group;
        this.benefactors = new ArrayList<>();
        this.individualShare=calculateIndividualShare();
    }

    // Getters and Setters
    public int getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public List<User> getBenefactors() {
        return benefactors;
    }

    public void addBenefactor(User user) {
        benefactors.add(user);
    }

    public double calculateIndividualShare() {
        return individualShare = amount / benefactors.size();
    }

    // toString method to print expense details
    @Override
    public String toString() {
        List<String> benefactorNames = benefactors.stream().map(User::getName).collect(Collectors.toList());
        return String.format(
                "Expense{id=%d, description='%s', amount=%.2f, paidBy=%s, group=%s, benefactors=%s, individualShare=%.2f}",
                expenseId, description, amount, paidBy.getName(), group.getName(), benefactorNames,
                individualShare = calculateIndividualShare());
    }
}