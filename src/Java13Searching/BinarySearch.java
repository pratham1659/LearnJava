package Java13Searching;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int len = arr.length;
        int start = 0;
        int end = len - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


    static int recursiveBinarySearch(int arr[], int start, int end, int target) {
        if (end >= start) {

            int mid = start + (end - start) / 2; //better way to prevent overflow in binary search.

            if (arr[mid] == target)
                return mid;

            if (arr[mid] > target)
                return recursiveBinarySearch(arr, start, mid - 1, target);

            return recursiveBinarySearch(arr, mid + 1, end, target);
        }
        return -1;
    }


    //    Find the first occurrence of a given element x, given that the given array is sorted. If no occurrence
//    of x is found then return -1.
    public static int findFirstOccurrence(int[] arr, int target) {
        int len = arr.length;
        int start = 0;
        int end = len - 1;
        int firstOccur = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                firstOccur = mid;
                end = mid-1;
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return firstOccur;
    }

    public static int findLastOccurrence(int[] arr, int target){
        int len = arr.length;
        int start = 0;
        int end = len - 1;
        int lastOccur = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                lastOccur = mid;
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return lastOccur;
    }

//    Find the square root of the given non negative value x. Round it off to the nearest floor integer value.

    public static int squareRootBinarySearch(int target){
        int start = 0, end = target;
        int ans = -1;

        while (start <= end){
            int mid = start + (end- start)/2;
            long value = (long) mid * mid;
            if(value == target){
                return  mid;
            }else if(value < target){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid -1;
                ans = mid;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int[] arr1 = {2, 4, 5, 9, 12, 16, 19};
//        int target = 4;
//
////        int result = binarySearch(arr, target);
//        int result = recursiveBinarySearch(arr, 0, arr.length - 1, target);
//        if (result == -1)
//            System.out.println("Element not present");
//        else
//            System.out.println("Element found at index " + result);


//        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
//        int target = 5;
////        int result = findFirstOccurrence(arr, target);
//        int result = findLastOccurrence(arr, target);
//        if (result == -1)
//            System.out.println("Element not present");
//        else
//            System.out.println("Element found at index " + result);

        int target = 1225;
        System.out.println(squareRootBinarySearch(target));

    }
}
