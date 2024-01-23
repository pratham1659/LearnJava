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

        while (num > 0){
            int lastDigit = num % 10;
            num /= 10;
            finalNumber += pow(lastDigit, noOfDigits);
        }
        return finalNumber == originalNumber;
    }

    public static int pow(int num1, int num2){
        int result = num1;
        int i = 1;
        while(i < num2){
            result *= num1;
            i++;
        }
        return result;
    }

    //Create a program to verify if a number is a palindrome.

    public static void main(String[] args) {

        System.out.println(checkArmstrong(12));

    }
}
