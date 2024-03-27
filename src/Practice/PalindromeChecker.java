package Temp;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] input = new String[n];
        for (int i = 0; i < n; i++) {
            input[i] = sc.next();
        }
        sc.close();

        for (String str : input) {
            System.out.println(checkPalindrome(str) ? "Yes" : "No");
        }
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
