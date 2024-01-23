package Practice;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Infosys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter two numbers separated by ',' (e.g., 10, 5):");
        String input = scanner.nextLine();

        // Extracting N1 and N2
        String[] numbers = input.split(",");
        int N1 = Integer.parseInt(numbers[0]);
        int N2 = Integer.parseInt(numbers[1]);

        // Arithmetic operations
        int sum = N1 + N2;
        int difference = N1 - N2;
        int product = N1 * N2;

        // Handling division by zero
        double quotient = (N2 != 0) ? (double) N1 / N2 : Double.POSITIVE_INFINITY;

        // Output
        System.out.println("Sum Difference Product Quotient");
        System.out.println(sum + "   " + difference + "          " + product + "       " + quotient);

        // Close the scanner
        scanner.close();
    }

}