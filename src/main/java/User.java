package src.main.java;

import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String name;
    private String email;
    private List<Group> groups;

    public User(int userId, String name, String email) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.groups = new ArrayList<>();
    }

    // Getters and setters for attributes
    public void joinGroup(Group group) {
        groups.add(group);
    }

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

    public List<Group> getGroups() {
        return groups;
    }
}
