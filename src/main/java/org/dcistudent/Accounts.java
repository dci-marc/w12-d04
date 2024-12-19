package org.dcistudent;

public class Accounts {
    public static void main(String[] args) {
        new Accounts();
    }

    public Accounts() {
        Account account1 = new Account("123456", AccountType.SILVER);
        Account account2 = new Account("654321", AccountType.GOLD);
        Account account3 = new Account("987654", AccountType.PLATINUM);

        account1.deposit(500);
        account2.deposit(1000);
        account3.deposit(2000);

        account1.withdraw(100);
        account2.withdraw(200);
        account3.withdraw(300);

        System.out.println("Account 1: " + account1.getAccountNumber() + " " + account1.getAccountType() + " " + account1.getBalance());
        System.out.println("Account 1: " + account1.getAccountType().getDepositLimit() + " " + account1.getAccountType().getWithdrawalLimit());
        System.out.println("Account 2: " + account2.getAccountNumber() + " " + account2.getAccountType() + " " + account2.getBalance());
        System.out.println("Account 2: " + account2.getAccountType().getDepositLimit() + " " + account2.getAccountType().getWithdrawalLimit());
    }
}
