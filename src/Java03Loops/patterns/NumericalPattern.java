package Java03Loops.patterns;

import java.util.Scanner;

public class NumericalPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number of Rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the Number of Columns: ");
        int c = sc.nextInt();




        //Numerical Rectangular print
//        for(int i=1; i<=r; i++){
//            for(int j=i; j<=r; j++){
//                System.out.print(j);
//            }
//            for(int k=1; k<=i-1; k++){
//                System.out.print(k);
//            }
//            System.out.println();
//        }

        //Numerical Print
//        for(int i=1; i<=r; i++){
//            for(int j=1; j<=c; j++){
//
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//      Numerical Hollow Print
//        123456
//        1    6
//        1    6
//        123456

//        for(int i=1; i<=r; i++){
//            for(int j=1; j<=c; j++){
//                if(i == 1 || i == r || j == 1 || j == c) {
//                    System.out.print(j);
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        121212
//        212121
//        121212
//        212121
//        for(int i=1; i<=r; i++){
//            for(int j=1; j<=c; j++){
//                if((i+j) % 2 == 0){
//                    System.out.print(1);
//                }else{
//                    System.out.print(2);
//                }
//            }
//            System.out.println();
//        }

//        Numerical Traingular pattern
//        1
//        12
//        123
//        1234
//        for(int i=1; i<=r; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


//        Numerical Pyramid
//           1
//          121
//         12321
//        1234321
        for(int i=1; i<=r; i++){

            //print r-i spaces
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }

            //print 1 to i print
            for(int k=1; k<=i; k++){
                System.out.print(k);
            }

            //print i-1 to l
            for(int l=i-1; l>=1; l--){
                System.out.print(l);
            }

            System.out.println();
        }


//        Triangle Hollow Pyramid pattern
//           1
//          2 2
//         3   3
//        4444444
        for(int i=1; i<=r; i++){

            //Print Spaces
            for(int j=r; j>i; j--){
                System.out.print(" ");
            }

            //print left Side of the Pyramid
            for(int k=1; k<=i * 2 - 1; k++){
                if(k==1 || k==i*2-1 || i==r){
                    System.out.print(i);
                }else{
                    System.out.print(" ");
                }
            }
            // Move to the next line
            System.out.println();
        }


    }
}
