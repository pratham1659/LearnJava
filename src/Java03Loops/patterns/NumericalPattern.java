package Java03Loops.patterns;

public class NumericalPattern {

    // Ques 1: Rectangle Numeric Pattern
    // 1 2 3 4
    // 1 2 3 4
    // 1 2 3 4
    public static void pattern1(int n) {
        System.out.println("Ques 1: Rectangle Pattern");
        int i = 1;

        while (i <= n) {
            int j = 1;

            while (j <= n) {
                System.out.print(j + " ");
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }

    }

    // Ques 2: Reverse Numeric Pattern
    // 4 3 2 1
    // 4 3 2 1
    // 4 3 2 1
    public static void inverseNumericPattern(int n) {
        System.out.println("Ques 2: Reverse Numeric Pattern");

        int i = n;

        while (i >= 1) {
            int j = n;

            while (j >= 1) {
                System.out.print(j + " ");
                j = j - 1;
            }
            System.out.println();
            i = i - 1;
        }
    }

    // Ques 3: Square Pattern
    // 1 2 3
    // 4 5 6
    // 7 8 9
    public static void pattern2(int n) {
        System.out.println("Ques 3: Square Pattern");

        int i = 1;
        int count = 1;

        while (i <= n) {
            int j = 1;

            while (j <= n) {
                System.out.print(count + " ");
                count++;
                j++;
            }
            System.out.println();
            i++;
        }
    }

    // Ques 4: Right-Angled Triangle
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    public static void rightAngledTriangle(int n) {

        System.out.println("Ques 4: Right-Angled Triangle");
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                System.out.print(col + " ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static void rightAngledTriangleAnother(int n) {
        System.out.println("Ques 4: Right-Angled Another Triangle");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Ques 5: Right Angled Pattern - 2
    // 1
    // 2 2
    // 3 3 3
    // 4 4 4 4
    public static void rightAngledPattern2(int n) {
        System.out.println("Ques 5: Right Angled Pattern - 2");
        int row = 1;
        int count = 1;
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                System.out.print(count + " ");
                col++;
            }
            System.out.println();
            count++;
            row++;
        }
    }

    // Ques 6: Numeric Triangle Pattern - 1
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    public static void NumericPattern1(int n) {
        System.out.println("Ques 6: Numeric Triangle Pattern - 1");

        int row = 1;
        int count = 1;
        while (row <= n) {

            int col = 1;
            while (col <= row) {
                System.out.print(count + " ");
                col++;
                count++;
            }
            System.out.println();
            row++;
        }
    }

    // Ques 7: Numeric Triangle Pattern - 2
    // 1
    // 2 3
    // 3 4 5
    // 5 6 7 8
    public static void NumericPattern2(int n) {
        System.out.println("Ques 6: Numeric Triangle Pattern - 2");

        int row = 1;

        while (row <= n) {
            int col = 1;
            int val = row;
            while (col <= row) {
                System.out.print(val + " ");
                val++;
                col++;
            }
            System.out.println();
            row++;
        }
    }

    // Ques 7: Numeric Triangle Pattern - 3
    // 1
    // 2 1
    // 3 2 1
    // 4 3 2 1
    public static void NumericPattern3(int n) {
        System.out.println("Ques 7: Numeric Triangle Pattern - 3");
        int row = 1;
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                System.out.print((row - col + 1) + " ");
                col++;
            }
            System.out.println();
            row++;
        }
    }

    public static void NumericAnotherPattern3(int n) {
        System.out.println("Ques 7: Numeric Triangle Another Pattern - 3");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i - j + 1) + " ");
            }
            System.out.println();
        }
    }

    // Ques 8: Numeric Inverse Triangle Pattern - 1
    // 1 1 1 1
    //// 2 2 2
    ////// 3 3
    //////// 4
    public static void NumericInversePattern2(int n) {
        System.out.println("Ques 8: Numeric Inverse Triangle Pattern - 1");

        int row = 1;
        while (row <= n) {
            int space = row - 1;

            int spaceCount = 1;
            while (spaceCount <= space) {
                System.out.print(" ");
                spaceCount++;
            }

            int col = n - row + 1;
            int numCount = 1;
            while (numCount <= col) {
                System.out.print(row);
                numCount++;
            }
            System.out.println();
            row++;
        }

    }

    // Ques 9: Numeric Inverse Triangle Pattern - 2
    ///////// 1
    /////// 2 2
    ///// 3 3 3
    /// 4 4 4 4
    public static void NumericInversePattern3(int n) {
        System.out.println("Ques 9: Numeric Inverse Triangle Pattern - 2");

        int row = 1;
        while (row <= n) {
            int space = n - row;

            int spaceCount = 1;
            while (spaceCount <= space) {
                System.out.print(" ");
                spaceCount++;
            }

            int numCount = 1;
            while (numCount <= row) {
                System.out.print(row);
                numCount++;
            }
            System.out.println();
            row++;
        }
    }

    // Ques 9: Numeric Inverse Triangle Pattern - 3
    // 5
    // 4 4
    // 3 3 3
    // 2 2 2 2
    // 1 1 1 1 1
    public static void NumericInverseTriangle3(int n) {
        System.out.println("Ques 9: Numeric Inverse Triangle Pattern - 3");
        // for (int i = 1; i <= n; i++) {
        // for (int j = i; j >= i; j--) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
    }

    // Ques 10: Numeric Triangle Pattern - 4
    ///////// 1
    /////// 1 2 1
    ///// 1 2 3 2 1
    /// 1 2 3 4 3 2 1
    public static void NumericTrianglePattern4(int n) {
        System.out.println("Ques 10: Numeric Triangle Pattern - 4");

        int row = 1;
        while (row <= n) {

            // Print space
            int space = n - row;
            int spaceCount = 1;
            while (spaceCount <= space) {
                System.out.print(" ");
                spaceCount++;
            }

            // Print 1st Triangle
            int numCount = 1;
            while (numCount <= row) {
                System.out.print(row);
                numCount++;
            }

            // print 2nd Triangle
            int start = row - 1;
            while (start > 0) {
                System.out.print(start);
                start--;
            }
            System.out.println();
            row++;
        }
    }

    // Ques 11: Numeric Rectangle Pattern Print Advance
    // 1 2 3 4 5 4 3 2 1
    // 1 2 3 4 * 4 3 2 1
    // 1 2 3 * * * 3 2 1
    // 1 2 * * * * * 2 1
    // 1 * * * * * * * 1

    // Ques 12: Alphabet Pattern - 1
    public static void alphabetPattern1(int n) {
        System.out.println("Ques 12: Alphabet Pattern - 1");

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

    // Ques 12: Alphabet Another Pattern - 1
    public static void alphabetPatternAnother1(int n) {
        System.out.println("Ques 12: Alphabet Another Pattern - 1");
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

    // Ques 13 - Alphabets pattern - 2
    // A B C
    // A B C
    // A B C
    public static void alphabetPattern2(int n) {
        System.out.println("Ques 13 - Alphabets pattern - 2");

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

    // Ques 13 - Alphabets Another pattern - 2
    public static void alphabetPatternAnother2(int n) {
        System.out.println("Ques 13 - Alphabets Another pattern - 2");
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

    // Ques 14 - Alphabets pattern - 3
    // A B C
    // D E F
    // G H I
    public static void alphabetPattern3(int n) {
        System.out.println("Ques 14 - Alphabets pattern - 3");

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

    // Ques 15 - Alphabets pattern - 4
    // A B C
    // B C D
    // C D E
    public static void alphabetPattern4(int n) {
        System.out.println("Ques 15 - Alphabets pattern - 4");

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

    // Ques 16 - Alphabets Traingle pattern - 1
    // A
    // B B
    // C C C
    // D D D D
    public static void alphabetTrianglePattern1(int n) {
        System.out.println("Ques 16 - Alphabets Traingle pattern - 1");

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

    // Ques 16 - Alphabets Another Traingle pattern - 1
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

    // Ques 17 - Alphabets Traingle pattern - 2
    // A
    // B C
    // D E F
    // G H I J
    public static void alphabetTriangleAnotherPattern2(int n) {
        System.out.println("Ques 17 - Alphabets Traingle pattern - 2");

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

    // Ques 17 - Alphabets Another Traingle pattern - 2
    // A
    // B C
    // C D E
    // D E F G
    public static void alphabetTriangleAnotherPattern3(int n) {
        System.out.println("Ques 17 - Alphabets Traingle pattern - 2");

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

    // Ques 18 - Alphabets Traingle Inverse pattern - 1
    // D
    // C D
    // B C D
    // A B C D
    public static void alphabetsTriangleInverse(int n) {
        System.out.println("Ques 18 - Alphabets Traingle Inverse pattern - 1");

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

    // Ques 19 - Alphabet pattern 5
    // A B C
    // B C D
    // C D E
    public static void alphabetPattern5(int n) {
        System.out.println("Ques 19 - Alphabet pattern 5");
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

    // Ques 19: Numeric Pattern - 4
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    public static void numericPattern4(int n) {
        System.out.println("Ques 19: Numeric Pattern  - 4");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Ques 20: Numeric Pattern - 5
    // 1 2 3 4 5
    // 2 3 4 5 1
    // 3 4 5 1 2
    // 4 5 1 2 3
    // 5 1 2 3 4
    public static void numericPattern5(int n) {
        System.out.println("Ques 20: Numeric Pattern - 5");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= i - 1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    // Ques 21 : Numeric Pattern - 6
    // 1 2 3 4 5
    // 1 2 3 4 5
    // 1 2 3 4 5
    // 1 2 3 4 5
    // 1 2 3 4 5
    public static void numericPattern6(int n) {
        System.out.println("Ques 21 : Numeric Pattern - 6");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Ques 22: Numeric Hollow Pattern - 7
    // 12345
    // 1 5
    // 1 5
    // 1 5
    // 12345
    public static void numericHollowPattern7(int n) {
        System.out.println("Ques 22: Numeric Hollow Pattern - 7");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Ques 23: Numeric Pattern - 9
    // 12121
    // 21212
    // 12121
    // 21212
    // 12121
    public static void numericPattern7(int n) {
        System.out.println("Ques 23: Numeric Pattern - 9");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1);
                } else {
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }

    // Ques 24: Numeric Triangle Pattern - 5
    // 1
    // 121
    // 12321
    // 1234321
    public static void numericTrianglePattern5(int n) {
        System.out.println("Ques 24: Numeric Triangle Pattern - 5");
        for (int i = 1; i <= n; i++) {
            // print r-i spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // print 1 to i print
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            // print i-1 to l
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    // Ques 25: Numeric Triangle Hollow Pattern - 6
    // 1
    // 2 2
    // 3 3
    // 4 4
    // 555555555
    public static void numericHollowTriangle1(int n) {
        for (int i = 1; i <= n; i++) {

            // Print Spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            //
            // print left Side of the Pyramid
            for (int k = 1; k <= i * 2 - 1; k++) {
                if (k == 1 || k == i * 2 - 1 || i == n) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line
            System.out.println();
        }
    }

    // Ques 26: Numeric Triangle Inverse Pattern - 7
    // 1 2 3 4 5
    // 2 3 4 5
    // 3 4 5
    // 4 5
    // 5
    public static void NumericTriangleInversePattern7(int n) {
        System.out.println("Ques 26: Numeric Triangle Inverse Pattern - 7");

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    // Ques 27: Numeric Triangle Inverse Pattern - 8
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    public static void NumericTriangleInversePattern8(int n) {
        System.out.println("Ques 27: Numeric Triangle Inverse Pattern - 8");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Ques 28: Numeric Triangle Inverse Pattern - 9
    // 1///////5
    // /2/////4
    // //3///3
    // ///4/4
    // ////5
    // ///4/4
    // //3///3
    // /2/////2
    // 1///////1
    public static void NumericDrum(int n) {
        System.out.println("Ques 28: Numeric Triangle Inverse Pattern - 9");

        // Uper part
        int leftSpace = 0;
        int middleSpace = 1 + (n - 2) * 2;

        for (int i = 1; i <= n; i++) {
            // leftspace
            for (int j = 1; j <= leftSpace; j++) {
                System.out.print(" ");
            }

            System.out.print(i);
            // middleSpace
            for (int j = 1; j <= middleSpace; j++) {
                System.out.print(" ");
            }

            if (i != n) {
                System.out.print(i);
            }
            leftSpace = leftSpace + 1;
            middleSpace = middleSpace - 2;

            System.out.println();
        }

        leftSpace = n - 2;
        middleSpace = 1;

        for (int i = n - 1; i >= 1; i--) {
            // leftspace
            for (int j = 1; j <= leftSpace; j++) {
                System.out.print(" ");
            }

            System.out.print(i);
            // middleSpace
            for (int j = 1; j <= middleSpace; j++) {
                System.out.print(" ");
            }

            System.out.print(i);

            leftSpace = leftSpace - 1;
            middleSpace = middleSpace + 2;

            System.out.println();
        }
    }

    // Ques 29: Numeric Rhombus Pattern - 1
    public static void numericRhombusPattern1(int n) {
        System.out.println("Ques 29: Numeric Rhombus Pattern - 1");

        int leftSpace = n - 1;
        for (int i = 1; i <= n; i++) {

            // leftSpace
            for (int j = 1; j <= leftSpace; j++) {
                System.out.print(" ");
            }

            if (i == 1 || i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");

                for (int j = 1; j <= n - 2; j++) {
                    System.out.print(" ");
                }

                System.out.print("*");
            }
            leftSpace = leftSpace - 1;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        pattern1(4);
        inverseNumericPattern(4);
        pattern2(3);
        rightAngledTriangle(4);
        rightAngledTriangleAnother(5);
        rightAngledPattern2(4);
        NumericPattern1(4);
        NumericPattern2(4);
        NumericPattern3(4);
        NumericAnotherPattern3(5);
        NumericInversePattern2(4);
        NumericInversePattern3(4);
        NumericInverseTriangle3(4);
        NumericTrianglePattern4(4);
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
        numericPattern4(5);
        numericPattern5(5);
        numericPattern6(5);
        numericHollowPattern7(5);
        numericPattern7(5);
        numericTrianglePattern5(4);
        numericHollowTriangle1(5);
        NumericTriangleInversePattern7(5);
        NumericTriangleInversePattern8(5);
        NumericDrum(5);
        numericRhombusPattern1(5);

    }
}
