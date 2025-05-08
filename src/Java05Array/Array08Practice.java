package Java05Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Array08Practice {

    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Array Size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Elements in Array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static int[][] input2DArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Please Enter the number of columns: ");
        int columns = sc.nextInt();

        int[][] numArray = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numArray[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return numArray;
    }

    public static void displayArray(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }

    // Ques 1: Program to reverse an array.
    public static void reverseArray(int[] arr) {
        int i = 0;
        while (i < arr.length / 2) {
            int swap = arr[i];
            arr[i] = arr[(arr.length - i) - 1];
            arr[(arr.length - i) - 1] = swap;
            i++;
        }
    }

    // Ques 2: Program to check is the array is palindrome or not.
    public static boolean checkPalindrome(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != arr[(arr.length - 1) - i]) {
                return false;
            }
            i++;
        }
        return true;
    }

    // Function called checkPalindrome
    public static void checkBooleanResult(int[] arr) {
        boolean result = checkPalindrome(arr);

        if (result) {
            System.out.println("The array is palindrome");
        } else {
            System.out.println("The array is not palindrome");
        }
    }

    // Ques 3: find the frequncy of the elements
    // input: int[] nums = [1, 2, 2, 3, 3, 4, 5, 5, 6, 6]
    // Ouput: 1 -> 1
    // 2 -> 2
    // 3 -> 2
    // 4 -> 1
    // 5 -> 2
    // 6 -> 2
    public static void frequncyElement(int[] arr) {
        int n = arr.length;
        int max = arr[0];

        for (int i = 0; i < n; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int newSize = (max + 1);
        int[] freq = new int[newSize];

        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i < newSize; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " -> " + freq[i]);
            }
        }
    }

    // Ques 4: Print of SumOfSubArray
    // Input: 1 2 3
    // Output:
    // 0 -> 0 = 1
    // 0 -> 1 = 3
    // 0 -> 2 = 6
    // 1 -> 1 = 2
    // 1 -> 2 = 5
    // 2 -> 2 = 3

    // Brute Fore Approach
    public static void sumOfSubArray(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                System.out.println(i + " -> " + j + " = " + sum);
            }
        }
    }

    // Ques 5. Find the total number of pairs in the Array whose sum is equal key.
    // int[] arr1 = { 1, 2, 3, 4, 5 };
    // int key1 = 5;System.out.println("Total Pairs: "+
    // countPairs(arr1, key1)); // Output: 2

    // int[] arr2 = {1, 1, 1, 1};
    // int key2 = 2;
    // System.out.println("Total Pairs: " + countPairs(arr2, key2)); // Output: 6

    // int[] arr3 = {2, 3, 4, 6, 7};
    // int key3 = 9;
    // System.out.println("Total Pairs: " + countPairs(arr3, key3)); // Output: 2
    public static int countPairs(int[] arr, int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == key) {
                    System.out.println("Pair: (" + arr[i] + ", " + arr[j] + ")");
                    count++;
                }
            }
        }
        return count;
    }

    // Ques 6. Count the number of triplets whose sum is equal to the given value x.
    // int[] arr1 = { 1, 2, 3, 4, 5 };
    // int key1 = 9;System.out.println("Total Triplets: "+
    // countTriplets(arr1, key1)); // (2,3,4), (1,3,5)

    // int[] arr2 = {0, 1, 2, 3, 4, 5};
    // int key2 = 6;
    // System.out.println("Total Triplets: " + countTriplets(arr2, key2)); //
    // Multiple triplets

    // int[] arr3 = {1, 1, 1, 1};
    // int key3 = 3;
    // System.out.println("Total Triplets: " + countTriplets(arr3, key3)); // All 1s
    public static int countTriplets(int[] arr, int key) {
        int count = 0;
        System.out.println("Triplets summing to " + key + ":");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == key) {
                        System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // Ques 7. Find Substing of Max Sum Sub Array
    // Time and Space : O(N) and O(1)
    // Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    // Output: 6
    // Input: nums = [1]
    // Output: 1
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    // Ques 8: Move all zeroes to the start and ones to the end of a given array of
    // random integers
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        int start = 0;
        int end = n - 1;

        // Step 1: Place all 0s at the start and 1s at the end
        for (int num : nums) {
            if (num == 0) {
                output[start++] = 0;
            } else if (num == 1) {
                output[end--] = 1;
            }
        }

        // Step 2: Place remaining elements in the middle
        for (int num : nums) {
            if (num != 0 && num != 1) {
                output[start++] = num;
            }
        }

        // Reverse the 1s section as they were placed backwards
        int left = end + 1, right = n - 1;
        while (left < right) {
            int temp = output[left];
            output[left] = output[right];
            output[right] = temp;
            left++;
            right--;
        }

        return output;
    }

    // Ques 4. Find Substing of Max Product Sub Array
    // Time and Space : O(N) and O(1)
    // Input: nums=[2,3,-2,4]
    // Output:6
    // Explanation:[2,3] has the largest product 6.
    // Input: nums = [-2,0,-1]
    // Output: 0
    // Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
    public static int maxProductSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxNum = nums[0];
        int minNum = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int tempMax = Math.max(nums[i], Math.max(maxNum * nums[i], minNum * nums[i]));
            int tempMin = Math.min(nums[i], Math.min(maxNum * nums[i], minNum * nums[i]));

            maxNum = tempMax;
            minNum = tempMin;

            ans = Math.max(ans, maxNum);
        }

        return ans;
    }

    // Ques 5: SubarrayPrinter
    // Input: { 1, 2, 3 };
    // output: 1, 1 2, 1 2 3, 2, 2 3, 3
    public static void SubarrayPrinter(int[] nums) {
        int[] arr = { 1, 2, 3 };

        int n = arr.length;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }

    // Ques 1: Insert element in Array
    public static int[] insertInArray(int[] arr, int index, int value) {
        if (index >= 0 && index < arr.length) {

            int[] newArr = new int[arr.length + 1];
            for (int i = 0, j = 0; i < newArr.length; i++) {
                if (i == index) {
                    newArr[i] = value;
                } else {
                    newArr[i] = arr[j++];
                }
            }
            return newArr;
        } else {
            return arr;
        }
    }

    // Ques 2: Delete element in Array
    public static int[] deleteElement(int[] array, int index) {
        if (index >= 0 && index < array.length) {
            int[] newArray = new int[array.length - 1];
            for (int i = 0, j = 0; i < array.length; i++) {
                if (i != index) {
                    newArray[j++] = array[i];
                }
            }
            return newArray;
        } else {
            System.out.println("Invalid index. Element not deleted.");
            return array; // Return original array if index is invalid
        }
    }

    // Ques 3 : Insert element in new Array
    public static int[] checkArray(int[] arr, int value, int position) {

        int n = arr.length;
        int ans[] = new int[n + 1];
        int i = 0;
        int j = 0;

        while (i < n + 1) {
            if (i == position - 1) {
                ans[i] = value;
            } else {
                ans[i] = arr[j];
                j++;
            }
            i++;
        }

        return ans;

    }

    // Ques 9. Maximum Three Digits in Array
    public static int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;

        // Case 1: All three largest elements are positive
        int maxProduct1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Case 2: Two smallest elements (if they exist) and the largest element
        int maxProduct2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(maxProduct1, maxProduct2);
    }

    // Ques 10: program to find number of occurrences of an element in an array.
    public static int occurrencesArray(int[] arr, int num) {
        int count = 0;
        int i = 0;

        while (i < arr.length) {
            if (arr[i] == num) {
                count++;
            }
            i++;
        }
        return count;
    }

    // Ques 11: Program to find the maximum and minimum element in an array.
    public static int minMaxArray(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int min = arr[0];
        int max = arr[0];
        int i = 1;
        while (i < arr.length) {
            if (min > arr[i]) {
                min = arr[i];
            }

            if (max < arr[i]) {
                max = arr[i];
            }
            i++;
        }
        return min + max;
    }

    // Ques 12: Program to return a new array deleting a specific element.
    public static int[] deleteArray(int[] arr, int numToDel) {
        int count = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] == numToDel) {
                count++;
            }
            i++;
        }

        if (count == 0) {
            return arr;
        }

        int newSizeOfArray = arr.length - count;
        int[] newArray = new int[newSizeOfArray];

        int j = 0, k = 0;
        while (j < arr.length) {
            if (arr[j] != numToDel) {
                newArray[k] = arr[j];
                k++;
            }
            j++;
        }

        return newArray;
    }

    public static int[] mergeArray(int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;
        int[] mergedArray = new int[size1 + size2];

        int i = 0, j = 0, k = 0;
        while (i < size1 && j < size2) {
            if (arr1[i] <= arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }

        while (i < size1) {
            mergedArray[k++] = arr1[i++];
        }

        while (j < size2) {
            mergedArray[k++] = arr2[j++];
        }
        return mergedArray;
    }

    public static boolean searchElement(int[][] matrix, int target) {

        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }

    public static int calculateDiagonalSum(int[][] matrix) {
        // Check for edge case where the matrix is not square
        if (matrix.length != matrix[0].length) {
            System.out.println("Matrix is not square.");
            return 0;
        }

        int size = matrix.length;
        int sum = 0;

        // Calculate the sum of the main diagonal (top-left to bottom-right)
        for (int i = 0; i < size; i++) {
            sum += matrix[i][i];
        }

        // Calculate the sum of the secondary diagonal (top-right to bottom-left)
        for (int i = 0; i < size; i++) {
            sum += matrix[i][size - 1 - i];
        }

        return sum;
    }

    public static void calculateSumAndAverage(int[][] matrix) {
        // Check for edge case where the matrix is empty
        if (matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("Matrix is empty.");
            return;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int sum = 0;

        // Calculate sum and average
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }

        double average = (double) sum / (rows * cols);

        // Print the results
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Average of all elements: " + average);
    }

    public static void CountDuplicate(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    i++;
                }
            }
            if (count > 1) {
                System.out.println(arr[i] + ": " + count + " times");
            }
        }
    }

    public static void CountOfIntegersInAnArrayUsingHashMap(int[] intArray) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i : intArray) {
            if (hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);
            } else {
                hm.put(i, 1);
            }

        }
        Set<Integer> intList = hm.keySet();
        for (int j : intList) {
            // if(j==1 || j==3){
            System.out.println(j + ": " + hm.get(j));
            // }
        }
    }

    // found duplicate
    public static void foundDuplicate() {
        int[] a = { 1, 2, 5, 5, 6, 6, 7, 2 };
        int len = a.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (a[i] == a[j] && (i != j)) {
                    System.out.println(a[j]);
                    ;
                }
            }
        }
    }

    public static void FindThreeElementsInAnArrayWithAGivenSum() {
        int[] a = { 1, 4, 2, 6, 3, 5, 8 }; // {1,2,3,4,5,6,8}
        int totalSum = 10;
        Arrays.sort(a);
        boolean flag = false;
        for (int i = 0; i < a.length - 2; i++) {
            int left = i + 1;
            int right = a.length - 1;
            while (left < right) {
                int csum = a[i] + a[left] + a[right];
                if (csum == totalSum) {
                    System.out.println("the numbers are: " + a[i] + ":" + a[left] + ":" + a[right]);
                    flag = true;
                    break;
                } else if (csum < totalSum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        if (!flag) {
            System.out.print("not found");
        }
    }

    public static void GetIndividualWordFromSentenceInArray() {
        String sentence = "the is of of the area of";

        // Split the sentence into words using space as delimiter
        String[] words = sentence.split(" ");

        // Print the individual words
        for (int i = 0; i < words.length; i++) {
            System.out.println("arr[" + i + "] should have: " + words[i]);
        }
    }

    public static void Keep1stArrayValuesTwoTimesIn2ndArray() {
        int[] a = { 1, 2, 3 };
        int size = a.length;
        int[] b = new int[2 * size];
        int j = 0, i;
        for (i = 0; i < b.length; i++) {
            b[i] = a[j];
            j++;
            if (j > size - 1) {
                j = 0;
            }
        }
        for (i = 0; i < b.length; i++) {
            System.out.println(b[i] + " ");
        }
    }

    public static void largestAndSmallest() {
        int[] a = { 10, 20, -20, -1, 2456 };
        int largest = a[0];
        int smallest = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            } else if (a[i] < smallest) {
                smallest = a[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }

    public static void PairOfElementsInAnArrayWithAGivenSum() {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        int sum = 8;
        int low = 0;
        int high = a.length - 1;
        while (low < high) {
            if (a[low] + a[high] > sum) {
                high--;
            } else if (a[low] + a[high] < sum) {
                low++;
            } else if (a[low] + a[high] == sum) {
                System.out.println(a[low] + ":" + a[high]);
                low++;
                high--;
            }
        }
    }
    // -------second approch-----
    // public static void main(String[] args) {
    // int[] a = {1, 2, 3, 4, 5, 6, 7};
    // int sum = 8;
    // int i,j;
    // for (i = 0; i < a.length; i++) {
    // for (j = i + 1; j < a.length; j++) {
    // if (a[i] + a[j] == sum) {
    // System.out.println(a[i] + "," + a[j]);
    // }
    // }
    // }
    // }

    public static void PairOfElementsInAnArrayWithAGivenSumUsingHashSet() {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        int sum = 8;
        HashSet<Integer> container = new HashSet<>();
        for (Integer ele : a) {
            int expectedSecondElement = sum - ele;
            if (container.contains(expectedSecondElement)) {
                System.out.println(ele + "," + expectedSecondElement);
            } else {
                container.add(ele);
            }
            // System.out.println(container);
        }
    }

    /*
     * container=[1,2,3,4]
     * 1= 8-1=7 ==>
     * 2=8-2=6==>added
     * 3=8-3=5==>added
     * 4=8-4=4==>added
     * 5=8-5==>3 ==> print 5 and 3
     * 6=8-6==> 2 ==> print 6 and 2
     * 7=8-7==>1 print 7 and 1
     */

    public static void PrintTheCharacterWhoseNumberOfOccurrenceIsMaximum() {
        String s = "this is demooo";
        s = s.replaceAll("\\s+", "");
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] c = s.toCharArray();

        for (char ch : c) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        int maxCount = 0;
        char maxChar = ' ';

        for (Map.Entry<Character, Integer> me : hm.entrySet()) {
            if (maxCount < me.getValue()) {
                maxCount = me.getValue();
                maxChar = me.getKey();
            }
        }

        System.out.println("Max char is " + maxChar);
    }

    public static void PrintTheCharacterWhoseNumberOfOccurrenceIsMinimum() {
        String s = "this is demo";
        s = s.replaceAll("\\s+", "");
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] c = s.toCharArray();

        for (char ch : c) {
            if (hm.containsKey(ch)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        int minCount = Integer.MAX_VALUE;
        char minChar = ' ';

        for (Map.Entry<Character, Integer> me : hm.entrySet()) {

            if (minCount > me.getValue()) {
                minCount = me.getValue();
                minChar = me.getKey();
            }
        }

        System.out.println("Min char is " + minChar);
    }

    public static void removeDupliCate() {
        int[] a = { 1, 2, 2, 3, 4, 5, 6, 6, 7 };
        int len = a.length;
        int j = 0;
        for (int i = 0; i < len - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }

        a[j++] = a[len - 1];

        for (int k = 0; k < j; k++) {
            System.out.println(a[k]);
        }
    }

    public static int[] RotationOfArrayFromSpecificElementUsingFormula(int[] arr, int startIndex) {
        int n = arr.length;
        int[] newArray = new int[n];

        for (int i = 0; i < n; i++) {
            int newIndex = (i + n - startIndex) % n;
            newArray[newIndex] = arr[i];
        }

        return newArray;
    }

    public static void RotationOfArrayFromSpecificElementUsingTemp() {
        int[] a = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 2;
        int n = a.length;
        int k = 0;
        int[] temp = new int[n];

        for (int i = d; i < n; i++) {
            temp[k] = a[i];
            k++;
        }
        for (int i = 0; i < d; i++) {
            temp[k] = a[i];
            k++;
        }
        for (int i = 0; i < n; i++) {
            a[i] = temp[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void SecondLargestNumber() {
        int[] a = { 6, 8, 2, 4, 3, 1, 5, 7, 9 };
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                second_largest = largest;
                largest = a[i];
            } else if (a[i] > second_largest && a[i] != largest) {
                second_largest = a[i];
            }
        }

        if (second_largest == Integer.MIN_VALUE) {
            System.out.println("no second largest number");
        } else {
            System.out.println("second largest number is= " + second_largest);
        }
    }

    public static void SecondSmallestNumber() {
        int[] a = { 6, 8, 2, 4, 3, 1, 5, 7, 9 };
        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < smallest) {
                second_smallest = smallest;
                smallest = a[i];
            } else if (a[i] < second_smallest && a[i] != smallest) {
                second_smallest = a[i];
            }
        }

        if (second_smallest == Integer.MIN_VALUE) {
            System.out.println("no second smallest number");
        } else {
            System.out.println("second smallest number is= " + second_smallest);
        }
    }

    public static void Shift0sToEnd() {
        int a[] = { 1, 0, 2, 3, 0, 0, 2 };
        int len = a.length;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (a[i] != 0) {
                a[count++] = a[i];
            }

        }
        while (count < len) {
            a[count++] = 0;

        }
        for (int j = 0; j < len; j++) {
            System.out.println(a[j]);
        }
    }

    public static void SortAndPrintSecondLargestNumber() {
        int[] a = { 6, 8, 2, 4, 3, 1, 5, 7 };
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);
        }
        System.out.println(a[1]);
    }

    public static void SortAndPrintSecondSmallestNumber() {
        int[] a = { 6, 8, 2, 4, 3, 1, 5, 7, 9 };
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(a[1]);
    }

    public static void SumOfNaturalNumbers() {
        int num = 10;
        int count, total = 0;
        for (count = 1; count <= num; count++) {
            total = total + count;
        }
        System.out.println("Sum: " + total);
    }

    public static int SumOfNumberBetween6And9(int[] arr) {
        int sum = 0;
        boolean add = false;

        for (int num : arr) {
            if (num == 6) {
                add = true;
            } else if (num == 9) {
                add = false;
            }

            if (add) {
                sum += num;
            }
        }

        return sum;
    }

    public static int SumOfNumberBetween6and9Including6and9(int[] arr) {
        boolean isInsideRange = false;
        int sum = 0;

        for (int num : arr) {
            if (num == 6) {
                isInsideRange = true;
            }

            if (isInsideRange) {
                sum += num;
            }

            if (num == 9) {
                isInsideRange = false;
            }
        }

        return sum;
    }

    public static int SumOfNumbersInAnArrayExcludingTheNumbersFrom6To9(int[] A) {
        int sum = 0;
        boolean add = true;
        int a = 6;
        int b = 9;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != a && add == true) {
                sum = sum + A[i];
            } else if (A[i] == a) {
                add = false;
            } else if (A[i] == b) {
                add = true;
            }
        }
        return sum;
    }

    public static void SwapFirstIndexvaluefromLastIndexValue(int[] arr) {
        if (arr.length <= 1) {
            return; // No change needed for arrays of length 0 or 1
        }
        int lastElement = arr[arr.length - 1];
        // Shift elements to the right
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = lastElement; // Place the last element at the beginning
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = inputArray();
        // int[] numArray = inputArray();
        // int[][] num2DArray = input2DArray();

        // int sum = arraySum(numArray);
        // int avg = arrayAverage(numArray);
        // System.out.println("Sum of Array: " + sum);
        // System.out.println("Average of Array: " + avg);

        // System.out.print("Enter the element to find: ");
        // int num = sc.nextInt();
        // System.out.println( occurrencesArray(numArray, num));

        // System.out.println(minMaxArray(arr));

        int[] arr = { 1, 2, 4, 5, 6 }; // Example array
        System.out.println("Insert in Array:" + Arrays.toString(insertInArray(arr, 2, 3)));
        System.out.println("Delete in Array: " + Arrays.toString(deleteElement(arr, 3)));

        System.out.println(Arrays.toString(checkArray(arr, 3, 3)));

        // System.out.println(minArray(numArray));
        // System.out.println(maxArray(numArray));

        // System.out.println(isIncreasedArray(numArray));
        // System.out.println(isDecreasedArray(numArray));

        // System.out.println("Enter Element to be delete: ");
        // int numToDel = sc.nextInt();
        // int[] newArr = deleteArray(numArray, numToDel);
        // displayArray(newArr);

        // reverseArray(numArray);
        // displayArray(numArray);

        // checkPalindrome(numArray);
        // checkBooleanResult(numArray);

        // displayArray(mergeArray(arr, numArray));

        // System.out.println(searchElement(num2DArray, 8));

        // calculateSumAndAverage(num2DArray);

        int[] nums = { 5, 0, 3, 1, 0, 4, 1, 7, 1 };
        int[] result = rearrangeArray(nums);
        System.out.println("Modified Array: " + Arrays.toString(result));

        // int sum = calculateDiagonalSum(num2DArray);
        // System.out.println("Sum of diagonal elements: " + sum);

        // int[] arr = { 6, 1, 2, 1, 9, 9, 3, 1, 2, 6, 8, 6, 5, 9, 6 };
        // CountDuplicate(arr);

        // int[] i = { 1, 5, 3, 1, 2, 8, 9 };
        // CountOfIntegersInAnArrayUsingHashMap(i);

        // int[] A = { 7, 5, 6, 15, 12, 9, 3 };
        // System.out.println(SumOfNumbersInAnArrayExcludingTheNumbersFrom6To9(A));

        // int[] inputArray = { 1, 2, 3, 4, 5 };
        // SwapFirstIndexvaluefromLastIndexValue(inputArray);

        // for (int num : inputArray) {
        // System.out.print(num + " ");
        // }
        sc.close();

    }
}
