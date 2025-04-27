import java.io.*;
import java.util.*;

public class Test {

    public class App {
        // defining fields
        int id;// field or data member or instance variable
        String name;

        // creating main method inside the App class
        public static void main(String args[]) {
        }
    }

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

    public static int minMovesToEqualAB(String L, int start) {
        int N = L.length();
        if (N % 2 != 0)
            return -1; // Impossible if N is odd

        int totalA = 0, totalB = 0;
        for (char c : L.toCharArray()) {
            if (c == 'a')
                totalA++;
            else
                totalB++;
        }

        if (totalA == totalB)
            return 0; // Already balanced

        // Bitmask for board: 0 = 'a', 1 = 'b'
        int board = 0;
        for (int i = 0; i < N; i++) {
            if (L.charAt(i) == 'b')
                board |= (1 << i);
        }

        Queue<int[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        // state: [position, board, moves]
        queue.offer(new int[] { start, board, 0 });
        visited.add(start + "," + board);

        while (!queue.isEmpty()) {
            int[] state = queue.poll();
            int pos = state[0], currBoard = state[1], moves = state[2];

            // Count a's and b's in currBoard
            int a = 0, b = 0;
            for (int i = 0; i < N; i++) {
                if (((currBoard >> i) & 1) == 0)
                    a++;
                else
                    b++;
            }
            if (a == b)
                return moves;

            // Try move left
            if (pos > 0) {
                int nextBoard = currBoard ^ (1 << (pos - 1)); // flip between pos-1 and pos
                String key = (pos - 1) + "," + nextBoard;
                if (!visited.contains(key)) {
                    visited.add(key);
                    queue.offer(new int[] { pos - 1, nextBoard, moves + 1 });
                }
            }
            // Try move right
            if (pos < N) {
                int nextBoard = currBoard ^ (1 << pos); // flip between pos and pos+1
                String key = (pos + 1) + "," + nextBoard;
                if (!visited.contains(key)) {
                    visited.add(key);
                    queue.offer(new int[] { pos + 1, nextBoard, moves + 1 });
                }
            }
        }
        return -1; // No solution found
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // String str = sc.nextLine();
        // String str2 = sc.nextLine();
        // int n = sc.nextInt();

        // int[] arr = new int[n];

        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }

        String L = "aaabab";
        int start = 3;
        System.out.println(minMovesToEqualAB(L, start)); // Output: 2

        // System.out.println(practice("{[()]}"));
        // System.out.println(practice(str));

        sc.close();

    }
}
