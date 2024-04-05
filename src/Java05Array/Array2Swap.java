package Java05Array;

public class Array2Swap {

    // Printing Array Methods
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 1. swap in Array Methods
    public static void swapInArray(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // 2. swap in Array Methods
    public static int[] swapOutArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            swapInArray(arr, i, j);
            i++;
            j--;
        }
        return arr;

    }

    // 3. Rotate the given array 'a' by k steps, where k is non-negative.
    // Note: k can be greater than n as well.
    public static int[] rotateA(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5, 6, 8, 9, 4, 2 };

        System.out.println("Swapping in Array Reverse: ");
        printArray(swapOutArray(arr));

        int[] ans = rotateA(arr, 2);
        printArray(ans);

    }

}

