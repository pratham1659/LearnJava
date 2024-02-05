package Java01Basic;

public class AdvanceProgram {

// Create a program to check if a number is an Armstrong number.

    public static int noOfDigit(int num) {
        int digits = 0;

        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits;
    }

    public static boolean checkArmstrong(int num) {

        int originalNumber = num;
        int finalNumber = 0;
        int noOfDigits = noOfDigit(num);

        while (num > 0) {
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit, noOfDigits);
        }
        return finalNumber == originalNumber;
    }

    public static int pow(int num1, int num2) {
        int result = num1;
        int i = 1;
        while (i < num2) {
            result *= num1;
            i++;
        }
        return result;
    }

    //Create a program to verify if a number is a palindrome.

    public static int reverseDigit(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        return newNum;
    }

    public static boolean checkPalindrome(int num) {
        int reverseNum = reverseDigit(num);
        return num == reverseNum;
    }

    public static void starRightTriangle(int maxRows){
       int rows = 0;
       while(rows < maxRows){
           System.out.print("*");
           int i = 0;
           while (i < rows){
               System.out.print(" *");
               i++;
           }
           System.out.println();
           rows++;
       }
    }

    public static void reverseRightTriangle(int maxRows){
        int rows = maxRows;
        while(rows > 0){
            int i = 0;
            while (i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    public static void printLeftHalfPyramid(int maxRows){
        int rows = maxRows;
        while(rows > 0){
            //this loop print spaces
            int j = 0;
            while (j < rows){
                System.out.print("  ");
                j++;
            }
            //this loop print star
            int i = 0;
            while (i <= (maxRows-rows)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
    public static void main(String[] args) {

//        System.out.println("Check Armstrong: " + checkArmstrong( 153));
//        System.out.println("Check Palindrome: " + checkPalindrome(3443));
//        starRightTriangle(6);

//        reverseRightTriangle(6);
//        printLeftHalfPyramid(6);

    }
}
