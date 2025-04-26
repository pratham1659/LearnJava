package Java06String.LeetCode;

public class MediumLeetCode {

    public class LongestPalindromeSubstring {

        // Function to check if a string is a palindrome
        public static boolean isPalindrome(String str) {
            int left = 0, right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                left++;
                right--;
            }
            return true;
        }

        // Function to find the longest palindromic substring using substring
        public static String longestPalindrome(String s) {
            int n = s.length();
            String longest = "";

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    String sub = s.substring(i, j); // substring from index i to j-1
                    if (isPalindrome(sub) && sub.length() > longest.length()) {
                        longest = sub;
                    }
                }
            }

            return longest;
        }

        public static void main(String[] args) {

            String input = "aaaabaaa";
            String result = longestPalindrome(input);
            System.out.println(result);

        }
    }
}
