package Java05Array;

import java.util.HashMap;
import java.util.Map;

public class Array4Duplicate {

    public static int findDuplicates(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }

        return -1;
    }

    public static void findDuplicatesHash(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1);
        }

        // Print elements with frequency > 1
        System.out.print("Duplicate elements: ");
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = { 2, 5, 6, 8, 8, 4 };
        System.out.println("Duplicate Element found: " + findDuplicates(arr));
        findDuplicatesHash(arr);
    }
}