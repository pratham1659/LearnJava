package Java03Loops.patterns;

import java.util.Scanner;

public class NumericalPattern {

    // Pattern questions start from here
    // 1 2 3 4
    // 1 2 3 4
    // 1 2 3 4
    public static void pattern1(int n) {

        System.out.println("Pattern Method - 1:");
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

    // Pattern questions start from here
    // 4 3 2 1
    // 4 3 2 1
    // 4 3 2 1
    public static void inverseNumericPattern(int n) {
        System.out.println("Inverse Method Pattern - 1: ");

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

    // Patten 2
    // 1 2 3
    // 4 5 6
    // 7 8 9
    public static void pattern2(int n) {
        System.out.println("Pattern Method - 2:");

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

    // Right-Angled Triangle
    // 1
    // 12
    // 123
    // 1234
    // 12345
    public static void rightAngledTriangle(int n) {

        System.out.println("Right Angled Pattern - 1: ");
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

    // Right Angled Pattern - 2
    // 1
    // 2 2
    // 3 3 3
    // 4 4 4 4
    public static void rightAngledPattern2(int n) {
        System.out.println("Right Angled Pattern - 2: ");
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

    // Numeric Pattern - 3
    // 1
    // 2 3
    // 4 5 6
    // 7 8 9 10
    public static void NumericPattern3(int n) {
        System.out.println("Numeric Pattern - 3");

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

    // Numeric Pattern - 4
    // 1
    // 2 3
    // 3 4 5
    // 5 6 7
    public static void NumericPattern4(int n) {
        System.out.println("Numeric Pattern - 4");

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

    // Numeric Pattern Inverse - 3
    // 1
    // 2 1
    // 3 2 1
    // 4 3 2 1
    public static void NumericPattern5(int n) {
        System.out.println("Inverse pattern Numeric  - 3");
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

    // Ques 4 - Numeric Inverse Pattern
    // 1 1 1 1
    //// 2 2 2
    ////// 3 3
    //////// 4
    public static void NumericInversePattern2(int n) {
        System.out.println("Ques 4 - Numeric Inverse Pattern 2");

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

    // Ques 5 - Numeric Inverse Pattern - 2
    ///////// 1
    /////// 2 2
    ///// 3 3 3
    /// 4 4 4 4
    public static void NumericInversePattern3(int n) {
        System.out.println("Ques 5 - Numeric Inverse Pattern 3");

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

    // Ques 6 - Numeric Triangle Pattern - 1
    ///////// 1
    /////// 1 2 1
    ///// 1 2 3 2 1
    /// 1 2 3 4 3 2 1
    public static void NumericTrianglePattern4(int n) {
        System.out.println("Ques 6 - Numeric Triangle Pattern - 1");

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

    // Ques 7: Numeric Rectable Pattern Print Advance
    // 1 2 3 4 5 4 3 2 1
    // 1 2 3 4 * 4 3 2 1
    // 1 2 3 * * * 3 2 1
    // 1 2 * * * * * 2 1
    // 1 * * * * * * * 1

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        pattern1(4);
        inverseNumericPattern(4);
        pattern2(3);
        rightAngledTriangle(4);
        rightAngledPattern2(4);
        NumericPattern3(4);
        NumericPattern4(4);
        NumericPattern5(4);
        NumericInversePattern2(4);
        NumericInversePattern3(4);
        NumericTrianglePattern4(4);

        // // Numerical Rectangular print
        // for (int i = 1; i <= r; i++) {
        // for (int j = i; j <= r; j++) {
        // System.out.print(j);
        // }
        // for (int k = 1; k <= i - 1; k++) {
        // System.out.print(k);
        // }
        // System.out.println();
        // }

        // Numerical Print
        // for(int i=1; i<=r; i++){
        // for(int j=1; j<=c; j++){
        //
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // Numerical Hollow Print
        // 123456
        // 1 6
        // 1 6
        // 123456

        // for(int i=1; i<=r; i++){
        // for(int j=1; j<=c; j++){
        // if(i == 1 || i == r || j == 1 || j == c) {
        // System.out.print(j);
        // }else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // 121212
        // 212121
        // 121212
        // 212121
        // for(int i=1; i<=r; i++){
        // for(int j=1; j<=c; j++){
        // if((i+j) % 2 == 0){
        // System.out.print(1);
        // }else{
        // System.out.print(2);
        // }
        // }
        // System.out.println();
        // }

        // Numerical Traingular pattern
        // 1
        // 12
        // 123
        // 1234
        // for(int i=1; i<=r; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        // Numerical Pyramid
        // 1
        // 121
        // 12321
        // 1234321
        // for(int i=1; i<=r; i++){
        //
        // //print r-i spaces
        // for(int j=1; j<=r-i; j++){
        // System.out.print(" ");
        // }
        //
        // //print 1 to i print
        // for(int k=1; k<=i; k++){
        // System.out.print(k);
        // }

        // print i-1 to l
        // for(int l=i-1; l>=1; l--){
        // System.out.print(l);
        // }
        //
        // System.out.println();
        // }

        // Triangle Hollow Pyramid pattern
        // 1
        // 2 2
        // 3 3
        // 4444444
        // for(int i=1; i<=r; i++){
        //
        // //Print Spaces
        // for(int j=r; j>i; j--){
        // System.out.print(" ");
        // }
        //
        // //print left Side of the Pyramid
        // for(int k=1; k<=i * 2 - 1; k++){
        // if(k==1 || k==i*2-1 || i==r){
        // System.out.print(i);
        // }else{
        // System.out.print(" ");
        // }
        // }
        // // Move to the next line
        // System.out.println();
        // }

        sc.close();

    }
}
