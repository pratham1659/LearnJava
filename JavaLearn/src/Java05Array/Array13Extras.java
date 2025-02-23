package Java05Array;

import java.util.*;

public class Array13Extras {

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
            //  if(j==1 || j==3){
            System.out.println(j + ": " + hm.get(j));
            //  }
        }
    }

    //found duplicate
    public static void foundDuplicate() {
        int[] a = {1, 2, 5, 5, 6, 6, 7, 2};
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
        int[] a = {1, 4, 2, 6, 3, 5, 8}; //{1,2,3,4,5,6,8}
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
        int[] a = {1, 2, 3};
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
        int[] a = {10, 20, -20, -1, 2456};
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
        int[] a = {1, 2, 3, 4, 5, 6, 7};
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
//    -------second approch-----
// public static void main(String[] args) {
//    int[] a = {1, 2, 3, 4, 5, 6, 7};
//    int sum = 8;
//    int i,j;
//    for (i = 0; i < a.length; i++) {
//        for (j = i + 1; j < a.length; j++) {
//            if (a[i] + a[j] == sum) {
//                System.out.println(a[i] + "," + a[j]);
//            }
//        }
//    }
//}

    public static void PairOfElementsInAnArrayWithAGivenSumUsingHashSet() {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
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
        int[] a = {1, 2, 2, 3, 4, 5, 6, 6, 7};
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
        int[] a = {1, 2, 3, 4, 5, 6, 7};
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
        int[] a = {6, 8, 2, 4, 3, 1, 5, 7, 9};
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
        int[] a = {6, 8, 2, 4, 3, 1, 5, 7, 9};
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
        int a[] = {1, 0, 2, 3, 0, 0, 2};
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
        int[] a = {6, 8, 2, 4, 3, 1, 5, 7};
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
        int[] a = {6, 8, 2, 4, 3, 1, 5, 7, 9};
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

        int[] arr = {6, 1, 2, 1, 9, 9, 3, 1, 2, 6, 8, 6, 5, 9, 6};
        CountDuplicate(arr);

        int[] i = {1, 5, 3, 1, 2, 8, 9};
        CountOfIntegersInAnArrayUsingHashMap(i);

        int[] A = {7, 5, 6, 15, 12, 9, 3};
        System.out.println(SumOfNumbersInAnArrayExcludingTheNumbersFrom6To9(A));

        int[] inputArray = {1, 2, 3, 4, 5};
        SwapFirstIndexvaluefromLastIndexValue(inputArray);

        for (int num : inputArray) {
            System.out.print(num + " ");
        }
    }
}
