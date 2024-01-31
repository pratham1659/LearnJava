package Java08Oops.Java03Encapsulation.questions.Banks;

public class testAccount {

    // Main method for testing
    public static void main(String[] args) {
        BankAccount account = new BankAccount("1234567890", 1000.0, "John Doe", "Main Branch");
        account.display(); // Display initial account information
        account.deposit(500.0); // Deposit $500
        account.withdraw(200.0); // Withdraw $200
        account.display(); // Display updated account information
    }
}
