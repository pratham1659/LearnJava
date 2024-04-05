package String.Problems;

import java.util.HashMap;
import java.util.Map;

public class String9Analyze {

    public static void analyzeString(String str) {
        // Count vowels, words, and character frequency
        int vowelCount = 0;
        int wordCount = 0;
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Convert the string to lowercase to simplify vowel check
        str = str.toLowerCase();

        // Split the string into words
        String[] words = str.split("\\s+"); // Splitting by whitespace

        // Iterate through each word
        for (String word : words) {
            wordCount++;
            // Count vowels in the word
            for (char c : word.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                }
                // Update character frequency map
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
        }

        // Print results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Character frequency:");
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    /*
     * How to Verify if the String Contains only Digits
     */
    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    public static boolean isNumericFind(CharSequence cs) {

        if (isEmpty(cs)) {
            return false;
        }

        int len = cs.length();
        for (int i = 0; i < len; i++) {
            if (!Character.isDigit(cs.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String inputString = "This is a sample string containing words of various lengths";
        analyzeString(inputString);

        System.out.println(isNumericFind(null));
        System.out.println(isNumericFind(""));
        System.out.println(isNumericFind("Sw23"));
        System.out.println(isNumericFind("23"));
        System.out.println(isNumericFind("\u0967\u0968\u0969"));
    }
}
