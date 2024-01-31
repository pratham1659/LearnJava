package Java08Oops.Java03Encapsulation.questions.Banks;

public class BankAccount {
//    Define a BankAccount class with private attributes like
//    accountNumber, accountHolderName, and balance. Provide
//    public methods to deposit and withdraw money, ensuring that
//    these methods don't allow illegal operations like withdrawing
//    more money than the current balance.

    private String accountNumber;
    private double balance;
    private String ownerName;
    private String branch;

    // Constructor
    public BankAccount(String accountNumber, double balance, String ownerName, String branch) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
        this.branch = branch;
    }

    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getBranch() {
        return branch;
    }

    // Setter method for balance (with validation)
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance. Balance cannot be negative.");
        }
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount. Deposit amount must be positive.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    // Method to display account information
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Branch: " + branch);
        System.out.println("Balance: " + balance);
    }
}


