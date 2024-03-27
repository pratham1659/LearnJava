package Temp;

public class Palindrom {
    public static String firstPalindromicString(String[] words) {
        for (String word : words) {
            if (new StringBuilder(word).reverse().toString().equals(word)) {
                return word;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String[] words = { "abc", "car", "ada", "racecar", "cool" };
        System.out.println(firstPalindromicString(words)); // Output: "ada"
    }
}
