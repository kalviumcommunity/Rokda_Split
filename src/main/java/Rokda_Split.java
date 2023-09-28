package src.main.java;

import java.util.Arrays;
import java.util.List;

public class Rokda_Split {
        public static void main(String[] args) {
                // Create user objects
                User user1 = new User(1, "Alice", "alice@example.com");
                User user2 = new User(2, "Bob", "bob@example.com");
                User user3 = new User(3, "Charlie", "charlie@example.com");

                // Create group objects
                Group cafeGroup = new Group(101, "Chill at cafe");

                // Add users to groups
                cafeGroup.addMember(user1);
                cafeGroup.addMember(user2);
                cafeGroup.addMember(user3);

                // Create expense objects with the correct group reference
                Expense expense1 = new Expense(1001, "Cold Coffee", 150.0, user1, cafeGroup);
                expense1.addBenefactor(user1);

                Expense expense2 = new Expense(1002, "Coffee", 120.0, user1, cafeGroup);
                expense2.addBenefactor(user2);

                Expense expense3 = new Expense(1003, "Tea", 50.0, user1, cafeGroup);
                expense3.addBenefactor(user3);

                Expense expense4 = new Expense(1004, "Ice Cream", 100.0, user2, cafeGroup);
                expense4.addBenefactor(user2);
                expense4.addBenefactor(user3);

                // Add expenses to groups
                cafeGroup.addExpense(expense1);
                cafeGroup.addExpense(expense2);
                cafeGroup.addExpense(expense3);
                cafeGroup.addExpense(expense4);

                // Calculate individual shares for each expense
                for (Expense expense : Arrays.asList(expense1, expense2)) {
                        expense.calculateIndividualShare();
                }

                // Print user, group, and expense details
                System.out.println("Users: " + Arrays.asList(user1, user2, user3));
                System.out.println();

                System.out.println("Group 1: " + cafeGroup.getName() + ", Members: " + cafeGroup.getMembers());
                System.out.println();

                System.out.println("Expense 1: " + expense1.getDescription() + ", Paid by: "
                                + expense1.getPaidBy().getName() + ", Benefactors: " +
                                expense1.getBenefactors()
                                + ", Individual share: " + expense1.calculateIndividualShare());
                System.out.println();

                System.out.println("Expense 2: " + expense2.getDescription() + ", Paid by: "
                                + expense2.getPaidBy().getName() + ", Benefactors: " +
                                expense2.getBenefactors()
                                + ", Individual share: " + expense2.calculateIndividualShare());
                System.out.println();

                System.out.println("Expense 3: " + expense3.getDescription() + ", Paid by: "
                                + expense3.getPaidBy().getName() + ", Benefactors: " +
                                expense3.getBenefactors()
                                + ", Individual share: " + expense3.calculateIndividualShare());
                System.out.println();

                System.out.println("Expense 4: " + expense4.getDescription() + ", Paid by: "
                                + expense4.getPaidBy().getName() + ", Benefactors: " +
                                expense4.getBenefactors()
                                + ", Individual share: " + expense4.calculateIndividualShare());
                System.out.println();
                
                System.out.println("____________________________________________________");

                // Create user objects
                User mike = new User(4, "Mike", "mike@example.com");
                User wili = new User(5, "William", "wili@example.com");
                User frank = new User(6, "Frankline", "frank@example.com");
                User ron = new User(6, "Ron", "ron@example.com");

                // Create group objects
                Group dinnerGroup = new Group(102, "Weekend Dinner with friends");

                // Add users to groups
                dinnerGroup.addMember(mike);
                dinnerGroup.addMember(wili);
                dinnerGroup.addMember(frank);
                dinnerGroup.addMember(ron);

                // Create expense objects with the correct group reference
                Expense newExpense1 = new Expense(1005, "Pizza", 3500.0, mike, dinnerGroup);
                newExpense1.addBenefactor(mike);
                newExpense1.addBenefactor(wili);
                newExpense1.addBenefactor(frank);
                newExpense1.addBenefactor(ron);

                Expense newExpense2 = new Expense(1006, "Cold Drink", 530.0, wili, dinnerGroup);
                newExpense2.addBenefactor(wili);
                newExpense2.addBenefactor(frank);
                newExpense2.addBenefactor(ron);

                Expense newExpense3 = new Expense(1007, "Coco Shake", 350.0, ron, dinnerGroup);
                newExpense3.addBenefactor(frank);
                newExpense3.addBenefactor(ron);

                Expense newExpense4 = new Expense(1008, "Ice Cream", 100.0, ron, dinnerGroup);
                newExpense4.addBenefactor(wili);
                newExpense4.addBenefactor(frank);

                // Add expenses to groups
                dinnerGroup.addExpense(newExpense1);
                dinnerGroup.addExpense(newExpense2);
                dinnerGroup.addExpense(newExpense3);
                dinnerGroup.addExpense(newExpense4);

                // Calculate individual shares for each expense
                for (Expense expense : Arrays.asList(newExpense1, newExpense2)) {
                        expense.calculateIndividualShare();
                }

                // Print user, group, and expense details
                System.out.println("Users: " + Arrays.asList(user1, user2, user3));
                System.out.println();

                System.out.println("Group 1: " + dinnerGroup.getName() + ", Members: " + dinnerGroup.getMembers());
                System.out.println();

                System.out.println("Expense 1: " + newExpense1.getDescription() + ", Paid by: "
                                + newExpense1.getPaidBy().getName() + ", Benefactors: " +
                                newExpense1.getBenefactors()
                                + ", Individual share: " + newExpense1.calculateIndividualShare());
                System.out.println();

                System.out.println("Expense 2: " + newExpense2.getDescription() + ", Paid by: "
                                + newExpense2.getPaidBy().getName() + ", Benefactors: " +
                                newExpense2.getBenefactors()
                                + ", Individual share: " + newExpense2.calculateIndividualShare());
                System.out.println();

                System.out.println("Expense 3: " + newExpense3.getDescription() + ", Paid by: "
                                + newExpense3.getPaidBy().getName() + ", Benefactors: " +
                                newExpense3.getBenefactors()
                                + ", Individual share: " + newExpense3.calculateIndividualShare());
                System.out.println();

                System.out.println("Expense 4: " + newExpense4.getDescription() + ", Paid by: "
                                + newExpense4.getPaidBy().getName() + ", Benefactors: " +
                                newExpense4.getBenefactors()
                                + ", Individual share: " + newExpense4.calculateIndividualShare());
                System.out.println();

                System.out.println("Compiled Successfully!");
        }

        public static <T> void printList(List<T> list) {
                for (T item : list) {
                        System.out.println(item + "\n");
                }
        }
}