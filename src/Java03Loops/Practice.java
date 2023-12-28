package Java03Loops;

import java.util.Scanner;

public class Practice {

    static int prac1(int num){
        for(int i =1; i<num; i++){
            System.out.println(i);
            if(i == 5){
                break;
            }
        }
        return num;
    }

//    Print the first multiple of 5 which is also a multiple of 7.
    static void prac2(){
        int num  = 1;
        while(true){
            if((num % 5 == 0) && (num % 7 == 0)){
                System.out.println("Found ans: " + num);
                break;
            }
            num++;
        }
    }
//    Print all the values between 1 and 50 except for the multiples of 3.
    static int prac3(int num){
        for(int i = 0; i<num; i++){
            if(i % 3 == 0){
                System.out.println("Removed element:" + i);
                continue;
            }
            System.out.println(i + " ");
        }
//        int i = 1;
//        while(i <= num){
//            if(i % 3 == 0){
//                num++;
//                continue;
//            }
//            System.out.println(i);
//            i++;
//        }


        return num;
    }


    static int labels(int num){
//        myloop: for(int i = 0; i< num; i++){
//            if(i % 3 == 0){
//                break myloop;
//            }
//            System.out.println(i);
//        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        prac3(num);
//        labels(num);

        int a = 1;
        while(a < num){
            System.out.println(a + " ");
            a++;
        }





    }
}
