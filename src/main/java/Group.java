package src.main.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    // Getters and setters
    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getMembers() {
        return members;
    }

    public void addMember(User user) {
        members.add(user);
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    // toString method to print group details
    @Override
    public String toString() {
        List<String> memberNames = members.stream().map(User::getName).collect(Collectors.toList());
        return String.format("Group{id=%d, name='%s', members=%s, expenses=%s}", groupId, name, memberNames, expenses);
    }
}