package Practice;

import java.util.*;

public class JavaPractice {

    public static char solve(int N, String S) {
        int[] count = new int[26]; // Assuming only lowercase English letters
        int maxCount = 0;
        char resultChar = 0;

        for (int i = 0; i < N; i++) {
            char ch = S.charAt(i);
            count[ch - 'a']++;

            if (count[ch - 'a'] > maxCount || (count[ch - 'a'] == maxCount && ch < resultChar)) {
                maxCount = count[ch - 'a'];
                resultChar = ch;
            }
        }

        return resultChar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt(); // Number of test cases

        for (int t = 0; t < T; t++) {
            int N = scanner.nextInt(); // Length of the string
            String S = scanner.next(); // The string

            // Call the solve function for each test case
            char result = solve(N, S);

            // Print the result for each test case
            System.out.println(result);
        }

        scanner.close();
    }
}
