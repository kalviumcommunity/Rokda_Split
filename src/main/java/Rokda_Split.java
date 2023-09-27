package src.main.java;

import java.util.Arrays;
import java.util.List;

public class Rokda_Split {
        public static void main(String[] args) {
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
                                + ", Individual share: " + newExpense1.getIndividualShare());
                System.out.println();

                System.out.println("Expense 2: " + newExpense2.getDescription() + ", Paid by: "
                                + newExpense2.getPaidBy().getName() + ", Benefactors: " +
                                newExpense2.getBenefactors()
                                + ", Individual share: " + newExpense2.getIndividualShare());
                System.out.println();

                System.out.println("Expense 3: " + newExpense3.getDescription() + ", Paid by: "
                                + newExpense3.getPaidBy().getName() + ", Benefactors: " +
                                newExpense3.getBenefactors()
                                + ", Individual share: " + newExpense3.getIndividualShare());
                System.out.println();

                System.out.println("Expense 4: " + newExpense4.getDescription() + ", Paid by: "
                                + newExpense4.getPaidBy().getName() + ", Benefactors: " +
                                newExpense4.getBenefactors()
                                + ", Individual share: " + newExpense4.getIndividualShare());
                System.out.println();

                System.out.println("Compiled Successfully!");
        }

        public static <T> void printList(List<T> list) {
                for (T item : list) {
                        System.out.println(item + "\n");
                }
        }
}