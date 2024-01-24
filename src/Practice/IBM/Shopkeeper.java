package Practice.IBM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Shopkeeper {

    public static long getMinimumMoves(List<Integer> price, int k) {
        int n = price.size();

        // Create a new ArrayList to make it modifiable
        List<Integer> sortedPrices = new ArrayList<>(price);
        Collections.sort(sortedPrices);

        int medianIndex = (n + 1) / 2;
        int currentMedian = sortedPrices.get(medianIndex - 1);

        long moves = 0;

        // Calculate the absolute difference between the current median and the desired median
        int diff = Math.abs(currentMedian - k);

        // Adjust the prices to make the median equal to k
        for (int i = 0; i < n; i++) {
            int currentPrice = price.get(i);
            if (currentPrice < k) {
                moves += Math.abs(currentPrice - k);
            } else {
                moves += Math.abs(currentPrice - k);
            }
        }

        return moves;
    }

    public static void main(String[] args) {
        // Example usage:
        List<Integer> prices = List.of(3, 3, 6, 3, 9);
        int k = 2;
        long result = getMinimumMoves(prices, k);
        System.out.println("Minimum moves: " + result);
    }
}
