package Practice;

import java.util.Scanner;
import java.util.TreeSet;

public class GoodCharacter {

    public static char solve(int N, String S) {
        int maxCount = 0;
        char resultChar = 0;

        // Convert the string to a set of characters
        TreeSet<Character> charSet = new TreeSet<>();
        for (char ch : S.toCharArray()) {
            charSet.add(ch);
        }

        for (char ch : charSet) {
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (S.charAt(i) == ch) {
                    count += (i + 1) * (N - i);
                }
            }
            if (count > maxCount || (count == maxCount && ch < resultChar)) {
                maxCount = count;
                resultChar = ch;
            }
        }

        return resultChar;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of test cases: ");
        int numTestCases = sc.nextInt();

        int[] lengths = new int[numTestCases];
        String[] strings = new String[numTestCases];

        for (int i = 0; i < numTestCases; i++) {
            System.out.print("Enter the length for test case " + (i + 1) + ": ");
            lengths[i] = sc.nextInt();

            System.out.print("Enter the string for test case " + (i + 1) + ": ");
            strings[i] = sc.next();
        }

        sc.close(); // Close the scanner after taking input

        for (int i = 0; i < numTestCases; i++) {
            char result = solve(lengths[i], strings[i]);
            System.out.println("For test case " + (i + 1) + ", the character is: " + result);
        }
    }
}
