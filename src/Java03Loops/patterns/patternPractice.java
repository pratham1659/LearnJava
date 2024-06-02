package Java03Loops.patterns;

public class patternPractice {


    //Ques 1: StarPattern
    //* * * * *
    //* * * * *
    //* * * * *
    //* * * * *
    //* * * * *
    public static void printRectanglePattern1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Ques 2: pyramidStar
    //* * * * *
    //* * * *
    //* * *
    //* *
    //*
    public static void printPyramid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Ques 3: Hollow Rectangle star print
    //*****
    //*   *
    //*   *
    //*   *
    //*****
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

    //Ques 4: Triangle star pattern
    //*
    //* *
    //* * *
    //* * * *
    //* * * * *
    public static void printTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Ques 5: Opposite Triangle star Pattern
    //* * * * *
    //* * * *
    //* * *
    //* *
    //*
    public static void printOppositeStarPattern() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 + 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    //Ques 6: Opposite Triangle another method
    //* * * * *
    //* * * *
    //* * *
    //* *
    //*
    public static void printOppositeTriangleAnother() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //Ques 7: Star Pyramid Pattern
    //    *
    //   ***
    //  *****
    // *******
    //*********
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

    //Ques 8: Print the top half of the pyramid
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

    //Ques 9: Print the bottom half of the pyramid
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
    }
}
