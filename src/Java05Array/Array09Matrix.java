package Java05Array;

import java.util.Scanner;

public class Array09Matrix {
    // Print 2d Array
    public static void printArray(int[][] arr) {
        System.out.println("Printed Array: ");
        for (int i = 0; i < arr.length; i++) { // row
            for (int j = 0; j < arr[i].length; j++) { // column
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // input 2d Array
    public static void inputArray() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int row = sc.nextInt();
        System.out.print("Enter Columns: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        System.out.println("Enter Elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        printArray(arr);

        sc.close();
    }

    // Adding 2 Matrix in Array
    public static void addMatrix(int[][] mat1, int r1, int c1, int[][] mat2, int r2, int c2) {
        if (r1 != r2 || c1 != c2) {
            return;
        }

        int[][] sumArr = new int[r1][c1];

        for (int i = 0; i < r1; i++) { // rows
            for (int j = 0; j < c1; j++) { // columns
                sumArr[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        printArray(sumArr);
    }

    public static void mulMatrix(int[][] mat1, int r1, int c1, int[][] mat2, int r2, int c2) {

        if (r2 != c1 || r1 != c2) {
            System.out.println("Mulitple not Possible - wrong dimensions");
            return;
        }

        int[][] multiplyArr = new int[r1][c2];

        for (int i = 0; i < r1; i++) { // rows
            for (int j = 0; j < c2; j++) { // columns
                for (int k = 0; k < c1; k++) {
                    multiplyArr[i][j] += (mat1[i][k] * mat2[k][j]);
                }
            }
        }

        printArray(multiplyArr);
    }

    public static void main(String[] args) {

        int[][] arr2d = new int[2][3];

        int[][] arr3d = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        printArray(arr2d);
        printArray(arr3d);

        // inputArray();

        int[][] matArr = { { 2, 3 }, { 4, 5 } };
        int[][] matArr2 = { { 1, 2 }, { 3, 4 } };

        addMatrix(matArr, 2, 2, matArr2, 2, 2);

        int[][] mulArr = { { 1, 2, 1 }, { 3, 1, 2 } };
        int[][] mulArr2 = { { 2, 1 }, { 1, 3 }, { 1, 1 } };
        mulMatrix(mulArr, 2, 3, mulArr2, 3, 2);
    }
}

