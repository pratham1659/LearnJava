package Java01Basic;

public class BasicProgram {

    //    Develop a program that prints the multiplication table for a given number.
    public static void multiplicationTable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + "X" + i + "=" + num * i);
            i++;
        }
    }

    //    Create a program to sum all odd numbers from 1 to a specified number N.
    public static void sumOfOdd(int num) {

        int i = 1;
        int sum = 0;
        while (i <= num) {
            if (i % 2 != 0) {
                sum += i;
//                System.out.print(sum + " + ");
            }
            i++;
        }
        System.out.println("Odd Sum till " + num + ": " + sum);
    }

    //    Write a function that calculates the factorial of a given number.
    public static long factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Negative Expression");
        }
        long fact = 1;
        int i = 2;

        while (i <= num) {
            fact *= i;
            i++;
        }

        return fact;
    }

    //    Create a program that computes the sum of the digits of an integer.
    public static void sumOfDigit(int num) {
        int ans = 0;
        while (num > 0) {
            ans += num % 10;
            num = num / 10;
        }
        System.out.println(ans);
    }

    //Create a program to find the Least Common Multiple (LCM) of two numbers.
    public static int lcmDigit(int first, int second) {
        int max = Math.max(first, second);
        while (true) {
            if (max % first == 0 && max % second == 0) {
                return max;
            }
            max++;
        }
    }

    //    Create a program to find the Greatest Common Divisor (GCD) of two integers.
    public static int gcdDigit(int first, int second) {
        while (second != 0) {
            int temp = second;
            second = first % second;
            first = temp;
        }
        return first;
    }

    //    Create a program to check whether a given number is prime.
    public static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
//        for (int i = 2; i < Math.sqrt(n); i++) {
//            if (n % 2 == 0) {
//                return false;
//            }
//        }

        int i = 2;
        while (i < num) {
            if (num % 2 == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    //  Create a program to reverse the digits of a number.
    public static void reverseDigit(int num) {
        int newNum = 0;
        while (num > 0) {
            int digit = num % 10;
            newNum = newNum * 10 + digit;
            num = num / 10;
        }
        System.out.println(newNum);
    }

    //    Create a program to print the Fibonacci series up to a certain number.
    public static void fibonacci(int num) {
        int firstTerm = 0, secondTerm = 1;

        if(num <=0 ){
            System.out.println("Please enter a positive integer greater than 0.");
        }
        else if (num == 1) {
            System.out.print(firstTerm);
        } else if (num == 2) {
            System.out.print(firstTerm + " " + secondTerm);
        } else {
            System.out.print(firstTerm + " " + secondTerm + " ");

            for (int i = 2; i < num; i++) {
                int nextTerm = firstTerm + secondTerm;
                System.out.print(nextTerm + " ");

                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }
    public static void main(String[] args) {

//        multiplicationTable(5);
//        sumOfOdd(100);
//        long fact = factorial(5);
//        System.out.println(fact);
//        sumOfDigit(82);
//        System.out.println(lcmDigit(4, 6));
//        System.out.println(gcdDigit(4, 6));

//        System.out.println(checkPrime(19));

//        reverseDigit(2050);

        fibonacci(4);

    }

}
