package Java09Oops.Java02Keyword.staticKey;

import java.util.Scanner;

public class Static2Key {

    private int accID;
    private String name;
    private double balance;
    private static double rateOfInterest;

    static {
        System.out.println("Enter the rate of interest: ");
        Scanner sc = new Scanner(System.in);
        rateOfInterest = sc.nextDouble();
        sc.close();
    }

    public Static2Key(int id, String n, double b) {
        accID = id;
        name = n;
        balance = b;
        System.out.println("Constructor Called....");
    }

    public void showAccount() {
        System.out.println("Id: " + accID);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + rateOfInterest);
    }

    public void simpleInterest() {

        double time = 3;
        double SI = (balance + time + rateOfInterest) / 100;
        System.out.println("Simple Interest:  " + SI);
    }

    public static void main(String[] args) {
        Static2Key obj = new Static2Key(123, "Pratham", 10000.0);
        obj.showAccount();
        obj.simpleInterest();
    }
}
