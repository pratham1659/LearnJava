package Java06String;

import java.util.*;

public class String04Problems {

    // Ques 1: Program to find a Palindrome in String
    // Time Complexity: O(NlogN)
    // Space Complexity: O(1)
    public static boolean checkPalindrome(String str) {

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    // Ques 2: program to find palindrome substring
    // Time Complexity: O(N^2)
    // Space Complexity: O(N^2)
    public static int palindromeSubstring(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                if (checkPalindrome(str.substring(i, j))) {
                    System.out.print((str.substring(i, j)) + " ");
                    count++;
                }
            }
        }
        return count;
    }

    // Ques 3: Reverse Each word in String
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // ABC CDE XYZ
    // Reverse String: CBA EDC ZYX
    public static void reverseEachWord(String str) {

        StringBuilder ans = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                sb.append(ch);
            } else {
                sb.reverse();
                ans.append(sb);
                ans.append(" ");
                sb = new StringBuilder();
            }
        }
        sb.reverse();
        ans.append(sb);
        System.out.println("Reverse String: " + ans);
    }

    // Ques 4: The string should be compressed such that consecutive
    // duplicates of characters are replaced with the character
    // and followed by the number of consecutive duplicates.

    public static void stringCompress(String str) {
        StringBuilder ans = new StringBuilder("" + str.charAt(0));
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (curr == prev) {
                count++;
            } else {
                ans.append(count);
                count = 1;
                ans.append(curr);
            }
        }
        ans.append(count);
        System.out.println(ans);
    }

    // Ques 5: find Palindrome in Big String
    // Time Complexity: O(N^2)
    // Space Complexity: O(N^2)
    public static ArrayList<String> findPalindromes(String bigString) {
        ArrayList<String> palindromes = new ArrayList<>();

        // Iterate through each substring and check for palindrome
        for (int i = 0; i < bigString.length(); i++) {
            for (int j = i + 1; j <= bigString.length(); j++) {
                String substring = bigString.substring(i, j);
                if (isPalindrome(substring)) {
                    palindromes.add(substring);
                }
            }
        }

        return palindromes;
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Ques 6: Add Number in String
    // Time Complexity: O(N)
    // Space Complexity: O(N)
    public static int addNumberInString(String str) {

        StringBuilder num = new StringBuilder();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num.append(str.charAt(i));
            } else {
                if (!num.toString().isEmpty()) {
                    sum = sum + Integer.parseInt(num.toString());
                    num = new StringBuilder();
                }
            }
        }

        return sum;
    }

    // Ques 7: Common Character between two String Alphabetical Order.
    // Time Complexity: O(n log k)
    // Space Complexity: O(n)
    public static void CommonCharacter(String s1, String s2) {
        char[] fStringToCharArray = s1.replaceAll("\\s+", "").toCharArray();
        char[] sStringToCharArray = s2.replaceAll("\\s+", "").toCharArray();

        Set<Character> firstStringSet = new TreeSet<>();
        Set<Character> secondStringSet = new TreeSet<>();

        for (char c : fStringToCharArray) {
            firstStringSet.add(c);
        }
        for (char c : sStringToCharArray) {
            secondStringSet.add(c);
        }

        firstStringSet.retainAll(secondStringSet);
        System.out.println("Common characters in alphabetical order: " + firstStringSet);
        System.out.println("Count: " + firstStringSet.size());

    }

    // Ques 8: Convert 2nd Character in Upper Case
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public static void makeUpperCase(String str) {

        String ans = "";

        ans = ans + str.charAt(0) + Character.toUpperCase(str.charAt(1)) + str.substring(2) + " ";
        System.out.println(ans);
    }

    // Ques 9: Sum of count of A and B in String
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void countAndSumCharacter() {
        String s = "acabbd";
        int countA = 0;
        int countB = 0;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                countA++;
            }
            if (s.charAt(i) == 'b') {
                countB++;
            }
        }

        sum += countA + countB;
        System.out.println(sum);
    }

    // Ques 10: Program to find substring in String
    // Time Complexity: O(n * m)
    // Space Complexity: O(1)
    public static void findSubstring() {
        String stringValue = "dhimanman";
        String subStringValue = "man";
        int count = 0;
        while (stringValue.length() >= subStringValue.length()) {
            if (stringValue.startsWith(subStringValue)) {
                count++;
            }
            stringValue = stringValue.substring(1);

        }
        if (count == 0) {
            System.out.println("Substring not found");
        } else {
            System.out.println("Frequency of substring is: " + count);
        }
    }

    // Ques 11: Rotation Of String
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void rotateStringCheck() {
        String s1 = "AmritaAmritaisis";
        String s2 = "isisAmritaAmrita";
        if (s1.length() != s2.length()) {
            System.out.println("s2 is not rotation of s1");
        } else {
            String s3 = s1 + s1;
            if (s3.contains(s2)) {
                System.out.println("s2 is rotation of s1");
            } else {
                System.out.println("s2 is not rotation of s1");
            }
        }
    }

    // Ques 12: Program Remove Extra White space from String
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void removeWhiteSpace(String s) {
        s = s.replaceAll("\\s+", "");
        System.out.println(s);
    }

    // Ques 14: Highest frequency of elements
    // Time Complexity: O(n + m)
    // Space Complexity: O(m)
    public static void checkFrequency(String s) {
        String[] words = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();

        for (String str : words) {
            if (map.get(str) != null) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        int maxCount = 0;
        String maxString = "";

        for (Map.Entry<String, Integer> me : map.entrySet()) {
            if (maxCount < me.getValue()) {
                maxCount = me.getValue();
                maxString = me.getKey();
            }
        }
        System.out.println("Max String: " + maxString);
        System.out.println("Count: " + maxCount);
    }

    // Ques 15: Program to Count Character Occurrence in String
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int countOccurrences(String input, char target) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }

    // Ques 16: Program to find First Repeated Non-Repeated Char
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static void firstRepeatedNonRepeatedChar(String str) {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();
        for (char ch : charArray) {
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                charCountMap.put(ch, 1);
            }
        }

        // checking for first non-repeated character
        for (char ch : charArray) {
            if (charCountMap.get(ch) == 1) {
                System.out.println("First Non-Repeated Character In '" + str + "' is '" + ch + "'");
                break;
            }
        }

        // checking for first repeated character
        for (char ch : charArray) {
            if (charCountMap.get(ch) > 1) {
                System.out.println("First Repeated Character In '" + str + "' is '" + ch + "'");
                break;
            }
        }
    }

    // Ques 16: Program to find duplicate Word Using HashMap
    // Time Complexity: O(n + m)
    // Space Complexity: O(m)
    public static void duplicateWordsUsingHashMap(String input) {
        String[] words = input.split(" ");
        Map<String, Integer> wordMap = new HashMap<String, Integer>();
        for (String str : words) {
            if (wordMap.get(str) != null) {
                wordMap.put(str, wordMap.get(str) + 1);
            } else {
                wordMap.put(str, 1);
            }
        }
        Set<String> str2 = wordMap.keySet();

        for (String str : str2) {
            if (wordMap.get(str) > 1) {
                System.out.println("Words: " + str + " - repeated " + wordMap.get(str) + " times");
            }
        }
    }

    // Ques 16: Program to find duplicate Word Using HashMap
    // Time Complexity: O(N^2)
    // Space Complexity: O(m)
    public static void duplicateCharacterUsingHashMap(String str) {

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s:%d %n", entry.getKey(), entry.getValue());
            }
        }
    }

    // Ques 17: Convert 2nd Character in Upper Case
    public static void InputForUpperCase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        String str = sc.nextLine();
        String upperCase = "";
        Scanner scanner = new Scanner(str);
        while (scanner.hasNext()) {
            String word = scanner.next();
            upperCase = upperCase + word.charAt(0) + Character.toUpperCase(word.charAt(1)) + word.substring(2) + " ";
        }
        System.out.println(upperCase);
        sc.close();
        scanner.close();
    }

    public static void swapString(String s1, String s2) {

        System.out.println("Before Swapping");
        System.out.println("The value of a is " + s1);
        System.out.println("The value of a is " + s2);

        s1 = s1 + s2;

        s2 = s1.substring(0, s1.length() - s2.length());
        s1 = s1.substring(s2.length());

        System.out.println("First : " + s1 + " Second : " + s2);

    }

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

        System.out.println("Check Palindrome: " + checkPalindrome("level"));
        System.out.println("Check Palindrome: " + checkPalindrome("levee"));

        System.out.println("\n" + palindromeSubstring("abcba"));

        String wordStr = "I am an Online Player";
        reverseEachWord(wordStr);

        String wordCount = "aaabbbcdddde";
        stringCompress(wordCount);

        String bigString = "abcbadefedabcba"; // Example big string
        ArrayList<String> palindromes = findPalindromes(bigString);

        // Print the palindromic strings found
        System.out.println("Palindromic Strings:");
        for (String palindrome : palindromes) {
            System.out.println(palindrome);
        }

        System.out.println("Add Number: " + addNumberInString("hllo57dk25gautm"));

        String fString = "thin sticks";
        String sString = "thick bricks";
        CommonCharacter(fString, sString);

        makeUpperCase("abcde");

        countAndSumCharacter();

        findSubstring();

        rotateStringCheck();

        removeWhiteSpace("abc    d e f    which k l m n   o p first");

        checkFrequency("this this is demo demo demo demo is demo is is amrita");

        String inputString = "Hello, how are you?";
        char targetCharacter = 'o';
        int occurrences = countOccurrences(inputString, targetCharacter);
        System.out.println("Number of occurrences of '" + targetCharacter + "': " + occurrences);

        String repeatedStr = "aabcshsddss";
        firstRepeatedNonRepeatedChar(repeatedStr);

        String duplicateStr = "margarita";
        duplicateCharacterUsingHashMap(duplicateStr);

        String duplicateArray = "Amrita man man mon pow mon";
        duplicateWordsUsingHashMap(duplicateArray);

        swapString("hello", "World");

        System.out.println("Get Maximum Char: " + getMaximumOccur("testsample"));

        System.out.println("Sum of numbers in the string: " + sumOfNumbers("1abc23"));

        System.out.println("Find first Repeated Character: " + findFirstRepeatedCharacter("abcdefa"));

        System.out.println("uncommon characters: " + uncommonCharacters("aacdb", "gafd"));

    }
}
