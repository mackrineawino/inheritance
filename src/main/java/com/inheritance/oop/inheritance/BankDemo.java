package com.inheritance.oop.inheritance;

public class BankDemo {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(01, 100.0, 2.5);
        savings.deposit(5000.0);

        if (savings instanceof SavingsAccount) {
            ((SavingsAccount) savings).addInterest();
        }
        System.out.println("Savings Account Balance: $" + savings.getBalance());

        BankAccount checking = new CheckingAccount(02, 1500.0, 10.0);
        checking.deposit(3000.0);
        if (checking instanceof CheckingAccount) {
            ((CheckingAccount) checking).deductMonthlyFee();
        }
        System.out.println("Checking Account Balance: $" + checking.getBalance());
    
    }
}