package Practice;

public class SubstringLength {
    public static void main(String[] args) {
        int N = 10;
        String s = "ababbaabaa";
        int q = 3;
        int[][] queries = {{3, 8}, {1, 7}, {2, 10}};
        char[] characters = {'a', 'b', 'a'};

        int[] result = solve(N, s, q, queries, characters);

        for (int i = 0; i < q; i++) {
            System.out.println(result[i]);
        }
    }

    static int[] solve(int N, String s, int q, int[][] queries, char[] characters) {
        int[] result = new int[q];

        for (int i = 0; i < q; i++) {
            result[i] = getMinLength(N, s, queries[i][0], queries[i][1], characters[i]);
        }

        return result;
    }

    static int getMinLength(int N, String s, int l, int r, char x) {
        int result = 0;
        int count = 0;

        for (int i = l - 1; i < r; i++) {
            if (s.charAt(i) == x) {
                count++;
            } else {
                result += count / 2;
                count = 0;
            }
        }

        result += count / 2;
        return (r - l + 1) - result * 2;
    }
}
