package Java03Loops;

import java.util.Scanner;

public class LoopsPractice {

    //Ques 1: Sum the previous integer, when user enter negative loop will break
    public static void checkNegativeInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter negative to break: ");
        int num = sc.nextInt();
        int sum = 0;

        //  Print the sum of the stream of integers in the input.
        while (num != -1) {
            sum += num;
            num = sc.nextInt();

        }
        System.out.println("Return sum " + sum);
    }

    //Ques 2: when user Enter 5, loop will break
    public static int loopBreak(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
        return num;
    }

    //Ques 3: Print the first multiple of 5 which is also a multiple of 7.
    static void multipleOf5and7() {
        int num = 1;
        while (true) {
            if ((num % 5 == 0) && (num % 7 == 0)) {
                System.out.println("Found ans: " + num);
                break;
            }
            num++;
        }
    }

    //Ques 4: Print all the values between 1 and 50 except for the multiples of 3.
    public static int expectThree(int num) {
        for (int i = 0; i < num; i++) {
            if (i % 3 == 0) {
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


    public static void main(String[] args) {

        checkNegativeInteger();
        loopBreak(6);
        multipleOf5and7();
        expectThree(45);


    }
}
