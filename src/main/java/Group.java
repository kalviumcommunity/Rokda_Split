package src.main.java;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private int groupId;
    private String name;
    private List<User> members;
    private List<Expense> expenses;

    public Group(int groupId, String name) {
        this.groupId = groupId;
        this.name = name;
        this.members = new ArrayList<>();
        this.expenses = new ArrayList<>();
    }

    public void addMember(User user) {
        members.add(user);
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    // Getters for attributes
}