package Java08Oops.Java07Encapsulation.questions.Utills;

import Java08Oops.Java07Encapsulation.questions.Geometry.Circles;
import Java08Oops.Java07Encapsulation.questions.Geometry.Rectangle;

public class Calculator {

    public static void main(String[] args) {

        Circles clr = new Circles(4.5);
        Rectangle rect = new Rectangle(8, 5);

        // Create a simple application with at least two packages:
        // com.example.geometry and com.example.utils. In the geometry
        // package, define classes like Circle and Rectangle. In the utils
        // package, create a Calculator class that can compute areas of these
        // shapes.
        double circleArea = Math.PI * Math.pow(clr.radius, 2);
        double rectArea = rect.length * rect.breadth;

        System.out.printf("Area of the circle is: %f and Rectangle is: %f", circleArea, rectArea);

    }
}
