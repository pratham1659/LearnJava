package Java08String;

import java.util.*;

public class String04Problems {

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

    public static void palindromeSubstring(String str) {

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                if (checkPalindrome(str.substring(i, j))) {
                    System.out.print((str.substring(i, j)) + " ");
                    count++;
                }
            }
        }
        System.out.println("The number of palindrome substring : " + count);
    }

    public static void reverseEachWord(String str) {

        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                sb.append(ch);
            } else {
                sb.reverse();
                ans += sb;
                ans += " ";
                // sb.delete(0, sb.length());
                sb = new StringBuilder();
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println("Reverse String: " + ans);
    }

    /*
     * The string should be compressed such that consecutive
     * duplicates of characters are replaced with the character
     * and followed by the number of consecutive duplicates.
     */

    public static void stringCompress(String str) {
        String ans = "" + str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            if (curr == prev) {
                count++;
            } else {
                ans += count;
                count = 1;
                ans += curr;
            }
        }
        ans += count;
        System.out.println(ans);
    }

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

    //
    public static int addNumberInString(String str) {

        String num = "";
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                num += str.charAt(i);
            } else {
                if (!num.equals("")) {
                    sum = sum + Integer.parseInt(num);
                    num = "";
                }
            }
        }

        return sum;
    }

    // CommonCharactersBetweenTwoStringsInAlphabeticalOrder
    public static void CommonChar(String s1, String s2) {
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

    //Convert 2nd Character in Upper Case
    public static void makeUpperCase() {
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
        scanner.close();

    }

    //Sum of count of A and B in String
    public static void countCharacter() {
        String s = "acbbd";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'b') {
                count++;
            }
        }
        System.out.println(count);
    }

    //Found substring in String
    public static void findSubstring() {
        String stringVal = "dhimanman";
        String subStringval = "man";
        int c = 0;
        while (stringVal.length() >= subStringval.length()) {
            if (stringVal.substring(0, subStringval.length()).equals(subStringval))
                c = c + 1;
            stringVal = stringVal.substring(1);

        }
        if (c == 0) {
            System.out.println("Substring not found");
        } else {
            System.out.println("Frequency of substring is: " + c);
        }
    }

    //Rotation Of String
    public static void rotateString() {
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

    //Reverse words in String only
    public static void reverseWordStr() {
        String str = "My Name Is Amrita";
        String a[] = str.split(" ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i] + "");
        }
    }

    //Reverse Letters in String
    public static void reverseCharStr() {
        String str = "Amrita is my name";
        String[] words = str.split(" ");
        String reverseString = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reversedWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord = reversedWord + word.charAt(j);
            }
            reverseString = reverseString + reversedWord + " ";
        }
        System.out.println(reverseString);
    }

    //Remove Extra White space from String
    public static void removeWhiteSpace() {
        String s = "  Hello World, I am   Amrita";
        s = s.replaceAll("\\s+", "");
        System.out.println(s);
    }

    //Highest frequency of elements
    public static void checkFrequency() {
        String s = "this is demooo is demo is is amrita";
        String[] words = s.split(" ");
        HashMap<String, Integer> hm = new HashMap<>();

        for (String str : words) {
            if (hm.get(str) != null) {
                hm.put(str, hm.get(str) + 1);
            } else {
                hm.put(str, 1);
            }
        }
        int maxCount = 0;
        String maxString = "";

        for (Map.Entry<String, Integer> me : hm.entrySet()) {
            if (maxCount < me.getValue()) {
                maxCount = me.getValue();
                maxString = me.getKey();
            }
        }
        System.out.println("Max String :  " + maxString + ":" + maxCount);
    }

    //count Character Occurrence
    public static int countOccurrences(String input, char target) {
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }

        return count;
    }

    //firstRepeatedNonRepeatedChar
    static void firstRepeatedNonRepeatedChar(String inputString)
    {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                charCountMap.put(c, 1);
            }
        }
        //checking for first non-repeated character
        for (char c : strArray)
        {
            if (charCountMap.get(c) == 1)
            {
                System.out.println("First Non-Repeated Character In '"+inputString+"' is '"+c+"'");
                break;
            }
        }
        //checking for first repeated character

        for (char c : strArray)
        {
            if (charCountMap.get(c) > 1)
            {
                System.out.println("First Repeated Character In '"+inputString+"' is '"+c+"'");

                break;
            }
        }
    }

    public static void duplicateWordsUsingHashMap(){
        System.out.print("enter String to analysis:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
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
                ;
                System.out.println("Words:" + str + ":repeated " + wordMap.get(str) + " times");

            }

        }
        sc.close();
    }

    //DuplicateCharacterUsingHashMap
    public static void duplicateCharacterUsingHashMap(String str){

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        char[] charecters = str.toCharArray();
        for (char c : charecters) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
            Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
            for (Map.Entry<Character, Integer> entry : entrySet) {
                if (entry.getValue() > 1) {

                    System.out.printf("%s:%d %n", entry.getKey(), entry.getValue());
                }


            }
        }
    }

    public static void main(String[] args) {

        String str = "abcba";
        palindromeSubstring(str);

        String wordStr = "I am an Online Player";
        reverseEachWord(wordStr);

        String wordCount = "aaabbbcdddde";
        stringCompress(wordCount);

        String bigString = "abcbadefedabcba"; // Example big string
        ArrayList<String> palindromes = findPalindromes(bigString);

//        // Print the palindromic strings found
//        System.out.println("Palindromic Strings:");
//        for (String palindrome : palindromes) {
//            System.out.println(palindrome);
//        }


        System.out.println("Add Number: " + addNumberInString("hllo57dk25gautm"));

        String fString = "thin sticks";
        String sString = "thick bricks";
        CommonChar(fString, sString);


        makeUpperCase();
        countCharacter();
        findSubstring();
        rotateString();
        reverseWordStr();

        String inputString = "Hello, how are you?";

        char targetCharacter = 'o';
        int occurrences = countOccurrences(inputString, targetCharacter);

        System.out.println("Number of occurrences of '" + targetCharacter + "': " + occurrences);

        String repeatedStr = "aabcshsddss";
        firstRepeatedNonRepeatedChar(repeatedStr);

        String dupliStr = "amritaa";
        duplicateCharacterUsingHashMap(dupliStr);

    }
}
