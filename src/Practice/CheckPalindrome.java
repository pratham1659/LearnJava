package Practice;


import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        String input = "N2 i&nJA?a& jnI2n";
        boolean result = checkPalindrome(input);
        System.out.println(result); // Output should be true
    }

    public static boolean checkPalindrome(String str) {
        String processedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = processedStr.length() - 1;
        while (left < right) {
            if (processedStr.charAt(left) != processedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

