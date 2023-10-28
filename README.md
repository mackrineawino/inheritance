# Bank Account Inheritance and Interface Example

This example shows a banking system with savings and checking accounts.

## Inheritance

### BankAccount Class

- This is the base class.
- It includes methods for depositing, withdrawing, and checking the account balance.
- The `deposit` and `withdraw` methods allow you to manage the balance.
- The `getBalance` method retrieves the account balance.

### SavingsAccount Class

- This class extends the `BankAccount`.
- It includes an additional `addInterest` method that allows you to add interest to the savings account.
- The `getBalance` method is overridden.

### CheckingAccount Class

- This class also extends the `BankAccount` class.
- It includes a `deductMonthlyFee` method to deduct a monthly fee.
- The `getBalance` method from the base class is used to display the checking account balance.

## Example

To use this example:

1. Create instances of savings and checking accounts using the provided classes.
2. Perform deposits, withdrawals, and account-specific operations.
3. Retrieve and display the account balances.

Code Example:

```java
BankAccount savings = new SavingsAccount(1001, 1000.0, 2.5);
savings.deposit(500.0);
if (savings instanceof SavingsAccount) {
            ((SavingsAccount) savings).addInterest();
        }
        System.out.println("Savings Account Balance: $" + savings.getBalance());
BankAccount checking = new CheckingAccount(2001, 1500.0, 10.0);
checking.deposit(300.0);
 if (checking instanceof CheckingAccount) {
            ((CheckingAccount) checking).deductMonthlyFee();
        }
System.out.println("Checking Account Balance: $" + checking.getBalance());
```

## Interfaces

1. **Account Interface**

   - `deposit(double amount)`: Allows deposits to the account.
   - `withdraw(double amount)`: Allows withdrawals.
   - `getBalance()`: Retrieves the account balance.

2. **Interest Interface**

   - `addInterest()`: Adds interest to the savings account balance.

3. **Deduction Interface**
   - `deductMonthlyFee()`: Deducts a monthly fee from the checking account balance.

### Classes

1. **BankAccount** (implements Account)

   - A basic account with deposit and getBalance methods.

2. **Savings** (implements Interest extends BankAccount)

   - Represents a savings account with interest calculation.

3. **Checking** (implements Deduction extends BankAccount)
   - Represents a checking account with monthly fee deduction.

## Example

To use this example:

1. Create instances of savings and checking accounts using the provided classes.
2. Perform deposit, withdrawal, and account-specific operations.
3. Retrieve the account balances..

Code Example:

```java
SavingsAccount savings = new Savings(1000.0, 2.5);
savings.deposit(500.0);
savings.addInterest();
System.out.println("Savings Account Balance: $" + savings.getBalance());

CheckingAccount checking = new Checking(1500.0, 10.0);
checking.deposit(300.0);
checking.deductMonthlyFee();
System.out.println("Checking Account Balance: $" + checking.getBalance());

```
