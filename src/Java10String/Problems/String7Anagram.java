package Java10String.Problems;

import java.util.Arrays;

public class String7Anagram {

    public static boolean checkAnagram(String str1, String str2) {

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

        String str1 = "aab";
        String str2 = "baa";
        System.out.println(checkAnagram(str1, str2));
    }
}
