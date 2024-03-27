package Temp;

import java.util.Scanner;

public class Palindrome {

    public static String isPalindrome(String str) {
        boolean isPalin = true;
        for (int left = 0, right = str.length() - 1; left < right; left++, right--) {
            if (str.charAt(left) != str.charAt(right)) {
                isPalin = false;
                break;
            }
        }
        return (isPalin ? "Yes" : "No");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        System.out.println(isPalindrome(str));

    }
}
