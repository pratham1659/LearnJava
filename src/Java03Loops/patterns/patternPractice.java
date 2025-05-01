package Java03Loops.patterns;

public class patternPractice {

    // Ques 1: StarPattern
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    // * * * * *
    public static void printRectanglePattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Ques 2: Hollow Rectangle star print
    // *****
    // * //*
    // * //*
    // * //*
    // *****
    public static void printHollowStar() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Ques 3: Triangle star pattern
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    public static void printTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Ques 5: Opposite Triangle star Pattern
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void printOppositeStarPattern(int n1, int n2) {
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= (n2 + 1 - i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Ques 6: Opposite Triangle another method
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void printOppositeTriangleAnother(int n1, int n2) {
        for (int i = n1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Ques 7: Star Pyramid Pattern
    //////// *
    /////// * *
    ////// * * *
    ///// * * * *
    //// * * * * *
    /// * * * * * *
    public static void starPyramidPattern() {
        System.out.println("Ques 8: Print the Star Pyramid Pattern");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Ques 7: Star Pyramid Pattern
    /// * * * * * *
    ///// * * * *
    ////// * * *
    /////// * *
    //////// *
    public static void reverseStartPyramidPattern(int n1) {

        for (int i = n1; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    // Ques 8: Print the top half of the pyramid
    public static void printHalfPyramid() {
        System.out.println("Ques 8: Print the top half of the pyramid");
        int rows = 4;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Ques 9: Print the bottom half of the pyramid
    public static void printHalfBottomPyramid() {
        System.out.println("Ques 9: Print the bottom half of the pyramid");
        int rows = 4; // You can change this value to adjust the height of the pyramid
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

    // Ques 10 - inverse star pattern - 2
    // *
    // * *
    // * * *
    // * * * *
    public static void inverseStarPattern(int n) {
        System.out.println("Ques 10 - inverse star pattern - 2");

        int row = 1;
        while (row <= n) {
            // space print
            int space = n - row;
            while (space > 0) {
                System.out.print(" ");
                space--;
            }

            int col = 1;
            while (col <= row) {
                System.out.print("*");
                col++;

            }
            System.out.println();
            row++;
        }
    }

    // Ques 11 - inverse star pattern - 3
    // * * * *
    // * * *
    // * *
    // *
    public static void InverseStarPattern3(int n) {
        System.out.println("Ques 11 - inverse star pattern - 3");
        int row = n;
        while (row >= 1) {
            int col = 1;
            while (col <= row) {
                System.out.print("*");
                col++;
            }
            System.out.println();
            row--;
        }
    }

    // Ques 12: Inverse star pattern - 4
    // * * * *
    // * * *
    // * *
    // *
    public static void InverseStarPattern4(int n) {
        System.out.println("Ques 12: Inverse star pattern - 4");

        int row = 1;
        while (row <= n) {
            int space = row - 1;
            int spaceCount = 1;
            while (spaceCount <= space) {
                System.out.print(" ");
                spaceCount++;
            }

            int col = n - row + 1;
            int xCount = 1;
            while (xCount <= col) {
                System.out.print("*");
                xCount++;
            }
            System.out.println();
            row++;
        }
    }

    // Ques 13: Rhombus Pattern - 1
    public static void rhombusPattern(int n) {
        System.out.println("Ques 13: Rhombus Pattern - 1");

        int space = 0;
        // Loop 1
        for (int i = 1; i <= n; i++) {

            // Loop 2
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            // Loop 3
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            space++;
            System.out.println();

        }
    }

    // Ques 14: Inverse Diamond Pattern
    public static void inverseDiamond(int n) {
        System.out.println("Ques 14: Inverse Diamond Pattern");
        int space = n - 1;
        int star = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            space--;
            star += 2;
        }

        space = 1;
        star = star - 4;

        for (int i = 1; i <= n - 1; i++) {

            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
            space++;
            star -= 2;

        }
    }

    public static void main(String[] args) {
        printRectanglePattern1();
        printHollowStar();
        printTriangle();
        printOppositeStarPattern(5, 5);
        printOppositeTriangleAnother(5, 5);
        starPyramidPattern();
        reverseStartPyramidPattern(5);
        printHalfPyramid();
        printHalfBottomPyramid();
        inverseStarPattern(4);
        InverseStarPattern3(4);
        InverseStarPattern4(4);
        rhombusPattern(4);
        inverseDiamond(6);
    }
}
