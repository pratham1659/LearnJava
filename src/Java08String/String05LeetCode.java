package Java08String;

import java.util.Arrays;
import java.util.Stack;

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

    // Ques 2: Program to Check Advance Palindrome or Not.
    public static boolean isAdvancePalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return isPalindrome(str, left + 1, right) || isPalindrome(str, left, right - 1);
            }
            left++;
            right--;
        }

        return true;
    }

    public static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindromeCheck(String word) {
        int left = 0;
        int right = word.length() - 1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Ques 3: Program to Check First Palindrome or Not.
    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindromeCheck(word)) {
                return word;
            }
        }
        return "";
    }


    // Ques 3: Program to Check Anagram or Not.
    public static boolean isAnagramCheck(String s, String t) {

        s = s.replaceAll("\\s", "").toLowerCase();
        t = t.replaceAll("\\s", "").toLowerCase();

        if (s.length() != t.length()) {
            return false;
        }

        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    //Ques 4. Program to check Valid parenthesis
    public static boolean validParenthesis(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    //Ques 5. Program to remove consecutive duplicates:
    public static String removeConsecutiveChars(String s) {

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            res.append(currentChar);

            // Skip consecutive duplicate characters
            while (i < s.length() - 1 && s.charAt(i + 1) == currentChar) {
                i++;
            }
        }
        return res.toString();
    }

    //Ques 6. Check UpperCase or not
    public static String checkStringCase(String s) {

        if (Character.isUpperCase(s.charAt(0))) {
            return s.toUpperCase();
        } else {
            return s.toLowerCase();
        }
    }

    /*

    Ques 7: Program to check Good String
    Example 1:
        Input: s = "aaa"
        Output: NO
        Explanation: distance between 'a' and 'a' is not 1.
    Example 2:
        Input: s = "cbc"
        Output: YES
        Explanation: distance between 'b' and 'c' is 1.
     */

    public static String isGoodString(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (Math.abs(s.charAt(i) - s.charAt(i + 1)) != 1 && Math.abs(s.charAt(i) - s.charAt(i + 1)) != 25) {
                return "NO";
            }
        }
        return "YES";
    }

    //Ques 8: Program to check the last Index of the duplicate character
    public static int findLastIndex(String s, char p) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == p) {
                return i;
            }
        }

        return -1;
    }

    //Ques 9: Sort in Ascending Order:
    public static void reverseString(char[] arr){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            // Swap characters at start and end indices
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            // Move towards the center
            start++;
            end--;
        }
    }

    //Ques 10: program to sort in Descending order
    public static String sortDescendingString(String str) {

        char[] charArray = str.toCharArray();

        Arrays.sort(charArray);

        StringBuilder sb = new StringBuilder();
        for(Character c : charArray){
            sb.append(c);
        }

        sb.reverse();
        return sb.toString();
    }

    //Ques 11: Program to check String is Isogram or not
    /*
    Example 1:
        Input:
        S = machine
        Output: 1
        Explanation: machine is an isogram
        as no letter has appeared twice. Hence
        we print 1.
    Example 2:
        Input:
        S = geeks
        Output: 0
        Explanation: geeks is not an isogram
        as 'e' appears twice. Hence we print 0.
     */

    public static boolean isIsogramString(String data){

        data = data.toLowerCase();
        for(int i=0; i<data.length(); i++){
            for(int j = i+1; j<data.length(); j++){
                if(data.charAt(i) ==  data.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "A man, a plan, a canal: Panama";
        System.out.println("Check palindrome: " + isPalindrome(str));

        String checkPal = "abca";
        System.out.println("Check palindrome: " + isAdvancePalindrome(checkPal));

        String[] words = {"xngla", "e", "itrn", "y", "s", "pfp", "rfd"};
        System.out.println("Check First Palindrome: " + firstPalindrome(words));

        System.out.println("Check Anagram: " + isAnagramCheck("anagram", "nagaram"));


        System.out.println("Check Valid Parenthesis: " + validParenthesis("{[()]}"));
        System.out.println("Check Valid Parenthesis: " + validParenthesis("(]"));

        System.out.println("Remove Consecutive: " + removeConsecutiveChars("aabaa"));

        System.out.println("Check UpperCase: " + checkStringCase("Abcd"));
        System.out.println("Check UpperCase: " + checkStringCase("aBCd"));

        System.out.println("Check Good String: " + isGoodString("aaa"));
        System.out.println("Check Good String: " + isGoodString("cbc"));

        System.out.println("Find Last Index: " + findLastIndex("Geeks", 'e'));

        System.out.println("Sorting in String: "+ sortDescendingString("geeks"));

        System.out.println("Check IsoGram: " + isIsogramString("machine"));
        System.out.println("Check IsoGram: " + isIsogramString("geeks"));

    }
}
