package Practice;

import java.util.Arrays;

public class ArrayBitwiseOperations {

    public static void main(String[] args) {
        // Example Usage
        int N = 10;
        int[] a = {9, 14, 9, 4, 3, 0, 6, 4, 8, 1};
        int q = 6;
        int[][] queries = {{2, 7, 10, 2}, {2, 1, 9, 9}, {1, 5, 7, 0}, {2, 8, 10, 15}, {2, 3, 10, 8}, {1, 6, 10, 0}};

        int[] result = solve(N, a, q, queries);
        for (int res : result) {
            System.out.println(res);
        }
    }

    static int[] solve(int N, int[] a, int q, int[][] queries) {
        int[] result = new int[q];
        int resultIndex = 0; // Index to track the result array

        for (int i = 0; i < q; i++) {
            int type = queries[i][0];
            int l = queries[i][1] - 1; // Adjusting for 0-based indexing
            int r = queries[i][2] - 1; // Adjusting for 0-based indexing

            if (type == 1) {
                // Query type 1: Find the OR of array elements on the segment [l, r]
                result[resultIndex++] = findOr(a, l, r);
            } else if (type == 2) {
                // Query type 2: Apply a[i] = a[i] ^ x for all i such that l ≤ i ≤ r
                applyXOR(a, l, r, queries[i][3]);
            }
        }

        // Only return the relevant results for type 1 queries
        return Arrays.copyOf(result, resultIndex);
    }

    static int findOr(int[] a, int l, int r) {
        int result = a[l];
        for (int i = l + 1; i <= r; i++) {
            result |= a[i];
        }
        return result;
    }

    static void applyXOR(int[] a, int l, int r, int x) {
        for (int i = l; i <= r; i++) {
            a[i] ^= x;
        }
    }
}
