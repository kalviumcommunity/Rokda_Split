package src.main.java;

public class Rokda_Split {
    public static void main(String[] args) {
        // Create user objects
        User user1 = new User(1, "Alice", "alice@example.com");
        User user2 = new User(2, "Bob", "bob@example.com");
        User user3 = new User(3, "Charlie", "charlie@example.com");

        // Create group objects
        Group group1 = new Group(101, "Trip to Beach");
        Group group2 = new Group(102, "Dinner Party");

        // Add users to groups
        user1.joinGroup(group1);
        user2.joinGroup(group1);
        user2.joinGroup(group2);
        user3.joinGroup(group2);

        // Create expense objects with the correct group reference
        Expense expense1 = new Expense(1001, "Gasoline", 50.0, user1, group1);
        Expense expense2 = new Expense(1002, "Dinner bill", 80.0, user2, group2);

        // Add expenses to groups
        group1.addExpense(expense1);
        group2.addExpense(expense2);

        // Create payment objects to settle debts
        Payment payment1 = new Payment(2001, user2, user1, 25.0);
        Payment payment2 = new Payment(2002, user3, user2, 40.0);

        System.out.println("Compiled Successfully!");
        // Perform calculations and update payments as needed
        // ...

        // Print user, group, and payment details
        // ...
    }
}
