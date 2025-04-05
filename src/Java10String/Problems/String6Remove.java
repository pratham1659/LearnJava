package Java10String.Problems;

public class String6Remove {

    /*
     * Write a java program to remove all white spaces from
     * given String
     */
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void removeWhiteSpaces(String str) {

        // String trimmedString = str.trim();
        // System.out.println(trimmedString);

        String replaceStr = str.replaceAll("\\s", "");
        System.out.println(replaceStr);

    }

    /*
     * Write a java program to remove all special characters
     * from given String
     */
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void removeSpecialCharacters(String str) {

        // Approach 1
        String plainStr1 = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(plainStr1);
    }

    public static void main(String[] args) {

        String str = "This     is      Hello World";
        removeWhiteSpaces(str);

        String specialString = "$ja!va$&st%ar";
        removeSpecialCharacters(specialString);

    }

    public static class StringFormat {

        public static void main(String[] args) {
            String name = "Sandeep";
            int marks = 23455;

            System.out.println("Hello " + name + ", Your marks are: " + marks);
            System.out.printf("Hello %S, Your marks are: %,5d", name, marks);
            System.out.println();

            StringBuilder str = new StringBuilder("First ");

            str.append(45);
            str.append(" Second");
            str.append(", now this is the ");
            str.append(76.59);
            str.toString();
            System.out.println(str);

        }
    }
}
