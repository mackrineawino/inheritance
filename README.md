# Bank Account Example with Interface Segregation

This example demonstrates a simple banking system with savings and checking accounts, showcasing the principles of object-oriented design, including interface segregation.

## Introduction

In this example, we have designed a basic banking system with the following classes and interfaces:

### Interfaces

1. **Account Interface**
    - `deposit(double amount)`: Allows deposits to the account.
    - `getBalance()`: Retrieves the account balance.

2. **SavingsAccount Interface** (extends Account)
    - `addInterest()`: Adds interest to the savings account balance.

3. **CheckingAccount Interface** (extends Account)
    - `deductMonthlyFee()`: Deducts a monthly fee from the checking account balance.

### Classes

1. **BaseAccount** (implements Account)
    - A basic account with deposit and getBalance methods.

2. **Savings** (implements SavingsAccount)
    - Represents a savings account with interest calculation.

3. **Checking** (implements CheckingAccount)
    - Represents a checking account with monthly fee deduction.

## Usage

To use this example:

1. Create instances of savings and checking accounts using the provided classes.
2. Perform deposit, withdrawal, and account-specific operations.
3. Retrieve the account balances.

Example Usage:
```java
SavingsAccount savings = new Savings(1000.0, 2.5);
savings.deposit(500.0);
savings.addInterest();
System.out.println("Savings Account Balance: $" + savings.getBalance());

CheckingAccount checking = new Checking(1500.0, 10.0);
checking.deposit(300.0);
checking.deductMonthlyFee();
System.out.println("Checking Account Balance: $" + checking.getBalance());

