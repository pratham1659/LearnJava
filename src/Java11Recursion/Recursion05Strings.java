package Java11Recursion;

public class Recursion05Strings {

    // 1: Remove all the occurrences of 'a' from string s = "abcax"
    public static String removeOccurrence(String str) {

        int n = str.length();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != 'a') {
                ans.append(str.charAt(i)); // constant time
            }
        }

        return ans.toString();
    }

    // 2: Approach
    // Time Complexity -- O(N^2)
    public static String removeOccur(String str, int idx) {

        // baseCase
        if (idx == str.length())
            return "";

        // subCase
        String smallAns = removeOccur(str, idx + 1);
        char currChar = str.charAt(idx);

        // self work
        if (currChar != 'a') {
            return currChar + smallAns; // d + bcx // Linear Time
        } else {
            return smallAns;
        }
    }

    // 3: Approach
    // Time Complexity -- O(NxN)
    public static String removeApproach(String str) {

        if (str.isEmpty())
            return "";
        String subAns = removeApproach(str.substring(1)); // Linear Time
        char currChar = str.charAt(0);

        if (currChar != 'a') {
            return currChar + subAns; // Linear Time
        } else {
            return subAns;
        }
    }

    // 4: Write a program to print reverse of a string using recursion.
    public static String reverseStr(String str, int idx) {
        // baseCase
        if (idx == str.length())
            return "";

        // subCase
        String smallAns = reverseStr(str, idx + 1);
        char currChar = str.charAt(idx);

        // self work
        return smallAns + currChar; // Linear Time
    }

    // 5: Write a program to check given string is palindrome or not.
    public static boolean checkPalindrome(String str, int l, int r) {
        if (l >= r)
            return true;

        return ((str.charAt(l) == str.charAt(r)) && checkPalindrome(str, l + 1, r - 1));

    }

    public static void main(String[] args) {

        System.out.println(removeOccurrence("abcax"));
        System.out.println(removeOccur("abcax", 0));

        System.out.println(removeApproach("abcax"));

        String str = "level";
        System.out.println(reverseStr(str, 0));
        // reverseStr(str, 0);
        // if (str.equals(reverseStr(str, 0))) {
        // System.out.println(str + " is Palindrome");
        // } else {
        // System.out.println(str + " is Not Palindrome");
        // }

        System.out.println(checkPalindrome("abcd", 0, 3));

    }
}
