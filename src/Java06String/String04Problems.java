package Java06String;

import java.util.*;

public class String04Problems {

    // Ques 1: Program to find a Palindrome in String
    // Time Complexity: O(n)
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

    // Ques 4: character occurence in String
    // I love Programming I love codeForWin.
    // find the index of "O present the string"
    public static void findCharacterIndex(String str) {

        int n = str.length();
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (int i = 0; i < n; i++) {

            if (str.charAt(i) == 'o') {
                if (!first) {
                    sb.append(", ");
                }
                sb.append(i);
                first = false;
            }
        }

        System.out.println(sb.toString());
    }

    // Ques 5: character occurence in String
    // I love Programming I love codeForWin.
    // find the index of "O present the string"
    public static boolean match(String str, String target, int startIndex) {

        int i = startIndex;
        int j = 0;
        while (i < str.length() && j < target.length()) {

            if (str.charAt(i) != target.charAt(j)) {
                return false;
            }
            i++;
            j++;
        }

        return j == target.length();
    }

    public static void findWordIndex(String str) {

        String target = "love";
        int n = str.length();

        for (int i = 0; i < n - target.length(); i++) {
            if (match(str, target, i) == true) {
                System.out.print(i + " ");
            }
        }
    }

    // Ques 6: Find Maximum Occurence of character in String
    // Fixing Technique Brute Force Approach
    public static void maximumOccurence(String str) {

        if (str.length() == 0) {
            System.out.println("Empty string");
            return;
        }

        str = str.trim().toLowerCase().replaceAll("\\s", "");
        int l = str.length();
        int maxFreq = 0;
        char answer = ' ';

        for (int i = 0; i < l; i++) {

            char fixedCharacter = str.charAt(i);
            int currentFreq = 0;

            for (int j = 0; j < l; j++) {
                if (str.charAt(j) == fixedCharacter) {
                    currentFreq++;
                }
            }

            if (currentFreq > maxFreq) {
                maxFreq = currentFreq;
                answer = fixedCharacter;
            }
        }
        System.out.println(answer);
        System.out.println(maxFreq);
    }

    // Ques 7: Reverse order of word in String
    // Fixing Technique Brute Force Approach
    // codeforwin love I. programming love I.
    public static void reverseWord(String words[]) {

        int i = 0;
        int j = words.length - 1;

        while (i < j) {

            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }
    }

    public static void reverseStringWord(String str) {

        int l = str.length();

        int count = 1;
        for (int i = 0; i < l; i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        String currentWord = "";

        String words[] = new String[count];

        int index = 0;

        for (int i = 0; i < l; i++) {
            if (str.charAt(i) != ' ') {
                currentWord = currentWord + str.charAt(i);
            } else {
                words[index] = currentWord;
                currentWord = "";
                index++;

            }
        }

        words[index] = currentWord;
        reverseWord(words);

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }

    // Ques 5: The string should be compressed such that consecutive
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

    // Ques 6: find Palindrome in Big String
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

    // Ques 7: Add Number in String
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

    // Ques 8: Common Character between two String Alphabetical Order.
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

    // Ques 9: Convert 2nd Character in Upper Case
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public static void makeUpperCase(String str) {

        String ans = "";

        ans = ans + str.charAt(0) + Character.toUpperCase(str.charAt(1)) + str.substring(2) + " ";
        System.out.println(ans);
    }

    // Ques 10: Sum of count of A and B in String
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

    // Ques 1: Program to Check Palindrome or Not.
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static boolean isPalindromes(String str) {

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
    // Time Complexity: O(2^n) in the worst case
    // Space Complexity: Varies based on recursion implementation, potentially O(n)
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
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindromeCheck(word)) {
                return word;
            }
        }
        return "";
    }

    // Ques 4: Program to Check Anagram or Not.
    // Time Complexity: O(n log n)
    // Space Complexity: O(n)
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

    // Ques 4. Program to check Valid parenthesis
    // Time Complexity: O(n)
    // Space Complexity: O(n)
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

    // Ques 5. Program to remove consecutive duplicates:
    // Time Complexity: O(n)
    // Space Complexity: O(n)
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

    // Ques 6. Check UpperCase or not
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public static String checkStringCase(String s) {

        if (Character.isUpperCase(s.charAt(0))) {
            return s.toUpperCase();
        } else {
            return s.toLowerCase();
        }
    }

    /*
     * Ques 7: Program to check Good String
     * Example 1:
     * Input: s = "aaa"
     * Output: NO
     * Explanation: distance between 'a' and 'a' is not 1.
     * Example 2:
     * Input: s = "cbc"
     * Output: YES
     * Explanation: distance between 'b' and 'c' is 1.
     */
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static String isGoodString(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (Math.abs(s.charAt(i) - s.charAt(i + 1)) != 1 && Math.abs(s.charAt(i) - s.charAt(i + 1)) != 25) {
                return "NO";
            }
        }
        return "YES";
    }

    // Ques 8: Program to check the last Index of the duplicate character
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static int findLastIndex(String s, char p) {
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == p) {
                return i;
            }
        }
        return -1;
    }

    // Ques 9: Sort in Ascending Order:
    // Time Complexity: O(N)
    // Space Complexity: O(1)
    public static void reverseString(char[] arr) {
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

    public static String sortAscendingString(String str) {

        char[] chArray = str.toCharArray();
        Arrays.sort(chArray);

        StringBuilder sb = new StringBuilder();
        for (char ch : chArray) {
            sb.append(ch);
        }

        return sb.toString();
    }

    // Ques 10: program to sort in Descending order
    // Time Complexity: O(n log n)
    // Space Complexity: O(n)
    public static String sortDescendingString(String str) {

        char[] charArray = str.toCharArray();

        Arrays.sort(charArray);

        StringBuilder sb = new StringBuilder();
        for (Character c : charArray) {
            sb.append(c);
        }

        sb.reverse();
        return sb.toString();
    }

    // Ques 11: Program to check String is Isogram or not
    /*
     * Example 1:
     * Input:
     * S = machine
     * Output: 1
     * Explanation: machine is an isogram
     * as no letter has appeared twice. Hence
     * we print 1.
     * Example 2:
     * Input:
     * S = geeks
     * Output: 0
     * Explanation: geeks is not an isogram
     * as 'e' appears twice. Hence, we print 0.
     */

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static boolean isIsogramString(String data) {

        data = data.toLowerCase();
        for (int i = 0; i < data.length(); i++) {
            for (int j = i + 1; j < data.length(); j++) {
                if (data.charAt(i) == data.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    // Time Complexity: O(n) Using HashMap
    // Space Complexity: O(n)
    public static boolean isIsoGramHash(String str) {
        str = str.toLowerCase();
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chArray = str.toCharArray();
        for (char ch : chArray) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
                return false;
            } else {
                map.put(ch, 1);
            }
        }
        return true;
    }

    // Q . 14. Process of String
    // Input: "a#b*c"
    // Rules:
    // -'#'- means convert next character to uppercase
    // -'*' means skip the next character

    // Output:"aB"Explanation:-'a'
    // stays as
    // it is-'#'
    // applies to'b'→becomes'B'-'*'skips'c'→it'sremoved
    public static String processString(String str) {

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char ch = str.charAt(i);

            if (ch == '#') {
                if (i + 1 < str.length()) {
                    Character nextChar = str.charAt(i + 1);
                    sb.append(Character.toUpperCase(nextChar));
                    i += 2;
                } else {
                    i++;
                }
            } else if (ch == '*') {
                i += 2;
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();

    }

    public static void main(String[] args) {

        // System.out.println("Check Palindrome: " + checkPalindrome("level"));
        // System.out.println("Check Palindrome: " + checkPalindrome("levee"));

        // System.out.println("\n" + palindromeSubstring("abcba"));
        // System.out.println("\n" + palindromeSubstring("abc"));

        String charIndex = "I love programming. I love codeforwin.";
        // findCharacterIndex(charIndex);
        // findWordIndex(charIndex);

        // maximumOccurence(charIndex);

        reverseStringWord(charIndex);

        // String wordStr = "I am an Online Player";
        // reverseEachWord(wordStr);

        // String wordCount = "aaabbbcdddde";
        // stringCompress(wordCount);

        // String bigString = "abcbadefedabcba"; // Example big string
        // ArrayList<String> palindromes = findPalindromes(bigString);

        // // Print the palindromic strings found
        // System.out.println("Palindromic Strings:");
        // for (String palindrome : palindromes) {
        // System.out.println(palindrome);
        // }

        // System.out.println("Add Number: " + addNumberInString("hllo57dk25gautm"));

        // String fString = "thin sticks";
        // String sString = "thick bricks";
        // CommonCharacter(fString, sString);

        // makeUpperCase("abcde");

        // countAndSumCharacter();

        // findSubstring();

        // rotateStringCheck();

        // removeWhiteSpace("abc d e f which k l m n o p first");

        // checkFrequency("this this is demo demo demo demo is demo is is amrita");

        // String inputString = "Hello, how are you?";
        // char targetCharacter = 'o';
        // int occurrences = countOccurrences(inputString, targetCharacter);
        // System.out.println("Number of occurrences of '" + targetCharacter + "': " +
        // occurrences);

        // String repeatedStr = "aabcshsddss";
        // firstRepeatedNonRepeatedChar(repeatedStr);

        // String duplicateStr = "margarita";
        // duplicateCharacterUsingHashMap(duplicateStr);

        // String duplicateArray = "Amrita man man mon pow mon";
        // duplicateWordsUsingHashMap(duplicateArray);

        // swapString("hello", "World");

        // System.out.println("Get Maximum Char: " + getMaximumOccur("testsample"));

        // System.out.println("Sum of numbers in the string: " +
        // sumOfNumbers("1abc23"));

        // System.out.println("Find first Repeated Character: " +
        // findFirstRepeatedCharacter("abcdefa"));

        // System.out.println("uncommon characters: " + uncommonCharacters("aacdb",
        // "gafd"));

        // String str = "A man, a plan, a canal: Panama";
        // System.out.println("Check palindrome: " + isPalindrome(str));

        // String checkPal = "abca";
        // System.out.println("Check palindrome: " + isAdvancePalindrome(checkPal));

        // String[] words = { "xngla", "level", "itrn", "y", "s", "pfp", "rfd" };
        // System.out.println("Check First Palindrome: " + firstPalindrome(words));

        // System.out.println("Check Anagram: " + isAnagramCheck("anagram", "nagaram"));

        // System.out.println("Check Valid Parenthesis: " + validParenthesis("{[()]}"));
        // System.out.println("Check Valid Parenthesis: " + validParenthesis("(]"));

        // System.out.println("Remove Consecutive: " + removeConsecutiveChars("aabaa"));

        // System.out.println("Check UpperCase: " + checkStringCase("Abcd"));
        // System.out.println("Check UpperCase: " + checkStringCase("aBCd"));

        // System.out.println("Check Good String: " + isGoodString("aaa"));
        // System.out.println("Check Good String: " + isGoodString("cbc"));

        // System.out.println("Find Last Index: " + findLastIndex("Geeks", 'e'));

        // System.out.println("Sorting in String: " + sortAscendingString("geeks"));
        // System.out.println("Sorting in String: " + sortDescendingString("geeks"));

        // System.out.println("Check IsoGram: " + isIsogramString("machine"));
        // System.out.println("Check IsoGram: " + isIsogramString("geeks"));
        // System.out.println("Check IsoGram: " + isIsoGramHash("geeks"));
        // System.out.println("Check IsoGram: " + isIsoGramHash("machine"));

        // String process = "a#b*c";
        // System.out.println(processString(process));

    }
}
