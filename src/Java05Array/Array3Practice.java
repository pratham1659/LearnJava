package Java05Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array3Practice {

    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }


// Calculate the sum of all the elements in the given array.
    void sumOfArray(){
        int[] arr = {2, 45, 56, 67, 89, 23};
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.print(sum);

    }

    void maxArray(){
//        Calculate the maximum value out of all the elements in the array.
        int[] arr = { 45, 67, 89, 23, 76, 99};  // ans 99
        int max = 0;

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Answer: " + max);
    }

    void findArray(){
// Search the given element x in the array. If present then return the index else return -1.
// Linear Search
        int[] arr ={1, 5, 7, 8, 3, 5};
        int x = 5;
        int ans = -1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == x){
                ans = i;
                break;
            }
        }
        System.out.println("Found: " + x + " at " + ans);
    }


    void inputArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Input Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out. println("original array");
        printArray(arr);


//        Trying to copy arr1 to arr2;
        //Copied Array without clone
//        int[] arr2 = arr;
        int[] arr2 = arr.clone();
        System.out. println("original array after cloning arr2");
        printArray(arr2);

        //New Array
        arr2[0] = 0;
        arr2[1] = 0;

        System.out. println("copied arr_2 after changing arr2");
        printArray(arr2);

        //Trying to copy arr to arr2
//        arr2 = Arrays.copyOf(arr, arr.length);
        arr2 = Arrays.copyOf(arr, 2);
        System.out.println("Genuine Copied Array: ");
        printArray(arr2);


        System.out.println("Print Range to Copied Array: ");
        arr2 = Arrays.copyOfRange(arr, 1, 3);
        printArray(arr2);
    }



    public static void main(String[] args) {

        Array3Practice obj = new Array3Practice();


        obj.inputArray();





    }
}
