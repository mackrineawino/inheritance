package com.inheritance.oop.interfaces;

class SavingsAccount extends BankAccount implements Interest{
    private double interestRate;

    public SavingsAccount(int accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void addInterest() {
        balance += balance * (interestRate / 100);
    }
}
