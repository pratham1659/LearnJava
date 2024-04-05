package Java04Maths;

import java.util.Scanner;

public class JavaLibrary {
    final double STUDENT_MARKS = 3.14;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(Math.abs(-90));
        System.out.println(Math.ceil(5.90)); // Rounds up.
        System.out.println(Math.floor(65.5)); // Rounds down.
        System.out.println(Math.round(34.89)); // Rounds to nearest integer.

        System.out.println(Math.max(23, 56)); //Find Maximum
        System.out.println(Math.min(45, 67)); //Find Minimum

        System.out.println(Math.pow(6, 2)); //power calculation

        System.out.println(Math.sqrt(49)); //Square roots

        System.out.println(Math.PI); // Value of Pi

        for (int i = 0; i < 10; i++) {
            long random = (int) Math.round(Math.random() * 100);
            System.out.print(random + " ");
        }


    }
}
