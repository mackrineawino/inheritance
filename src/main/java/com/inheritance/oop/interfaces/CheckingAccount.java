package com.inheritance.oop.interfaces;

class CheckingAccount extends BankAccount implements Deduction {
    private double monthlyFee;

    public CheckingAccount(int accountNumber, double initialBalance, double monthlyFee) {
        super(accountNumber, initialBalance);
        this.monthlyFee = monthlyFee;
    }

    @Override
    public void deductMonthlyFee() {
        if (balance >= monthlyFee) {
            balance -= monthlyFee;
        } else {
            System.out.println("Insufficient funds to deduct the monthly fee");
        }
    }
}
