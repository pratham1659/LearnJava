package Practice;

import java.util.ArrayList;

public class GenerateArray {

    public static ArrayList<Integer> solve(int n, String s) {
        ArrayList<Integer> result = new ArrayList<>();
        int current = 1;

        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == 'I') {
                result.add(current);
                current++;
            } else {
                int countD = 0;
                while (i < n - 1 && s.charAt(i) == 'D') {
                    countD++;
                    i++;
                }

                int temp = current + countD;
                for (int j = temp; j >= current; j--) { // Start from temp
                    result.add(j);
                }
                current = temp; // Update current to temp
            }
        }

        result.add(current);

        return result;
    }

    public static void main(String[] args) {
        int n1 = 9;
        String s1 = "IDDDDDDI";
        ArrayList<Integer> result1 = solve(n1, s1);
        System.out.println(result1);

        int n2 = 6;
        String s2 = "DDDDD";
        ArrayList<Integer> result2 = solve(n2, s2);
        System.out.println(result2);
    }
}
