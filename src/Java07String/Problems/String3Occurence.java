package String.Problems;

import java.util.*;
import java.util.Map.Entry;

public class String3Occurence {

    /*
     * Write a Java Program to find occurrence of each character in given String
     */

    public static void wordOccurence(String str) {

        Map<Character, Integer> map = new HashMap<>();
        char[] chArray = str.toCharArray();

        for (char ch : chArray) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                int value = map.get(ch);
                map.put(ch, value + 1);
            }
        }

        System.out.println(map);
    }

    /*
     * Java Program To Find First Non Repeated Character In String
     */

    // Approach using Normal
    public static void nonRepeatedWord(String str) {

        for (int i = 0; i < str.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.println("Non Repeated: " + str.charAt(i));
                break;
            }
        }

    }

    // Approach Using Collection
    public static void nonRepeatedCollection(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(str.charAt(i), map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        System.out.println(map);
        for (Entry<Character, Integer> entrySet : map.entrySet()) {
            if (entrySet.getValue() == 1) {
                System.out.println("Non Repeated: " + entrySet.getKey());
                break;
            }

        }
    }

    /*
     * Java Program to replace a character with it's occurrence in given String
     */

    public static void replaceOccurenceChracter(String str) {

        // Charcter is present or not
        char charToReplace = 'T';
        if (str.indexOf(charToReplace) == -1) {
            System.out.println("Given Character is not a valid occurrence");
            System.exit(0);
        }

        // // Logic to replace char occurance in String
        // char[] arr = str.toCharArray();
        // int count = 1;
        // for (int i = 0; i < str.length(); i++) {
        // if (arr[i] == charToReplace) {
        // arr[i] = String.valueOf(count).charAt(0);
        // count++;
        // }
        // }
        // System.out.println(Arrays.toString(arr));

        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == charToReplace) {
                str = str.replaceFirst(String.valueOf(charToReplace), String.valueOf(count));
                count++;
            }
        }
        System.out.println(str);

    }

    /*
     * Write a java program to print even length words in a String?
     */

    public static void printEvenLengthWords(String str) {
        // Split the string into words
        String[] words = str.split("\\s+"); // Splitting by whitespace

        // Iterate through each word
        for (String word : words) {
            // Check if the length of the word is even
            if (word.length() % 2 == 0) {
                System.out.print(word + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        String str = "aaabbbbccdeee";
        wordOccurence(str);

        String str1 = "AABCCDBECE";
        nonRepeatedWord(str1);
        nonRepeatedCollection(str1);

        String str2 = "OPENTEXT";
        replaceOccurenceChracter(str2);

        String inputString = "This is a sample string containing words of various lengths";
        System.out.println("Even length words in the string:");
        printEvenLengthWords(inputString);
    }
}
