class CheckingAccount extends BankAccount {
    double monthlyFee;

    public CheckingAccount(int accountNumber, double initialBalance, double monthlyFee) {
        super(accountNumber, initialBalance);
        this.monthlyFee = monthlyFee;
    }

    public void deductMonthlyFee() {
        if (balance >= monthlyFee) {
            balance -= monthlyFee;
        } else {
            System.out.println("Insufficient funds to deduct the monthly fee");
        }
    }
}
