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

    // Ques 2: pyramidStar
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    public static void printPyramid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Ques 3: Hollow Rectangle star print
    // *****
    // * *
    // * *
    // * *
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

    // Ques 4: Triangle star pattern
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
    public static void printOppositeStarPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 + 1 - i; j++) {
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
    public static void printOppositeTriangleAnother() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Ques 7: Star Pyramid Pattern
    // *
    // ***
    // *****
    // *******
    // *********
    public static void starPyramidPattern() {
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

    // Ques 8: Print the top half of the pyramid
    public static void printHalfPyramid() {
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

    // Ques 10: check this alphabets pattern
    public static void alphabetPattern1(int n) {
        System.out.println("Alphabtes Pattern -1");

        char row = 1;
        char val = 'A';
        while (row <= n) {
            char col = 1;
            while (col <= n) {
                System.out.print(val + " ");
                col++;
            }
            System.out.println();
            val++;
            row++;
        }
    }

    public static void alphabetPatternAnother1(int n) {

        System.out.println("Alphabtes Pattern Another -1");
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= n) {
                char ch = (char) ('A' + row - 1);
                System.out.print(ch + " ");
                col++;
            }
            System.out.println();
            row++;

        }
    }

    // Ques 11 - Alphabets pattern - 2
    // A B C
    // A B C
    // A B C
    public static void alphabetPattern2(int n) {
        System.out.println("Ques 11 -  Alphabets pattern - 2");

        int row = 1;
        while (row <= n) {
            int col = 1;
            char val = 'A';
            while (col <= n) {
                System.out.print(val + " ");
                col++;
                val++;
            }
            System.out.println();

            row++;
        }
    }

    public static void alphabetPatternAnother2(int n) {
        System.out.println("Alphabtes Pattern Another -2");
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= n) {
                char ch = (char) ('A' + col - 1);
                System.out.print(ch + " ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    // Ques 12 - Alphabets pattern - 3
    // A B C
    // D E F
    // G H I
    public static void alphabetPattern3(int n) {
        System.out.println("Ques 12 -  Alphabets pattern - 3");

        int row = 1;
        char val = 'A';
        while (row <= n) {
            int col = 1;

            while (col <= n) {
                System.out.print(val + " ");
                col++;
                val++;
            }
            System.out.println();

            row++;
        }
    }

    // Ques 13 - Alphabets pattern - 4
    // A B C
    // B C D
    // C D E
    public static void alphabetPattern4(int n) {
        System.out.println("Alphabetical Pattern - 4");

        int row = 1;
        while (row <= n) {
            int col = 1;

            while (col <= n) {
                char val = (char) ('A' + row + col - 2);
                System.out.print(val + " ");
                val++;
                col++;
            }
            System.out.println();
            row++;
        }
    }

    // Ques 14 - Alphabets Traingle pattern - 1
    // A
    // B B
    // C C C
    // D D D D
    public static void alphabetTrianglePattern1(int n) {
        System.out.println("Ques 14 - Alphabets Traingle pattern - 1");

        int row = 1;
        char val = 'A';
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                System.out.print(val + " ");
                col++;
            }
            System.out.println();
            val++;
            row++;
        }
    }

    public static void alphabetTriangleAnotherPattern1(int n) {
        System.out.println("Alphabets Traingle Another pattern - 1");

        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                char val = (char) ('A' + row - 1);
                System.out.print(val + " ");
                col++;
                val++;
            }
            System.out.println();
            row++;
        }
    }

    // Ques 15 - Alphabets Traingle pattern - 2
    // A
    // B C
    // D E F
    // G H I J
    public static void alphabetTriangleAnotherPattern2(int n) {
        System.out.println("Ques 15 - Alphabets Traingle pattern - 2");

        int row = 1;
        char val = 'A';
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                System.out.print(val + " ");
                col++;
                val++;
            }
            System.out.println();
            row++;
        }
    }

    // Ques 16 - Alphabets Traingle pattern - 3
    // A
    // B C
    // C D E
    // D E F G
    public static void alphabetTriangleAnotherPattern3(int n) {
        System.out.println("Ques 16 - Alphabets Traingle pattern - 3");

        int row = 1;

        while (row <= n) {
            int col = 1;
            while (col <= row) {
                char val = (char) ('A' + row + col - 2);
                System.out.print(val + " ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    // Ques 17 - Alphabets Traingle Inverse pattern - 1
    // D
    // C D
    // B C D
    // A B C D

    public static void alphabetsTriangleInverse(int n) {
        System.out.println("Ques 17 - Alphabets Traingle Inverse pattern - 1");

        int row = 1;
        while (row <= n) {
            int col = 1;
            char val = (char) ('A' + n - row);
            while (col <= row) {
                System.out.print(val + " ");
                val++;
                col++;
            }
            System.out.println();
            row++;
        }
    }

    // Ques 18 - alphabet pattern 5
    // A B C
    // B C D
    // C D E
    public static void alphabetPattern5(int n) {
        System.out.println("Ques 18 - alphabet pattern 5");
        int row = 1;
        while (row <= n) {
            int col = 1;
            char val = (char) ('A' + row - 1);
            while (col <= n) {
                System.out.print(val + " ");
                val++;
                col++;
            }
            System.out.println();
            row++;
        }
    }

    // Ques 19 - inverse star pattern - 2
    // *
    // * *
    // * * *
    // * * * *
    public static void inverseStarPattern(int n) {
        System.out.println("Ques 19 - inverse star pattern - 2");

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

    // Ques 20 - inverse star pattern - 3
    // * * * *
    // * * *
    // * *
    // *
    public static void InverseStarPattern3(int n) {
        System.out.println("Ques 20 - inverse star pattern - 3");
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

    // Ques 21: Inverse star pattern - 4
    // * * * *
    // /* * *
    // /* *
    // /*
    public static void InverseStarPattern4(int n) {
        System.out.println("Ques 21: Inverse star pattern - 4");

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

    public static void main(String[] args) {
        printRectanglePattern1();
        printHollowStar();
        printPyramid();
        printTriangle();
        printOppositeStarPattern();
        printOppositeTriangleAnother();
        starPyramidPattern();
        printHalfPyramid();
        printHalfBottomPyramid();
        alphabetPattern1(3);
        alphabetPatternAnother1(3);
        alphabetPattern2(3);
        alphabetPatternAnother2(3);
        alphabetPattern3(3);
        alphabetPattern4(3);
        alphabetTrianglePattern1(4);
        alphabetTriangleAnotherPattern1(4);
        alphabetTriangleAnotherPattern2(4);
        alphabetTriangleAnotherPattern3(4);
        alphabetsTriangleInverse(4);
        alphabetPattern5(3);
        inverseStarPattern(4);
        InverseStarPattern3(4);
        InverseStarPattern4(4);
    }
}
