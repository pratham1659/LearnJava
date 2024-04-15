package Java08String.Problems;

import java.util.Arrays;

public class String1Reverse {

    /*
     * Using toCharArray() method
     * Using chartAt(int index) method
     * Using java.lang.String Buffer class provided reverse() method
     * Using java.lang.StringBuilder class provided reverse() method
     */

    // Approach-1
    // Time complexity : O(N)
    public static String reverseCharAt(String str) {

        int length = str.length();
        StringBuilder newStr = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            newStr.append(str.charAt(i));
        }
        return newStr.toString();
    }

    // Approach-2
    // Time Complexity : O(nlogN)
    public static String reverseAtCharArray(String str) {

        char[] charArray = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;
        while(start < end){
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }

    // Approach-3
    // Time complexity : O(N)
    public static String reverseStringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }


     // Java Program To Reverse Each Word In String
     // Time complexity : O(N^2)
    public static String reverseWordStringArray(String str) {
        System.out.println("Original String: " + str);

        String[] words = str.split(" ");
        StringBuilder output = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord.append(word.charAt(i));
            }
            output.append(reverseWord).append(" ");
        }
        return output.toString();
    }

    // Java Program To Reverse Each Word In String
    // Time complexity : O(NlogN)
    public static String reverseWordStringArray2(String str){

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for(String st : words){
            result.append(reverseAtCharArray(st)).append(" ");
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String strAtChar = "Hello";
        System.out.println("Reverse String atCharAt: " + reverseCharAt(strAtChar));
        System.out.println("Reverse String atCharArray: " + reverseAtCharArray(strAtChar));

        System.out.println("Reverse String using Builder: " + reverseStringBuilder(strAtChar));

        String strString = "This is Hello World";
        System.out.println("Reverse words in String: " +  reverseWordStringArray(strString));
        System.out.println("Reverse words in String: " +  reverseWordStringArray2(strString));
    }
}
