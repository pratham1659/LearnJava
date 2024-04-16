package Java08String.Problems;

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

    public static void main(String[] args) {

        longestSubstring("abbac");
    }
}
