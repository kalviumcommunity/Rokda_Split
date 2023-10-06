package src.main.java;

public abstract class ExpenseType {
    public abstract double calculateIndividualShare(double amount, int benefactorCount);
}

class EqualExpenseType extends ExpenseType {
    @Override
    public double calculateIndividualShare(double amount, int benefactorCount) {
        return amount / benefactorCount;
    }
}

class UnequalExpenseType extends ExpenseType {
    private double[] shares;

    public UnequalExpenseType(double[] shares) {
        this.shares = shares;
    }

    @Override
    public double calculateIndividualShare(double amount, int benefactorCount) {
        double totalShares = 0;
        for (double share : shares) {
            totalShares += share;
        }
        return amount * (shares[benefactorCount - 1] / totalShares);
    }
}