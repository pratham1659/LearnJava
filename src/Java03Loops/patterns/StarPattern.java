package Java03Loops.patterns;

public class StarPattern {
    public static void main(String[] args) {
        int rows = 4; // You can change this value to adjust the height of the pyramid

        // Print the top half of the pyramid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Print the bottom half of the pyramid
        for (int i = rows - 2; i >= 0; i--) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
