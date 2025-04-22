package Java03Loops.Loops;

import java.util.Arrays;
import java.util.Scanner;

public class LoopsPractice {

    // Ques 1: Sum the previous integer, when user enter negative loop will break
    public static void checkNegativeInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter negative to break: ");
        int num = sc.nextInt();
        int sum = 0;

        // Print the sum of the stream of integers in the input.
        while (num != -1) {
            sum += num;
            num = sc.nextInt();

        }
        System.out.println("Return sum " + sum);

        sc.close();
    }

    // Ques 2: when user Enter 5, loop will break
    public static int loopBreak(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
        return num;
    }

    // Ques 3: Print the first multiple of 5 which is also a multiple of 7.
    static void multipleOf5and7() {
        int num = 1;
        while (true) {
            if ((num % 5 == 0) && (num % 7 == 0)) {
                System.out.println("Found ans: " + num);
                break;
            }
            num++;
        }
    }

    // Ques 4: Print all the values between 1 and 50 except for the multiples of 3.
    public static int expectThree(int num) {
        for (int i = 0; i < num; i++) {
            if (i % 3 == 0) {
                System.out.println("Removed element:" + i);
                continue;
            }
            System.out.println(i + " ");
        }
        return num;
    }

    // Ques 5: Program to find the prime factors of a numbers
    public static boolean isPrime(int num) {

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void primeFactor(int num) {

        for (int i = 1; i <= num; i++) {
            if (num % i == 0 && isPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Ques 6: Convert number from binary to Decimal
    // 0 * 2^0, 1 * 2^1, 0 * 2^2, 1 * 2^3
    public static void binaryToDecimal(int num) {

        int sumNum = 0;
        int power = 1;
        while (num > 0) {
            int lastDigit = num % 10;
            sumNum = sumNum + lastDigit * power;
            power = power * 2;
            num = num / 10;
        }

        System.out.println(sumNum);

    }

    // Ques 7: Check n^Cr value for the two integer
    // n^Cr = n! / (r! * (n - r)!)
    public static long factorial(long num) {
        long fact = 1;
        for (long i = 1; i <= num; i++) {

            fact = fact * i;
        }
        return fact;
    }

    // Ques 8. put even and odd array in seperate array in Java
    public static void seperateOddEven(int n, int[] nums) {
        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        if (countEven > 0) {
            for (int i = 0; i < n; i++) {
                if (nums[i] % 2 == 0) {
                    System.out.print(nums[i] + " ");
                }
            }
        }

        System.out.println();

        if (countOdd > 0) {
            for (int i = 0; i < n; i++) {
                if (nums[i] % 2 != 0) {
                    System.out.print(nums[i] + " ");
                }
            }
        }

    }

    // Ques 9: Find two indexes in array whose sums equal to target element
    // numbers = [2,7,11,5] , target = 9
    // Note Array is sorted
    public static int[] twoSum(int[] numbers, int target) {

        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;

        int n = numbers.length;
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            int currSum = numbers[i] + numbers[j];
            if (currSum == target) {
                result[0] = i + 1;
                result[1] = j + 1;
                break;
            } else if (currSum > target) {
                j--;
            } else {
                i++;
            }
        }

        return result;
    }

    // Ques 10: Find the NCR Value in Java
    public static void valueNcr(int num1, int num2) {

        long n = factorial(num1);
        long r = factorial(num2);
        long nr = factorial(num1 - num2);

        long value = n / r;
        value = value / nr;

        System.out.println(value);
    }

    // Ques 11. find smallest and 2nd smalled in an array
    public static void s2ndSmallestInArray(int[] arr) {

        int n = arr.length;
        int eMin = Integer.MAX_VALUE;
        int sMin = (int) (1e9);

        for (int i = 0; i < n; i++) {
            if (arr[i] < eMin) {

                sMin = eMin;
                eMin = arr[i];
            } else if (arr[i] > eMin && arr[i] < sMin) {
                sMin = arr[i];
            }
        }

        System.out.println(eMin);
        System.out.println(sMin);

    }

    // Ques 12. Reverse an Array without increaing the time and Space complexity
    public static void reverseArrays(int[] arr) {

        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i <= j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {

        // checkNegativeInteger();
        // loopBreak(6);
        // multipleOf5and7();
        // expectThree(45);
        // primeFactor(200);
        // findFibonnaci(12);
        binaryToDecimal(1011);
        valueNcr(5, 2);

        int[] oddEven = { 2, 3, 4, 5, 6, 7, 8, 9 };
        seperateOddEven(oddEven.length, oddEven);

        int[] twoSumArray = { 2, 7, 13, 15, 19 };
        System.out.println(twoSum(twoSumArray, 9));

        int[] smallArr = { 10, 12, 5, 7, 1, 4 };

        s2ndSmallestInArray(smallArr);

        reverseArrays(smallArr);
    }
}
