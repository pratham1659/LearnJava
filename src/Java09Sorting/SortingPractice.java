package Java09Sorting;

public class SortingPractice {

    /*
     * Ques 1: Given an integer array arr, move all O's to the end of it while
     * maintaining the relative order of
     * the non-zero elements.
     * Note that you must do this in-place without making a copy of the array.
     * Input: 0 5 0 3 42
     * Output: 5 3 42 0 0
     * Using BubbleSort Approach
     */

    public static void moveElement(int[] arr) {
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] == 0 && arr[j + 1] != 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) { // Have any swaps Happened
                return;
            }
        }
    }

    /*
     * Ques 2: Give an array of names of the fruits; you are supposed to sort it in
     * lexicographical order using
     * the selection sort
     * Input : ["papaya" "lime" "watermelon", "apple" "mango", "kiwi"]
     * Output: ["apple", "kiwi", "lime", "mango", "papaya", "watermelon"]
     */
    public static void lexicoElement(String[] str) {
        int len = str.length;

        for (int i = 0; i < len - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < len; j++) {
                if (str[j].compareTo(str[min_index]) < 0) {
                    min_index = j;
                }
            }

            String temp = str[i];
            str[i] = str[min_index];
            str[min_index] = temp;
        }
    }

    // printArray
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = { 0, 5, 0, 3, 4, 2 };
        moveElement(arr);
        printArray(arr);

        String[] str = { "papaya", "lime", "watermelon", "apple", "mango", "kiwi" };
        lexicoElement(str);

        for (String i : str) {
            System.out.print(i + " ");
        }
    }
}
