package Java05Array;

public class Array3Reverse {

    // Approach - 1
    public static void reverseInteger(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        System.out.println("Reverse Num: " + rev);
    }

    // Approach - 2
    public static void reverseStringInteger(int num) {
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        sb.reverse();
        System.out.println("Reverse Using Buffer: " + sb);

    }


     // How to check Palindrome number
    public static void checkPalindrome(int num) {

        int reserve = 0;
        int sum = 0;
        int temp = num;

        while (num > 0) {
            reserve = num % 10;
            sum = (sum * 10) + reserve;
            num = num / 10;
        }

        if (temp == sum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static boolean isPalindrome(String str) {
        /*
         Convert the number to a strings
         String str = Integer.toString(num);
         Reverse the string
        */

        StringBuilder reversed = new StringBuilder(str).reverse();
        return str.equals(reversed.toString());
    }

    public static void findPalindromicSubstrings(String str) {
        int n = str.length();

        // Iterate through all substrings
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String substring = str.substring(i, j);
                if (isPalindromeString(substring)) {
                    System.out.println("Palindrome found: " + substring);
                }
            }
        }
    }

    public static boolean isPalindromeString(String str) {
        int left = 0;
        int right = str.length() - 1;

        // Check if the string is a palindrome
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

//        reverseInteger(12345);
//        reverseStringInteger(12345);
//
//        checkPalindrome(121);
//        int num1 = 12321;
//        System.out.println(num1 + " is palindrome? " + isPalindrome(Integer.toString(num1)));

        int inputString = 121454;
        String str = "abacdgfdcaba";
//        findPalindromicSubstrings(Integer.toString(inputString));
        findPalindromicSubstrings(str);
    }
}
