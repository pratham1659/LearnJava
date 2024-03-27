package String.Problems;

import java.util.Stack;

public class String8Stacks {

    // Function to check if a given string is well-formed or not
    public static boolean isWellFormed(String str) {
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                // Push opening brackets onto the stack
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                // If closing bracket encountered, check if it matches the top of the stack
                if (stack.isEmpty()) {
                    return false; // More closing brackets than opening brackets
                }
                char top = stack.pop(); // Get the top of the stack
                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false; // Mismatched brackets
                }
            }
        }

        // If the stack is not empty, it means there were more opening brackets than
        // closing brackets
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String testString1 = "{[()]}";
        String testString2 = "{[()]";
        String testString3 = "([)]";
        String testString4 = "{[()]}(";

        System.out.println("Is \"" + testString1 + "\" well-formed? " + isWellFormed(testString1));
        System.out.println("Is \"" + testString2 + "\" well-formed? " + isWellFormed(testString2));
        System.out.println("Is \"" + testString3 + "\" well-formed? " + isWellFormed(testString3));
        System.out.println("Is \"" + testString4 + "\" well-formed? " + isWellFormed(testString4));
    }
}
