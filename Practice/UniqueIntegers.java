package Temp;

import java.util.*;

public class UniqueIntegers {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr)
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(Comparator.comparingInt(frequencyMap::get));
        minHeap.addAll(frequencyMap.keySet());

        while (k > 0) {
            int min = minHeap.poll();
            k -= frequencyMap.get(min);
            if (k >= 0)
                frequencyMap.remove(min);
        }

        return frequencyMap.size();
    }

    public static void main(String[] args) {
        UniqueIntegers solution = new UniqueIntegers();

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
