package Temp;

import java.util.*;

public class Unique {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        // Count the frequency of each integer
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Create a list of frequencies
        List<Integer> frequencies = new ArrayList<>(frequencyMap.values());
        Collections.sort(frequencies);

        int uniqueCount = frequencyMap.size();
        int removeCount = 0;
        int index = 0;

        while (k > 0 && index < frequencies.size()) {
            int freq = frequencies.get(index);
            if (k >= freq) {
                k -= freq;
                removeCount++;
            } else {
                break;
            }
            index++;
        }

        return uniqueCount - removeCount;
    }

    public static void main(String[] args) {
        Unique solution = new Unique();

        // Example 1
        int[] arr1 = { 5, 5, 4 };
        int k1 = 1;
        System.out.println(solution.findLeastNumOfUniqueInts(arr1, k1)); // Output: 1

        // Example 2
        int[] arr2 = { 4, 3, 1, 1, 3, 3, 2 };
        int k2 = 3;
        System.out.println(solution.findLeastNumOfUniqueInts(arr2, k2)); // Output: 2
    }
}
