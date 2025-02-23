package Java04Maths;

import java.util.Scanner;

public class JavaMaths {

    // Check Prime or not in Array
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // Time Complexity SqRoot of N times. (N * sqRootN)
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Convert Binary to Decimal
    static void binaryToDecimal(int num) {
        int ans = 0;
        int pw = 1;

        while (num > 0) {
            int unit_digit = num % 10;
            ans += (unit_digit * pw);
            num /= 10;
            pw *= 2;
        }
        System.out.print("Binary To Decimal: ");
        System.out.println(ans);
    }

    static void decimalToBinary(int num) {
        int ans = 0; // binary number
        int pw = 1;

        while (num > 0) {
            int parity = num % 2;
            ans += (parity * pw);
            pw *= 10;
            num /= 2;
        }

        System.out.print("Decimal To Binary: ");
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // for (int i = 1; i <= num; i++) {
        // System.out.println(i + " " + isPrime(i));
        // }

        // binaryToDecimal(num);
        decimalToBinary(num);

        sc.close();
    }
}
