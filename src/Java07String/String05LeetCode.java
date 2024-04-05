package Java07String;

public class String05LeetCode {

    // Ques 1: Program to Check Palindrome or Not.
    public static boolean isPalindrome(String str) {

        String regex = "[^a-zA-Z0-9]";

        String newInput = str.replaceAll(regex, "").toLowerCase();

        int left = 0;
        int right = newInput.length() - 1;

        while (left < right) {
            if (newInput.charAt(left) != newInput.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
