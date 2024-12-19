package org.dcistudent;

public enum AccountType {
    SILVER(1000, 500),
    GOLD(2000, 1000),
    PLATINUM(5000, 2000);

    private final double withdrawalLimit;
    private final double depositLimit;

    AccountType(double withdrawalLimit, double depositLimit) {
        this.withdrawalLimit = withdrawalLimit;
        this.depositLimit = depositLimit;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public double getDepositLimit() {
        return depositLimit;
    }
}
