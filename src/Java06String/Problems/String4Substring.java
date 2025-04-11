package Java06String.Problems;

import java.util.*;

public class String4Substring {

    // Write a java program to find the longest substring length which doesn't
    // contain repeating characters in given String.
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void longestSubstring(String str) {

        String longestSubString = null;
        int longestSubstringLength = 0;

        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];

            if (!map.containsKey(ch)) {
                map.put(ch, i);
            } else {
                i = map.get(ch);
                map.clear();
            }

            if (map.size() > longestSubstringLength) {
                longestSubstringLength = map.size();
                longestSubString = map.keySet().toString();
            }
        }
        System.out.println("The longest substring: " + longestSubString);
        System.out.println("The substring length: " + longestSubstringLength);
    }

    public static void stringSubstring() {

        /*
         * String str = "abcd";
         * System.out.println(str.substring(0,3));
         * System.out.println(str.substring(2));
         * What will be the output of following code?
         * String s = "physics";
         * for(int i=2;i<4;i++){
         * System.out.println(s.substring(i));
         * }
         * write a code to print substring
         */

        String str = "abcd";
        for (int i = 0; i <= 3; i++) {
            for (int j = i + 1; j <= 4; j++) {
                System.out.print(str.substring(i, j) + " ");
            }
        }
    }

    public static void main(String[] args) {

        longestSubstring("abbac");
        stringSubstring();
    }
}
