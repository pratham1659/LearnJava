package Java06String.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class EasyLeetCode {

    // Q1 - Remove Outermost Parentheses (Easy)
    // https://leetcode.com/problems/remove-outermost-parentheses
    public static String removeOuterParentheses(String s) {

        StringBuilder sb = new StringBuilder();
        int open = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (open > 0) {
                    sb.append(ch);
                }
                open++;
            } else {
                open--;
                if (open > 0) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }

    // Q2 - Reverse String
    // https://leetcode.com/problems/reverse-string
    public static String reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }

        return s.toString();
    }

    // Q3 - Valid Palindrome in String
    // https://leetcode.com/problems/valid-palindrome
    public static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }

        int left = 0;
        int right = sb.length() - 1;
        while (left < right) {
            if (sb.charAt(left) != sb.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    // Q5 - Longest Common Prefix (Easy)
    // https://leetcode.com/problems/longest-common-prefix
    public static String longestCommonPrefix(String[] strs) {

        if (strs.length == 0 || strs == null)
            return "";

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty())
                    return "";
            }
        }

        return prefix;
    }

    // Q. 6 - Valid Anagram (Easy)
    // https://leetcode.com/problems/valid-anagram
    public static boolean validAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return Arrays.equals(sArr, tArr);
    }

    // Q7 - Fizz Buzz (Easy)
    // https://leetcode.com/problems/fizz-buzz

    public static List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(Integer.toString(i));
            }
        }
        return res;
    }

    // Q. 8 - Valid Parentheses
    // https://leetcode.com/problems/valid-parentheses
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    // Q.9 - Reverse Words in a String
    // https://leetcode.com/problems/reverse-words-in-a-string
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }

    // Q.10 - Isomorphic Strings
    // https://leetcode.com/problems/isomorphic-strings
    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Character> mapS = new HashMap<>();
        HashMap<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            Character chS = s.charAt(i);
            Character chT = t.charAt(i);

            if (mapS.containsKey(chS)) {
                if (mapS.get(chS) != chT) {
                    return false;
                }
            } else {
                mapS.put(chS, chT);
            }

            if (mapT.containsKey(chT)) {
                if (mapT.get(chT) != chS) {
                    return false;
                }
            } else {
                mapT.put(chT, chS);
            }
        }
        return true;
    }

    // Q. 11 Rotate String
    // https://leetcode.com/problems/rotate-string
    public static boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String doubled = s + s;
        return doubled.contains(goal);
    }

    public static void main(String[] args) {

        System.out.println(removeOuterParentheses("(()())(())"));

        char[] s = { 'h', 'e', 'l', 'l', 'o' };

        System.out.println(reverseString(s));

        String val = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(val));

        String[] strs = { "flower", "flow", "flight" };

        System.out.println(longestCommonPrefix(strs));

        System.out.println(fizzBuzz(5));

        System.out.println(validAnagram("rat", "cat"));

        System.out.println(isValid("()[]{}"));

        String val1 = "the sky is blue";
        System.out.println(reverseWords(val1));

        String st1 = "paper";
        String st2 = "title";
        System.out.println(isIsomorphic(st1, st2));

        String set = "abcde";
        String goal = "cdeab";
        System.out.println(rotateString(set, goal));

    }

}
