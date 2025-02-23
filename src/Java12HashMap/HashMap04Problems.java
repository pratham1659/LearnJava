package Java12HashMap;

import java.util.*;

public class HashMap04Problems {
/*
• To access a value one must know its key.
• HashMap doesn't allow duplicate keys but allows duplicate values. That means A single key can't       contain more than 1 value
but more than 1 key can contain a single value.
• HashMap allows null key also but only once and multiple null values.
• Java HashMap maintains no order.
*/

    public class HashMap05Internal {

        // Given an array, find the most frequent element in it. If there are multiple
        // elements that appear a maximum number of times, print any one of them:

        public static void frequencyCount(int[] arr) {

            Map<Integer, Integer> freq = new HashMap<>();

            for (int i : arr) {
                if (!freq.containsKey(i)) {
                    freq.put(i, 1);
                } else {
                    freq.put(i, freq.get(i) + 1);
                }
            }
            System.out.println(freq.entrySet());
            int maxFreq = 0;
            int ans = -1;

            for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
                if (e.getValue() > maxFreq) {
                    maxFreq = e.getValue();
                    ans = e.getKey();
                }
            }

            System.out.println(ans);

        }

        // Check Given String is Anagram or Not

        public static HashMap<Character, Integer> makeFreq(String str) {

            HashMap<Character, Integer> map = new HashMap<>();

            for (int i = 0; i < str.length(); i++) {
                Character ch = str.charAt(i);

                if (!map.containsKey(ch)) {
                    map.put(ch, 1);
                } else {
                    int currfreq = map.get(ch);
                    map.put(ch, currfreq + 1);
                }
            }
            return map;

        }

        // Appraoch 1 using 2 HashMap Time complexity: O(n) Space complexity: O(n)
        public static boolean isAnagram(String str1, String str2) {

            if (str1.length() != str2.length()) {
                return false;
            }

            HashMap<Character, Integer> map1 = makeFreq(str1);
            HashMap<Character, Integer> map2 = makeFreq(str2);

            return map1.equals(map2);

        }

        // Approach 2 using 1 HashMap
        public static boolean checkAnagram(String str1, String str2) {

            if (str1.length() != str2.length()) {
                return false;
            }

            HashMap<Character, Integer> map = makeFreq(str1);

            for (int i = 0; i < str2.length(); i++) {
                Character ch = str2.charAt(i);

                if (!map.containsKey(ch)) {
                    return false;
                }
                int currFreq = map.get(ch);
                map.put(ch, currFreq - 1);

            }

            // All values in mp should be 0 for s and t to be anagrams
            for (int i : map.values()) {
                if (i != 0) {
                    return false;
                }
            }
            return true;
        }

        // Given two strings s and t, determine if they are isomorphic.
        // Approach 1 HashMap
        public static boolean isomorphic(String s, String t) {

            if (s.length() != t.length()) {
                return false;
            }

            HashMap<Character, Character> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                char c1 = s.charAt(i);
                char c2 = t.charAt(i);
                if (map.containsKey(c1)) {
                    if (map.get(c1) != c2) {
                        return false;
                    }
                } else {
                    if (map.containsValue(c2)) {
                        return false;
                    }
                    map.put(c1, c2);
                }
            }
            return true;
        }

        // Appraoch 2 HashSet
        public static boolean checkIsomorphic(String s, String t) {

            HashMap<Character, Character> charMap = new HashMap<>();
            HashSet<Character> mappedChars = new HashSet<>();

            for (int i = 0; i < s.length(); i++) {
                char ch1 = s.charAt(i);
                char ch2 = t.charAt(i);

                if (charMap.containsKey(ch1)) {
                    if (charMap.get(ch1) != ch2) {
                        return false; // Mapping is different
                    }
                } else {
                    if (mappedChars.contains(ch2)) {
                        return false; // ch2 is already mapped to another character
                    }
                    charMap.put(ch1, ch2);
                    mappedChars.add(ch2);
                }
            }

            return true;
        }

        // Two sum in Array
        public static int[] twoSum(int[] arr, int key) {
            int n = arr.length;
            int[] ans = {-1};

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; i < n; j++) {
                    if (arr[j] == key - arr[i]) {
                        return ans = new int[]{i, j};
                    }
                }
            }

            return ans;
        }

        // Two sum in Array Using Binary Search O(NlogN)
        public static int[] twoSumBinary(int[] arr, int key) {

            Arrays.sort(arr);
            int left = 0;
            int right = arr.length - 1;
            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == key) {
                    return new int[]{left, right};
                } else if (sum < key) {
                    left++;
                } else {
                    right--;
                }
            }
            throw new IllegalArgumentException("");
        }

        // Two sum in Array Using HashMap
        public static int[] twoSumHashMap(int[] arr, int key) {
            int n = arr.length;
            int[] ans = new int[]{-1};

            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int partner = key - arr[i];

                if (map.containsKey(partner)) {
                    ans = new int[]{i, map.get(partner)};
                    return ans;
                }

                map.put(arr[i], i);
            }

            return ans;
        }

        // Largest SubArray of with 0 Sum
        public static int zeroSumlargestSubArray(int[] arr) {

            HashMap<Integer, Integer> map = new HashMap<>();
            int maxLen = 0;
            int prefSum = 0;
            map.put(0, -1);
            for (int i = 0; i < arr.length; i++) {
                prefSum += arr[i];
                if (map.containsKey(prefSum)) {
                    maxLen = Math.max(maxLen, i - map.get(prefSum));
                } else {
                    map.put(prefSum, i);
                }
            }
            return maxLen;
        }

        public static void main(String[] args) {

            int[] arr = {1, 3, 2, 1, 4, 1, 2, 4, 3, 7};

            System.out.println("Frequency: ");
            frequencyCount(arr);

            System.out.println("Check Anagarm: " + isAnagram("silent", "listen"));
            System.out.println("Check Anagarm: " + checkAnagram("anagram", "nagaram"));

            System.out.println("Check Isomorphic: " + isomorphic("abccd", "xywwz"));
            System.out.println("Check Isomorphic: " + checkIsomorphic("aab", "xxy"));

            int[] arrSum = {2, 7, 11, 15};
            System.out.println("Two Sum : " + Arrays.toString(twoSum(arrSum, 9)));
            System.out.println("Two Sum Binary : " + Arrays.toString(twoSumBinary(arrSum, 9)));
            System.out.println("Two Sum HashMap: " + Arrays.toString(twoSumHashMap(arrSum, 9)));

            int[] subArray = {15, -2, 1, 0, 1, 10};
            System.out.println("Longest SubArray: " + zeroSumlargestSubArray(subArray));

        }

    }
}