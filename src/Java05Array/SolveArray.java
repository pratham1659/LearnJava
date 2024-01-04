package Java05Array;

import java.util.Scanner;

public class SolveArray {
//    Find the total number of pairs in the Array whose sum is equal to the given value x
    static int pairSum(int[] arr, int x){
        int n = arr.length;
    int ans = 0;

    for(int i=0; i<n; i++){ //first Number
        for(int j=i+1; j<n; j++ ){ //Second Number
            if(arr[i] + arr[j] == x){
                ans++;
            }
        }
    }
        return ans;
    }


//    Count the number of triplets whose sum is equal to the given value x.

    static int findTripletSum(int[] arr, int x){
        int n = arr.length;
        int ans = 0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                  if(  arr[i] + arr[j] + arr[k] == x){
//                      int[] qrr = {arr[i], arr[j], arr[k]};
                      ans++;
                  }
                }
            }
        }
            return ans;
    }


    static  int uniqueNum(int[] arr){
        int ans = 0;
        int n = arr.length;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                   arr[i] = -1;
                   arr[j] = -1;
                }
            }
        }

        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                ans = arr[i];
            }
        }

        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " Elements: ");
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

//        System.out.println("Enter Target: ");
//        int x = sc.nextInt();

//        System.out.println(pairSum(arr, x));

//        System.out.println(findTripletSum(arr, x));
        System.out.println(uniqueNum(arr));
    }
}
