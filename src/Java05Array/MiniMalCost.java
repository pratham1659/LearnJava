package Java05Array;

public class MiniMalCost {
    public static long solve(int N, int M, int K) {
        long minCost = Long.MAX_VALUE;

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (i * j >= K) {
                    long cost = (long) (N - i + 1) * (M - j + 1) * (N - i + 1) * (M - j + 1);
                    minCost = Math.min(minCost, cost);
                }
            }
        }

        return minCost;
    }

    public static void main(String[] args) {
        // Example usage:
        int N = 4;
        int M = 5;
        int K = 3;
        long result = solve(N, M, K);
        System.out.println("Minimum total cost: " + result);
    }
}



