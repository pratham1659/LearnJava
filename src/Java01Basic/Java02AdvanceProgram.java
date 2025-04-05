package Java01Basic;

public class Java02AdvanceProgram {

    // Ques 1: program to print the Fibonacci series up to a certain number.
    public static void fibonacciSeries(int num) {
        int firstTerm = 0, secondTerm = 1;

        if (num <= 0) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else if (num == 1) {
            System.out.print((firstTerm));
        } else if (num == 2) {
            System.out.print(firstTerm + " " + secondTerm);
        } else {
            System.out.print(firstTerm + " " + secondTerm + " ");

            for (int i = 2; i <= num; i++) {
                int nextTerm = firstTerm + secondTerm;

                System.out.print(nextTerm + " ");

                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }

    // Ques 2: Program to check Palindrome Number.
    public static boolean checkPalindromeNumber(int num) {

        int original = num;
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }

        return original == newNum;
    }

    // Ques 3: Program to check Power.
    public static int pow(int num1, int num2) {
        int result = num1;
        int i = 1;

        while (i < num2) {
            result = result * num1;
            i++;
        }
        return result;
    }

    // Ques 4: Program to check No Of Digit
    public static int noOfDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    // Ques 5: Program to check Armstrong
    public static boolean checkArmstrong(int num) {
        int originalNumber = num;
        int finalNumber = 0;
        int noOfDigit = noOfDigits(num);

        while (num > 0) {
            int lastDigit = num % 10;
            num = num / 10;
            finalNumber = finalNumber + pow(lastDigit, noOfDigit);
        }

        return finalNumber == originalNumber;
    }

    // Ques 6: Program to print Star Right Triangle
    public static void starPrintRightTriangle(int maxRows) {
        int rows = 0;
        while (rows < maxRows) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

    // Ques 6: Program to print Reverse Right Triangle
    public static void reverseRightTriangle(int maxRows) {
        int rows = maxRows;
        while (rows > 0) {
            System.out.print("*");
            int i = 0;
            while (i < rows) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    // Ques 7: Program to print Left Half Triangle
    public static void printLeftHalfPyramid(int maxRows) {
        int rows = maxRows;
        while (rows > 0) {
            // this loop print spaces
            int j = 0;
            while (j < rows) {
                System.out.print("  ");
                j++;
            }
            // this loop print star
            int i = 0;
            while (i <= (maxRows - rows)) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    public static void main(String[] args) {

        fibonacciSeries(9);
        System.out.println("\nCheck Palindrome: " + checkPalindromeNumber(121));
        System.out.println("Power of Two Number: " + pow(5, 3));
        System.out.println("Check Armstrong: " + checkArmstrong(9474));
        starPrintRightTriangle(5);
        reverseRightTriangle(5);
        printLeftHalfPyramid(5);
    }

}
