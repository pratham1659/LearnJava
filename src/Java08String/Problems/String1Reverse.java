package String.Problems;

public class String1Reverse {

    /*
     * Using toCharArray() method
     * Using chartAt(int index) method
     * Using java.lang.String Buffer class provided reverse() method
     * Using java.lang.StringBuilder class provided reverse() method
     */

    // Approach-1
    public static void reverseAtCharArray(String str) {
        int length = str.length();

        char[] charArray = str.toCharArray();
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(charArray[i]);
        }
        System.out.println();
    }

    // Approach-2
    public static void reverseCharAt(String str) {

        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    // Approach-3
    public static void reverseStringBuilder(String str) {

        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
        System.out.println();
    }

    /*
     * Java Program To Reverse Each Word In String
     */

    public static void reverseWord(String str) {
        System.out.println("Original String: " + str);

        String[] words = str.split(" ");
        String output = "";

        for (String word : words) {
            String reverseWord = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord = reverseWord + word.charAt(i);
            }

            output = output + reverseWord + " ";
        }

        System.out.println("Reverse Word: " + output);
    }

    public static void main(String[] args) {

        String strAtChar = "Hello";
        reverseAtCharArray(strAtChar);
        reverseCharAt(strAtChar);
        reverseStringBuilder(strAtChar);

        String strString = "This is Hello World";
        reverseWord(strString);

    }

}
