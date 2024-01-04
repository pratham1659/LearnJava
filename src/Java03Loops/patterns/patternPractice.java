package Java03Loops.patterns;

import java.util.Scanner;

public class patternPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Rows: ");
        int r = sc.nextInt();
//        System.out.println("Enter the number of columns: ");
//        int c = sc.nextInt();

//    Print Rectangle Star
//        for(int i=1;i<=r;i++){
//            for(int j=1;j<=c;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        Hollow Rectangle Start print
//        for(int i=1;i<=r;i++){
//            for(int j=1;j<=c;j++){
//                if(i == 1 || i == r || j == 1 || j == c){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }


//        Triangle star pattern
//        for(int i=1;i<=r;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        Opposite Triangle Star Pattern
//        for(int i=1; i<=r; i++){
//            for(int j=1; j<=r+1-i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Opposite Triangle another method
//        for(int i=r; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        //Star Pyramid

        for(int i=1; i<=r; i++){
            for(int j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
