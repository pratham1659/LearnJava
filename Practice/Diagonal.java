package Practice;

public class Diagonal {
    public static void main(String[] args) {
        System.out.println(diagonalSum(3, 3)); // Output: 15
        System.out.println(diagonalSum(2, 2)); // Output: 5
    }

    public static long diagonalSum(long n, long d) {
        long sum = 0;
        if (d <= n) {
            sum += (d * (d - 1)) / 2 + 1 + (n * (n - 1)) / 2 - (n - d) * (n - d + 1) / 2;
        } else {
            d = 2 * n - d;
            sum += (d * (d - 1)) / 2 + 1 + (n * (n - 1)) / 2 - (n - d) * (n - d + 1) / 2;
        }
        return sum;
    }
}
