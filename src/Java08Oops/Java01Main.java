package Java08Oops;


import java.util.Scanner;

class Algebra{

    int a, b;
    Algebra(){
        System.out.println("Constructor with no Argument Called Here");

    }

    Algebra(int x, int y){
        System.out.println("Constructor with two Arguments");
        a = x;
        b = y;
    }

    int add(){
        return a + b;
    }

    int sub(){
        return a - b;
    }

    int mul(){
        return a * b;
    }
}
public class Java01Main {

    //Write a program to add two number;
    static void addNum(int a, int b){
        int sum = 0;
        sum += a + b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        Scanner sc =  new Scanner(System.in);

//        Java02Class Rohan = new Java02Class();
//        System.out.println(Rohan.rollNo);
//        System.out.println(Rohan.studentId);
//
//        Java02Class Pratham = new Java02Class();
//        Pratham.rollNo = 12;
//        Pratham.studentId = "19BCS1700";
//        System.out.println(Pratham.rollNo);
//        System.out.println(Pratham.studentId);


//        System.out.println("Enter A and B here: ");
//        double a = sc.nextDouble();
//        double b = sc.nextDouble();

//        double res = obj.add(a, b);
//        System.out.println(res);


        //Standard Library Methods;
//        double ans = a + b;
//        System.out.println(ans); //Print Function
//
//        double sqrt = Math.sqrt(a);
//        System.out.println(sqrt); //Print Sqrt Function
//
//        double flr = Math.floor(a);
//        System.out.println("Floor will be " + flr); // Print Rounding number
//
//        double ceil = Math.ceil(a);
//        System.out.println("Ceil will be " + ceil); //Print Rounding Number

        System.out.println(obj.add());

        Algebra obj2 = new Algebra(43, 26);
        System.out.println(obj2.add());
        System.out.println(obj2.sub());
        System.out.println(obj2.mul());

    }
}
