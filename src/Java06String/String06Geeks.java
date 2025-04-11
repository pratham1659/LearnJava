package Java06String;

import java.util.*;

public class String06Geeks {

    /*
     * Ques 1: Maximum Occurring Character
     * Input:
     * str = testsample
     * Output: e
     * Explanation: e is the character which
     * is having the highest frequency.
     */
    public static char getMaximumOccur(String line) {

        int[] freq = new int[26];
        for (char c : line.toCharArray()) {
            freq[c - 'a']++;
        }

        char maxChar = 'a';
        int maxFreq = 0;

        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = (char) (i + 'a');
            } else if (freq[i] == maxFreq && i + 'a' < maxChar) {
                maxChar = (char) (i + 'a');
            }
        }

        return maxChar;
    }

    // Ques 2: Sum of Numbers in Given String
    public static int sumOfNumbers(String str) {
        int sum = 0;
        StringBuilder num = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                num.append(ch);
            } else {
                if (!num.isEmpty()) {
                    sum += Integer.parseInt(num.toString());
                    num.setLength(0);
                }
            }
        }

        if (!num.isEmpty()) {
            sum += Integer.parseInt(num.toString());
        }
        return sum;
    }

    // Ques 3: Find First Repeated character from String
    public static String findFirstRepeatedCharacter(String str) {
        HashSet<Character> set = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (set.contains(ch)) {
                return String.valueOf(ch);
            }
            set.add(ch);
        }

        return "-1"; // Return null character if no repeated character found
    }

    // Ques 4: remove common character and concat String
    public static String uncommonCharacters(String s1, String s2) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        // Add characters of s1 to set1
        for (char ch : s1.toCharArray()) {
            set1.add(ch);
        }

        // Add characters of s2 to set2
        for (char ch : s2.toCharArray()) {
            set2.add(ch);
        }

        StringBuilder result = new StringBuilder();
        for (char ch : s1.toCharArray()) {
            if (!set2.contains(ch)) {
                result.append(ch);
            }
        }
        for (char ch : s2.toCharArray()) {
            if (!set1.contains(ch)) {
                result.append(ch);
            }
        }

        // Check if all characters are removed
        if (result.isEmpty()) {
            return "-1";
        }

        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println("Get Maximum Char: " + getMaximumOccur("testsample"));

        System.out.println("Sum of numbers in the string: " + sumOfNumbers("1abc23"));

        System.out.println("Find first Repeated Character: " + findFirstRepeatedCharacter("abcdefa"));

        System.out.println("uncommon characters: " + uncommonCharacters("aacdb", "gafd"));
    }
}
