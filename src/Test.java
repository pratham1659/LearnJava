import java.io.*;
import java.util.*;

public class Test {

    public static void minMedals(int[] ranks) {
        int n = ranks.length;

        // Array to store the number of medals for each soldier
        int[] medals = new int[n];

        // Step 1: Assign 1 medal to each soldier initially
        for (int i = 0; i < n; i++) {
            medals[i] = 1;
        }

        // Step 2: Left to Right: Ensure that soldiers with higher ranks get more medals
        // than their left neighbor
        for (int i = 1; i < n; i++) {
            if (ranks[i] > ranks[i - 1]) {
                medals[i] = medals[i - 1] + 1;
            }
        }

        // Step 3: Right to Left: Ensure that soldiers with higher ranks get more medals
        // than their right neighbor
        for (int i = n - 2; i >= 0; i--) {
            if (ranks[i] > ranks[i + 1]) {
                medals[i] = Math.max(medals[i], medals[i + 1] + 1);
            }
        }

        // Step 4: Sum up the medals to get the minimum total number of medals
        int totalMedals = 0;
        for (int i = 0; i < n; i++) {
            totalMedals += medals[i];
        }

        System.out.println(totalMedals);
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // String str = sc.nextLine();
        // String str2 = sc.nextLine();
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // ArrayList<Integer> arr = new ArrayList<>();

        // arr.add(5);
        // arr.add(6);
        // arr.add(7);
        // arr.add(8);
        // arr.add(9);
        // String[] str = { "Java", "JavaScript", "Python", "Ruby", "Cpp", "Java" };
        minMedals(arr);

        // System.out.println(practice("{[()]}"));
        // System.out.println(practice(str));

        sc.close();

    }
}
