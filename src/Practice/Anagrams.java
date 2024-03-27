package Temp;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    public static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert strings to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().replaceAll("\\s", "").toLowerCase();
        String str2 = sc.nextLine().replaceAll("\\s", "").toLowerCase();
        sc.close();
        System.out.println(Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray()) ? "Anagrams"
                : "Not Anagrams");

    }
}
