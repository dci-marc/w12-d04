package org.dcistudent;

public class Account {
    private final String accountNumber;
    private final AccountType accountType;
    private double balance;

    public Account(String accountNumber, AccountType accountType) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > accountType.getDepositLimit()) {
            throw new IllegalArgumentException("Deposit amount exceeds limit");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > accountType.getWithdrawalLimit()) {
            throw new IllegalArgumentException("Withdrawal amount exceeds limit");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }
}
