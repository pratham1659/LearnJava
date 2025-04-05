import java.util.Scanner;

public class Test {

    public static long findMissing(long[] numbers, long n) {

        long expectedSum = n * (n + 1) / 2;
        long actualSum = 0;

        for (long num : numbers) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n <= 1) {
            sc.close();
            return;
        }

        long[] numbers = new long[(int) (n - 1)];
        for (long i = 0; i < n - 1; i++) {
            numbers[(int) i] = sc.nextLong();
        }

        System.out.println(findMissing(numbers, n));

        sc.close();

    }
}
