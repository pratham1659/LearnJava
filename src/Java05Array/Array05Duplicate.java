package Java05Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Array05Duplicate {

    public static int findDuplicatesONN(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }

        return -1;
    }

    public static boolean findDuplicatesON(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true; // Duplicate found
            }
        }
        return false; // No duplicates found
    }

    // 8. frequency of the element using HashMap
    public static void frequencyHash(int[] arr) {

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (freqMap.containsKey(num)) {
                int oldCount = freqMap.get(num);
                freqMap.put(num, oldCount + 1);
            } else {
                freqMap.put(num, 1);
            }
        }

        // Display the frequencies using a normal for loop on keySet
        for (Integer key : freqMap.keySet()) {
            System.out.println("Element: " + key + " → Frequency: " + freqMap.get(key));
        }
    }

    //
    public static void findDuplicatesUsingMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println("Duplicates are:");
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }

    //

    public static void FindDuplicatesUsingSet(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : nums) {
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        System.out.println("Duplicates are: " + duplicates);
    }

    public static void findDuplicates(int[] nums) {
        System.out.println("Duplicates:");
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]);
            if (nums[index - 1] < 0) {
                System.out.println(index); // Found duplicate
            } else {
                nums[index - 1] = -nums[index - 1]; // Mark visited
            }
        }
    }

    // 3. Remoce Duuplicates from Array
    public static int[] removeDuplicateArray(int[] arr) {
        int n = arr.length;

        if (n == 0 || n == 1) {
            return arr;
        }

        // sort the Array
        Arrays.sort(arr);

        int j = 0; // index to track unique elements

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        // Create a new array to hold unique elements
        int[] uniqueArray = new int[j + 1];

        // Copy unique elements from the original array to the new array
        for (int i = 0; i < uniqueArray.length; i++) {
            uniqueArray[i] = arr[i];
        }

        return uniqueArray;
    }

    // 4. remove duplicates elements in array
    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0 || n == 1) {
            return -1;
        }

        Arrays.sort(arr);

        int idx = 0; // index
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[idx++] = arr[i];
            }
        }

        arr[idx++] = arr[idx];
        return idx;
    }

    public static void main(String[] args) {

        // int[] arr = { 2, 5, 6, 8, 8, 4 };

        // System.out.println("Duplicate Element found: " + findDuplicatesONN(arr));
        // System.out.println("Find Duplicates HashMap: " + findDuplicatesON(arr));
        // System.out.println("Remove Duplicates: " +
        // Arrays.toString(removeDuplicateArray(arr)));

        // System.out.println(removeDuplicates(arr));

        int[] freqArr = { 2, 2, 3, 3, 4, 4 };
        frequencyHash(freqArr);
    }
}
