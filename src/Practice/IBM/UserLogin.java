package Practice.IBM;
import java.util.HashMap;
import java.util.Scanner;

public class UserLogin {

    public static void login(int noOfDigitForThePalindrome, String userld, String password) {
        // Check constraints
        if (!(noOfDigitForThePalindrome > 0)) {
            System.out.println("Invalid input");
            return;
        }

        // Check user credentials
        HashMap<String, String> validUsers = new HashMap<>();
        validUsers.put("user1", "pass1");  // Replace this with your actual user credentials
        if (!validUsers.containsKey(userld) || !validUsers.get(userld).equals(password)) {
            System.out.println("UserId or password is not valid, please try again.");
            return;
        }

        // Generate palindrome token
        int palindromeToken = Integer.parseInt("1" + "0".repeat(noOfDigitForThePalindrome - 1) + "1");

        // Display welcome message
        System.out.println("Welcome " + userld + " and the generated token is: token-" + palindromeToken + ".");
    }

    public static void main(String[] args) {
        // Use Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for noOfDigitForThePalindrome
        System.out.print("Enter the number of digits for the palindrome: ");
        int noOfDigitForThePalindrome = scanner.nextInt();

        // Take user input for user ID
        System.out.print("Enter your user ID: ");
        String userld = scanner.next();

        // Take user input for password
        System.out.print("Enter your password: ");
        String password = scanner.next();

        // Call the login function with user input
        login(noOfDigitForThePalindrome, userld, password);

        // Close the scanner
        scanner.close();
    }
}
