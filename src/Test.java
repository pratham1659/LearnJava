import java.io.*;
import java.util.*;

public class Test {

    public static void practice(String str) {

       
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static ArrayList<String> findPalindromes(String bigString) {
        ArrayList<String> palindromes = new ArrayList<>();

        // Iterate through each substring and check for palindrome
        for (int i = 0; i < bigString.length(); i++) {
            for (int j = i + 1; j <= bigString.length(); j++) {
                String substring = bigString.substring(i, j);
                if (isPalindrome(substring)) {
                    palindromes.add(substring);
                }
            }
        }

        return palindromes;
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        // int n = sc.nextInt();

        // int[] arr = new int[n];

        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }

        // ArrayList<Integer> arr = new ArrayList<>();

        // arr.add(5);
        // arr.add(6);
        // arr.add(7);
        // arr.add(8);
        // arr.add(9);
        // String[] str = { "Java", "JavaScript", "Python", "Ruby", "Cpp", "Java" };
        practice(str);

         String bigString = "abcbadefedabcba"; // Example big string
        ArrayList<String> palindromes = findPalindromes(bigString);

        System.out.println(palindromes.toString());
        // System.out.println(practice("{[()]}"));
        // System.out.println(practice(str));

        sc.close();

    }
}
