package String.Basic;

import java.util.ArrayList;

public class Java3StringProblems {

    public static boolean checkPalindrome(String str) {

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void palindromeSubstring(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                if (checkPalindrome(str.substring(i, j)) == true) {
                    System.out.print((str.substring(i, j)) + " ");
                    count++;
                }
            }
        }
        System.out.println("The number of palindrome substing : " + count);
    }

    public static void reverseEachWord(String str) {

        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                sb.append(ch);
            } else {
                sb.reverse();
                ans += sb;
                ans += " ";
                // sb.delete(0, sb.length());
                sb = new StringBuilder();
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println("Reverse String: " + ans);
    }

    /*
     * The string should be compressed such that consecutive
     * duplicates of characters are replaced with the character
     * and followed by the number of consecutive duplicates.
     */

    public static void stringCompress(String str) {
        String ans = "" + str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (curr == prev) {
                count++;
            } else {
                ans += count;
                count = 1;
                ans += curr;
            }
        }
        ans += count;
        System.out.println(ans);
    }

    public static ArrayList<String> findPalindromes(String bigString) {
        ArrayList<String> palindromes = new ArrayList<>();

        // Iterate through each substring and check for palindrome
        for (int i = 0; i < bigString.length(); i++) {
            for (int j = i + 1; j <= bigString.length(); j++) {
                String substring = bigString.substring(i, j);
                if (isPalindrome(substring)) {
                    palindromes.add(substring);
                }
            }
        }

        return palindromes;
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "abcba";
        palindromeSubstring(str);

        String wordStr = "I am an Online Player";
        reverseEachWord(wordStr);

        String wordCount = "aaabbbcdddde";
        stringCompress(wordCount);

        String bigString = "abcbadefedabcba"; // Example big string
        ArrayList<String> palindromes = findPalindromes(bigString);

        // Print the palindromic strings found
        System.out.println("Palindromic Strings:");
        for (String palindrome : palindromes) {
            System.out.println(palindrome);
        }

    }
}
