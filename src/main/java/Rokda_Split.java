package src.main.java;

import java.util.Arrays;
import java.util.List;

public class Rokda_Split {
        public static void main(String[] args) {
                // Create user objects
                PaidByUser mike = new PaidByUser(4, "Mike", "mike@example.com", 5000, 3000, "Cash");
                PaidByUser wili = new PaidByUser(5, "William", "wili@example.com", 2000, 5000, "G Pay");
                PaidByUser frank = new PaidByUser(6, "Frankline", "frank@example.com", 0, 4000, "PhonePe");
                PaidByUser ron = new PaidByUser(6, "Ron", "ron@example.com", 400, 3514, "Paytm");

                // Create group objects
                Group dinnerGroup = new Group(102, "Weekend Dinner with friends");

                // Add users to groups
                dinnerGroup.addMember(mike);
                dinnerGroup.addMember(wili);
                dinnerGroup.addMember(frank);
                dinnerGroup.addMember(ron);

                // Create expense objects with the correct group reference and expense type
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

                newExpense1.updatePendingPayment();
                newExpense2.updatePendingPayment();
                newExpense3.updatePendingPayment();
                newExpense4.updatePendingPayment();

                // Print user, group, and expense details
                System.out.println("Users:");
                printUsers(Arrays.asList(mike, frank, wili, ron));
                System.out.println();

                System.out.println("Group 1: " + dinnerGroup.getName() + ", Members: " + dinnerGroup.getMembers());
                System.out.println();

                System.out.println("Expenses:");
                printExpense(newExpense1);
                printExpense(newExpense2);
                printExpense(newExpense3);
                printExpense(newExpense4);
                System.out.println();

                System.out.println("Pending payments for Mike: ");
                mike.displayPendingPayments();
                System.out.println();

                System.out.println("Pending payments for Frankline: ");
                frank.displayPendingPayments();
                System.out.println();

                System.out.println("Pending payments for William: ");
                wili.displayPendingPayments();
                System.out.println();

                System.out.println("Pending payments for Ron: ");
                ron.displayPendingPayments();
                System.out.println();

                // Payments made by users
                Payment wiliCashPayment = new CashPayment(wili);
                Payment ronUPIPayment = new UPIPayment("ron@ybl", ron);

                int wili_payment_id = wiliCashPayment.makePayment(mike, 875.0);
                int ron_payment_id = ronUPIPayment.makePayment(wili, 176.66666666666666);

                System.out.println("William's Cash Balance: " + wili.getCashBalance());
                System.out.println("Mike's Cash Balance: " + mike.getCashBalance());
                System.out.println("Ron's UPI Balance: " + ron.getUPIBalance());
                System.out.println("William's UPI Balance: " + wili.getUPIBalance());
                System.out.println();

                System.out.println("Payment status for William's payment: "
                                + wiliCashPayment.getPaymentStatus(wili_payment_id));
                System.out.println(
                                "Payment status for Ron's payment: " + ronUPIPayment.getPaymentStatus(ron_payment_id));
                System.out.println();

                // Remove references to objects
                mike = null;
                wili = null;
                frank = null;
                ron = null;
                dinnerGroup = null;
                newExpense1 = null;
                newExpense2 = null;
                newExpense3 = null;
                newExpense4 = null; // Remove reference to objects
                // At this point, all these becomes eligible for garbage collection

                // Suggest garbage collection (not typically needed)
                System.gc();

                System.out.println("User count: " + User.getUserCount());
                System.out.println("Group count: " + Group.getGroupCount());
                System.out.println("Compiled Successfully!");
        }

        // Helper methods to format and print users and expenses
        private static void printUsers(List<User> users) {
                for (User user : users) {
                        System.out.println("User ID: " + user.getUserId());
                        System.out.println("Name: " + user.getName());
                        System.out.println("Email: " + user.getEmail());
                        System.out.println();
                }
        }

        private static void printExpense(Expense expense) {
                System.out.println("Expense ID: " + expense.getExpenseId());
                System.out.println("Description: " + expense.getDescription());
                System.out.println("Paid by: " + expense.getPaidBy().getName());
                System.out.println("Benefactors: " + expense.getBenefactors());
                System.out.println("Individual share: " + String.format("%.2f", expense.calculateIndividualShare()));
                System.out.println();
        }
}
