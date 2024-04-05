package String.Problems;

public class String7Anagram {

    public static void checkAnagram(String str1, String str2) {

        int count[] = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
    }

    public static void main(String[] args) {

        String str1 = "aab";
        String str2 = "baa";
        checkAnagram(str1, str2);
    }
}
