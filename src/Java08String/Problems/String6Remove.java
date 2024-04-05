package String.Problems;

public class String6Remove {

    /*
     * Write a java program to remove all white spaces from
     * given String
     */

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
}
