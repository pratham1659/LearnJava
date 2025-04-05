package Java06Search;

import java.util.*;

public class Java01LinearSearch {

    //Approach 1
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int linearSearchInArray(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Return the index if target is found
            }
        }
        return -1; // Return -1 if target is not found
    }

    //Approach 2
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int LinearSearchArrayList(ArrayList<Integer> arrayList, int target) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) == target) {
                return i; // Return the index if target is found
            }
        }
        return -1; // Return -1 if target is not found
    }

    //Approach 3
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int linearSearchInString(StringBuilder str, char target) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i; // Return the index if target is found
            }
        }
        return -1; // Return -1 if target is not found
    }

    //Approach 4
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static <K, V> K linearSearchForKey(Map<K, V> map, V targetValue) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getValue().equals(targetValue)) {
                return entry.getKey(); // Return the key if target value is found
            }
        }
        return null; // Return null if target value is not found
    }



    public static void main(String[] args) {

        int[] array = {5, 9, 3, 7, 2, 8, 6};
        int target = 7;
        System.out.println("LinearSearch Array index: " + linearSearchInArray(array, target));

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(8);
        list.add(6);

        System.out.println("LinearSearch ArrayList index: " + LinearSearchArrayList(list, target));

        StringBuilder str = new StringBuilder("Hello, world!");
        char key = 'o';
        System.out.println("LinearSearch String index: " + linearSearchInString(str, key));


        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);

        int targetValue = 3;
        System.out.println("LinearSearch HashMap index: " + linearSearchForKey(map, targetValue));
    }

}
