package Java10Oops.Java01Class;

public class Bank {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("121", "Pratham", 10000.00);

        b1.displayAccountInfo();

        b1.deposit(3000);

        b1.displayAccountInfo();

        b1.withdraw(6000);

        b1.displayAccountInfo();

    }

}
