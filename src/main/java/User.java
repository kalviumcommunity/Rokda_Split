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

    public void joinGroup(Group group) {
        groups.add(group);
    }

    // Getters and setters for attributes
}
