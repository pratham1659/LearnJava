package Java02Conditional;

import java.util.Scanner;

public class Java3Maths {
//    Ques : Given three points (xl, yl), (×2, y2) and
//    (×3, y3), write a program to check if all the three
//    points fall on one straight line.
    static void threePoints(){
        double x1 = 1, x2 = 2, x3 = 3, y1 = 1, y2 = 2, y3 = 4;

        double m1 = (y2-y1)/(x2-x1);
        double m2 = (y3-y2)/(x3-x2);

        if(m1==m2){
            System.out.println("Three points lie on same line");
        }else{
            System.out.println("Invalid Points");
        }
    }

//    Ques: Given a point (x, y), write a program to find
//    out if it lies on the x-axis, y-axis or at the origin, viz (0, 0).

    static void axisPoints(int x, int y){
        if((x == 0 && y == 0)){
            System.out.println("Point is in Origin");
        } else if (x == 0) {
            System.out.println("Point lies in Y");
        } else if (y == 0) {
            System.out.println("Point lies in X");
        }else {
            System.out.println("Invalid Points");
        }
    }

//    Ques: Given the coordinates (x, y) of a center of a
//    circle and its radius, write a program which will
//    determine whether a point lies inside the circle, on
//    the circle or outside the circle.

//    static void coordinate(int x, int y, int r){
//
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();

//        threePoints();
//        axisPoints(x, y);
//        coordinate(x , y, r);
    }
}
