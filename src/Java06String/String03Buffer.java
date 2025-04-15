package Java06String;

public class String03Buffer {

    // 1. Append Operation
    public static void appendExample() {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // O(1) amortized time
        System.out.println("Append Example: " + sb);
    }

    // 2. Insert Operation
    public static void insertExample() {
        StringBuilder sb = new StringBuilder("HelloWorld");
        sb.insert(5, ","); // O(n) time
        System.out.println("Insert Example: " + sb);
    }

    // 3. Replace Operation
    public static void replaceExample() {
        StringBuilder sb = new StringBuilder("JavaProgramming");
        sb.replace(4, 11, " is Fun"); // O(n) time
        System.out.println("Replace Example: " + sb);
    }

    // 4. Delete Operation
    public static void deleteExample() {
        StringBuilder sb = new StringBuilder("DeleteThisPart");
        sb.delete(6, 10); // O(n) time
        System.out.println("Delete Example: " + sb);
    }

    // 5. Reverse Operation
    public static void reverseExample() {
        StringBuilder sb = new StringBuilder("ReverseMe");
        sb.reverse(); // O(n) time
        System.out.println("Reverse Example: " + sb);
    }

    // 6. charAt and setCharAt
    public static void charAtAndSetCharAtExample() {
        StringBuilder sb = new StringBuilder("Java");
        char ch = sb.charAt(2); // O(1) time
        System.out.println("Char at index 2: " + ch);
        sb.setCharAt(2, 'X'); // O(1) time
        System.out.println("After setCharAt: " + sb);
    }

    // 7. Length and Capacity
    public static void lengthAndCapacityExample() {
        StringBuilder sb = new StringBuilder("Hi");
        System.out.println("Length: " + sb.length()); // O(1)
        System.out.println("Capacity: " + sb.capacity()); // O(1)
        sb.ensureCapacity(50); // O(n) in worst case
        System.out.println("New Capacity after ensureCapacity(50): " + sb.capacity());
    }

    // 8. Toggle Case Example (custom logic)
    public static void toggleCaseExample() {
        String input = "HeLLo WoRLD";
        StringBuilder sb = new StringBuilder(input);

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i); // O(1)
            if (Character.isUpperCase(ch)) {
                sb.setCharAt(i, Character.toLowerCase(ch)); // O(1)
            } else if (Character.isLowerCase(ch)) {
                sb.setCharAt(i, Character.toUpperCase(ch)); // O(1)
            }
        }

        System.out.println("Toggle Case Example: " + sb);
    }

    public static void main(String[] args) {
        appendExample();
        insertExample();
        replaceExample();
        deleteExample();
        reverseExample();
        charAtAndSetCharAtExample();
        lengthAndCapacityExample();
        toggleCaseExample();
    }
}
