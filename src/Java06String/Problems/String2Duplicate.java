package Java06String.Problems;

import java.util.*;
import java.util.Map.Entry;

public class String2Duplicate {

    // Ques 1: Remove Duplicate Characters in Given String
    // Approach - 1
    // Time complexity : O(N)
    public static void duplicateRemove(String str) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = str.indexOf(ch, i + 1);
            System.out.println(idx);
            if (idx == -1) {
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }

    // Approach - 2
    // Time complexity : O(N^2)
    public static void duplicateCharArray(String str) {

        char[] chArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chArray.length; i++) {
            boolean repeated = false;
            for (int j = i + 1; j < chArray.length; j++) {
                if (chArray[i] == chArray[j]) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
                sb.append(chArray[i]);
            }
        }

        System.out.println(sb);
    }

    // Approach - 3
    // TimeComplexity O(n)
    public static void duplicateBuilder(String str) {

        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(c -> sb.append((char) c));
        System.out.println(sb);

    }

    // Approach - 4
    public static void duplicateSetInterface(String str) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        for (Character c : set) {
            sb.append(c);
        }
        System.out.println(sb);
    }

    // Duplicate elements in String Array
    public static void findDuplicates(String[] str) {

        // Approach - 1; Time Complexity O(N)^2 -- Worst Solution
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[i].equals(str[j])) {
                    System.out.println("Found Duplicate element: " + str[i]);
                }
            }
        }

        // Approach - 2; Using HashSet, Time Complexity O(N) -- worst solution
        Set<String> store = new HashSet<>();

        for (String name : str) {
            if (!store.add(name)) {
                System.out.println("Found Duplicate element: " + name);
            }
        }

        // Approach - 3 Using HashMap, Time Complexity - O(n+m) -- worst solution
        Map<String, Integer> map = new HashMap<>();

        for (String name : str) {
            Integer count = map.get(name);
            if (count == null) {
                map.put(name, 1);
            } else {
                map.put(name, ++count);
            }
        }

        // get the value from HashMap
        Set<Entry<String, Integer>> entrySet = map.entrySet();

        for (Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.println("Found Duplicate element: " + entry.getKey());
            }
        }
    }

    // Java Program to Count the Number of Duplicate Words in Given String
    public static void findDuplicateWord(String inputString) {

        // split:
        String[] words = inputString.split(" ");

        // Create one HashMap
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        Set<String> wordsSet = wordCount.keySet();

        for (String word : wordsSet) {
            if (wordCount.get(word) > 1) {
                System.out.println(word + " " + wordCount.get(word));
            }
        }
    }

    public static void main(String[] args) {

        String wordStr = "Programming";
        duplicateRemove(wordStr);
        duplicateCharArray(wordStr);
        duplicateBuilder(wordStr);
        duplicateSetInterface(wordStr);

        String[] str = { "Java", "JavaScript", "Python", "Ruby", "Cpp", "Java" };
        findDuplicates(str);

        findDuplicateWord("Hey Java is Java best language");
        findDuplicateWord("100 200 300 300 500 600 100");

    }

}
