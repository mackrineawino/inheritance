class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(int accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        balance += balance * (interestRate / 100);
    }
}