package Practice;

public class CherryPickup {
    public int cherryPickup(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        // dp[i][j][k] represents the maximum cherries that can be picked starting from
        // (i, j) for robot 1
        // and (i, k) for robot 2
        int[][][] dp = new int[rows][cols][cols];

        // Initialize dp array
        dp[0][0][cols - 1] = grid[0][0] + grid[0][cols - 1];

        // Iterate over each row
        for (int i = 1; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < cols; k++) {
                    int maxCherries = 0;

                    // Iterate over all possible previous positions for robot 1 and robot 2
                    for (int pj = j - 1; pj <= j + 1; pj++) {
                        for (int pk = k - 1; pk <= k + 1; pk++) {
                            if (pj >= 0 && pj < cols && pk >= 0 && pk < cols) {
                                maxCherries = Math.max(maxCherries, dp[i - 1][pj][pk]);
                            }
                        }
                    }

                    // Add cherries from current position to max cherries from previous positions
                    dp[i][j][k] = maxCherries + (j == k ? grid[i][j] : grid[i][j] + grid[i][k]);
                }
            }
        }

        // Find maximum cherries from the last row
        int maxCherries = 0;
        for (int j = 0; j < cols; j++) {
            for (int k = 0; k < cols; k++) {
                maxCherries = Math.max(maxCherries, dp[rows - 1][j][k]);
            }
        }

        return maxCherries;
    }

    public static void main(String[] args) {
        int[][] grid1 = { { 3, 1, 1 }, { 2, 5, 1 }, { 1, 5, 5 }, { 2, 1, 1 } };
        int[][] grid2 = { { 1, 0, 0, 0, 0, 0, 1 }, { 2, 0, 0, 0, 0, 3, 0 }, { 2, 0, 9, 0, 0, 0, 0 },
                { 0, 3, 0, 5, 4, 0, 0 }, { 1, 0, 2, 3, 0, 0, 6 } };

        CherryPickup cp = new CherryPickup();
        System.out.println("Output for grid1: " + cp.cherryPickup(grid1)); // Output: 24
        System.out.println("Output for grid2: " + cp.cherryPickup(grid2)); // Output: 28
    }
}
