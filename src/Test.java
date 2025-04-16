import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Test {

    public static Boolean substringPalindrom(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Character> mapA = new HashMap<>();
        HashMap<Character, Character> mapB = new HashMap<>();

        for (int i = 0; i < str1.length(); i++) {

            Character chA = str1.charAt(i);
            Character chB = str2.charAt(i);

            if (mapA.containsKey(chA)) {
                if (mapA.get(chA) != chB) {
                    return false;
                }
            } else {
                mapA.put(chA, chB);
            }

            if (mapB.containsKey(chB)) {
                if (mapB.get(chB) != chA) {
                    return false;
                }
            } else {
                mapB.put(chB, chA);
            }

        }

        return true;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // int n = Integer.parseInt(br.readLine());
        // int n1 = Integer.parseInt(br.readLine());
        // int n2 = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String str2 = br.readLine();

        // StringTokenizer st = new StringTokenizer(br.readLine());

        // int[] arr = new int[n];

        // // Populate the array
        // for (int i = 0; i < n; i++) {
        // if (st.hasMoreTokens()) {
        // arr[i] = Integer.parseInt(st.nextToken());
        // } else {
        // System.out.println("Not enough elements provided.");
        // return;
        // }
        // }

        // pattern(str);

        // System.out.println(pattern(str));

        System.out.println(substringPalindrom(str, str2));

    }
}
