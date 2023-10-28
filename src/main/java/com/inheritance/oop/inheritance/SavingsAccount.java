package com.inheritance.oop.inheritance;

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        balance += balance * (interestRate / 100);
    }

    @Override
    public double getBalance() {
        // Method overriding
        return balance + balance * (interestRate / 100);
    }
}