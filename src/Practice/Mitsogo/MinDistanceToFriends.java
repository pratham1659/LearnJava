package Practice.Mitsogo;
import java.util.Arrays;

import java.util.Arrays;

public class MinDistanceToFriends {
    public static int[] minDistanceToFriends(int N, int[] A) {
        int[] distances = new int[N];

        for (int i = 0; i < N; i++) {
            int closestDistance = Integer.MAX_VALUE;
            for (int j = 0; j < N; j++) {
                if (i != j) {
                    closestDistance = Math.min(closestDistance, Math.abs(A[i] - A[j]));
                }
            }
            distances[i] = closestDistance;
        }
        return distances;
    }

    public static void main(String[] args) {
        int N = 3;
        int[] A = {1, 3, 8};

        int[] result = minDistanceToFriends(N, A);
        System.out.println(Arrays.toString(result));  // Output: [2, 2, 5]
    }
}
