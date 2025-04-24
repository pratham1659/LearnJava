import java.io.*;
import java.util.*;

public class Test {

    public static void reverseWord(String words[]) {

        int i = 0;
        int j = words.length - 1;

        while (i < j) {

            String temp = words[i];
            words[i] = words[j];
            words[j] = temp;
            i++;
            j--;
        }
    }

    public static void practice(String str) {

        int l = str.length();

        int count = 1;
        for (int i = 0; i < l; i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        String currentWord = "";

        String words[] = new String[count];

        int index = 0;

        for (int i = 0; i < l; i++) {
            if (str.charAt(i) != ' ') {
                currentWord = currentWord + str.charAt(i);
            } else {
                words[index] = currentWord;
                currentWord = "";
                index++;

            }
        }

        words[index] = currentWord;
        reverseWord(words);

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }

    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        // int[] arr = new int[n];

        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }

        // // Print array to verify input
        // System.out.println("Array elements:");
        // for (int val : arr) {
        // System.out.print(val + " ");
        // }

        practice(str);

        sc.close();

        // int n = Integer.parseInt(br.readLine());
        // String str = br.readLine();

        // StringTokenizer st = new StringTokenizer(br.readLine());

        // int[] arr = new int[n];

        // int i = 0;
        // while(true){
        // st.has
        // }
        // // Populate the array
        // for (int i = 0; i < n; i++) {
        // if (st.hasMoreTokens()) {
        // arr[i] = Integer.parseInt(st.nextToken());
        // } else {
        // System.out.println("Not enough elements provided.");
        // return;
        // }
        // }

        // System.out.println(substringPalindrom(n, arr));

    }
}
