package Java10Oops.Java01Class;

// Blueprint for BankAccount objects
public class BankAccount {
    // Attributes (Instance Variables)
    String accountNumber;
    String accountHolder;
    double balance;

    // Constructor (Used to initialize objects)
    BankAccount(String accNumber, String accHolder, double initialBalance) {
        this.accountNumber = accNumber;
        this.accountHolder = accHolder;
        this.balance = initialBalance;
    }

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to display account details
    void displayAccountInfo() {
        System.out.println("\nAccount Details");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}
