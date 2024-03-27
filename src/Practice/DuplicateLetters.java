package Temp;

import java.util.Scanner;

public class DuplicateLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String result = duplicateLetters(str);

        System.out.println(result);
        scanner.close();
    }

    public static String duplicateLetters(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            sb.append(ch).append(ch);
        }
        return sb.toString();
    }
}
