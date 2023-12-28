package Practice;

import java.util.Scanner;

public class Solve {

    public static int solve(int N, int M, int K) {
        int minCost = 0;

        // Iterate through each possible sub-rectangle
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                int area = i * j;
                if (area > K) {
                    minCost += (area - K);
                }
            }
        }

        return minCost;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Value of N
            int M = scanner.nextInt(); // Value of M
            int K = scanner.nextInt(); // Value of K

            // Call the solve function for each test case
            int result = solve(N, M, K);

            // Print the result for each test case
            System.out.println(result);
        }

        scanner.close();
    }
}
