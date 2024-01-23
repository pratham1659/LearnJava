package Practice.IBM;

import java.util.Scanner;

public class UserAuthentication {
    static boolean isValidUser(String user, String pass) {
        // Replace this array with your actual user-id and password pairs
        String[][] users = {{"user1", "pass1"}, {"user2", "pass2"}, {"user3", "pass3"}, {"user4", "pass4"},
                {"user5", "pass5"}};

        for (String[] userInfo : users) {
            if (userInfo[0].equals(user) && userInfo[1].equals(pass)) {
                return true;
            }
        }
        return false;
    }

    static int generatePalindromeToken(int n) {
        for (int i = (int) Math.pow(10, n - 1); i < Math.pow(10, n); i++) {
            String str = Integer.toString(i);
            String reversed = new StringBuilder(str).reverse().toString();
            if (str.equals(reversed)) {
                return i;
            }
        }
        return -1; // Return -1 if no palindrome number found (shouldn't happen with valid inputs)
    }

    static void login(int noOfDigitForThePalindrome, String userld, String password) {
        if (noOfDigitForThePalindrome <= 0 || !userld.matches("[a-zA-Z0-9]+") || !password.matches("[a-zA-Z0-9]+")) {
            System.out.println("Invalid input");
            return;
        }

        if (isValidUser(userld, password)) {
            int palindromeToken = generatePalindromeToken(noOfDigitForThePalindrome);
            System.out.println("Welcome " + userld + " and the generated token is: token-" + palindromeToken);
        } else {
            System.out.println("Userld or password is not valid, please try again.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no. of digits for the palindrome number: ");
        int noOfDigits = scanner.nextInt();

        scanner.nextLine(); // Consume the newline character

//        System.out.print("Enter user-id: ");
////        String user = scanner.nextLine();
        String user = "user5";
//
//        System.out.print("Enter password: ");
//        String pass = scanner.nextLine();
        String pass = "pass5";

        login(noOfDigits, user, pass);
    }
}
