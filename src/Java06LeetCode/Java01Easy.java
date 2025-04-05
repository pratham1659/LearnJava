package Java06LeetCode;

public class Java01Easy {

    // Ques 1: You are given all numbers between 1,2,....n except one. 
    // find the missing number. https://cses.fi/problemset/task/1083
    public static void missingNum(int[] numbers, int n) {

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int number : numbers) {
            actualSum += number;
        }

        System.out.println(expectedSum - actualSum);
    }

    public static void main(String[] args) {

        int[] number = { 2, 4, 5, 1, 6 };

        missingNum(number, 6);
    }

}
