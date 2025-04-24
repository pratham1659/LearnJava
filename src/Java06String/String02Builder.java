package Java06String;

public class String02Builder {

    public static void StringBuilderOperations() {

        // Create a new StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        // Time: O(1), Space: O(n)
        System.out.println("Initial: " + sb);

        // Append a string
        sb.append(" World");
        // Time: O(m), Space: O(n+m)
        System.out.println("After append: " + sb);

        // Insert a string
        sb.insert(6, "Java ");
        // Time: O(n), Space: O(n)
        System.out.println("After insert: " + sb);

        // Replace a part of string
        sb.replace(6, 10, "Awesome");
        // Time: O(n), Space: O(n)
        System.out.println("After replace: " + sb);

        // Delete a part of string
        sb.delete(6, 13);
        // Time: O(n), Space: O(n)
        System.out.println("After delete: " + sb);

        // Reverse the string
        sb.reverse();
        // Time: O(n), Space: O(n)
        System.out.println("After reverse: " + sb);

        // Length of string
        System.out.println("Length: " + sb.length()); // O(1)

        // Capacity of StringBuilder
        System.out.println("Capacity: " + sb.capacity()); // O(1)

        // Set char at index
        sb.setCharAt(0, 'X');
        // Time: O(1)
        System.out.println("After setCharAt: " + sb);

        // Convert to String
        String finalString = sb.toString(); // O(n)
        System.out.println("Final String: " + finalString);

    }

    // Q1. check palindrom number using loop method
    public static void isPalindrome1(String str) {
        int i = 0;
        int j = str.length() - 1;
        boolean flag = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                System.out.println("Not Palindrome");
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if (flag) {
            System.out.println("Palindrome");
        } else
            System.out.println("Not Palindrome");
    }

    // Q2. check palindrom number using String Builder
    public static boolean isPalindrome2(String str) {
        // Convert the number to a string
        // String str = Integer.toString(num);

        // Reverse the string
        StringBuilder reverseString = new StringBuilder(str).reverse();
        return str.equals(reverseString.toString());
    }

    // Q3. check palindrome number using String Builder two
    public static void isPalindrome3(String str) {
        StringBuilder gtr = new StringBuilder(str);
        System.out.println(gtr);

        String sb = gtr.reverse() + "";

        if (str.equals(sb)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    // Q4. check String value append in String Builder
    public static void stringAppend(String str) {
        String[] arr = new String[] { "Java", "is", "the", "best", "programming", "Language" };
        StringBuilder sb = new StringBuilder();
        for (String i : arr) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }

    // Q5. check string changeAlphabetCase
    // ✅ Time Complexity: O(n)
    // ✅ Space Complexity: O(n) (for the StringBuilder)
    public static void changeAlphabetCase(String prevWord) {

        StringBuilder sb = new StringBuilder(prevWord);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (ch == ' ')
                continue;

            if (Character.isUpperCase(ch)) {
                sb.setCharAt(i, Character.toLowerCase(ch));
            } else {
                sb.setCharAt(i, Character.toUpperCase(ch));
            }
        }

        System.out.println(sb.toString());
    }

    // Reverse of String Using Two Pointer method
    public static void reverseString(String str) {

        int i = 0;
        int j = str.length() - 1;

        StringBuilder sb = new StringBuilder(str);

        while (i < j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);

            i++;
            j--;
        }

        System.out.println(sb);
    }

    public static void main(String[] args) {

        StringBuilderOperations();

        isPalindrome1("abcdcbc");
        System.out.println(isPalindrome2("abcdcbc"));

        isPalindrome3("abcdcbc");

        changeAlphabetCase("phYSics");

        reverseString("ABCDEF");

    }

}
